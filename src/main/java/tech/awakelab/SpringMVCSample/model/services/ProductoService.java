package tech.awakelab.SpringMVCSample.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tech.awakelab.SpringMVCSample.model.beans.ProductoDTO;
import tech.awakelab.SpringMVCSample.model.dao.IProductDAO;

@Service
public class ProductoService {
	
	@Autowired
	@Qualifier("MySQL")
	private IProductDAO productDao;

	public ProductoDTO getProduct(String id) {
		return productDao.get(id);
	}
	
	public List<ProductoDTO> getAllProducts(){
		return productDao.getAll();
	}
	
	public void addProduct(ProductoDTO producto) throws Exception {
		try {
			
			Integer.parseInt(producto.getId());
		}
		catch(Exception e) {
			
			throw new Exception("El id debe ser num�rico");
			
		}
		
		
		if(productDao.get(producto.getId())!= null) {
			throw new Exception("El producto con el id dado ya existe");
		}
	
		
		productDao.addProduct(producto);
	}
}


