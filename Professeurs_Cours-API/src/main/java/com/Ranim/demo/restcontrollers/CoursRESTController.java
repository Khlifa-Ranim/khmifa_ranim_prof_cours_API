package com.Ranim.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Ranim.demo.entities.Cours;
import com.Ranim.demo.repos.CoursRepository;


@RestController
@RequestMapping("/api/cours")
@CrossOrigin("*")

public class CoursRESTController {

	@Autowired
	CoursRepository coursRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Cours> getAllCategories()
	{
	return coursRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Cours getCoursById(@PathVariable("id") Long id) {
	return coursRepository.findById(id).get();
	}

}
