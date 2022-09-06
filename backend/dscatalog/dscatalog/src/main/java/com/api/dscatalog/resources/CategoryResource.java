package com.api.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dscatalog.entities.Category;
import com.api.dscatalog.services.CategoryService;

@RestController // efetua um pré processamento
@RequestMapping(value = "/categories") // rota REST
public class CategoryResource { // recurso relativo a classe Category
	// Controladores REST ficam aqui
	
	@Autowired
	private CategoryService service;
	
	// end point: rota possível que responde a algo
	@GetMapping
	public ResponseEntity<List<Category>> findAll() { // resposta HTTP
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	} 

		
}
