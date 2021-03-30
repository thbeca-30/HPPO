
public abstract class Component {
	protected int id;
	protected String type;
	protected String name;
	protected String manufacturerInformation;
	//private String componentCompatibility;
	
	
	public Component(int id, String type, String name, String manufacturerInformation) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.manufacturerInformation = manufacturerInformation;
		//this.componentCompatibility = componentCompatibility;
	}



	public Component() {
		super();
	}

	
	public int getId() {
		return id;
	}



	public String getType() {
		return type;
	}




	public String getName() {
		return name;
	}




	public String getManufacturerInformation() {
		return manufacturerInformation;
	}


	@Override
	public String toString() {
		return "Component [id=" + id + ", type=" + type + ", name=" + name + ", manufacturerInformation="
				+ manufacturerInformation + "]";
	}
	
	
}
