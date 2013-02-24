package watertap.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final List<String> RANDOM_NAMES = new ArrayList<String>();

	private Random r = new Random();

	protected String nextName() {
		int size = RANDOM_NAMES.size();
		return RANDOM_NAMES.get(r.nextInt(size));
	}

	protected Date nextDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, -r.nextInt(365));
		return cal.getTime();
	}

	protected BigDecimal nextDecimal() {
		return new BigDecimal(r.nextInt(9999) + "." + r.nextInt(99));
	}

	static {
		RANDOM_NAMES.add("Chas");
		RANDOM_NAMES.add("Cerqueo");
		RANDOM_NAMES.add("Rodgha");
		RANDOM_NAMES.add("Chacer");
		RANDOM_NAMES.add("Therxon");
		RANDOM_NAMES.add("Gobur");
		RANDOM_NAMES.add("Belrmor");
		RANDOM_NAMES.add("Keliro");
		RANDOM_NAMES.add("Scheage");
		RANDOM_NAMES.add("Daran");
		RANDOM_NAMES.add("Iton");
		RANDOM_NAMES.add("Rothos");
		RANDOM_NAMES.add("Nuis");
		RANDOM_NAMES.add("Pervesy");
		RANDOM_NAMES.add("Oningi");
		RANDOM_NAMES.add("Onaz");
		RANDOM_NAMES.add("Warkaw");
		RANDOM_NAMES.add("Osane");
		RANDOM_NAMES.add("Morest");
		RANDOM_NAMES.add("Ontia");
		RANDOM_NAMES.add("Tinyv");
		RANDOM_NAMES.add("Anggari");
		RANDOM_NAMES.add("Morsler");
		RANDOM_NAMES.add("Sambcha");
		RANDOM_NAMES.add("Ryntaso");
		RANDOM_NAMES.add("Naltasu");
		RANDOM_NAMES.add("Echer");
		RANDOM_NAMES.add("Ildvtas");
		RANDOM_NAMES.add("Morost");
		RANDOM_NAMES.add("Torhough");
		RANDOM_NAMES.add("Untrurn");
		RANDOM_NAMES.add("Golye");
		RANDOM_NAMES.add("Peresh");
		RANDOM_NAMES.add("Voron");
		RANDOM_NAMES.add("Keshy");
		RANDOM_NAMES.add("Keech");
		RANDOM_NAMES.add("Garfvor");
		RANDOM_NAMES.add("Thruir");
		RANDOM_NAMES.add("Belnage");
		RANDOM_NAMES.add("Eldar");
		RANDOM_NAMES.add("Rakurn");
		RANDOM_NAMES.add("Emkel");
		RANDOM_NAMES.add("Whenal");
		RANDOM_NAMES.add("Hinril");
		RANDOM_NAMES.add("Oughen");
		RANDOM_NAMES.add("Atar");
		RANDOM_NAMES.add("Delighti");
		RANDOM_NAMES.add("Rodond");
		RANDOM_NAMES.add("Hatuc");
		RANDOM_NAMES.add("Ghajrod");
		RANDOM_NAMES.add("Nysshye");
		RANDOM_NAMES.add("Urnyll");
		RANDOM_NAMES.add("Quaon");
		RANDOM_NAMES.add("Imdynu");
		RANDOM_NAMES.add("Mored");
		RANDOM_NAMES.add("Gharr");
		RANDOM_NAMES.add("Phoim");
		RANDOM_NAMES.add("Inaton");
		RANDOM_NAMES.add("Estimo");
		RANDOM_NAMES.add("Vesow");
		RANDOM_NAMES.add("Torylye");
		RANDOM_NAMES.add("Lereck");
		RANDOM_NAMES.add("Inageo");
		RANDOM_NAMES.add("Peran");
		RANDOM_NAMES.add("Smuack");
		RANDOM_NAMES.add("Tiazat");
		RANDOM_NAMES.add("Kinpgha");
		RANDOM_NAMES.add("Delcshy");
		RANDOM_NAMES.add("Endnend");
		RANDOM_NAMES.add("Cheing");
		RANDOM_NAMES.add("Chaghau");
		RANDOM_NAMES.add("Delenthi");
		RANDOM_NAMES.add("Creves");
		RANDOM_NAMES.add("Undran");
		RANDOM_NAMES.add("Ildpris");
		RANDOM_NAMES.add("Swydra");
		RANDOM_NAMES.add("Isiq");
		RANDOM_NAMES.add("Ineeld");
		RANDOM_NAMES.add("Etes");
		RANDOM_NAMES.add("Blyvor");
		RANDOM_NAMES.add("Athdyno");
		RANDOM_NAMES.add("Lorrack");
		RANDOM_NAMES.add("Kinolt");
		RANDOM_NAMES.add("Uskmos");
		RANDOM_NAMES.add("Shyt");
		RANDOM_NAMES.add("Shyet");
		RANDOM_NAMES.add("Peris");
		RANDOM_NAMES.add("Vesar");
		RANDOM_NAMES.add("Aughban");
		RANDOM_NAMES.add("Tasslye");
		RANDOM_NAMES.add("Cerdvor");
		RANDOM_NAMES.add("Tuyer");
		RANDOM_NAMES.add("Semor");
		RANDOM_NAMES.add("Hontia");
		RANDOM_NAMES.add("Petai");
		RANDOM_NAMES.add("Chakas");
		RANDOM_NAMES.add("Biad");
		RANDOM_NAMES.add("Esswlye");
		RANDOM_NAMES.add("Emttia");
		RANDOM_NAMES.add("Shocha");
		RANDOM_NAMES.add("Oror");
		RANDOM_NAMES.add("Ightsam");
		RANDOM_NAMES.add("Hinlnys");
		RANDOM_NAMES.add("Uskvwar");
		RANDOM_NAMES.add("Emding");
		RANDOM_NAMES.add("Tinyum");
		RANDOM_NAMES.add("Enther");
		RANDOM_NAMES.add("Iair");
		RANDOM_NAMES.add("Stryat");
		RANDOM_NAMES.add("Umyunt");
		RANDOM_NAMES.add("Tines");
		RANDOM_NAMES.add("Morak");
		RANDOM_NAMES.add("Torvack");
		RANDOM_NAMES.add("Honthere");
		RANDOM_NAMES.add("Samom");
		RANDOM_NAMES.add("Hony");
		RANDOM_NAMES.add("Peros");
		RANDOM_NAMES.add("Redel");
		RANDOM_NAMES.add("Isskeld");
	}
}
