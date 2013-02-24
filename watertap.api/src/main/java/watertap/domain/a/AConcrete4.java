package watertap.domain.a;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public abstract class AConcrete4 extends AGeneric {

	private static final long serialVersionUID = 1L;

	@OneToMany(cascade = { CascadeType.ALL })
	public List<AConcreteWeak> weaks = new ArrayList<AConcreteWeak>();
}
