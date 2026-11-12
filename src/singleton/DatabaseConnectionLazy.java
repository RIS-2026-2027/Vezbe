package singleton;

public class DatabaseConnectionLazy {
	//2. način - lazy loading
	private static DatabaseConnectionLazy instance;
	
	/*public*/ private DatabaseConnectionLazy() {}

	//implementacija konekcije na BP

	public static DatabaseConnectionLazy getInstance() {
		if(instance==null)
			instance = new DatabaseConnectionLazy();
		return instance;
	}

}
