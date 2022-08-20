

import java.util.ArrayList;

/**
 * Exemplo de utilização do padrão Proxy.<br>
 * A classe ArrayListProxy é um proxy da classe ArrayList.<br>
 * Essa nova classe extende todos os comportamentos da classe mãe, no
 * entanto,<br>
 * ela faz um log, sempre que, um item for adicionado ou removido.
 * 
 * @author Manoel Flores Neto
 * @version 1.0
 * @since 17 de ago. de 2022
 */

class ArrayListProxy<T> extends ArrayList<T> {
	private static final long serialVersionUID = 1L;

	// Sobrescreve o método original, fazendo um log da ação.
	public boolean add(T e) {
		System.out.println("Adicionando item: " + e);
		return super.add(e);
	};

	// Sobrescreve o método original, fazendo um log da ação.
	public T remove(int index) {
		System.out.println("Removendo item: " + index);
		return super.remove(index);
	};
}

public class Strategy {

	public static void main(String[] args) {

		ArrayListProxy<String> lista = new ArrayListProxy<>();

		lista.add("Manoel");
		lista.add("Flores");
		lista.add("Neto");
		lista.add("Neto");
		lista.remove(2);

		System.out.println(lista);

	}

}
