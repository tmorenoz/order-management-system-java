package com.tmzdev.api.resource;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tmzdev.api.model.Product;
import com.tmzdev.api.repository.ProductRepository;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})

public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/addProduct")
	public String saveProduct(@RequestBody Product product) {
		repository.save(product);
		return "Added product with id:"+product.getId();
	}
	
	@GetMapping("/findAllProducts")
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllProducts/{id}")
	public Optional<Product> getProduct(@PathVariable int id){
		return repository.findById(id);
	}
	
	@PostMapping("/updateProduct/{id}")
	public String updateProduct(@PathVariable int id, @RequestBody Product product) {
		repository.save(product);
		return "Added product with id:"+product.getId();
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		repository.deleteById(id);
		return "product delete with id : "+id;
	}
}
