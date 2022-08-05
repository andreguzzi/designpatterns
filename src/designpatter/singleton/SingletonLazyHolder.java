package designpatter.singleton;

/*
 * Singleton Lazy Holder
 * vai encapsular a intancia em uma classe estática interna
 * tem consumo de memória mais otimizado, thread-safe
 */

public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {}

	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instance;
	}
}
