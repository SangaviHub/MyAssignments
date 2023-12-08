package week3.assignments;

public class InterfaceDemo implements DatabseConnection {
	
	public void connect() {
		System.out.println("Connect the database");
	}
	
	public void disconnect() {
		System.out.println("Disconnect the database");
	}
	
	public void executeUpdate() {
		System.out.println("Execute sql update query");
	}
	
	public static void main(String[] args) {
		InterfaceDemo demo = new InterfaceDemo();
		demo.connect();
		demo.executeUpdate();
		demo.disconnect();
	}

}
