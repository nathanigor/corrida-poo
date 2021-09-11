
public abstract class Veiculo {

	// Atributos/ Características
	private int quantRodas;
	private int maxPassageiros;
	private boolean eletrico;
	private int velocidadeAtual;
	private int velocidadeMax;
	private double preco;
	private int distanciaPercorrida;
	private String nome;

	public Veiculo(int quantRodas, int maxPassageiros, boolean eletrico, int velocidadeMax, double preco, String nome) {
		super();
		this.quantRodas = quantRodas;
		this.maxPassageiros = maxPassageiros;
		this.eletrico = eletrico;
		this.velocidadeMax = velocidadeMax;
		this.preco = preco;
		this.nome = nome;
		this.velocidadeAtual = 0;
		this.distanciaPercorrida = 0;
	}

	// Métodos/Ações
	abstract void acelerar();

	abstract void frear();
	
	abstract String imprimirInfoVeiculo();
	abstract String imprimirVeiculo(int numero);


	public int getQuantRodas() {
		return quantRodas;
	}

	public void setQuantRodas(int quantRodas) {
		this.quantRodas = quantRodas;
	}

	public int getMaxPassageiros() {
		return maxPassageiros;
	}

	public void setMaxPassageiros(int maxPassageiros) {
		this.maxPassageiros = maxPassageiros;
	}

	public boolean isEletrico() {
		return eletrico;
	}

	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}

	public int getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(int distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}


}