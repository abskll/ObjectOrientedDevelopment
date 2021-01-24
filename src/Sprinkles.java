
public class Sprinkles extends ToppingDecorator {

	Dessert dessert;
	
	public Sprinkles(Dessert dessert) {
		this.dessert = dessert;
	}
	public String getDescription() {
		return dessert.getDescription() + ", Sprinkles";
	}
	public double cost() {
		return dessert.cost() + 1.99;
	}
}
