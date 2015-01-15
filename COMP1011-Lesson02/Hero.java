public class Hero {
	//Private Properties.................................................
    private int strength;
    private int speed;
    private int health;
    public String name;
    

    //Getters.............................................................
	public int getStrength() {
		return strength;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getHealth() {
		return health;
	}
	
	//Constructor+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Hero(String name) {
		this.name = name;
		
		generateAbilities();
	}

	//Private Methods-----------------------------------------------------
	private void generateAbilities() {
		
	}
	
	public void fight() {
		
	}
	
	public void run() {
		
	}
}
