package watertap.domain.b;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

import watertap.domain.BaseEntity;


@Entity
public class BStrong1 extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "STRONG1")
	@TableGenerator(name = "STRONG1")
	public long id;

	@Column
	public String name = nextName();

	@Column(precision = 6, scale = 2)
	public BigDecimal amount = nextDecimal();

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "STRONG1_ID")
	// BatchFetch ist nicht kompatibel mit dem in TestB3 verwendeten QueryHint
	// @BatchFetch(value=BatchFetchType.IN)
	public List<BWeak1> weak1s = new ArrayList<BWeak1>();

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "STRONG1_ID")
	public List<BWeak2> weak2s = new ArrayList<BWeak2>();

	@OneToOne(cascade = { CascadeType.ALL })
	public BStrong2 otherA = null;

	@OneToOne(cascade = { CascadeType.ALL })
	public BStrong2 otherB = null;

	@OneToOne(cascade = { CascadeType.ALL })
	public BStrong2 otherC = null;

	@OneToOne(cascade = { CascadeType.ALL })
	public BStrong2 otherD = null;

}
