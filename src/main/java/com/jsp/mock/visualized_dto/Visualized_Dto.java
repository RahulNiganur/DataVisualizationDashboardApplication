package com.jsp.mock.visualized_dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Visualized_Dto {

	@Id
	private String Intensity;
	private String Likalhood;
	private String Relevence;
	private String Year;
	private String Country;
	private String topics;
	private String Region;
	private String City;

	public String getIntensity() {
		return Intensity;
	}

	public void setIntensity(String intensity) {
		Intensity = intensity;
	}

	public String getLikalhood() {
		return Likalhood;
	}

	public void setLikalhood(String likalhood) {
		Likalhood = likalhood;
	}

	public String getRelevence() {
		return Relevence;
	}

	public void setRelevence(String relevence) {
		Relevence = relevence;
	}

	public String getYear() {
		return Year;
	}

	@Override
	public String toString() {
		return "Visualized_Dto [Intensity=" + Intensity + ", Likalhood=" + Likalhood + ", Relevence=" + Relevence
				+ ", Year=" + Year + ", Country=" + Country + ", topics=" + topics + ", Region=" + Region + ", City="
				+ City + "]";
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

}
