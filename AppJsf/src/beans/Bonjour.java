package beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Bonjour {

	private String B = "Bonjour, il est :";
    public String getBonjour() {
        return 	B;
    }

    public void setBonjour(String bonjour) {
        this.B = bonjour;
    }
    
    public String getMessage(){
        return B + " "+ new SimpleDateFormat("HH:mm:ss").format(new Date());    
    }
    
    public String getgetMessage(){
        return "Message"+ " "+ new SimpleDateFormat("HH:mm:ss").format(new Date());    
    }
    
    
	
	
	
}
