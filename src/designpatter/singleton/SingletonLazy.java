package designpatter.singleton;

/*
 * Singleton Pregui�oso
 * vai fazer verifica��o para ver se esta nulo e retornar ela mesma
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
