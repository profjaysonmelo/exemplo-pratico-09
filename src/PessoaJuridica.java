
public class PessoaJuridica extends Pessoa {

	private String ie;
	private String cnpj;
	private String razaoSocial;
	
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public double calcularDesconto() {
		return this.getValorAPagar() * 0.03;
	}
}
