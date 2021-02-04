package com.cesarochoa2006.market.persistencia;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Proyecto implements Serializable {

	private static final long serialVersionUID = -3923702825190981855L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.TIME)
	@Column(nullable = false, updatable = false )
	private Date createdAt = Calendar.getInstance().getTime();
	
	@ManyToOne
	@JoinColumn(name = "PROYECTOS", nullable = false)
	private Compania idCompania;

}
