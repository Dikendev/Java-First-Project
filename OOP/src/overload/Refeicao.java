package overload;

public class Refeicao {

	String carbo;
	String protein;
	String salad;
	String drink;
	
	
	Refeicao(String carbo){
		this.carbo = carbo;	
	}
	
	Refeicao(String carbo,String protein){
		this.carbo = carbo;
		this.protein = protein;
	}
	
	Refeicao(String carbo,String protein,String salad){
		this.carbo = carbo;
		this.protein = protein;
		this.salad = salad;
	}
	
	Refeicao(String carbo,String protein,String salad,String drink){
		this.carbo = carbo;
		this.protein = protein;
		this.salad = salad;
		this.drink = drink;
	}
}
