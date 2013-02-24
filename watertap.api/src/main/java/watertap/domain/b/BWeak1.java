package watertap.domain.b;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import watertap.domain.BaseEntity;


@Entity
public class BWeak1 extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "WEAK")
	@TableGenerator(name = "WEAK")
	public long id;

	@Column
	public String name = nextName();

	@Column
	@Temporal(TemporalType.DATE)
	public Date entryDate = nextDate();

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "BWEAK1_WEAKWEAK_RELATION", joinColumns = { @JoinColumn(name = "WEAK1_ID") }, inverseJoinColumns = { @JoinColumn(name = "WEAKWEAK_ID") } )
	public List<BWeakWeak> weakWeaks = new ArrayList<BWeakWeak>();

}
