package com.ramesh.service.jsonreturn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh.service.jsonreturn.dao.CandidateDAO;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CanidateController {

	@Autowired
	private CandidateDAO candidateDAO;

	@CrossOrigin(origins = "http://locahost:8080")
	@RequestMapping(value = "/candidates",produces = "application/json")
	public List getAllCanidateDetailsJSON(Model model) {
		
		//model.addAttribute("candidates",getCandiateDetails());
	 	return candidateDAO.list();
	}
}
