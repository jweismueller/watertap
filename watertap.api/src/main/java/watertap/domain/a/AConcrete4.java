package watertap.domain.a;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public abstract class AConcrete4 extends AGeneric {

	@OneToMany(cascade = { CascadeType.ALL })
	public List<AConcreteWeak> weaks = new ArrayList<AConcreteWeak>();

}
