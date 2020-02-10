package com.ramesh.service.jsonreturn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ramesh.service.jsonreturn.model.Candidate;

@Component
public class CandidateDAO {

	private static List<Candidate> candidate;
	{
		candidate = new ArrayList<Candidate>();
		candidate.add(new Candidate("1a","Candidate1","Front End",5.02f,"Recuriter 1","Technical"));
		candidate.add(new Candidate("2a","Candidate2","Back End",6.02f,"Recuriter 2","Technical"));
		candidate.add(new Candidate("3a","Candidate3","Cloud Engineer",7.02f,"Recuriter 3","Technical"));
		candidate.add(new Candidate("4a","Candidate4","Test Engineer",5.02f,"Recuriter 4","Technical"));
		candidate.add(new Candidate("5a","Candidate5","Front End",5.22f,"Recuriter 5","Technical"));
		candidate.add(new Candidate("6a","Candidate6","Front End",7.42f,"Recuriter 6","Technical"));
		candidate.add(new Candidate("7a","Candidate7","Back End",9.02f,"Recuriter 7","Technical"));
		
	}
	
	public List list() {
		return candidate;
	}

}
