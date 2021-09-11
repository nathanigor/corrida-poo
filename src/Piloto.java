
public class Piloto extends Pessoa {

	private boolean CNH;
	private Veiculo carro;

	public Piloto(String nome, int idade, boolean CNH, Veiculo carro) {
		super(nome, idade);
		this.CNH = CNH;
		this.carro = carro;
	}

	public boolean isCNH() {
		return CNH;
	}

	public void setCNH(boolean CNH) {
		this.CNH = CNH;
	}

	public void infoPiloto() {
		System.out.println("---------------------------------");
		System.out.printf("  Nome: %s                       \n", getNome());
		System.out.printf("  Idade: %s                      \n", getIdade());
		System.out.printf("  CNH: %s                        \n", isCNH());
		System.out.printf("  Carro: %s                      \n", carro.getNome());
		System.out.println("----------------------------------");
	}

	public void AcelerarCarro(Carro carro) {
		carro.acelerar();
	}

	public void AcelerarCarro(CarroTunado carroTunado) {
		carroTunado.acelerar();
	}

}
