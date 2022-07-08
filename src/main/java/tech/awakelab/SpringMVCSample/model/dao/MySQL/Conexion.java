package tech.awakelab.SpringMVCSample.model.dao.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	private static Connection conexion;
	
	
	private Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2", "root", "Asdf1234$");
			
			System.out.println("EXISTE");
		}
		catch (Exception e) {
			System.out.println("NO EXISTE");
		}
	}
	
	
	public static Connection getInstance() {
		
		if(conexion == null) {
			new Conexion();
		}
		
		return conexion;
	}

}
