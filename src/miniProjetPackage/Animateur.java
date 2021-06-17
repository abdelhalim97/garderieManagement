package miniProjetPackage;

import java.util.Scanner;
import java.util.Vector;
import java.time.*;
public  class Animateur extends Personne{
	int CIN;
	public Animateur(int cIN,String nom, String prenom,int pereTelNum, String perePrenom, Adresse adr, LocalDate dateNais, 
			String img) {
		super(nom, prenom, perePrenom, dateNais, img, adr, pereTelNum);
		CIN = cIN;
	}
	public Animateur() {
		
	}
	void ajouterAnimateur(Animateur animateur,Vector<Animateur> animateurs) {
		animateurs.add(animateur);		
	}
	void mettreAJourAnimateur(Animateur animateur) {
		boolean test=true;
		String NANomA, NAPrenomA,nEv,NAImgA,NAPPrenomA,nEDr,nEG;
		int NACIN,NAPereTelA,nECp,nEY,nEM,nED,nENr;
		Adresse NAAdrA;
		Scanner nEScan = new Scanner(System.in);
		Scanner nEMyObj = new Scanner(System.in);
		do {
			System.out.println("modifier animateur\n "
					+ "1.modifier CIN\n"
					+ "2.modifier nom\n"
					+ "3.modifier prenom\n"
					+ "4.modifier pereTel\n"
					+ "5.modifier Pprenom\n"
					+ "6.modifier img\n"
					+ "7.modifier dateNais\n"
					+ "8.modifier adr\n"
					+ "9.Exit\n");
			int change = nEScan.nextInt();
			if(change>0 ||change<10) {
				switch(change) {
				  case 1:
					  System.out.println("Entrer CIN");
					  NACIN = nEScan.nextInt();
					  setCIN(NACIN);
					  break;
				  case 2:
					  System.out.println("Entrer nom");
					  NANomA = nEMyObj.nextLine();
					  setNom(NANomA);
					  break;
				  case 3:
					  System.out.println("Entrer prenom");
					  NAPrenomA = nEMyObj.nextLine();
					  setPrenom(NAPrenomA);
					  break;
				  case 4:
					  System.out.println("Entrer pereTel");
					  NAPereTelA = nEMyObj.nextInt();
					  setPereTel(NAPereTelA);
					  break;
				  case 5:
					  System.out.println("Entrer Pprenom");
					  NAPPrenomA = nEMyObj.nextLine();
					  setPprenom(NAPPrenomA);
					  break;
				  case 6:
					  System.out.println("Entrer img");
					  NAImgA = nEMyObj.nextLine();
					  setImg(NAImgA);
					  break;
				  case 7:
					  System.out.println("Entrer annee");
					  nEY = nEScan.nextInt();
					  System.out.println("Entrer mois");
					  nEM = nEScan.nextInt();
					  System.out.println("Entrer jour");
					  nED = nEScan.nextInt();
					  LocalDate nrwDateNais=LocalDate.of(nEY,nEM,nED);
					  setDateNais(nrwDateNais);
					  break;
				  case 8:
					  System.out.println("Entrer code postal");
					  nECp = nEScan.nextInt();
					  System.out.println("Entrer num rue");
					  nENr = nEScan.nextInt();
					  System.out.println("Entrer designation");
					  nEDr = nEMyObj.nextLine();
					  System.out.println("Entrer ville");
					  nEv = nEMyObj.nextLine();
					  System.out.println("Entrer gouvernorat");
					  nEG = nEMyObj.nextLine();
					  NAAdrA=new Adresse(nENr,nECp,nEDr,nEv,nEG);
					  setAdr(NAAdrA);
					  break;
				  case 9:
					  System.out.println("Exit");
					  test=false;
					  break;
				  default:
					  System.out.println("erreur\n ");
				}
			}
		}while(test==true);
	}
	void supprimerAnimateur(Vector<Animateur> animateurs,int i) {
		animateurs.remove(i);
	}
	void afficheAnimateur(Vector<Animateur> animateurs) {
		for (int i = 0; i < animateurs.size(); i++) {
			int j=i+1;
            System.out.print("Index :"+j+" cin :"+animateurs.get(i).CIN   +" nom :"+animateurs.get(i).nom+" prenom :"+
			animateurs.get(i).prenom+"\n");
        }
	}
	public void setCIN(int cIN) {
		CIN = cIN;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setPprenom(String perePrenom) {
		perePrenom = perePrenom;
	}
	public void setPereTel(int pereTelNum) {
		this.pereTelNum = pereTelNum;
	}
	public void setAdr(Adresse adr) {
		this.adr = adr;
	}
	public void setDateNais(LocalDate dateNais) {
		this.dateNais = dateNais;
	}
	public void setImg(String img) {
		this.img = img;
	}
}
