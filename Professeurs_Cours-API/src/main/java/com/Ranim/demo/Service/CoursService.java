package com.Ranim.demo.Service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;

import com.Ranim.demo.entities.Cours;
import com.Ranim.demo.entities.Professeur;



public interface CoursService {
	List<Cours> findAll();

	Cours saveCours(Cours c);

	Cours updateCours(Cours c);

	void deleteCours(Cours c);

	void deleteCoursById(Long id);

	Cours getCours(Long idCours);

	Page<Cours> getAllCourssParPage(int page, int size);

	

	
}
