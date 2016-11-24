package proj1;
import proj1.Pokoj;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokoj salon = new Pokoj(10, 10, 2);
		Pokoj kuchnia = new Pokoj(15, 5, 2);
		Pokoj sypialnia = new Pokoj(8, 8, 2);
		
		System.out.println("salon");
		System.out.println("objetosc : " + Integer.toString(salon.objetosc()));
		System.out.println("powierzchnia podlogi : " + Integer.toString(salon.pow_podlogi()));
		System.out.println("powierzchnia scian : " + Integer.toString(salon.pow_scian()));
		System.out.println("koszt malowania : " + Integer.toString(salon.koszt_malowania()));
		System.out.println("koszt malowania podlogi : " + Integer.toString(salon.koszt_malowania_podlogi()));
		System.out.println("");
		
		System.out.println("kuchnia");
		System.out.println("objetosc : " + Integer.toString(salon.objetosc()));
		System.out.println("powierzchnia podlogi : " + Integer.toString(salon.pow_podlogi()));
		System.out.println("powierzchnia scian : " + Integer.toString(salon.pow_scian()));
		System.out.println("koszt malowania : " + Integer.toString(salon.koszt_malowania()));
		System.out.println("koszt malowania podlogi : " + Integer.toString(salon.koszt_malowania_podlogi()));
		System.out.println("");
		
		System.out.println("sypialnia");
		System.out.println("objetosc : " + Integer.toString(salon.objetosc()));
		System.out.println("powierzchnia podlogi : " + Integer.toString(salon.pow_podlogi()));
		System.out.println("powierzchnia scian : " + Integer.toString(salon.pow_scian()));
		System.out.println("koszt malowania : " + Integer.toString(salon.koszt_malowania()));
		System.out.println("koszt malowania podlogi : " + Integer.toString(salon.koszt_malowania_podlogi()));
		System.out.println("");		
	}

}
