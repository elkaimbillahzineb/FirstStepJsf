package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Classreponse {
 
	private String reponse = "Bonjour tous le monde!! ";
      
	public Classreponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classreponse(String reponse) {
		super();
		this.reponse = reponse;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	} 
	
	
}
