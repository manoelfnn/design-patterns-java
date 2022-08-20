

import java.util.HashMap;
import java.util.Map;

/**
 * @author Manoel Flores Neto
 * @version 1.0
 * @since 18 de ago. de 2022
 */

class CondiguracoesGlobais {

	private static CondiguracoesGlobais instancia;
	private Map<String, String> configuracoes = new HashMap<>();

	private CondiguracoesGlobais() {
	}

	public static CondiguracoesGlobais getInstancia() {
		if (instancia == null) {
			instancia = new CondiguracoesGlobais();
		}
		return instancia;
	}
	
	public void adicionarConfiguracao(String nome, String valor) {
		configuracoes.put(nome, valor);
	}	

	public String obterConfiguracao(String nome) {
		return configuracoes.get(nome);
	}
}

public class Singleton {

	public static void main(String[] args) {
		
		CondiguracoesGlobais config = CondiguracoesGlobais.getInstancia();		
		config.adicionarConfiguracao("nome", "Projeto Singleton");
		
		CondiguracoesGlobais configXPTO = CondiguracoesGlobais.getInstancia();	
		System.out.println(configXPTO.obterConfiguracao("nome"));
				
	}

}
