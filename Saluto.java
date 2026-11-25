public class Saluto {
	private String nome;

	public Saluto(String nome) {
		this.nome = nome;
	}

	public void stampaMessaggio() {
		System.out.println("Ciao, " + nome + ".");
	}
}
