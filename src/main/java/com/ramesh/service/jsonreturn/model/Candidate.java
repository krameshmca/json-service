package com.ramesh.service.jsonreturn.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Candidate {

	private String candidateId;
	private String name;
	private String domain;
	private float experience;
	private String recuriterName;
	private String interviewType;



	public Candidate(String candidateId, String name, String domain, float experience, String recuriterName,
			String interviewType) {
		
		this.candidateId = candidateId;
		this.name = name;
		this.domain = domain;
		this.experience = experience;
		this.recuriterName = recuriterName;
		this.interviewType = interviewType;

	}
	
	public Candidate() {
		
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public String getRecuriterName() {
		return recuriterName;
	}

	public void setRecuriterName(String recuriterName) {
		this.recuriterName = recuriterName;
	}

	public String getInterviewType() {
		return interviewType;
	}

	public void setInterviewType(String interviewType) {
		this.interviewType = interviewType;
	}

}
