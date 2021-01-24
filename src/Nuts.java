
public class Nuts extends ToppingDecorator {

	Dessert dessert;
	
	public Nuts(Dessert dessert) {
		this.dessert = dessert;
	}
	public String getDescription() {
		return dessert.getDescription() + ", Nuts";
	}
	public double cost() {
		return dessert.cost() + 0.99;
	}
}
