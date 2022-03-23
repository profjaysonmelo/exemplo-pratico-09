/*
 * Adicione o atributo valorAPagar na superclasse Pessoa e o método calcular desconto, conforme abaixo:
		calcularDesconto();
		Pessoa -> 4%
		PF -> 5% / PJ -> 3%
 */

public class Principal {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("João Paulo");
		pf.setCpf("123456789-00");
		pf.setRg("123456");
		pf.setValorAPagar(1000.00);
		
		System.out.println(pf.getNome() + " CPF: " + pf.getCpf() + " RG: " + pf.getRg());
		System.out.println("Desconto: " + pf.calcularDesconto());
	}
	
}
