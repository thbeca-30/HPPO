
public class MotherBoard extends Component {
	protected String conCpuMoBo;
	protected String conMoBoRam;
	protected String conMoBoRom;

	public MotherBoard(int id, String type, String name, String manufacturerInformation, String conCpuMoBo,
			String conMoBoRam, String conMoBoRom) {
		super(id, type, name, manufacturerInformation);
		this.conCpuMoBo = conCpuMoBo;
		this.conMoBoRam = conMoBoRam;
		this.conMoBoRom = conMoBoRom;
	}

	public MotherBoard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public boolean equals(Cpu other) {
		return this.conCpuMoBo == other.conCpuMoBo;
	}
	
	public boolean equals(Ram other) {
		return this.conMoBoRam == other.conMoBoRam;
	}
	
	public boolean equals(Rom other) {
		return this.conMoBoRom == other.conMoBoRom;
	}


	@Override
	public String toString() {
		return "MotherBoard{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conCpuMoBo='" + conCpuMoBo + '\'' +
				", conMoBoRam='" + conMoBoRam + '\'' +
				", conMoBoRom='" + conMoBoRom + '\'' +
				'}';
	}
}
