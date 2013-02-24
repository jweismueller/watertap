package watertap.service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import watertap.domain.b.BRef;
import watertap.domain.b.BStart;

public class TestB3 implements Test {

	@Override
	public String test(EntityManager em) throws Exception {
		StringBuilder out = new StringBuilder();
		TypedQuery<BStart> query = em.createQuery("select s from BStart s", BStart.class);
		out.append(LF);
		int i = 0;
		for (BStart s : query.getResultList()) {
			out.append(++i).append(") ").append(s.name).append(LF);
			out.append("   refDefault:  ").append(s.refDefault.getClass().toString()).append(LF);
			out.append("   refEager:    ").append(s.refEager.getClass().toString()).append(LF);
			out.append("   refLazy1:    ").append(s.refLazy1.getClass().toString());
			out.append(" with id ").append(s.refLazy1.toString()).append(LF);
			out.append("   refLazy2:    ").append(s.refLazy2.getClass().toString());
			out.append(" with id ").append(s.refLazy2.toString()).append(LF);
			out.append("   refOptional: ").append(s.refOptional.getClass().toString()).append(LF);
//			out.append("   refLazy.refEager: ").append(s.refLazy1.refEager.toString()).append(LF);
//			out.append("   refLazy.refLazy:  ").append(s.refLazy1.refLazy.toString()).append(LF);
		}
		return out.toString();
	}

}
