
public class CarroTunado extends Veiculo {

	private int turbo;
	private int potencia;
	private String espaço = " ";

	public CarroTunado(int quantRodas, int maxPassageiros, boolean eletrico, int velocidadeMax, double preco,
			String nome, int potencia, int turbo) {
		super(quantRodas, maxPassageiros, eletrico, velocidadeMax, preco, nome);
		setVelocidadeAtual(0);
		this.turbo = turbo;
		this.potencia = potencia;

	}

	public int getTurbo() {
		return turbo;
	}

	public void setTurbo(int turbo) {
		this.turbo = turbo;
	}

	public void acelerar() {
		int velocidadeAtual = getVelocidadeAtual();
		int novaVelocidade = velocidadeAtual + potencia + turbo;
		if (novaVelocidade <= getVelocidadeMax()) {
			setVelocidadeAtual(novaVelocidade);

		} else if (novaVelocidade > getVelocidadeMax()) {
			setVelocidadeAtual(getVelocidadeMax());

		}
		System.out.printf("Carro: %s acelerou e está a  %s  km/m  e percorreu %sm \n", getNome(), getVelocidadeAtual(),
				getDistanciaPercorrida());

	}

	public void frear() {
		int novaVelocidade = getVelocidadeAtual() - potencia - turbo;
		if (novaVelocidade <= 0) {
			setVelocidadeAtual(0);
		} else {
			setVelocidadeAtual(novaVelocidade);

		}

		System.out.printf("Carro: %s pisou no freio e está a  %s  km/m  e e percorreu %sm \n", getNome(),
				getVelocidadeAtual(), getDistanciaPercorrida());

	}

	public String imprimirInfoVeiculo() {
		System.out.println("---------------------------------");
		System.out.printf("  Carro: %s                      \n", getNome());
		System.out.printf("  Valor: R$:%.3f                 \n", getPreco());
		System.out.printf("  Eletrico: %s                   \n", isEletrico());
		System.out.printf("  Quant. Max Passageiros: %s     \n", getMaxPassageiros());
		System.out.printf("  Quant Rodas: %s                \n", getMaxPassageiros());
		System.out.printf("  Potencia: %s                   \n", getPotencia());
		System.out.printf("  Velocidade Max: %s             \n", getVelocidadeMax());
		System.out.printf("  Turbo: %s                      \n", getTurbo());
		System.out.println("----------------------------------");
		return "";
	}

	public String imprimirVeiculo(int numero) {

		if (numero == 0) {
			if(getVelocidadeAtual() >= 0 && getVelocidadeAtual() <30) {
				espaço += " ";

			}
			if(getVelocidadeAtual() >= 30 && getVelocidadeAtual() <60) {
				espaço += " ";
				espaço += " ";
				
			}
			if(getVelocidadeAtual() >= 60 && getVelocidadeAtual() <90) {
				espaço += " ";
				espaço += " ";
				espaço += " ";
				
			}
			if(getVelocidadeAtual() > 90 ) {
				espaço += " ";
				espaço += " ";
				espaço += " ";
				espaço += " ";
				
			}
			
		}else {
			espaço.replace(" ", ""); 

		}

		System.out.println(espaço + "   _______");
		System.out.print(espaço + " _/");
		System.out.println("  ||   \\__");
		System.out.print(espaço + "|__");
		System.out.println("__________d|");
		System.out.print(espaço + " O");
		System.out.println("           O");
		return "";

	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
