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
public class BStrong3 extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "STRONG3")
	@TableGenerator(name = "STRONG3")
	public long id;

	@Column
	public String name = nextName();

	@Column
	@Temporal(TemporalType.DATE)
	public Date entryDate = nextDate();

}
