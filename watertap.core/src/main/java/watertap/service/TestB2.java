package watertap.service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import watertap.domain.b.BStart;
import watertap.domain.b.BWeak1;
import watertap.domain.b.BWeakWeak;

public class TestB2 implements Test {

	@Override
	public String test(EntityManager em) throws Exception {
		StringBuilder out = new StringBuilder();
		TypedQuery<BStart> query = em.createQuery("select s from BStart s", BStart.class);
		out.append(LF);
		for (BStart s : query.getResultList()) {
			for (BWeak1 weak1 : s.weak1s) {
				for (BWeakWeak weakWeak1 : weak1.weakWeaks) {
					out.append(s.name).append("; ");
					out.append(weak1.name).append("; ");
					out.append(weakWeak1.name).append(LF);
				}
			}
		}
		return out.toString();
	}

}
