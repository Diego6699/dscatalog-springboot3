package br.com.diegocoding.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.diegocoding.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
