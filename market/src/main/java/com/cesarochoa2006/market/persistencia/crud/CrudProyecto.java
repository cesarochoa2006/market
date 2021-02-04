package com.cesarochoa2006.market.persistencia.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarochoa2006.market.persistencia.Proyecto;

public interface CrudProyecto extends JpaRepository<Proyecto, Long> {

}
