

/**
 * Exemplo do padrão de projeto Decorator.<br>
 * A classe Tag recebe um nome para a tag e o próximo decorador.
 * @author Manoel Flores Neto
 * @version 1.0
 * @since 17 de ago. de 2022
 */

class Tag {
	private Tag conteudo;
	private String nome;

	public Tag(String nome, Tag conteudo) {
		this.nome = nome;
		this.conteudo = conteudo;
	}

	public String escreve(int espacos) {
		String s = "";
		for (int i = 0; i < espacos; i++) {
			s += " ";
		}
		String tag = s + "<" + this.nome + ">\n";
		tag += this.conteudo == null ? "" : conteudo.escreve(espacos + 3);
		return tag + s + "</" + this.nome + ">\n";
	}
}

public class Decorator {

	public static void main(String[] args) {
		Tag html = new Tag("html", new Tag("body", new Tag("div", new Tag("h1", null))));
		System.out.println(html.escreve(0));
	}

}
