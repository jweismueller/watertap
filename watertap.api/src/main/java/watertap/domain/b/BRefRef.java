package watertap.domain.b;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import watertap.domain.BaseEntity;

@Entity
public class BRefRef extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "REFREF")
	@TableGenerator(name = "REFREF")
	public long id;

	@Column
	public String name = nextName();

	@Column
	@Temporal(TemporalType.DATE)
	public Date entryDate = nextDate();
}
