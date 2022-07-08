package tech.awakelab.demospring2.model.dao;
import java.util.List;

import tech.awakelab.demospring2.model.beans.ProductoDTO;


public interface IProductDAO {
	
	public ProductoDTO get(String id);
	
	public List<ProductoDTO> getAll();
	
	public void addProduct(ProductoDTO producto);

}
