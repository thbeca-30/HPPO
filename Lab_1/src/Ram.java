
public class Ram extends Component {
	protected String conCpuRam;
	protected String conMoBoRam;

	public Ram(int id, String type, String name, String manufacturerInformation, String conCpuRam, String conMoBoRam) {
		super(id, type, name, manufacturerInformation);
		this.conCpuRam = conCpuRam;
		this.conMoBoRam = conMoBoRam;
	}

	public Ram() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean equals(Cpu other) {
		return this.conCpuRam == other.conCpuRam;
	}
	
	public boolean equals(MotherBoard other) {
		return this.conMoBoRam == other.conMoBoRam;
	}

	@Override
	public String toString() {
		return "Ram{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conCpuRam='" + conCpuRam + '\'' +
				", conMoBoRam='" + conMoBoRam + '\'' +
				'}';
	}
}
