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

import com.tmzdev.api.model.Order;
import com.tmzdev.api.repository.OrderRepository;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
public class OrderController {

	@Autowired
	private OrderRepository repository;
	
	@PostMapping("/addOrder")
	public String saveOrder(@RequestBody Order order) {
		repository.save(order);
		return "Added Order with id:"+order.getId();
	}
	
	@GetMapping("/findAllOrders")
	public List<Order> getOrders(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllOrders/{id}")
	public Optional<Order> getOrder(@PathVariable int id){
		return repository.findById(id);
	}
	
	@PostMapping("/updateOrder/{id}")
	public String updateOrder(@PathVariable int id, @RequestBody Order order) {
		repository.save(order);
		return "Added Order with id:"+order.getId();
	}
	
	@GetMapping("/delete/{id}")
	public String deleteOrder(@PathVariable int id) {
		repository.deleteById(id);
		return "Order delete with id : "+id;
	}
}
