package week3.assignments;

public class JavaConnection extends MySqlConnection {
	
	public void connect() {
		System.out.println("Connect the database");
	}
	
	public void disconnect() {
		System.out.println("Disconnect the database");
	}
	
	public void executeUpdate() {
		System.out.println("Execute sql update query");
	}
	
	public void executeQuery() {
		System.out.println("SQL query is executed");
	}

	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect();
		java.executeQuery();
		java.executeUpdate();
		java.disconnect();

	}

}
