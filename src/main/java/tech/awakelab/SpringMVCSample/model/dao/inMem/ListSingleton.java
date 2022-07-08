package tech.awakelab.SpringMVCSample.model.dao.inMem;

import java.util.ArrayList;
import java.util.List;

import tech.awakelab.SpringMVCSample.model.beans.ProductoDTO;


public class ListSingleton {
	private static ListSingleton singleton;
	private static List<ProductoDTO> lista;
	
	
	private ListSingleton() {
		
	}
	
	
	public static ListSingleton getInstance() {
		
		if(singleton == null) {
			singleton = new ListSingleton();
			lista = new ArrayList<ProductoDTO>();
		}
		
		return singleton;
	}
	
	public List<ProductoDTO> getList(){
		return lista;
	}
	

}
