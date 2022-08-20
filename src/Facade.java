

/**
 * Exemplo do padrão de projeto Facade.<br>
 * A classe Compilador é uma fachada. Ou seja, através do seu único método exposto compilar(),<br>
 * ela executa diversas outras ações.
 * @author Manoel Flores Neto
 * @version 1.0
 * @since 17 de ago. de 2022
 */

class Compilador {
	public void compilar(String arquivo) {
		System.out.println("Abrindo arquivo...");
		System.out.println("Fazendo análise léxica...");
		System.out.println("Fazendo análise sintática...");
		System.out.println("Criando bytecodes...");
		System.out.println("Salvando o arquivo executável...");
		System.out.println("Compilação do arquivo " + arquivo + " realizada com sucesso.");
	}
}

public class Facade {
	public static void main(String[] args) {
		Compilador compilador = new Compilador();
		compilador.compilar("teste.java");
	}

}
