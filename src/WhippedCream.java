
public class WhippedCream extends ToppingDecorator {

	Dessert dessert;
	
	public WhippedCream(Dessert dessert) {
		this.dessert = dessert;
	}
	public String getDescription() {
		return dessert.getDescription() + ", Whipped Cream";
	}
	public double cost() {
		return dessert.cost() + 1.99;
	}
}
