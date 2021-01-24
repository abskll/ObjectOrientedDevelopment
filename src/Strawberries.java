
public class Strawberries extends ToppingDecorator {

	Dessert dessert;
	
	public Strawberries(Dessert dessert) {
		this.dessert = dessert;
	}
	public String getDescription() {
		return dessert.getDescription() + ", Strawberries";
	}
	public double cost() {
		return dessert.cost() + 3.99;
	}
}
