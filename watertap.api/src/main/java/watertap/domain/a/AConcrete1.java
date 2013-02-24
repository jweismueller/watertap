package watertap.domain.a;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AConcrete1 extends AGeneric {

	private static final long serialVersionUID = 1L;

	@Column(length = 16)
	public String info1 = nextName();
}
