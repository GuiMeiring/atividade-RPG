package Atividade;

import java.util.ArrayList;

public class Aviao {
	Asas asas;
	Assento assento;
	Leme leme;
	TremDePouso tremDePouso;
	Manche manche;
	Banheiro banheiro;
	Turbina turbina;
	Fuselagem fuselagem;
	Passageiro passageiro;
	Piloto piloto;
	private int cadastro;
	private static int qtdAvioes;
	private static  ArrayList<Aviao>listaAvioes=new ArrayList<>();
	public static ArrayList<Aviao> getListaFormas() {
		return listaAvioes;
	}


	public  void adicionar() {
		listaAvioes.add(this);
	}
	/*public  void remover() {
		listaAvioes.add(this);
	}
	*/

	
	
	public Aviao(Asas asas, Assento assento, Fuselagem fuselagem, Manche manche, Leme leme,Turbina turbina, TremDePouso tremDePouso
			) {
		super();
		this.asas = asas;
		this.assento = assento;
		this.leme = leme;
		this.tremDePouso = tremDePouso;
		this.manche = manche;
		this.turbina = turbina;
		this.fuselagem = fuselagem;
		qtdAvioes ++;
		this.cadastro = qtdAvioes;
		
	}

	public Banheiro getBanheiro() {
		return banheiro;
	}

	public void setBanheiro(Banheiro banheiro) {
		this.banheiro = banheiro;
	}


	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public int getCadastro() {
		return cadastro;
	}

	@Override
	public String toString() {
		return "\n------------------------------"+"\nAviao cadastro: "+cadastro +"\n"+ asas + "\n" + assento + "\n" + leme + "\n" + tremDePouso
				+ "\n" + manche + "\n" + banheiro + "\n" + turbina + "\n" + fuselagem
				+ "\n" + passageiro + "\n" + piloto + "\n"
				+ cadastro;
	}
	
	
	
 
	
}
