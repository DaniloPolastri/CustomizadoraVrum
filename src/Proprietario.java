public class Proprietario {
	
	private String nome;
	private int cpf;
	private int rg;
	private String datanasc;
	private Endereco endereco; 
	
	
	public Proprietario() {
		
	}
	public Proprietario (String nome,int cpf, int rg, Endereco endereco, String datanasc) {
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.datanasc = datanasc;
	
	}
	

	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public int getRg() {
		return rg;
	}



	public void setRg(int rg) {
		this.rg = rg;
	}



	public String getDatanasc() {
		return datanasc;
	}



	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", datanasc=" + datanasc + ", endereco="
				+ endereco + "]";
	}

	
	}
