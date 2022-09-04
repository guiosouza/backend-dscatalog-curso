package com.api.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dscatalog.entities.Category;

@RestController // efetua um pré processamento
@RequestMapping(value = "/categories") // rota REST
public class CategoryResource { // recurso relativo a classe Category
	// Controladores REST ficam aqui
	
	// ende point: rota possível que responde a algo
	@GetMapping
	public ResponseEntity<List<Category>> findAll() { // resposta HTTP
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Books"));
		list.add(new Category(2L, "Electronics"));
		return ResponseEntity.ok().body(list);
	} 

		
}
