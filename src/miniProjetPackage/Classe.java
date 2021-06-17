package miniProjetPackage;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Vector;

import java.time.*;
public class Classe {
		String nom;
		static Vector<Eleve> eleves= new Vector<Eleve>();
		static Vector<Cours> courss= new Vector<Cours>();
		static Vector<Animateur> animateurs= new Vector<Animateur>();
		public Classe(String nom, Vector<Eleve> eleves, Vector<Cours> courss, Vector<Animateur> animateurs) {
			this.nom = nom;
			this.eleves = eleves;
			this.courss = courss;
			this.animateurs = animateurs;
		}
		public Classe() {

		}
		void ajouterClasse(Classe classe,Vector<Classe> classes) {
			classes.add(classe);		
		}
		void mettreAJourClasse(Classe classe, Vector<Eleve> eleves, Vector<Cours> courss, Vector<Animateur> animateurs) {
			String nCN;
			boolean test=true;
			Eleve eleve = new Eleve();
			Animateur animateur = new Animateur();
			Cours cours = new Cours();
			do {
				Scanner nEScan = new Scanner(System.in);
				Scanner nEMyObj = new Scanner(System.in);
				System.out.println("1.modifier nom\n"
						+ "2.modifier eleve\n"
						+ "3.modifier animateur\n"
						+ "4.modifier cours\n"
						+ "5.Exit\n");
				int change = nEScan.nextInt();
				if(change>0 ||change<6) {
					switch(change) {
					  case 1:
						  Scanner ss = new Scanner(System.in);
						  System.out.println("Entrer nom classe");
						  nCN = ss.nextLine();
						  setNom(nCN);
						  break;
					  case 2:
						  Scanner scanC = new Scanner(System.in);
						  Scanner scanT = new Scanner(System.in);
						  int eC,eD;
						  for (int i = 0; i < eleves.size(); i++) {
								 int j=i+1;
								 Eleve E=eleves.get(i);
								 System.out.print("Index :"+j  +" nom :"+E.nom+" prenom :"+E.prenom+" frais:"+E.frais+"\n");
								 System.out.print("\n1.Pour ajouter cet eleve\r\n"
								 		+ "0.L eleve suivant");
								  eC = scanC.nextInt();
								  boolean test1=true;
								 if(eC==1) {
									 for (Eleve var : classe.eleves) 
									 { 
									     if(var ==eleves.get(i)) {
									    	 System.out.print("\n Cet eleve est deja dans la liste\r\n");
									    	 test1=false;
									     }
									 }
									 if(test1==true) {eleves.get(i).ajouterEleve(eleves.get(i),classe.eleves);}
								 }
								 }
						  for (int k = 0; k < classe.eleves.size(); k++) {
										 int l=k+1;
										 Eleve EE=classe.eleves.get(k);
										 System.out.print("Index :"+l  +" nom :"+EE.nom+" prenom :"+EE.prenom+" frais:"+EE.frais+"\n");
								 }
						  System.out.print("\n1.Choisir l indice d eleve a supprimer\n"
								 + "0 pour exit"); 	
						  eD = scanC.nextInt();
						  if(eD!=0) {
							  int f=eD-1;
							  System.out.print(f);
							  classe.eleves.get(f).supprimerEleve(classe.eleves,f);
						  }
					    break;
					  case 3:Scanner scanA = new Scanner(System.in);
					  int aC,aD;
					  for (int i = 0; i < animateurs.size(); i++) {
							 int j=i+1;
							 Animateur E=animateurs.get(i);
							 System.out.print("Index :"+j +" cin :"+E.CIN   +" nom :"+E.nom+" prenom :"+E.prenom+"\n");
							 System.out.print("\n1.Pour ajouter cet animateur\r\n"
							 		+ "0.Animateur suivant");
							  aC = scanA.nextInt();
							  boolean test1=true;
							 if(aC==1) {
								 for (Animateur var : classe.animateurs) 
								 { 
								     if(var ==animateurs.get(i)) {
								    	 System.out.print("\n Cet animateur est deja dans la liste\r\n");
								    	 test1=false;
								     }
								 }
								 if(test1==true) {animateurs.get(i).ajouterAnimateur(animateurs.get(i),classe.animateurs);}
							 }
							 }
					  for (int k = 0; k < classe.animateurs.size(); k++) {//8
									 int l=k+1;
									 Animateur EE=classe.animateurs.get(k);
									 System.out.print("Index :"+l  +" cin :"+EE.CIN   +" nom :"+EE.nom+" prenom :"+EE.prenom+"\n");	 
							 }
					  System.out.print("\n1.Choisir l indice d animateur a supprimer\n"
								 + "0 pour exit");
						  aD = scanA.nextInt();
						  if(aD!=0) {
							  int f=aD-1;
							  System.out.print(f);
							  classe.animateurs.get(f).supprimerAnimateur(classe.animateurs,f);
						  }
				    break;
					  case 4:Scanner scanCours = new Scanner(System.in);
					  int cC,cD;
					  for (int i = 0; i < courss.size(); i++) {
							 int j=i+1;
							 Cours E=courss.get(i);
							 System.out.print("Index :"+j +" code :"+courss.get(i).code   +" designation :"+courss.get(i).designation +
										" cin :"+courss.get(i).animateur.CIN   +" nom :"+courss.get(i).animateur.nom+" prenom :"+courss.get(i).animateur.prenom+
										"\n");
							 System.out.print("\n1.Pour ajouter ce cours\r\n"
							 		+ "0. cours suivant");
							 cC = scanCours.nextInt();
							  boolean test1=true;
							 if(cC==1) {
								 for (Cours var : classe.courss) 
								 { 
								     if(var ==courss.get(i)) {
								    	 System.out.print("\n Cette cours est deja dans la liste\r\n");
								    	 test1=false;
								     }
								 }
								 if(test1==true) {courss.get(i).ajouterCours(courss.get(i),classe.courss);}
							 }
							 }
					  for (int k = 0; k < classe.courss.size(); k++) {
									 int l=k+1;
									 Cours EE=classe.courss.get(k);
									 System.out.print("Index :"+l +" code :" +EE.code   +" designation :"+EE.designation +" cin :"
									 +EE.animateur.CIN   +" nom :"+EE.animateur.nom+" prenom :"+EE.animateur.prenom+"\n");
							 }
					  System.out.print("\n1.Choisir l indice d cours a supprimer\n"
								 + "0 pour exit");		
					 cD = scanCours.nextInt();
					  if(cD!=0) {
						  int f=cD-1;
						  System.out.print(f);
						  classe.courss.get(f).supprimerCours(classe.courss,f);
						  }
					    break;
					  case 5:
						  System.out.println("Exit");
						  test=false;
						  break;
				  default:
					  System.out.println("erreur\n ");
					    }
				}}
			while(test==true);
		}
		void supprimerClasse(Vector<Classe> classes,int i) {
			classes.remove(i);
		}
		void afficheClasse(Vector<Classe> classes) {
			for (int i = 0; i < classes.size(); i++) {
				int j=i+1;
	            System.out.print("Index :"+j  + " classe nom " +classes.get(i).nom+"\n");
	            for (int k = 0; k < classes.get(i).eleves.size(); k++) {
					int l=k+1;
					Eleve eleveClasse=classes.get(i).eleves.get(k);
		            System.out.print(" Index :"+l + " eleve nom :"+eleveClasse.nom+" eleve prenom :"+eleveClasse.prenom+" eleve perePrenom :"+
		            		eleveClasse.perePrenom+" eleve frais:"+eleveClasse.frais+"\n"  );
		        }
	            for (int k = 0; k < classes.get(i).animateurs.size(); k++) {
					int l=k+1;
					Animateur animateurClasse=classes.get(i).animateurs.get(k);
		            System.out.print(" Index :"+l + " cin d animateur :"+animateurClasse.CIN+" nom d animateur:"+animateurClasse.nom+
		            		" prenom d animateur:"+animateurClasse.prenom+" img d animateur:"+animateurClasse.img+"\n" );
		        }
	            for (int k = 0; k < classes.get(i).courss.size(); k++) {
					int l=k+1;
					Cours coursClasse=classes.get(i).courss.get(k);
		            System.out.print(" Index :"+l + " code cours de classe:"+coursClasse.code+
							" nom d animateur res de cours de classe:"+coursClasse.animateur.nom+
							" prenom d animateur res de cours de classe:"+coursClasse.animateur.prenom+"\n" );
		        }
	        }
		}
		void statClasse() {
			Garderie G=new Garderie();
			System.out.print("Le nombre totales des classes est "+G.classes.size());
			for (int i = 0; i < G.classes.size(); i++) {
				System.out.print("\nClasse de nom:"+G.classes.get(i).nom+" est composee de:\n"+G.classes.get(i).eleves.size()+" eleves :");
				for (int k = 0; k < G.classes.get(i).eleves.size(); k++) {
					System.out.print("-"+G.classes.get(i).eleves.get(k).nom + " ");
				}
				System.out.print("\net "+G.classes.get(i).animateurs.size()+" animateurs : ");
				for (int k = 0; k < G.classes.get(i).animateurs.size(); k++) {
					System.out.print("-"+G.classes.get(i).animateurs.get(k).nom + " ");
				}
				System.out.print("\net "+G.classes.get(i).courss.size()+" cours :");
				for (int k = 0; k < G.classes.get(i).courss.size(); k++) {
					System.out.print("-"+G.classes.get(i).courss.get(k).code + " ");
				}
			}System.out.print("\n");
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
}
