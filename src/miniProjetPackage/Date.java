package miniProjetPackage;

public class Date {
	int j;
	int m;
	int a;
	Date(){
		
	}
	void setDate(int jour,int mois,int annee) {
		j=jour;
		m=mois;
		a=annee;
	}
	void afficheDate(){
		System.out.println(j+"/"+m+"/"+a);
	}
}
