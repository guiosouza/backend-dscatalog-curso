package com.api.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.dscatalog.entities.Category;

@Repository // vira um componente injetável
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
