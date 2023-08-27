package Atividade;

import java.util.Scanner;



public class Executavel {

	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("MENU"
					+"\n1 - Cadastrar Avião"
					+"\n2 - Listar todos os Aviões"
					+"\n3 - Remover Avião"
					+"\n4 - Fechar programa");
			int escolha=sc.nextInt();
			switch(escolha) {
			case 1:{
				System.out.println("Formato das asas: "); 
				String formato=sc.next();
				Asas asas = new Asas(formato);
				System.out.println("Quantidade de assentos: ");
				int qtdAssento=sc.nextInt();
				Assento assento = new Assento(qtdAssento);
				System.out.println("Material da fuselagem: ");
				String materialFuse=sc.next();
				Fuselagem fuselagem=new Fuselagem(materialFuse);
				System.out.println("Piloto automatico: ");
				String pilotoAutomatico=sc.next();
				Manche manche = new Manche( pilotoAutomatico);
				System.out.println("Tamanho do leme: ");
				int tamLeme=sc.nextInt();
				Leme leme =new Leme(tamLeme);
				System.out.println("Tipo da turbina: ");
				String tipoTur=sc.next();
				Turbina turbina =new Turbina(tipoTur);
				System.out.println("Tipo do trem de pouso");
				String tipoTrem=sc.next();
				TremDePouso tremDePouso=new TremDePouso(tipoTrem);
				Aviao aviao =new Aviao(asas,assento,fuselagem,manche,leme,turbina,tremDePouso);
				aviao.adicionar();
				System.out.println("Deseja adicionar mais componentes? ");
				String opicao =sc.next();
				if(opicao.equals("sim")) {
					System.out.println("Nome do piloto: ");
					String nome=sc.next();
					aviao.setPiloto(new Piloto(nome));
					System.out.println("Quantidade de passageiro: ");
					int numPasageiro=sc.nextInt();
					aviao.setPassageiro(new Passageiro(numPasageiro));
				}
				break;
			}
			case 2:{
				for (int i = 0; i < Aviao.getListaFormas().size(); i++) {
					System.out.println(Aviao.getListaFormas().get(i).toString());
				}				
				break;
			}case 3:{
				System.out.print("Número de cadastro a ser removido: ");
				int numeroEscolhido = sc.nextInt();
				for (int i = 0; i < Aviao.getListaFormas().size(); i++) {
					if (numeroEscolhido ==  Aviao.getListaFormas().get(i).getCadastro()) {
						Aviao.getListaFormas().remove(i);
					}
				}
				break;
			}
			case 4:{
				System.exit(0);
			}
			}
			
		}while(true);

	}

}

