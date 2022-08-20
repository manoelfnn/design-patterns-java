

import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo do padrão de projeto Observer.<br>
 * Um objeto da classe notificador recebe seus ouvintes.<br>
 * O método notificarOuvintes() chama o método acao() de todos os ouvintes cadastrados.
 * @author Manoel Flores Neto
 * @version 1.0
 * @since 17 de ago. de 2022
 */

interface Ouvinte {
	void acao(String mensagem);
}

class Notificador {
	private List<Ouvinte> escutantes;

	public Notificador() {
		this.escutantes = new ArrayList<>();
	}

	void notificarOuvintes(String mensagem) {
		this.escutantes.stream().forEach((e) -> {
			e.acao(mensagem);
		});
	}
	
	void adicionarEscutante(Ouvinte escutante) {
		this.escutantes.add(escutante);
	}
}

public class Observer {

	public static void main(String[] args) {
		
		Ouvinte ouvinte1 = new Ouvinte() {
			public void acao(String mensagem) {
				System.out.println("Ouvinte 1, recebeu a mensagem: " + mensagem);			
			}
		};
		
		Ouvinte ouvinte2 = new Ouvinte() {
			public void acao(String mensagem) {
				System.out.println("Ouvinte 2, recebeu a mensagem: " + mensagem);			
			}
		};	
		
		Notificador notificador = new Notificador();
		notificador.adicionarEscutante(ouvinte1);
		notificador.adicionarEscutante(ouvinte2);
		
		notificador.notificarOuvintes("Olá ouvinte.");		

	}
}
