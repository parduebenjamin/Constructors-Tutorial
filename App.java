class Machine {
	private String name;
	
	public Machine() {
		//constructors don't have a return time
		//the name of the constructor needs to match the class

		this("Pumpkin Pie");
		//when calling a constructor in another constructor; that needs to go first
		System.out.println("Constructor Ran");
		name = "Ben";
		
	}
	


public Machine (String name) {
	this.name = name;
	System.out.println( "Constructor " + name + " Ran");
	
}

public Machine (int number) {
	//this.number = number;
	System.out.println("Int " +number+ " Constructor Ran");
	}

public Machine (int number, String name) {
	//this.number = number;
	//this.name = name;
	System.out.println("Int " + number + " " + name + " Constructor Ran");
	
}


}




public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine();
		//just creating the object causes the constructor to run
		Machine machine2 = new Machine("Bananas");
		Machine machine3 = new Machine(4);
		Machine machine4 = new Machine(71, "Oranges");
		
		//constructors can take parameters
	}

}

