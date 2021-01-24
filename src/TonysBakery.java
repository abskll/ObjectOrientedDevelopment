
public class TonysBakery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dessert dessert = new Cookie();
		System.out.println(dessert.getDescription() + " $" + dessert.cost());
		
		Dessert dessert2 = new Cake();
		dessert2 = new Nuts(dessert2);
		dessert2 = new Nuts(dessert2);
		dessert2 = new Sprinkles(dessert2);
		dessert2 = new Strawberries(dessert2);
		dessert2 = new WhippedCream(dessert2);
		System.out.println(dessert2.getDescription() + " $" + dessert2.cost());
		
		Dessert dessert3 = new Pie();
		dessert3 = new Nuts(dessert3);
		dessert3 = new Sprinkles(dessert3);
		dessert3 = new Strawberries(dessert3);
		dessert3 = new WhippedCream(dessert3);
		System.out.println(dessert3.getDescription() + " $" + dessert3.cost());
	}

}
