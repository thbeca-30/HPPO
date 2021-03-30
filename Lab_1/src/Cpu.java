
public class Cpu extends Component {
	protected String conCpuGrCa;
	protected String conCpuMoBo;
	protected String conCpuRam;


	public Cpu(int id, String type, String name, String manufacturerInformation, String conCpuMoBo, String conCpuGrCa,
			String conCpuRam) {
		super(id, type, name, manufacturerInformation);
		this.conCpuGrCa = conCpuGrCa;
		this.conCpuMoBo = conCpuMoBo;
		this.conCpuRam = conCpuRam;
	}

	public Cpu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean equals(GraphicCard other) {
		return this.conCpuGrCa == other.conCpuGrCa;
	}
	
	public boolean equals(MotherBoard other) {
		return this.conCpuMoBo == other.conCpuMoBo;
	}
	
	public boolean equals(Ram other) {
		return this.conCpuRam == other.conCpuRam;
	}

	@Override
	public String toString() {
		return "Cpu{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conCpuGrCa='" + conCpuGrCa + '\'' +
				", conCpuMoBo='" + conCpuMoBo + '\'' +
				", conCpuRam='" + conCpuRam + '\'' +
				'}';
	}
}
