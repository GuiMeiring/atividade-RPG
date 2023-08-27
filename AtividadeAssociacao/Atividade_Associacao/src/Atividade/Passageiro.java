package Atividade;

public class Passageiro {
	private int numPasageiro;

	public Passageiro(int numPasageiro) {
		this.numPasageiro=numPasageiro;
	}

	@Override
	public String toString() {
		return "Número de pasageiro: " + numPasageiro;
	}

}
