package watertap.service;

import javax.persistence.EntityManager;

import watertap.domain.b.BRef;
import watertap.domain.b.BRefRef;
import watertap.domain.b.BStart;
import watertap.domain.b.BWeak1;
import watertap.domain.b.BWeak2;
import watertap.domain.b.BWeakWeak;

public class TestB1 implements Test {

	@Override
	public String test(EntityManager em) throws Exception {
		BStart s1 = new BStart();
		//
		s1.refDefault = new BRef();
		s1.refEager = new BRef();
		s1.refLazy1 = new BRef();
		s1.refLazy2 = new BRef();
		s1.refOptional = new BRef();
		//
		s1.refEager.refEager = new BRefRef();
		s1.refEager.refLazy = new BRefRef();
		//
		s1.refLazy1.refEager = new BRefRef();
		s1.refLazy1.refLazy = new BRefRef();
		//
		s1.weak1s.add(new BWeak1());
		s1.weak1s.get(0).weakWeaks.add(new BWeakWeak());
		s1.weak1s.get(0).weakWeaks.add(new BWeakWeak());
		s1.weak1s.add(new BWeak1());
		s1.weak1s.get(1).weakWeaks.add(new BWeakWeak());
		s1.weak1s.get(1).weakWeaks.add(new BWeakWeak());
		//
		s1.weak2s.add(new BWeak2());
		s1.weak2s.get(0).weakWeaks.add(new BWeakWeak());
		s1.weak2s.get(0).weakWeaks.add(new BWeakWeak());
		//
		em.persist(s1);
		return "";
	}

}
