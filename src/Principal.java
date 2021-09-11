
public class Principal {

	public static void main(String[] args) {

		CarroTunado carro1 = new CarroTunado(4, 4, true, 250, 250.000, "Mach-e", 15, 5);
		Carro carro2 = new Carro(4, 4, false, 120, 10.000, "Chevette", 10);

		Corrida TrilhaBahia = new Corrida(1000);

		TrilhaBahia.adicionaCarro(carro1);
		TrilhaBahia.adicionaCarro(carro2);

		Piloto p1 = new Piloto("Nathan Igor", 20, false, carro1);
		Piloto p2 = new Piloto("Joelson Gonçalves", 20, true, carro2);

		TrilhaBahia.adicionaPiloto(p1);
		TrilhaBahia.adicionaPiloto(p2);

		TrilhaBahia.iniciarCorrida();

	}

}
