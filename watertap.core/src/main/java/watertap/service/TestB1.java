package watertap.service;

import javax.persistence.EntityManager;

import watertap.domain.b.BStrong1;
import watertap.domain.b.BStrong2;
import watertap.domain.b.BStrong3;
import watertap.domain.b.BWeak1;
import watertap.domain.b.BWeak2;
import watertap.domain.b.BWeakWeak;

public class TestB1 implements Test {

	@Override
	public String test(EntityManager em) throws Exception {
		BStrong1 s1 = new BStrong1();
		//
		s1.otherA = new BStrong2();
		;
		s1.otherB = new BStrong2();
		;
		s1.otherC = new BStrong2();
		;
		s1.otherD = new BStrong2();
		;
		//
		s1.otherA.moreA = new BStrong3();
		s1.otherA.moreB = new BStrong3();
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
