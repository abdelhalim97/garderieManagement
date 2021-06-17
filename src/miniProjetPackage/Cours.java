package miniProjetPackage;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Vector;
public class Cours {
	int code;
	String designation;
	Animateur animateur;
	public Cours(int code, String designation, Animateur animateur) {
		this.code = code;
		this.designation = designation;
		this.animateur = animateur;
	}
	public Cours() {

	}
	void ajouterCours(Cours cours,Vector<Cours> courss) {
		courss.add(cours);		
	}
	void mettreAJourCours(Cours cours, Vector<Animateur> animateurs) {
		int codeC,indiceAnimateur;
		String designationC;
		boolean test=true;
		do {
			Scanner nEScan = new Scanner(System.in);
			Scanner nEMyObj = new Scanner(System.in);
			System.out.println("modifier cours\n "
					+ "1.modifier code\n"
					+ "2.modifier designation\n"
					+ "3.modifier animateur\n"
					+ "4.Exit\n");
			int change = nEScan.nextInt();
			if(change>0 ||change<5) {
				switch(change) {
				  case 1:
					  System.out.println("Entrer code");
					  codeC = nEScan.nextInt();
					  setCode(codeC);
					  break;
				  case 2:
					  System.out.println("Entrer designation");
					  designationC = nEMyObj.nextLine();
					  setDesignation(designationC);
					  break;
				  case 3:
					  animateur.afficheAnimateur(animateurs);
					  System.out.println("Entrer indice animateur");
					  indiceAnimateur = nEScan.nextInt();
					  indiceAnimateur--;
					  cours.animateur = animateurs.get(indiceAnimateur);
					  break;
				  case 4:System.out.println("Exit");
					  test=false;
					  break;
				  default:
					  System.out.println("erreur\n ");
				    }
			}
			else{System.out.println("erreur");}}
		while(test==true);
	}
	void supprimerCours(Vector<Cours> Cours,int i) {
		Cours.remove(i);
	}
	void afficheCours(Vector<Cours> courss) {
		for (int i = 0; i < courss.size(); i++) {
			int j=i+1;
			System.out.print("Index :"+j +" code :"+courss.get(i).code   +" designation :"+courss.get(i).designation +" cin :"+
			courss.get(i).animateur.CIN   +" nom :"+courss.get(i).animateur.nom+" prenom :"+courss.get(i).animateur.prenom+"\n");
        }
	}
	void statCours() {
		Garderie G=new Garderie();
		System.out.print("le nombre totales des cours est "+G.courss.size() +" et chaque cours a un animateur responsable\n");
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
