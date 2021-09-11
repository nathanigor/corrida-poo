
public class Carro extends Veiculo {

	private int potencia;
	private String espa�o = " ";

	public Carro(int quantRodas, int maxPassageiros, boolean eletrico, int velocidadeMax, double preco, String nome,
			int potencia) {
		super(quantRodas, maxPassageiros, eletrico, velocidadeMax, preco, nome);
		setVelocidadeAtual(0);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void acelerar() {
		int velocidadeAtual = getVelocidadeAtual();
		int novaVelocidade = velocidadeAtual + potencia;
		if (novaVelocidade <= getVelocidadeMax()) {
			setVelocidadeAtual(novaVelocidade);

		} else if (novaVelocidade > getVelocidadeMax()) {
			setVelocidadeAtual(getVelocidadeMax());
		}
		System.out.printf("Carro: %s acelerou e est� a  %s  km/m  e percorreu %sm \n", getNome(), getVelocidadeAtual(),
				getDistanciaPercorrida());
		
	}

	public void frear() {
		int novaVelocidade = getVelocidadeAtual() - potencia;
		if (novaVelocidade <= 0) {
			setVelocidadeAtual(0);
		} else {
			setVelocidadeAtual(novaVelocidade);
			
		}
		System.out.printf("Carro: %s pisou no freio e est� a  %s  km/m  e e percorreu %sm \n", getNome(),
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
		System.out.println("----------------------------------");
		return "";
	}

	public String imprimirVeiculo(int numero) {

		if (numero == 0) {
			if(getVelocidadeAtual() >= 0 && getVelocidadeAtual() <30) {
				espa�o += " ";

			}
			if(getVelocidadeAtual() >= 30 && getVelocidadeAtual() <60) {
				espa�o += " ";
				espa�o += " ";
				
			}
			if(getVelocidadeAtual() >= 60 && getVelocidadeAtual() <90) {
				espa�o += " ";
				espa�o += " ";
				espa�o += " ";
				
			}
			if(getVelocidadeAtual() > 90 ) {
				espa�o += " ";
				espa�o += " ";
				espa�o += " ";
				espa�o += " ";
				
			}
			
		}else {
			espa�o.replace(" ", ""); 


		}

		System.out.println(espa�o + "   _______");
		System.out.print(espa�o + " _/");
		System.out.println("  ||   \\__");
		System.out.print(espa�o + "|__");
		System.out.println("__________d|");
		System.out.print(espa�o + " O");
		System.out.println("           O");
		return "";

	}

}
