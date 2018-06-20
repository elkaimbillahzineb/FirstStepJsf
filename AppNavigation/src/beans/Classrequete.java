package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Classrequete {

	
	private String requete = "Entrer votre message : ";

	public Classrequete() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Classrequete(String requete) {
		super();
		this.requete = requete;
	}


	public String getRequete() {
		return requete;
	}

	public void setRequete(String requete) {
		this.requete = requete;
	}
	
	
	
	
	
}
