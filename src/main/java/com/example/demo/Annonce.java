package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Annonce {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column (name = "annonce_id")	
public Long annonceId;
	public String marque;
public String etat;
public Long kilometrage;
public int prix ;
public String texte;
public String image;



public Long getAnnonceId() {
	return annonceId;
}



public void setAnnonceId(Long annonceId) {
	this.annonceId = annonceId;
}



public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}
public long getKilometrage() {
	return kilometrage;
}
public void setKilometrage(Long kilometrage) {
	this.kilometrage = kilometrage;
}
public String getTexte() {
	return texte;
}
public void setTexte(String texte) {
	this.texte = texte;
}

public int getPrix() {
	return prix;
}

public void setPrix(int prix) {
	this.prix = prix;
}



public String getImage() {
	return image;
}



public void setImage(String image) {
	this.image = image;
}





}