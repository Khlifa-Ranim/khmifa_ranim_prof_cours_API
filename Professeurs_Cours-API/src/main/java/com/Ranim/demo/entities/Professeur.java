package com.Ranim.demo.entities;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Professeur {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long idProf;
	

    private String nomProf;

    private String prenomProf;

    private int cin;
	

    private String adresse;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateCreation;
    
    
    @ManyToOne
    private Cours cours;
    
    
  
    
	
	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}



	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professeur(String nomProf, String prenomProf, int cin, String adresse, Date dateCreation,Cours cours) {
		super();
		this.nomProf = nomProf;
		this.prenomProf = prenomProf;
		this.cin = cin;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
		this.cours=cours;
		
	}
	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public Long getIdProf() {
		return idProf;
	}

	public void setIdProf(Long idProf) {
		this.idProf = idProf;
	}

	public String getNomProf() {
		return nomProf;
	}

	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}

	public String getPrenomProf() {
		return prenomProf;
	}

	public void setPrenomProf(String prenomProf) {
		this.prenomProf = prenomProf;
	}



	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Professeur [idProf=" + idProf + ", nomProf=" + nomProf + ", prenomProf=" + prenomProf + ", cin=" + cin
				+ ", adresse=" + adresse + ", dateCreation=" + dateCreation + ", cours=" + cours + "]";
	}




	
	

	
	

}
