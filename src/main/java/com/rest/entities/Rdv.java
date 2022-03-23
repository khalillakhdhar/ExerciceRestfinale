package com.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

@Entity
public class Rdv {
@Id
private int id;
@NotBlank
private String titre;
@Lob

private String description;
@Column(nullable = false)
private String date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}




}
