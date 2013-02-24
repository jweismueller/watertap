package watertap.service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import watertap.domain.b.BStrong1;
import watertap.domain.b.BWeak1;
import watertap.domain.b.BWeakWeak;


public class TestB2 implements Test {

	@Override
	public String test(EntityManager em) throws Exception {
		StringBuilder out = new StringBuilder();
		TypedQuery<BStrong1> query = em.createQuery("select s from BStrong1 s", BStrong1.class);
		out.append("Strong1.name; Strong1.weaks1s[n].name; Strong1.weaks1s[n].weakWeaks[m].name");
		out.append(LF);
		for (BStrong1 s : query.getResultList()) {
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
