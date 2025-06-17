package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PedidoRequest {

	@NotNull(message = "Valor do pedido é obrigatório.")
	@DecimalMin(value =  "0.01", message = "Valor do pedido deve estar entre 0.01 e 9999999999.99.")
	private Double valor;
	
	@NotBlank(message = "Cliente é obrigatório.")
	@Size(min = 8, max = 100, message = "Cliente deve ter entre 8 e 100 caracteres.")
	private String cliente;
	
	@NotBlank(message = "Detalhes do pedido são obrigatórios.")
	@Size(min = 8, max = 250, message = "Detalhes do pedido devem ter entre 8 e 250 caracteres.")
	private String detalhes;

}
