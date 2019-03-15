package Day13;

public class Happiness {

	public void Pizza() {
		System.out.println("Pizza Brings Happiness");
		happy();
	}

	// Don't use same name for a method as that of the class. We only do this when
	// we create
	// constructors

	// public void Happiness() {
	public void happy() {
		System.out.println("Happiness makes you healthy");
		Methods(); 
	}
	
	public void Methods() {
		System.out.println("Eat more Pizza to stay healthy");
	}

	public static void main(String[] args) {

		Happiness h = new Happiness();

		h.Pizza();

	}

}
