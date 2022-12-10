package com.Ranim.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Ranim.demo.entities.Cours;
import com.Ranim.demo.entities.Professeur;


@RepositoryRestResource(path = "cours")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular 
public interface CoursRepository extends JpaRepository<Cours, Long> {
	
	


}




