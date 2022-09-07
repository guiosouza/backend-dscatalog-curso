package com.api.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.dscatalog.dto.CategoryDTO;
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

	@Transactional(readOnly = true) // garante mais estabilidade banco
	public List<CategoryDTO> findAll() {
		List<Category> list = repository.findAll();

		// converter lista pra stream depois stream para lista:
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}

}
