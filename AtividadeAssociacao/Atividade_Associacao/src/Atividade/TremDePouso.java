package Atividade;

public class TremDePouso {
	private String tipoTrem;

	public TremDePouso(String tipoTrem) {
		this.tipoTrem = tipoTrem;
	}

	@Override
	public String toString() {
		return "Tipo de trem de pouso: " + tipoTrem;
	}

}
