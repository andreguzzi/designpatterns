package designpatter.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

/* Facade
 * Prover uma interface que reduza a complexidade nas integrações com subsistemas
 */

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstance().recuperarCidade(cep);
		String estado = CepApi.getInstance().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
