package watertap.domain.b;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import watertap.domain.BaseEntity;


@Entity
public class BStrong2 extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "STRONG2")
	@TableGenerator(name = "STRONG2")
	public long id;

	@Column
	public String name = nextName();

	@Column
	@Temporal(TemporalType.DATE)
	public Date entryDate = nextDate();
	
	@OneToOne(cascade = { CascadeType.ALL })
	public BStrong3 moreA = null;

	@OneToOne(cascade = { CascadeType.ALL })
	public BStrong3 moreB = null;

}
