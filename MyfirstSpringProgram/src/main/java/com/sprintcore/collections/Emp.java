package com.sprintcore.collections;
import java.util.*;
public class Emp {
	private String eName;
	private List<String> ePhones;
	private Set<String> eAddresses;
	private Map<String,String> eCourses;

	public Emp(String eName, List<String> ePhones, Set<String> eAddresses, Map<String, String> eCourses) {
		super();
		this.eName = eName;
		this.ePhones = ePhones;
		this.eAddresses = eAddresses;
		this.eCourses = eCourses;
	}
	public Emp(){
		
	}
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<String> getePhones() {
		return ePhones;
	}

	public void setePhones(List<String> ePhones) {
		this.ePhones = ePhones;
	}

	public Set<String> geteAddresses() {
		return eAddresses;
	}

	public void seteAddresses(Set<String> eAddresses) {
		this.eAddresses = eAddresses;
	}

	public Map<String, String> geteCourses() {
		return eCourses;
	}

	public void seteCourses(Map<String, String> eCourses) {
		this.eCourses = eCourses;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
