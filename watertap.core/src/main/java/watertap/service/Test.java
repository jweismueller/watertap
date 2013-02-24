package watertap.service;

import javax.persistence.EntityManager;

public interface Test {
	
	String LF = "\n";
	
	String test(EntityManager em) throws Exception ;

}
