package designpatter.singleton;

/*
 * Singleton apressado
 * vai instanciar direto quando precisar esta pronto 
 */

public class SingletonEager {
	
private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstance() {
		return instance;
	}

}
