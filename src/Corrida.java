import java.util.ArrayList;
import java.util.Random;

public class Corrida {

	private int pista;
	private ArrayList<Veiculo> Carros = new ArrayList<>();
	private ArrayList<Piloto> Piloto = new ArrayList<>();
	Random gerador = new Random();

	public Corrida(int KM) {
		pista = KM;
	}

	public void adicionaCarro(Veiculo novoCarro) {
		Carros.add(novoCarro);
		System.out.printf("Novo carro adicionado na corrida\n");
	}

	public void adicionaPiloto(Piloto piloto) {
		Piloto.add(piloto);
		System.out.printf("Novo piloto adicionado na corrida\n");
		piloto.infoPiloto();
	}

	public void iniciarCorrida() {
		System.out.println("Corrida Iniciada!!!!!!!!!!!");
		int distancia = 0;
		while (distancia < getPista()) {
			for (Veiculo Carro : Carros) {

				int numeroSorteado = gerador.nextInt(2);

				if (numeroSorteado == 0) {

					Carro.acelerar();
					distancia = Carro.getDistanciaPercorrida();
					distancia += Carro.getVelocidadeAtual();
					Carro.setDistanciaPercorrida(distancia);

				} else {
					
					Carro.frear();
					distancia = Carro.getDistanciaPercorrida();
					distancia += Carro.getVelocidadeAtual();
					Carro.setDistanciaPercorrida(distancia);
				}

				Carro.imprimirVeiculo(numeroSorteado);
				limpaTela();

				if (distancia >= getPista()) {
					System.out.println("Ganhador foi:");
					String mensagem = Carro.imprimirInfoVeiculo();
					System.out.println(mensagem);
					break;
				}

			}

			try {
				Thread.sleep(200);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void limpaTela() {

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}

	public int getPista() {
		return pista;
	}

	public void setPista(int pista) {
		this.pista = pista;
	}

}
