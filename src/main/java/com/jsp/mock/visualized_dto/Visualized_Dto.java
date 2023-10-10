package com.jsp.mock.visualized_dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Visualized_Dto {

	@Id
	private int intensity;
	private String likalhood;
	private String relevence;
	private String year;
	private String country;
	@Override
	public String toString() {
		return "Visualized_Dto [intensity=" + intensity + ", likalhood=" + likalhood + ", relevence=" + relevence
				+ ", year=" + year + ", country=" + country + ", topics=" + topics + ", region=" + region + ", city="
				+ city + "]";
	}
	private String topics;
	private String region;
	private String city;
	public int getIntensity() {
		return intensity;
	}
	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
	public String getLikalhood() {
		return likalhood;
	}
	public void setLikalhood(String likalhood) {
		this.likalhood = likalhood;
	}
	public String getRelevence() {
		return relevence;
	}
	public void setRelevence(String relevence) {
		this.relevence = relevence;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}

