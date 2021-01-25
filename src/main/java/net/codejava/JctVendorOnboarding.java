package net.codejava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class JctVendorOnboarding {
	private Long id;
	private String organizationName;
	private String doingBuisinessAs;
	private String organizationStreetAddress;
	private String country;
	private String zipOrPostalCode;
	private String city;
	private String state;
	private String organizationWebsite;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getDoingBuisinessAs() {
		return doingBuisinessAs;
	}
	public void setDoingBuisinessAs(String doingBuisinessAs) {
		this.doingBuisinessAs = doingBuisinessAs;
	}
	public String getOrganizationStreetAddress() {
		return organizationStreetAddress;
	}
	public void setOrganizationStreetAddress(String organizationStreetAddress) {
		this.organizationStreetAddress = organizationStreetAddress;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipOrPostalCode() {
		return zipOrPostalCode;
	}
	public void setZipOrPostalCode(String zipOrPostalCode) {
		this.zipOrPostalCode = zipOrPostalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOrganizationWebsite() {
		return organizationWebsite;
	}
	public void setOrganizationWebsite(String organizationWebsite) {
		this.organizationWebsite = organizationWebsite;
	}
	@Override
	public String toString() {
		return "JctVendorOnboarding [OrganizationName=" + organizationName + ", DoingBuisinessAs=" + doingBuisinessAs + ", OrganizationStreetAddress=" + organizationStreetAddress + ", Country=" + country
				+ ", ZipOrPostalCode=" + zipOrPostalCode+ ", City=" + city+ ", State=" + state+ ", OrganizationWebsite=" + organizationWebsite
				+ "]";
	}
}
