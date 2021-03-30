
public class Rom extends Component {
	protected String conMoBoRom;
	public Rom(int id, String type, String name, String manufacturerInformation, String conMoBoRom) {
		super(id, type, name, manufacturerInformation);
		this.conMoBoRom = conMoBoRom;
	}

	public Rom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean equals(MotherBoard other) {
		return this.conMoBoRom == other.conMoBoRom;
	}

	@Override
	public String toString() {
		return "Rom{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conMoBoRom='" + conMoBoRom + '\'' +
				'}';
	}
}
