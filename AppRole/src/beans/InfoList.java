package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Validation.ValidationView;
import Validation.ValideHome;

@ManagedBean
@SessionScoped
public class InfoList {

	
public static final List<ValideHome> infosListAdmin = new ArrayList<ValideHome>();
public static final List<ValideHome> infosListManager = new ArrayList<ValideHome>();

	
	
	public InfoList(){
	
	}
			
	public List<ValideHome> getInfosListAdmin(){
		
		return infosListAdmin;
	}
   public List<ValideHome> getInfosListManager(){
		
		return infosListManager;
	}
	
}
