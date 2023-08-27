package Atividade;

public class Assento {
	private int qtdAssentos;

	public Assento(int qtdAssento) {
		this.qtdAssentos= qtdAssentos;
	}

	@Override
	public String toString() {
		return "Quantidade de assentos: " + qtdAssentos;
	}
	

}
