package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JctVendorOnboardingService {
	@Autowired
	private JctVendorOnboardingRepository repo;
	
	public List<JctVendorOnboarding> listAll() {
		return repo.findAll();
	}
	
	public void save(JctVendorOnboarding product) {
		repo.save(product);
	}
	
	public JctVendorOnboarding get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
