package watertap.domain.a;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AConcrete2 extends AGeneric {

	private static final long serialVersionUID = 1L;

	@Column
	public String info2 = nextName();
}
