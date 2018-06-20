package Validation;


import javax.faces.bean.ManagedBean;

import beans.InfosBean;


@ManagedBean
public class ValidationView {
	
	
	private String nom;
	private String prenom;
	private String adresse;
	private String login;
	private String mdp;
	private String mdp2;
	
	
	
	public ValidationView() {
		super();
	}
	public ValidationView(String nom, String prenom, String adresse, String login, String mdp) 
	{
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.login = login;
		this.mdp = mdp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getMdp2() {
		return mdp2;
	}
	public void setMdp2(String mdp2) {
		this.mdp2 = mdp2;
	}
 
	public String addInfo() {		 
	     
		ValidationView info = new ValidationView(nom,prenom,adresse,login,mdp);
	    InfosBean.infosList.add(info);
	    return "error";
	}
     

}
