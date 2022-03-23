
public class PessoaFisica extends Pessoa {

	private String celular;
	private String rg;
	private String cpf;
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double calcularDesconto() {
		return this.getValorAPagar() * 0.05;
	}
	
}
