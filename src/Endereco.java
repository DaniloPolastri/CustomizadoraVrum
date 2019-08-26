public  class Endereco{	
	protected String rua;
	protected String cidade;
	protected String estado;
	protected int cep;
	protected String complemento;
	private String bairro;
	
	
	public Endereco() {
		
	}
	public Endereco(String bairro, String rua, String estado, String cidade, int cep, String complemento) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getCep() {
		return cep;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", complemento="
				+ complemento + ", bairro=" + bairro + "]";
	}
	
	
}
