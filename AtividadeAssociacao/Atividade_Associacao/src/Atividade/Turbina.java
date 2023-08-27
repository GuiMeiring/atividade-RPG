package Atividade;

public class Turbina {
	private String  tipoTur;

	public Turbina(String tipoTur) {
		this.tipoTur = tipoTur; 
	}

	@Override
	public String toString() {
		return "Tipo de turbina: "+ tipoTur;
	}
	

}
