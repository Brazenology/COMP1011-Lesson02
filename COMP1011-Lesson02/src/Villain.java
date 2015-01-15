
public class Villain extends Hero {

	public Villain(String name) {
		super(name);
	}
	
	public void steals() {
		System.out.println(this.name + " steals health");
	}

}
