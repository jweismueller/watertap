package watertap.domain.a;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AConcrete1 extends AGeneric {

	@Column(length = 16)
	public String info1 = nextName();

}
