package br.com.cotiinformatica.entities;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import br.com.cotiinformatica.enums.StatusPedido;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
@Entity
@Data
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(updatable = false)
	private UUID id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date dataPedido;
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal valor;
	@Column(nullable = false, length = 100)
	private String cliente;
	@Column(nullable = false, length = 250)
	private String detalhes;
	
	private StatusPedido status;
}


