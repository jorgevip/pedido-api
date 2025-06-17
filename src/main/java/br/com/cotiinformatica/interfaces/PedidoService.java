package br.com.cotiinformatica.interfaces;

import java.util.UUID;

import org.springframework.data.domain.Page;

import br.com.cotiinformatica.dtos.PedidoRequest;
import br.com.cotiinformatica.dtos.PedidoResponse;

public interface PedidoService {
	
	PedidoResponse criar(PedidoRequest request);
	PedidoResponse alterar(UUID idPedido, PedidoRequest request);
	PedidoResponse excluir(UUID idPedido);
	Page<PedidoResponse> consultar(int page, int size, String sortBy, String direction);	
	PedidoResponse obterPorId(UUID idPedido);
}
