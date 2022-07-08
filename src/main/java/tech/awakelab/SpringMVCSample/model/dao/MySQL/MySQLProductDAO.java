package tech.awakelab.SpringMVCSample.model.dao.MySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import tech.awakelab.SpringMVCSample.model.beans.ProductoDTO;
import tech.awakelab.SpringMVCSample.model.dao.IProductDAO;

@Component(value = "MySQL")
public class MySQLProductDAO implements IProductDAO {
	
	private Connection conexion;
	
	
	public MySQLProductDAO() {
		conexion = Conexion.getInstance();
	}

	@Override
	public ProductoDTO get(String id) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public List<ProductoDTO> getAll() {
		String sql = "SELECT idProducto, name, price FROM producto";
		List<ProductoDTO> resultado = new ArrayList<ProductoDTO>();
		try {
			Statement stm = conexion.createStatement(); 
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				resultado.add(new ProductoDTO(rs.getString("idProducto"),rs.getString("name"), rs.getString("price")));
			}
			
			rs.close();
			stm.close();
			System.out.println("todo bien GET ALL");
		}
		catch (Exception e) {
			System.out.println("FALLA GET ALL");
		}
		
		return resultado;
	}

	@Override
	public void addProduct(ProductoDTO producto) {
		
		String sql = "INSERT producto (idProducto, name, price) values ('"+producto.getId()+"', '"+producto.getName()+"', '"+producto.getPrice()+"')";
		try {
			Statement stm = conexion.createStatement();
			stm.execute(sql);
			stm.close();
			System.out.println("todo bien GET ALL");
		}
		catch (Exception e) {
			System.out.println("FALLA GET ALL");
		}
		
	}

}
