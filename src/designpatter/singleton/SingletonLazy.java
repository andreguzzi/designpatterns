package designpatter.singleton;

/*
 * Singleton Preguiçoso
 * vai fazer verificação para ver se esta nulo e retornar ela mesma
 */

public class SingletonLazy {

	private static SingletonLazy instance;
	
	private SingletonLazy() {}
	
	public static SingletonLazy getInstance() {
		
		if (instance == null) {
			instance = new SingletonLazy();
		}
		
		return instance;
	}
}
