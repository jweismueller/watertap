package watertap.service;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful
@Remote(WatertapService.class)
public class WatertapEjb implements WatertapService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public String execute(String name) throws Exception {
		Class<?> cls = Class.forName("watertap.service.Test" + name);
		Test test = (Test) cls.newInstance();
		StringBuilder out = new StringBuilder();
		out.append(test.test(entityManager));
		return out.toString();
	}

}
