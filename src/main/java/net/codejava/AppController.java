package net.codejava;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class AppController {
//	@Autowired
//	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveRecord(@ModelAttribute("product") JctVendorOnboarding employee) {
		ObjectMapper Obj = new ObjectMapper();
		String requestJson=null;
        try {
            // get employee object as a json string
        	requestJson = Obj.writeValueAsString(employee);
            // Displaying JSON String
//            System.out.println(requestJson);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
		System.out.println("JSON:"+requestJson);
//	    final String uri = "http://localhost:8081/insert";
	    final String uri = "jct-vendor-onboarding-db.us-e2.cloudhub.io/insert";
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);

	    HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
	    RestTemplate restTemplate=new RestTemplate();
	    String answer = restTemplate.postForObject(uri, entity, String.class);
//	    String result = restTemplate.postForObject( uri, requestJson, String.class);
	    System.out.println("Result::"+answer);
	    return "redirect:/";
	}
	
	
	@Autowired
	private JctVendorOnboardingService service; 
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<JctVendorOnboarding> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		JctVendorOnboarding product = new JctVendorOnboarding();
		model.addAttribute("product", product);
		
		return "new_product";
	}
	
/*	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") JctVendorOnboarding product) {
		service.save(product);
		createJctVendorOnboarding(product);
		return "redirect:/";
	}*/
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
		JctVendorOnboarding product = service.get(id);
		mav.addObject("product", product);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";		
	}
}
