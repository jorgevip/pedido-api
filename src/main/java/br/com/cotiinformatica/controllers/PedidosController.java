package br.com.cotiinformatica.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/api/v1/pedidos")
@Tag(name = "Pedidos", description = "Endpoints para gerenciamento de pedidos.")
public class PedidosController {


	@PostMapping
	@Operation(summary = "Inserir um pedido", description = "Endpoint para inserir um novo pedido.")
	public ResponseEntity<String> post() {
		return ResponseEntity.ok("Pedido inserido com sucesso.");
	}


	@PutMapping
	@Operation(summary = "Atualizar um pedido", description = "Endpoint para atualizar um pedido existente.")
	public ResponseEntity<String> put() {
		return ResponseEntity.ok("Pedido atualizado com sucesso.");
	}


	@DeleteMapping
	@Operation(summary = "Excluir um pedido", description = "Endpoint para excluir um pedido existente.")
	public ResponseEntity<String> delete() {
		return ResponseEntity.ok("Pedido excluído com sucesso.");
	}


	@GetMapping
	@Operation(summary = "Obter um pedido", description = "Endpoint para obter os dados de um pedido existente.")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Pedido obtido com sucesso.");
	}
}
