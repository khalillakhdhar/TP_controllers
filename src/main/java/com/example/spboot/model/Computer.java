package com.example.spboot.model;

public class Computer {
int id;
String marque,CPU,description;
float prix;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getCPU() {
	return CPU;
}
public void setCPU(String cPU) {
	CPU = cPU;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
public Computer(int id, String marque, String cPU, String description, float prix) {
	super();
	this.id = id;
	this.marque = marque;
	CPU = cPU;
	this.description = description;
	this.prix = prix;
}
@Override
public String toString() {
	return "Computer [id=" + id + ", marque=" + marque + ", CPU=" + CPU + ", description=" + description + ", prix="
			+ prix + "]";
}



}
