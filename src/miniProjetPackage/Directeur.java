package miniProjetPackage;

import java.time.LocalDate;

class Directeur extends  Personne{

	public Directeur() {
	}
	public Directeur(String nom, String prenom, String perePrenom, LocalDate dateNais, String img, Adresse adr,
			int pereTelNum) {
		super(nom, prenom, perePrenom, dateNais, img, adr, pereTelNum);
	}
	@Override
	public void setImg(String img) {
		// TODO Auto-generated method stub
		
	}
}
