package br.com.cotiinformatica.services;
import java.util.Date;
import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import br.com.cotiinformatica.dtos.PedidoRequest;
import br.com.cotiinformatica.dtos.PedidoResponse;
import br.com.cotiinformatica.entities.Pedido;
import br.com.cotiinformatica.enums.StatusPedido;
import br.com.cotiinformatica.interfaces.PedidoService;
import br.com.cotiinformatica.repositories.PedidoRepository;
@Service
public class PedidoServiceImpl implements PedidoService {
	@Autowired PedidoRepository pedidoRepository;
	
	@Override
	public PedidoResponse criar(PedidoRequest request) {
		
		var mapper = new ModelMapper();
		var pedido = mapper.map(request, Pedido.class);
		
		pedido.setDataPedido(new Date());
		pedido.setStatus(StatusPedido.PENDENTE);
		
		pedidoRepository.save(pedido);
		
		return mapper.map(pedido, PedidoResponse.class);
	}
	@Override
	public PedidoResponse alterar(UUID id, PedidoRequest request) {
		var pedido = pedidoRepository.findById(id)
						.orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado para edição."));
		
		var mapper = new ModelMapper();
		mapper.map(request, pedido);
		
		pedidoRepository.save(pedido);
		
		return mapper.map(pedido, PedidoResponse.class);
	}
	@Override
	public PedidoResponse excluir(UUID id) {
		var pedido = pedidoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado para exclusão."));
		
		pedidoRepository.delete(pedido);
		
		var mapper = new ModelMapper();
		return mapper.map(pedido, PedidoResponse.class);
	}
	@Override
	public Page<PedidoResponse> consultar(int page, int size, String sortBy, String direction) {
		if(size > 25)
			throw new IllegalArgumentException("A quantidade máxima de registros permitido é de 25 pedidos.");
		
		var sort = direction.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
		var pageable = PageRequest.of(page, size, sort);
		var pedidos = pedidoRepository.findAll(pageable);
				
		var mapper = new ModelMapper();
		return pedidos.map(p -> mapper.map(p, PedidoResponse.class));
	}
	@Override
	public PedidoResponse obterPorId(UUID id) {
		
		var pedido = pedidoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado."));
		
		var mapper = new ModelMapper();
		return mapper.map(pedido, PedidoResponse.class);
	}
}


