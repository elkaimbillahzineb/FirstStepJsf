package beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped

public class ApplicationStatuts implements Serializable{
	   
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// public static final long serialVersionUID = 6666666;
	    int value = 0;
	    public Integer getCounter()
	    {
	      return ++value; 
	    }
	    @PostConstruct
	     void init()
	     {
	      System.err.println("Create"+this);
	     }
	     @PreDestroy
	     void close()
	     {
	      System.err.println("Close" +this);
	     }
	    
	}

