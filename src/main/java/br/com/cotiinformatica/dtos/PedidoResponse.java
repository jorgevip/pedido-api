package br.com.cotiinformatica.dtos;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class PedidoResponse {
	
	private UUID idPedido;
	private Date dataPedido;
	private String cliente;
	private String detalhes;
	private Double valor;
	private String status;

}
