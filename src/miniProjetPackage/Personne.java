package miniProjetPackage;

import java.time.LocalDate;

public abstract class Personne {
	String nom;
	String prenom;
	String perePrenom;
	LocalDate dateNais;
	String img;
	Adresse adr;
	int pereTelNum;
	public Personne() {}
	public Personne(String nom, String prenom, String perePrenom, LocalDate dateNais, String img, Adresse adr,
			int pereTelNum) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.perePrenom = perePrenom;
		this.dateNais = dateNais;
		this.img = img;
		this.adr = adr;
		this.pereTelNum = pereTelNum;
	}
	public abstract void setImg(String img);
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPerePrenom() {
		return perePrenom;
	}
	public void setPerePrenom(String perePrenom) {
		this.perePrenom = perePrenom;
	}
	public LocalDate getDateNais() {
		return dateNais;
	}
	public void setDateNais(LocalDate dateNais) {
		this.dateNais = dateNais;
	}
	public Adresse getAdr() {
		return adr;
	}
	public void setAdr(Adresse adr) {
		this.adr = adr;
	}
	public int getPereTelNum() {
		return pereTelNum;
	}
	public void setPereTelNum(int pereTelNum) {
		this.pereTelNum = pereTelNum;
	}
	
}
