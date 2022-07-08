package tech.awakelab.demospring2.model.dao.inMem;

import java.util.List;

import org.springframework.stereotype.Component;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import tech.awakelab.demospring2.model.beans.ProductoDTO;
import tech.awakelab.demospring2.model.dao.IProductDAO;

@Component(value = "Memory")
public class MemoryProductDAO implements IProductDAO {
	
	private List<ProductoDTO> lista = ListSingleton.getInstance().getList();
	

	@Override
	public ProductoDTO get(String id) {
		// TODO Auto-generated method stub
		for(ProductoDTO p: ListSingleton.getInstance().getList()) {
			if(p.getId().equals(id)) {
				return p;
			}
		}
		
		return null;
	}

	@Override
	public List<ProductoDTO> getAll() {
		return lista;
	}

	@Override
	public void addProduct(ProductoDTO producto) {
		
		
		lista.add(producto);
	}

}
