package tech.awakelab.demospring2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.demospring2.model.beans.ProductoDTO;
import tech.awakelab.demospring2.model.services.ProductoService;

@Controller
@RequestMapping("/productos/{productoId}")
public class ProductosController {
	@Autowired
	private ProductoService servicio;
	
	@RequestMapping(method = RequestMethod.GET)
	public String mostrarProductos(Model model) {
		
		List<ProductoDTO> lista = servicio.getAllProducts();
		model.addAttribute("productos", lista);
		
		return "listaProductos";
	}
	
	@RequestMapping(path="/stats/{var}",method = RequestMethod.GET)
	public String mostrarProducto(@PathVariable String productoId, @PathVariable String var, Model model) {
		
		System.out.println("PRODUCTO ID: "+productoId);
		System.out.println("PRODUCTO VAR: "+var);
		
		return "listaProductos";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String agregarProducto(@PathVariable String productoId, String id, Model model) {
		
		System.out.println("PRODUCTO ID: "+productoId);
		System.out.println("ID :"+id);
		
		model.addAttribute("productos", null);
		return "listaProductos";
	}
	
	
	
//	@RequestMapping(path = "/productos", method = RequestMethod.POST)
//	public ModelAndView agregarProducto(HttpServletRequest request, HttpServletResponse response, String id, HttpSession session, Model model) {
//		
//		System.out.println("ID: "+id);
//		//List<ProductoDTO> lista = servicio.getAllProducts();
//		//model.addAttribute("productos", lista);
//		
//		//return "listaProductos";
//		
//		List<ProductoDTO> lista = servicio.getAllProducts();
//		return new ModelAndView("listaProductos","productos", lista);
//	}
}
