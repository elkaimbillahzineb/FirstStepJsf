package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Validation.ValidationView;


@ManagedBean
@SessionScoped
public class InfosBean  implements Serializable {
	
	public static final List<ValidationView> infosList = new ArrayList<ValidationView>();
	
	
	public InfosBean(){
		
		

	}
			
	public List<ValidationView> getInfosList(){
		
		return infosList;
	}
	
	
	
	

}
