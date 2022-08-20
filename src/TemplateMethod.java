/**
 * Exemplo de utilização do padrão Template Method.<br>
 * Na classe abstrata Prato, é especificado uma ação "assar()", essa ação utilza os métodos nome(), tempo() e temperatura()<br>
 * que devem ser implementados por suas classes derivadas.
 * @author Manoel Flores Neto
 * @version 1.0
 * @since 17 de ago. de 2022
 */


abstract class Prato {
	final public void assar() {
		System.out.println("O prato " + this.nome() + " precisa ficar " + this.tempo() + 
				" minutos no forno com temperatura de " + this.temperatura() + 
				" graus para ficar pronto.");
	}

	public abstract String nome();
	
	public abstract int tempo();

	public abstract int temperatura();
}

class Pizza extends Prato {
	public String nome() {
		return "Pizza";
	}	
	public int tempo() {
		return 15;
	}

	public int temperatura() {
		return 180;
	}
}

class Lazanha extends Prato {
	public String nome() {
		return "Lazanha";
	}	
	public int tempo() {
		return 35;
	}

	public int temperatura() {
		return 150;
	}
}

public class TemplateMethod {

	public static void main(String[] args) {

		Pizza pizza = new Pizza();
		pizza.assar();
		
		Lazanha lazanha = new Lazanha();
		lazanha.assar();		
	}

}
