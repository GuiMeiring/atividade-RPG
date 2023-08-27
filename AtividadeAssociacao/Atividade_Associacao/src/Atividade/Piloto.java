package Atividade;

public class Piloto {
	private String nome;

	public Piloto(String nome) {
		this.nome= nome;
	}

	@Override
	public String toString() {
		return "Nome do piloto: " + nome;
	}

}
