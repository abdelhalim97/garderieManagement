package miniProjetPackage;
import java.time.*;
import java.util.Scanner;
import java.util.Vector;

public  class  Eleve extends Personne{
	static Vector<Eleve_Cours> elevesCr= new Vector<Eleve_Cours>();
	String gPPrenom;
	String merePrenom;
	String mereNom;
	int pereCIN;
	int niveauScolaire;
	int frais;
//public void Personne() {}
//Personne P = new  Personne();
	public Eleve() {
	}
	public Eleve(String nom, String prenom, String perePrenom, String mereNom, String merePrenom, String gPPrenom, Adresse adr,
			LocalDate dateNais,int pereTelNum, int pereCIN,int niveauScolaire, String img) {
		super(nom, prenom, perePrenom, dateNais, img, adr, pereTelNum);
		this.gPPrenom = gPPrenom;
		this.merePrenom = merePrenom;
		this.mereNom = mereNom;
		this.pereCIN = pereCIN;
		this.niveauScolaire = niveauScolaire;
		this.frais = 0;
	}
	void payer(Eleve eleveAPayer) {
		int montant=0,niveauS;
		boolean test=false;
		eleveAPayer.setFrais(0);
		Scanner nEScan = new Scanner(System.in);
		niveauS=eleveAPayer.getNiveauScolaire();
		System.out.println("Eleve de nom:"+eleveAPayer.nom+" avec niveau scolaire:"+niveauS);
		for (Eleve_Cours var : elevesCr)
		 {
			  if(var.eleve ==eleveAPayer) { 
				  System.out.println("\r\navec cours de code:" +var.cours.code);
				  test=true;
				  }
		 }
		if(test) {
			System.out.println("\ndonner le montant a payer");
			montant=nEScan.nextInt();
			eleveAPayer.setFrais(montant);
			}
		else {
			System.out.println("\\nn a pas inscrit a aucun cours");
			} 
		}
	void addEleveEtCours(Eleve eleve, Cours cours) {
		Eleve_Cours ec=new Eleve_Cours(eleve, cours);
		elevesCr.add(ec);
	}
	void desinscrire(int i) {
		elevesCr.remove(i);
	}
	void afficheEleve_Cours() {
		if(elevesCr.size()!=0) {
		for (int i = 0; i < elevesCr.size(); i++) {
			int j=i+1;
            System.out.print("Index :"+j +" nom :"+elevesCr.get(i).eleve.nom+" prenom :"+elevesCr.get(i).eleve.prenom
            		+" code :"+elevesCr.get(i).cours.code   +" designation :"+elevesCr.get(i).cours.designation +"\n");
        }
	}
		else{System.out.print("Aucune inscription pour le moment");}}
	
	void ajouterEleve(Eleve eleve,Vector<Eleve> eleves) {
		eleves.add(eleve);		
	}
	void mettreAJourEleve(Eleve eleve) {
		boolean test=true;
		Adresse nEAdr;
		int nEY,nED,nEM,nEPcin,nEPt,nENs,nEF,nENr, nECp;
		String nEN,nEP,nEPp,nEGp,nEMp,nEMn,nEDr,nEv,nEG,nEA;
		do {
		Scanner nEScan = new Scanner(System.in);
		Scanner nEMyObj = new Scanner(System.in);
		System.out.println("modifier eleve\n "
				+ "1.modifier nom\n"
				+ "2.modifier prenom\n"
				+ "3.modifier perePrenom\n"
				+ "4.modifier gPPrenom\n"
				+ "5.modifier merePrenom\n"
				+ "6.modifier mereNom\n"
				+ "7.modifier LocalDate\n"
				+ "8.modifier pereCIN\n"
				+ "9.modifier pereTelNum\n"
				+ "10.modifier niveauScolaire\n"
				+ "11.modifier adr\n"
				+ "12.modifier img\n"
				+ "13.Exit\n");
		int change = nEScan.nextInt();
		if(change>0 ||change<14) {
			switch(change) {
			  case 1:
				  System.out.println("Entrer nom");
				  nEN = nEMyObj.nextLine();
				  setNom(nEN);
				  break;
			  case 2:
				  System.out.println("Entrer prenom");
				  nEP = nEMyObj.nextLine();
				  setPrenom(nEP);
				  break;
			  case 3:
				  System.out.println("Entrer pere prenom");
				  nEPp = nEMyObj.nextLine();
				  setPerePrenom(nEPp);
				  break;
			  case 4:
				  System.out.println("Entrer grand-pere prenom");
				  nEGp = nEMyObj.nextLine();
				  setgPPrenom(nEGp);
				  break;
			  case 5:
				  System.out.println("Entrer mere prenom");
				  nEMp = nEMyObj.nextLine();
				  setMerePrenom(nEMp);
				  break;
			  case 6:
				  System.out.println("Entrer mere nom");
				  nEMp = nEMyObj.nextLine();
				  setMereNom(nEMp);
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
				  System.out.println("Entrer pere cin");
				  nEPcin = nEScan.nextInt();
				  setPereCIN(nEPcin);
				  break;
			  case 9:
				  System.out.println("Entrer pere telephone");
				  nEPt = nEScan.nextInt();
				  setPereTelNum(nEPt);
				  break;
			  case 10:
				  System.out.println("Entrer niveau scolaire");
				  nENs = nEScan.nextInt();
				  setNiveauScolaire(nENs);
				  break;
			  case 11:
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
				  nEAdr=new Adresse(nENr,nECp,nEDr,nEv,nEG);
				  setAdr(nEAdr);
			    break;
			  case 12:
				  System.out.println("Entrer img");
				  nEA = nEMyObj.nextLine();
				  setImg(nEA);
				  break;
			  case 13:
				  System.out.println("Exit");
				  test=false;
				  break;
			  default:
				  System.out.println("erreur\n ");
			}
		}}while(test==true);
	}
	void supprimerEleve(Vector<Eleve> eleves,int i) {
		eleves.remove(i);
	}
	void afficheEleve(Vector<Eleve> eleves) {
		for (int i = 0; i < eleves.size(); i++) {
			int j=i+1;
            System.out.print("Index :"+j +" nom :"+eleves.get(i).nom+" prenom :"+eleves.get(i).prenom+
            		" frais:"+eleves.get(i).frais+"\n");
        }
	}
public int getFrais() {
		return frais;
	}
public void setFrais(int frais) {
	this.frais = frais;
}
public int getNiveauScolaire() {
		return niveauScolaire;
	}
public void setNom(String nom) {
	this.nom = nom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public void setPerePrenom(String perePrenom) {
	this.perePrenom = perePrenom;
}
public void setgPPrenom(String gPPrenom) {
	this.gPPrenom = gPPrenom;
}
public void setMerePrenom(String merePrenom) {
	this.merePrenom = merePrenom;
}
public void setMereNom(String mereNom) {
	this.mereNom = mereNom;
}
public void setAdr(Adresse adr) {
	this.adr = adr;
}
public void setDateNais(LocalDate dateNais) {
	this.dateNais = dateNais;
}
public void setPereCIN(int pereCIN) {
	this.pereCIN = pereCIN;
}
public void setPereTelNum(int pereTelNum) {
	this.pereTelNum = pereTelNum;
}
public void setNiveauScolaire(int niveauScolaire) {
	this.niveauScolaire = niveauScolaire;
}
@Override
public void setImg(String img) {
	this.img = img;
}
}
