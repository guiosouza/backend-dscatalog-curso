package com.api.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dscatalog.entities.Category;
import com.api.dscatalog.repositories.CategoryRepository;


/* OBS:
 * - @Service: vai registrar a classe como componente que vai participar
 * - Do sistema de injeção de dependência automatizado do Spring.
 * - Quer dizer que o gerenciamento das instâncias do "CategoryService"
 * - Será feito pelo Spring.
 */
@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
}
