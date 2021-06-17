package miniProjetPackage;

public class Adresse {
	int numeroRue,codePostal;
	String designationRue,ville,gouvernorat;
	public Adresse(int numeroRue, int codePostal, String designationRue, String ville, String gouvernorat) {
		this.numeroRue = numeroRue;
		this.codePostal = codePostal;
		this.designationRue = designationRue;
		this.ville = ville;
		this.gouvernorat = gouvernorat;
	}
	public Adresse() {
		
	}
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public void setDesignationRue(String designationRue) {
		this.designationRue = designationRue;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	
}
