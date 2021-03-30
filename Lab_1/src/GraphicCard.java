
public class GraphicCard extends Component {
	protected String conCpuGrCa;

	public GraphicCard(int id, String type, String name, String manufacturerInformation, String conCpuGrCa) {
		super(id, type, name, manufacturerInformation);
		this.conCpuGrCa = conCpuGrCa;
	}

	public GraphicCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean equals(Cpu other) {
		return this.conCpuGrCa == other.conCpuGrCa;
	}

	@Override
	public String toString() {
		return "GraphicCard{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conCpuGrCa='" + conCpuGrCa + '\'' +
				'}';
	}
}
