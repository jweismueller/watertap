package watertap.domain.b;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import watertap.domain.BaseEntity;

@Entity
public class BRef extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "REF")
	@TableGenerator(name = "REF")
	public long id;

	@Column
	public String name = nextName();

	@Column
	@Temporal(TemporalType.DATE)
	public Date entryDate = nextDate();

	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	public BRefRef refEager = null;

	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	public BRefRef refLazy = null;
}
