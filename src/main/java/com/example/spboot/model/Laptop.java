package com.example.spboot.model;

public class Laptop extends Computer {
int autonomie;

public int getAutonomie() {
	return autonomie;
}

public void setAutonomie(int autonomie) {
	this.autonomie = autonomie;
}

public Laptop(int id, String marque, String cPU, String description, float prix, int autonomie) {
	super(id, marque, cPU, description, prix);
	this.autonomie = autonomie;
}

}
