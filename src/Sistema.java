import java.util.Scanner;

public class Sistema {
	private static Scanner ler;

	public static void main(String[] args) {
	
		String nome,bairro,rua,estado,cidade,datanasc,complemento,cor,modelocar = " ";
		int cpf,rg,cep,velocidademax,nrporta,nrmarchas,combustivel,tetosolar,cambioauto,ano,chassi,modelo,test = 0;
		double precoano = 0,precomodelo = 0,precomarcha = 0,precoporta = 0,precoteto = 0,precocambio = 0,precoinicial = 20000.00;
		Endereco endere = new Endereco();
		Proprietario prop = new Proprietario();
		
		
		ler = new Scanner(System.in);
		
		System.out.println("====================================================================================");
		System.out.println("                             CUSTOMIZADORA VRUM!!                                   ");
		System.out.println("====================================================================================");
		
		
		System.out.println("                                                                                    ");
		System.out.println("====================================================================================");
		System.out.println("                         ________________________________");
		System.out.println("                                                         ");
		System.out.println("                                 INFO PROPRIETÁRIO       ");
		System.out.println("                         ________________________________");
		System.out.println("                                                         ");
		System.out.print("|Digite o nome do proprietário: ");
		nome = ler.nextLine();
		System.out.print("|Digite a data de nascimento (22/02/2222): ");
		datanasc = ler.nextLine();
		System.out.print("|CPF: ");
		cpf = ler.nextInt();
		ler.nextLine();
		System.out.print("|RG: ");
		rg = ler.nextInt();
		
		System.out.println("====================================================================================");
		System.out.println("                         ________________________________");
		System.out.println("                                                         ");
		System.out.println("                                   ENDEREÇAMENTO         ");
		System.out.println("                         ________________________________");
		
		System.out.println("                                                                                    ");
		ler.nextLine();
		System.out.println("|Digite seu estado: ");
		estado = ler.nextLine();
		System.out.println("|Digite sua cidade: ");
		cidade = ler.nextLine();
		System.out.println("|Digite seu bairro: ");
		bairro = ler.nextLine();
		System.out.println("|Digite a sua rua: ");
		rua = ler.nextLine();
		System.out.println("|Digite seu cep: ");
		cep = ler.nextInt();
		ler.nextLine();
		System.out.println("|Digite seu complemento: ");
		complemento = ler.nextLine();
		System.out.println("                                                                                    ");
		System.out.println("====================================================================================");

		
		endere = new Endereco(bairro, rua, estado, cidade, cep, complemento);
		prop = new Proprietario(nome, cpf, rg, endere , datanasc);
		
		
		System.out.println("                                                                                    ");
		System.out.println("====================================================================================");
		System.out.println("                             CUSTOMIZADOR DE CARRO                                  ");
		System.out.println("====================================================================================");
		System.out.println("                         ________________________________");
		System.out.println("                                                         ");
		System.out.println("                                    CUSTOMIZAÇÃO         ");
		System.out.println("                         ________________________________");
		System.out.println("                                                         ");
		System.out.print("|Digite o modelo do carro (1- Ferrari , 2- BMW , 3-AUDI):  ");
		modelo = ler.nextInt();
		ler.nextLine();
		System.out.print("|Digite a cor do carro: ");
		cor = ler.nextLine();
		System.out.print("|Digite o ano do carro: ");
		ano = ler.nextInt();
		ler.nextLine();
		System.out.print("|Digite o chassi do carro: ");
		chassi = ler.nextInt();
		System.out.println("                         ________________________________");
		System.out.println("                                                         ");
		System.out.println("                          CUSTOMIZAÇÃO TÉCNICA DO CARRO  ");
		System.out.println("                         ________________________________");
		System.out.println("                                                         ");
		System.out.print("|Velocidade max do carro (max 300): ");
		velocidademax = ler.nextInt();
		ler.nextLine();
		System.out.print("|Números de porta min(2), max(4): ");
		nrporta = ler.nextInt();
		ler.nextLine();
		System.out.print("|Teto Solar (1=sim/2=não): ");
		tetosolar = ler.nextInt();
		System.out.print("|Número de marchas (4),(6): ");
		nrmarchas = ler.nextInt();
		ler.nextLine();
		System.out.print("|Cambio automático (1=sim/2=não): ");
		cambioauto = ler.nextInt();
		System.out.print("|Combustivel: ");
		combustivel = ler.nextInt();
		ler.nextLine();
		
		Marca mr = new Marca(modelo, cor, ano, chassi);
		Carro cr = new Carro(velocidademax, nrporta, tetosolar, nrmarchas, cambioauto, combustivel);

		
//		
//		System.out.println(prop.toString());
//		System.out.println(endere.toString());
//		System.out.println(cr.toString());
		
		
		if(nrporta == 2) {
			 precoporta = 4000;
		}else if (nrporta == 3) {
			 precoporta = 6000;
		}else if (nrporta == 4) {
			 precoporta = 8000;
		}
		
		if (tetosolar == 1) {
			precoteto = 7000;
		} else {
			precoteto = 0;
		}
		
		if(nrmarchas == 4) {
			 precomarcha = 4000;
		} else if(nrmarchas == 6) {
			precomarcha = 6000;
		}
		
		if(cambioauto == 1) {
			precocambio = 10000;
		} else {
			precocambio = 0;
		}
		
		if(modelo == 1) {
			precomodelo = 200000;
			modelocar = "Ferrari";
		} else if (modelo == 2) {
			precomodelo = 150000;
			modelocar = "BMW";
		} else if (modelo == 3) {
			precomodelo = 190000;
			modelocar = "AUDI";
		}
		if (ano < 2000){
			precoano = 20000;
		}
		else if(ano >= 2000 && ano >= 2005) {
			precoano = 30000;
			
		} else if (ano >= 2001 && ano <= 2010) {
			precoano = 35000;
		} else if (ano > 2010) {
			precoano = 40000;
		}
		
		double total = precomarcha + precoporta + precocambio + precoteto + precomodelo + precoano + precoinicial;
		
		System.out.println("====================================================================================");
		System.out.println("                         ________________________________");
		System.out.println("                                                                                    ");
		System.out.println("                                 INFO PREÇO CARRO        ");
		System.out.println("                         ________________________________");
		
		System.out.println("                                                                                    ");
		System.out.println("|Preço para numero de marchas:R$" + precomarcha);
		System.out.println("|Preço para numero de portas:R$" +precoporta);
		System.out.println("|Preço para cambio automático:R$" +precocambio);
		System.out.println("|Preço para teto solar:R$" +precoteto);
		System.out.println("|Preço ano do carro(" + ano + ")" + "R$" + precoano);
		System.out.println("                                                                                    ");
		System.out.println("|Preço total da customização do carro é: R$" + total);
		System.out.println("====================================================================================");
		System.out.println("                                                                                    ");
		System.out.println("                                                                                    ");
		
		System.out.println("====================================================================================");
		System.out.println("Deseja testar o carro (1= SIM e 0= NAO)? ");
		test = ler.nextInt();
		
		switch (test) {
		case 1:
			int i2;
			for (int i = cr.getVeloatual(); cr.getVeloatual() <= velocidademax ; i++) {	
				System.out.println("Desejar acelerar mais ou  freiar (1- acelerar ,2- freiar ou 3-parar o teste)? ");
				i2 = ler.nextInt();
				if( i2 == 1) {
					if(cr.getVeloatual() <= velocidademax) {
						System.out.println("Velocidade atual: " + cr.getVeloatual());
						cr.passaMarcha(i);
						cr.acelera();
					}
				}
				if(i2 == 2) {
					if(cr.getVeloatual() <= velocidademax && cr.getVeloatual() != 0) {
						System.out.println("Velocidade atual: " + cr.getVeloatual());
						cr.reduzMarcha(i);
						cr.freia();
					} else if (cr.getVeloatual() == 0 ){
						int i3;
						System.out.println("CARRO PARADO");
						System.out.println("Engatar a ré (1-SIM e 2 -NAO)? ");
						i3 = ler.nextInt();
							
							if(i3 == 1) {
								if(cr.getVeloatual() == 0) {
									System.out.println("RÉ ENGATADA");
								} else {
									System.out.println("NAO PODE ENGATAR A RÉ");
								}
						
							} else if(i3 == 2) {
								System.out.println("PONTO MORTO");
							}
							
					}
				}
				if(i2 == 3) {
					System.out.println("                                                         ");
					System.out.println("                         ________________________________");
					System.out.println("                                                         ");
					System.out.println("                                    INFO GERAIS          ");
					System.out.println("                         ________________________________");
					System.out.println("                                                         ");
					System.out.println("Nome do proprietário: " + nome);
					System.out.println("Nascimento: " + datanasc);
					System.out.println("CPF: " + cpf);
					System.out.println("Estado: " + estado);
					System.out.println("Cidade: "  + cidade);
					System.out.println("Bairro: " + bairro);
					System.out.println("Rua: " + rua);
					System.out.println("CEP: " + cep);
					System.out.println("                         ");
					System.out.println("|INFO CARRO PROPRIETÁRIO|");
					System.out.println("                         ");
					System.out.println("Modelo: " + modelocar);
					System.out.println("Cor: " + cor);
					System.out.println("Ano: " + ano);
					System.out.println("Chassi: " + chassi);
					System.out.println("Preço do carro customizado R$" + total);
					System.out.println("==================================VOLTE SEMPRE=====================================");
					break;
				}
			}
			
			
			
//			cr.setVeloatual(0);
//			cr.passaMarcha();
//			
//			cr.passaMarcha();
//			System.out.println(cr.acelera());
//			System.out.println(cr.getVeloatual());
	
			
			break;		
		default:
			System.out.println("                                                         ");
			System.out.println("                         ________________________________");
			System.out.println("                                                         ");
			System.out.println("                                 INFO GERAIS             ");
			System.out.println("                         ________________________________");
			System.out.println("                                                         ");
			System.out.println("Nome do proprietário: " + nome);
			System.out.println("Nascimento: " + datanasc);
			System.out.println("CPF: " + cpf);
			System.out.println("Estado: " + estado);
			System.out.println("Cidade: "  + cidade);
			System.out.println("Bairro: " + bairro);
			System.out.println("Rua: " + rua);
			System.out.println("CEP: " + cep);
			System.out.println("                         ");
			System.out.println("|INFO CARRO PROPRIETÁRIO|");
			System.out.println("                         ");
			System.out.println("Modelo: " + modelocar);
			System.out.println("Cor: " + cor);
			System.out.println("Ano: " + ano);
			System.out.println("Chassi: " + chassi);
			System.out.println("Preço do carro customizado R$" + total);
			System.out.println("==================================VOLTE SEMPRE=====================================");
			break;
		}
		
	}
}
