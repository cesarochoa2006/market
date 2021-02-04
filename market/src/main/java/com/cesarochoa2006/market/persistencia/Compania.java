package com.cesarochoa2006.market.persistencia;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Compania implements Serializable {

	private static final long serialVersionUID = 6100725288440949505L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@Temporal(TemporalType.TIME)
	@Column(nullable = false, updatable = false)
	private Date fechaCreacion = Calendar.getInstance().getTime();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)	
	private List<Proyecto> proyectos;

}
