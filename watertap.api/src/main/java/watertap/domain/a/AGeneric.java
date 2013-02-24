package watertap.domain.a;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import watertap.domain.BaseEntity;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class AGeneric extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "GENERIC")
	@TableGenerator(name = "GENERIC")
	public long id;

	@Column
	public String name = nextName();

	@Column
	@Temporal(TemporalType.DATE)
	public Date entryDate = nextDate();
}
