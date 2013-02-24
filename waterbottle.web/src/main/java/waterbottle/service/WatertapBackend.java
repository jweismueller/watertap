package waterbottle.service;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import watertap.service.WatertapService;

@RequestScoped
public class WatertapBackend {

	InitialContext ic;
	{
		try {
			ic = new InitialContext();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	@Produces
	public WatertapService getService() {
		try {
			Object o = ic.lookup("java:global/watertap/watertap.core/WatertapEjb!watertap.service.WatertapService");
			return (WatertapService) o;
		} catch (NamingException e) {
			e.printStackTrace();
			return null;
		}
	}

}
