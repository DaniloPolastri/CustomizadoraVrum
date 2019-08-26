public class Carro {

	
	private int velocidademax;
	private int veloatual=0;
	private int nrporta;
	private int tetosolar;
	private int nrmarchas;
	private int cambioauto;
	private int combustivel = 100;
	private int marchaAtual;
	
	//private Marca marca = new Marca();
	
	public Carro () {
		
	}
		
	public Carro(int velocidademax, int nrporta, int tetosolar, int nrmarchas, int cambioauto,
			int combustivel) {
		super();
		this.velocidademax = velocidademax;
		this.nrporta = nrporta;
		this.tetosolar = tetosolar;
		this.nrmarchas = nrmarchas;
		this.cambioauto = cambioauto;
		this.combustivel = combustivel;
	}
	
	
	public void passaMarcha(int passamarcha) {
		if(this.veloatual == 0){
			passamarcha = -1;
			System.out.println("PONTO MORTO");
		}else if(this.veloatual == 20) {
			passamarcha = 1;
			System.out.println("PASSANDO A MARCHA: " + passamarcha);
		}else if(this.veloatual == 60) {
			passamarcha = 2;
			System.out.println("PASSANDO A MARCHA: " + passamarcha);
		}else if(this.veloatual == 80) {
			passamarcha = 3;
			System.out.println("PASSANDO A MARCHA: " + passamarcha);
		}else if(this.veloatual == 110 ) {
			passamarcha = 4;
			System.out.println("PASSANDO A MARCHA: " + passamarcha);
		}else if(this.veloatual == 190) {
			passamarcha = 5;
			System.out.println("PASSANDO A MARCHA: " + passamarcha);
		}else if(this.veloatual == 250) {
			passamarcha = 6;
			System.out.println("PASSANDO A MARCHA: " + passamarcha);
			System.out.println("Ultima marcha ativada, iniciado modo TURBO vrummmmmmmmmm.....");
		}	
			
	}
	
	public void reduzMarcha( int reduzMarcha) {
		
		if(this.veloatual == 0){
			reduzMarcha = 0;
			System.out.println("RÉ ATIVADA");
		}else if(this.veloatual == 20) {
			reduzMarcha = 1;
			System.out.println("REDUZINDO A MARCHA PARA: " + reduzMarcha);
		}else if(this.veloatual == 60) {
			reduzMarcha = 2;
			System.out.println("REDUZINDO A MARCHA PARA: " + reduzMarcha);
		}else if(this.veloatual == 80) {
			reduzMarcha = 3;
			System.out.println("REDUZINDO A MARCHA PARA: " + reduzMarcha);
		}else if(this.veloatual == 110 ) {
			reduzMarcha = 4;
			System.out.println("REDUZINDO A MARCHA PARA: " + reduzMarcha);
		}else if(this.veloatual == 190) {
			reduzMarcha = 5;
			System.out.println("REDUZINDO A MARCHA PARA: " + reduzMarcha);
		}else if(this.veloatual == 250) {
			reduzMarcha = 6;
			System.out.println("REDUZINDO A MARCHA PARA: " + reduzMarcha);
		}	

		
	}
	 
	public Integer acelera() {
		if (this.getVeloatual() == this.getVelocidademax()) {
			System.out.println("=============================================================================");
			System.out.println("Velocidade maxima atingida, não pode acelarar mais do que a velocidade máxima");
			System.out.println("=============================================================================");
			return this.getVeloatual();
		} else
			this.veloatual+=10;
			return this.getVeloatual();
	}


	
	public void freia () {
		if(this.veloatual == 0 ) {
			System.out.println("Carro parado");
		} else {
			this.veloatual -= 10;	
		}
	
	}
	public int getVelocidademax() {
		return velocidademax;
	}
	public void setVelocidademax(int velocidademax) {
		this.velocidademax = velocidademax;
	}
	public int getVeloatual() {
		return veloatual;
	}
	public void setVeloatual(int veloatual) {
		this.veloatual = veloatual;
	}
	public int getNrporta() {
		return nrporta;
	}
	public void setNrporta(int nrporta) {
		this.nrporta = nrporta;
	}
	public int getTetosolar() {
		return tetosolar;
	}
	public void setTetosolar(int tetosolar) {
		this.tetosolar = tetosolar;
	}
	public int getNrmarchas() {
		return nrmarchas;
	}
	public void setNrmarchas(int nrmarchas) {
		this.nrmarchas = nrmarchas;
	}
	public int getCambioauto() {
		return cambioauto;
	}
	public void setCambioauto(int cambioauto) {
		this.cambioauto = cambioauto;
	}
	public int getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		return "Carro [velocidademax=" + velocidademax + ", veloatual=" + veloatual + ", nrporta=" + nrporta
				+ ", tetosolar=" + tetosolar + ", nrmarchas=" + nrmarchas + ", cambioauto=" + cambioauto
				+ ", combustivel=" + combustivel + "]";
	}

}
