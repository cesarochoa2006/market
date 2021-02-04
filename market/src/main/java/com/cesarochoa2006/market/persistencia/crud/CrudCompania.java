package com.cesarochoa2006.market.persistencia.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarochoa2006.market.persistencia.Compania;

public interface CrudCompania extends JpaRepository<Compania, Long> {
	
}
