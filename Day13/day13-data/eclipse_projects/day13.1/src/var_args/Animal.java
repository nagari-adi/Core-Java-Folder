package var_args;

public class Animal {
    
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	protected String getName() {
		return name+" "+toString();
	}
	
	
}
