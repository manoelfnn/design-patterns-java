

/**
 * @author Manoel Flores Neto
 * @version 1.0
 * @since 18 de ago. de 2022
 */

interface Construtor {

}

class GeradorSql {
	private String colunas = "";
	private String tabela = "";
	private String condicao = "";
	private String ordenacao = "";

	public GeradorSql select(String colunas) {
		this.colunas = colunas;
		return this;
	}

	public GeradorSql from(String tabela) {
		this.tabela = tabela;
		return this;
	}

	public GeradorSql where(String condicao) {
		this.condicao = condicao;
		return this;
	}

	public GeradorSql orderby(String ordenacao) {
		this.ordenacao = ordenacao;
		return this;
	}

	public String gerarSql() {
		String consulta = "";
		if (!this.colunas.isEmpty()) {
			consulta += "SELECT " + this.colunas;
		}
		if (!this.tabela.isEmpty()) {
			consulta += " FROM " + this.tabela;
		}
		if (!this.condicao.isEmpty()) {
			consulta += " WHERE " + this.condicao;
		}
		if (!this.ordenacao.isEmpty()) {
			consulta += " ORDER BY " + this.ordenacao;
		}
		return consulta;
	}

}

public class Builder {

	public static void main(String[] args) {
		GeradorSql geradorSql = new GeradorSql();
		String sql = geradorSql.select("*").from("usuarios").where("ativo = 1").orderby("id DESC").gerarSql();
		System.out.println(sql);

	}

}
