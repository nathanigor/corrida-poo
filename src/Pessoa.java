
public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private double peso;

	public Pessoa(String nome, int idade, double altura, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;

	}

	public void andar() {
		System.out.println("Andei");
	}

	public void falar() {
		System.out.println("Falei");
	}

	public void comer(double caloria) {
		peso += caloria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
