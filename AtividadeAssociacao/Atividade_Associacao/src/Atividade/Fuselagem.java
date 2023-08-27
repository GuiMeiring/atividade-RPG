package Atividade;

public class Fuselagem {
	private String Material;

	public Fuselagem(String materialFuse) {
		this.Material= materialFuse;
	}

	@Override
	public String toString() {
		return "Material da Fuselagem: " + Material;
	}

	

}
