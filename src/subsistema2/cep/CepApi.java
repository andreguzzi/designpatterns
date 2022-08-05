package subsistema2.cep;

import designpatter.singleton.SingletonEager;

public class CepApi {
	
private static CepApi instance = new CepApi();
	
	private CepApi() {}
	
	public static CepApi getInstance() {
		return instance;
	}
	
	public String recuperarCidade(String cep) {
		return "Florian�polis";
	}
	
	public String recuperarEstado(String cep) {
		return "SC";
	}

}
