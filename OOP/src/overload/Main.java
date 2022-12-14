package overload;

public abstract class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Refeicao refeicao = new Refeicao("steak","arroz colorido");
		System.out.println("Igredientes de refeicao exemplo de overloaded constructors");
		System.out.println(refeicao.carbo);	
		System.out.println(refeicao.protein);
		System.out.println(refeicao.salad);
		System.out.println(refeicao.drink);
	
	
	}

}
