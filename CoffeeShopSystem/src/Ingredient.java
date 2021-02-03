
/*Course: COMP 1020(A03)
 * Name: Saif Mahmud
 * ID: 7808507
 * Assignment 1
 */
public class Ingredient {
	
	private String ingredient = null;
	private int ingredientAmount ;
	private double ingredientPrice ;
	
	public Ingredient(String ingredientName, int ingredientAmnt, double ingredientCost) {       //this is constructor
		this.ingredient = ingredientName;
		this.ingredientAmount = ingredientAmnt;
		this.ingredientPrice = ingredientCost;
	}
	
	public double getCost() {
		return (((double)ingredientAmount/1000)*(ingredientPrice));
	}
	public String toString() {
		return ('\t'+(ingredient + ", " + ingredientAmount + " mls, " + ingredientPrice + "/L"));
	}
}
