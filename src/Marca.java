public class Marca {
	
	private int modelo;
	private String cor;
	private int ano;
	private int chassi;
	
	public Marca(int modelo, String cor, int ano, int chassi) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.chassi = chassi;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getChassi() {
		return chassi;
	}
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	
	@Override
	public String toString() {
		return "Marca [modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", chassi=" + chassi + "]";
	}
}
