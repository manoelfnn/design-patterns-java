

/**
 * Exemplo de utilização do padrão Strategy.<br>
 * A classe Gps utiliza diferentes estratégias (Carro, Bike e Carroça) para calcular o
 * tempo necessário para percorrer determinada distância.
 * 
 * @author Manoel Flores Neto
 * @version 1.0
 * @since 17 de ago. de 2022
 */

// Interface das estratégias

interface IVeiculo {
	String veiculoNome();

	float calcularTempo(int distancia);
}

// Implementações das diferentes estratégias Carro/Bike/Carroça 

class Carro implements IVeiculo {
	public String veiculoNome() {
		return "Carro";
	}

	public float calcularTempo(int distancia) {
		return (distancia / 80) * 60; // 80km hora
	}
}

class Bike implements IVeiculo {
	public String veiculoNome() {
		return "Bicicleta";
	}

	public float calcularTempo(int distancia) {
		return (distancia / 15) * 60; // 15km hora
	}
}

class Carroca implements IVeiculo {
	public String veiculoNome() {
		return "Carroça";
	}

	public float calcularTempo(int distancia) {
		return (distancia / 20) * 60; // 20km hora
	}

}

// Implementação da classe Gps que faz uso das diferentes estratégias de locomoção.

class Gps {
	private IVeiculo veiculo;

	public Gps(IVeiculo veiculo) {
		this.veiculo = veiculo;
	}

	public float calcularTempo(int distancia) {
		return veiculo.calcularTempo(distancia);
	}

	public String veiculoNome() {
		return veiculo.veiculoNome();
	}
}

// Classe de inicialização

public class Proxy {

	public static void main(String[] args) {
		Carroca carroca = new Carroca();
//		Bike bike = new Bike();
//		Carro carro = new Carro();

		int distancia = 1000;
		Gps gps = new Gps(carroca);
		float tempo = gps.calcularTempo(distancia);
		System.out.printf("De \"%s\", demora cerca de %.0f minutos para percorrer %s Km.", gps.veiculoNome(), tempo,
				distancia);

	}

}
