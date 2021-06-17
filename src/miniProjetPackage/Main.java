package miniProjetPackage;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Vector;
public class Main {
	public static void main(String[] args) {		
		Garderie G = new Garderie();
		Vector<Animateur> animateurs=G.animateurs;
		Vector<Eleve> eleves=G.eleves;
		Vector<Cours> courss=G.courss;
		Eleve eleve=G.eleve;
		Animateur animateur=G.animateur;
		Vector<Classe> classes=G.classes;
		Classe classe=G.classe;
		Cours cours=G.cours;
		Eleve_Cours ec=new Eleve_Cours();
		Eleve eleveT1=new Eleve("abdelhalim","ben oun","mehdi","nadia","ouni","ben oun",new Adresse(1,4004,"om salma","Sousse","riadh"),LocalDate.of(1997,1,1),53359815,63359815,88748498,"C://");
		Eleve eleveT2=new Eleve("marwa","selmi","majdi","salma","hmd","selmi",new Adresse(2,4000,"barca","kairoun","sidi heni"),LocalDate.of(1997,2,2),98359815,73359815,94748498,"C://");
		Animateur animateurT1=new Animateur(8795513,"fakih","chaaben",68326988,"chbile",new Adresse(11,4236,"etoile","sousse","khzema"),LocalDate.of(1950,1,1),"D://");
		Animateur animateurT2=new Animateur(1749835,"khaled","mlih",53326987,"sfaxi",new Adresse(27,4578,"baghded","tunis","jawhra"),LocalDate.of(1955,2,2),"D://");
		Cours coursT1=new Cours(1,"1",animateurT1);
		Cours coursT2=new Cours(2,"2",animateurT2);
		Vector<Animateur> animateursT1= new Vector<Animateur>();
		Vector<Eleve> elevesT1= new Vector<Eleve>();
		Vector<Cours> courssT1= new Vector<Cours>();
		eleveT1.ajouterEleve(eleveT1,eleves);
		eleveT2.ajouterEleve(eleveT2,eleves);
		animateurT1.ajouterAnimateur(animateurT1,animateurs);
		animateurT2.ajouterAnimateur(animateurT2,animateurs);
		eleveT2.ajouterEleve(eleveT1,elevesT1);
		eleveT2.ajouterEleve(eleveT2,elevesT1);
		animateurT1.ajouterAnimateur(animateurT1,animateursT1);
		coursT1.ajouterCours(coursT1,courss);
		coursT2.ajouterCours(coursT2,courss);
		coursT2.ajouterCours(coursT2,courssT1);
		Classe classeT1 =new Classe("1",elevesT1,courssT1,animateursT1);
		classeT1.ajouterClasse(classeT1,classes);
		do {
			boolean test=false;
			Scanner scan = new Scanner(System.in);
			System.out.println("1. Gestion Animateurs\r\n"
				+ "2. Gestion élèves\r\n"
				+ "3. Gestion Classes\r\n"
				+ "4. Gestion Activités/Cours \r\n"
				+ "5. Fermeture de l'application "
				);
			int x = scan.nextInt();
			Scanner myObj = new Scanner(System.in);
			if (x==1) {
				System.out.println("a. Ajouter Animateur\r\n"
				+ "b. Mettre à jour Animateur\r\n"
				+ "c. Supprimer Animateur\r\n"
				+ "d. Lister les animateurs\r\n"
				+ "e. Menu");
				String choix = myObj.nextLine();
				if(choix.equals("a")) {
					String nomA, prenomA,villeA,imgA,pPrenomA,designationRueA,gouvernoratA;
					int CIN,pereTelA,codePostalA,yA,mA,dA,numeroRueA;
					Adresse adrA;
					Scanner scanA = new Scanner(System.in);
					System.out.println("year");
					yA = scanA.nextInt();
					System.out.println("month");
					mA = scanA.nextInt();
					System.out.println("day");
					dA = scanA.nextInt();
					System.out.println("num cin");
					CIN = scanA.nextInt();
					System.out.println("tele pere");
					pereTelA = scanA.nextInt();
					System.out.println("code postal");
					codePostalA = scanA.nextInt();
					System.out.println("num rue");
					numeroRueA = scanA.nextInt();
					Scanner myObjA = new Scanner(System.in);
					System.out.println("nom");
					nomA = myObjA.nextLine();
					System.out.println("prenom");
					prenomA = myObjA.nextLine();
					System.out.println("ville");
					villeA = myObjA.nextLine();
					System.out.println("pere prenom");
					pPrenomA = myObjA.nextLine();
					System.out.println("designation");
					designationRueA = myObjA.nextLine();
					System.out.println("gouvernorat");
					gouvernoratA = myObjA.nextLine();
					System.out.println("img");
					imgA = myObjA.nextLine();
					animateur = new Animateur(CIN,nomA,prenomA,pereTelA,pPrenomA,
					adrA =new Adresse(numeroRueA,codePostalA,designationRueA,villeA,gouvernoratA),LocalDate.of(yA,mA,dA),imgA);
					animateur.ajouterAnimateur(animateur,animateurs);
			}
			else if(choix.equals("b")) {
				if(animateurs.size()!=0) {
					animateur.afficheAnimateur(animateurs);
					String NANomA, NAPrenomA,NAVilleA,NAImgA,NAPPrenomA,NADesignationRueA,NAGouvernoratA;
					int NACIN,NAPereTelA,NACodePostalA,NAYA,NAMA,NADA,NANumeroRueA;
					Adresse NAAdrA;
					Scanner NAScanA = new Scanner(System.in);
					Scanner NAMyObjA = new Scanner(System.in);
					int i;
					System.out.println("Entrer l indice d animateur a modifier");
					i = NAScanA.nextInt();
					i--;
					Animateur newAnimateur=animateurs.get(i);
					newAnimateur.mettreAJourAnimateur(newAnimateur);
					}
				else {
					System.out.print("Liste d animateur est vide\r\n");
				}
				}
			else if(choix.equals("c")) {
				if(animateurs.size()!=0) {
					int j1C;
					Scanner scanC = new Scanner(System.in);
					animateur.afficheAnimateur(animateurs);
					System.out.print(" \r\n Entrer l indice de l animateur a supprimer\r\n");
					j1C = scanC.nextInt();
					j1C--;
					animateurs.get(j1C).supprimerAnimateur(animateurs,j1C);
			}else {
				System.out.print("Liste d animateur est vide\r\n");
			}
				}
			else if(choix.equals("d")) {
				if(animateurs.size()!=0) {
					animateur.afficheAnimateur(animateurs);}
				else {
					System.out.print("Liste d animateur est vide\r\n");
				}
	}
			else if(choix.equals("e")) {
				test=true;
			}
			else  {
				System.out.println("erreur");
	}
			}
		else if (x==2 && test==false) {
			System.out.println("a. Ajouter élèves\r\n"
				+ "b. Mettre à jour élèves\r\n"
				+ "c. Supprimer élèves\r\n"
				+ "d. Lister les élèves\r\n"
				+ "e. Menu\r\n"
				+ "f. Inscription\r\n"
				+ "g. Desinscrire\r\n"
				+ "h. Afficher l inscription\r\n"
				+ "i. Deffinir le paiement\r\n");
			String choix = myObj.nextLine();
			if(choix.equals("a")) {
				Adresse adr;
				int y,d,m,pcin,pt,ns,f, nr, cp;
				String n,p,pp,gp,mp,mn,dr,v,g,a;
				Scanner scan2A = new Scanner(System.in);
				Scanner myObj2A = new Scanner(System.in);
				System.out.println("year");
				y = scan2A.nextInt();
				System.out.println("month");
				m = scan2A.nextInt();
				System.out.println("day");
				d = scan2A.nextInt();
				System.out.println("num rue");
				nr = scan2A.nextInt();
				System.out.println("code postal");
				cp = scan2A.nextInt();
				System.out.println("pere cin");
				pcin = scan2A.nextInt();
				System.out.println("pere telephone");
				pt = scan2A.nextInt();
				System.out.println("niveau scolaire");
				ns = scan2A.nextInt();
				System.out.println("nom");
				n = myObj2A.nextLine();
				System.out.println("prenom");
				p = myObj2A.nextLine();
				System.out.println("pere prenom");
				pp = myObj2A.nextLine();
				System.out.println("grand pere prenom");
				gp = myObj2A.nextLine();
				System.out.println("mere prenom");
				mp = myObj2A.nextLine();
				System.out.println("mere nom");
				mn = myObj2A.nextLine();
				System.out.println("designation rue");
				dr = myObj2A.nextLine();
				System.out.println("ville");
				v = myObj2A.nextLine();
				System.out.println("gouvernorat");
				g = myObj2A.nextLine();
				System.out.println("img");
				a = myObj2A.nextLine();
				eleve = new Eleve(n,p,pp,gp,mp,mn,adr =new Adresse(nr,cp,dr,v,g),LocalDate.of(y,m,d),pcin,pt,ns,a);
				eleve.ajouterEleve(eleve,eleves);
			}
			else if(choix.equals("b")) {
				if(eleves.size()!=0) {
					Adresse nEAdr;
					int nE,nEY,nED,nEM,nEPcin,nEPt,nENs,nEF,nENr, nECp;
					String nEN,nEP,nEPp,nEGp,nEMp,nEMn,nEDr,nEv,nEG,nEA;
					Scanner nEScan = new Scanner(System.in);
					Scanner nEMyObj = new Scanner(System.in);
					eleve.afficheEleve(eleves);
					System.out.println("Entrer l indice d eleve a modifier");
					nE = nEScan.nextInt();
					nE--;
					Eleve newEleve=eleves.get(nE);
					newEleve.mettreAJourEleve(newEleve);
			}
				else {
					System.out.print("Liste des eleves est vide\r\n");
			}}
			else if(choix.equals("c")) {
				if(eleves.size()!=0) {
					int j2C;
					Scanner scanC = new Scanner(System.in);
					eleve.afficheEleve(eleves);
					System.out.print(" \r\n Entrer l indice de l eleve a supprimer\r\n");
					j2C = scanC.nextInt();
					j2C--;
					eleves.get(j2C).supprimerEleve(eleves,j2C);
				}
				else {
					System.out.print("Liste des eleves est vide\r\n");
				}
			}
			else if(choix.equals("d")) {
				if(eleves.size()!=0) {
					eleve.afficheEleve(eleves);}
				else {
					System.out.print("Liste des eleves est vide\r\n");
				}
			}
			else if(choix.equals("e")) {
				test=true;
			}
			else if(choix.equals("f")) {
				if(eleves.size()!=0 && courss.size()!=0) {
					int el,co;
					Scanner scanC = new Scanner(System.in);
					eleve.afficheEleve(eleves);
					System.out.print("Choisit l indice d eleve qui veut prendre une cours\r\n");
					el = scanC.nextInt();
					el--;
					cours.afficheCours(courss);
					System.out.print("Choisit le cours qui veut l eleve a prendre \r\n");
					co = scanC.nextInt();
					co--;
					eleve.addEleveEtCours( eleves.get(el),  courss.get(co));
					}
				else {System.out.print("Liste de cours ou(et) eleves est(sont) vide(s)\r\n");}
			}
			else if(choix.equals("g")) {
				if(eleves.size()!=0 && courss.size()!=0) {
					eleve.afficheEleve_Cours();
					System.out.println("choisit le cours et l eleve a supprimer");
					Scanner scanC = new Scanner(System.in);
					int i = scanC.nextInt();
					i--;
					eleve.desinscrire(i);}
					else {System.out.print("Liste de cours ou(et) eleves est(sont) vide(s)\r\n");
					}
			}
			else if(choix.equals("h")) {
				if(eleves.size()!=0 && courss.size()!=0) {
					eleve.afficheEleve_Cours();}
				else {System.out.print("Liste de cours ou(et) eleves est(sont) vide(s)\r\n");}
			}
			else if(choix.equals("i")) {
				if(eleves.size()!=0 && courss.size()!=0) {
					eleve.afficheEleve(eleves);
					System.out.println("choisit l eleve a savoir le montant");
					Scanner scanC = new Scanner(System.in);
					int i = scanC.nextInt();
					i--;
					eleve.payer(eleves.get(i));
					}
				else {System.out.print("Liste de cours ou(et) eleves est(sont) vide(s)\r\n");}
			}
			else  {
				System.out.println("erreur");
				}
			}
		else if (x==3 && test==false) {
			System.out.println("a. Ajouter Classes\r\n"
				+ "b. Mettre à jour Classes\r\n"
				+ "c. Supprimer Classes\r\n"
				+ "d. Lister les Classes\r\n"
				+ "e. Afficher statistiques\r\n"
				+ "f. Menu"
				);
			String choix = myObj.nextLine();
			if(choix.equals("a")) {
				Vector<Cours> CCours= new Vector<Cours>();
				Vector<Eleve> CEleves= new Vector<Eleve>();
				Vector<Animateur> CAnimateurs= new Vector<Animateur>();
				if(eleves.size()!=0||animateurs.size()!=0||courss.size()!=0) {
				String nomC;
				int eC,aC,cC;
				Scanner myObjC = new Scanner(System.in);
				System.out.println("Classe nom\n");
				nomC = myObjC.nextLine();
				for (int i = 0; i < eleves.size(); i++) {
					 int j=i+1;
					 System.out.print("Index :"+j  +" nom :"+eleves.get(i).nom+" prenom :"+eleves.get(i).prenom+" frais:"+eleves.get(i).frais+"\n");
					 Scanner scanC = new Scanner(System.in);
					 System.out.print("\n1.pour ajouter cet eleve\r\n"
					 + "0.l eleve suivant");
					 eC = scanC.nextInt();
					 if(eC==1) {
						 eleves.get(i).ajouterEleve(eleves.get(i),CEleves);
					 }
				 }
				 for (int i = 0; i < courss.size(); i++) {
					 int j=i+1;
					 System.out.print("Index :"+j +" code :"+courss.get(i).code   +" designation :"+courss.get(i).designation+"\n");
					 Scanner scanC = new Scanner(System.in);
					 System.out.print("\n1.pour ajouter cet cours\r\n"
					 + "0.l cours suivant");
					 cC = scanC.nextInt();
					 if(cC==1) {
						 courss.get(i).ajouterCours(courss.get(i),CCours);
					 }
				 }
				 for (int i = 0; i < animateurs.size(); i++) {
					 int j=i+1;
					 System.out.print("Index :"+j+" cin :"+animateurs.get(i).CIN   +" nom :"+animateurs.get(i).nom+" prenom :"+animateurs.get(i).prenom 
			            		+"\n");
					 Scanner scanC = new Scanner(System.in);
					 System.out.print("\n1.pour ajouter cet animateur\r\n"
					 + "0.l animateur suivant");
					 aC = scanC.nextInt();
					 if(aC==1) {
						 animateurs.get(i).ajouterAnimateur(animateurs.get(i),CAnimateurs);
					 }
				 }
				 	classe = new Classe(nomC,CEleves,CCours,CAnimateurs);
				 	classe.ajouterClasse(classe,classes);
				 }
				else {System.out.print("\nListe de cours ou des eleves ou des animateurs est(sont) vide(s)\r\n");}
			}
			else if(choix.equals("b")) {
				if(classes.size()!=0) {
					int i;
					Scanner scanC = new Scanner(System.in);
					for ( i = 0; i < classes.size(); i++) {
						int j=i+1;
			            System.out.print("Index :"+j  + " classe nom: " +classes.get(i).nom);
			            }
					System.out.print("\nEntrer indice de classe a modifier\n");
					i = scanC.nextInt();
					i--;
					classe.mettreAJourClasse( classes.get(i),  eleves,  courss, animateurs);
					
				}
				else {
					System.out.print("\nListe de cours est vide\r\n");
				}
			}
			else if(choix.equals("c")) {
				if(classes.size()!=0) {
					int j3C;
					Scanner scanC = new Scanner(System.in);
					classe.afficheClasse(classes);
					System.out.print(" \r\n Entrer l indice de classe a supprimer\r\n");
					j3C = scanC.nextInt();
					j3C--;
					classes.get(j3C).supprimerClasse(classes,j3C);
					}
				else {
					System.out.print("\nListe de classe est vide\r\n");
					}
				}
			else if(choix.equals("d")) {
				if(classes.size()!=0) {
					classe.afficheClasse(classes);
					}
				else {
					System.out.print("Liste de cours est vide\r\n");
					}
			}
			else if(choix.equals("e")) {
				classe.statClasse();
			}
			else if(choix.equals("f")) {
				test=true;
			}
			else  {
				System.out.println("erreur");
				}
			}
		else if (x==4 && test==false) {
			System.out.println("a. Ajouter Cours\r\n"
				+ "b. Mettre à jour Cours\r\n"
				+ "c. Supprimer Cours\r\n"
				+ "d. Lister les Cours\r\n"
				+ "e. Afficher statistiques\r\n"
				+ "f. Menu \n"
				);
			String choix = myObj.nextLine();
			if(choix.equals("a")) {
				if(animateurs.size()!=0) {
					int code4A,i4A;
					String designation4A;
					Animateur animateur4A;
					Scanner scan4A = new Scanner(System.in);
					Scanner myObj4A = new Scanner(System.in);
					System.out.println("code");
					code4A = scan.nextInt();
					System.out.println("nom");
					designation4A = myObj4A.nextLine();
					animateur.afficheAnimateur(animateurs);
					System.out.print("1.choisit l indice de l animateur res\r\n");
					i4A = scan4A.nextInt();
					i4A--;
					animateur4A=animateurs.get(i4A);
					cours=new Cours(code4A,designation4A,animateur4A);
					cours.ajouterCours(cours,courss);
				}
				else {
					System.out.print("Liste d animateur est vide\r\n");
				}
			}
			else if(choix.equals("b")) {
				if(courss.size()!=0) {
					String NANomA, NAPrenomA,NAVilleA,NAImgA,NAPPrenomA,NADesignationRueA,NAGouvernoratA,designation4B;
					int i,NACIN,NAPereTelA,NACodePostalA,NAYA,NAMA,NADA,NANumeroRueA,code4B,i4B;
					Cours cours4B;
					cours.afficheCours(courss);
					Scanner scan4B = new Scanner(System.in);
					Scanner myObj4B = new Scanner(System.in);
					System.out.print("1.choisit l indice de cours a modifier\r\n");
					i4B = scan4B.nextInt();
                    i4B--;
					cours4B=courss.get(i4B);
					cours.mettreAJourCours(cours4B,animateurs);
				}
				else {
					System.out.print("Liste de cours est vide\r\n");
					}
			}
			else if(choix.equals("c")) {
				if(courss.size()!=0) {
					int j4C;
					Scanner scanC = new Scanner(System.in);
					cours.afficheCours(courss);
					System.out.print(" \r\n Entrer l indice de cours a supprimer\r\n");
					j4C = scanC.nextInt();
					j4C--;
					courss.get(j4C).supprimerCours(courss,j4C);
			}
				else {
					System.out.print("Liste de cours est vide\r\n");
					}}
			else if(choix.equals("d")) {
				if(courss.size()!=0) {
					cours.afficheCours(courss);}
				else {
					System.out.print("Liste de cours est vide\r\n");
					}
			}
			else if(choix.equals("e")) {
				cours.statCours();
			}
			else if(choix.equals("f")) {
				test=true;
			}
			else  {
				System.out.println("erreur");
				}
			}
		if (x==5 && test==false) {
			System.exit(0);
		}
		else if(x<1||x>5)
		{System.out.println("erreur");}
		}while(1==1);
		}
	}

