package br.com.serratec.service;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.serratec.entity.Pedido;
import br.com.serratec.exception.ResourceNotFoundException;
import br.com.serratec.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;
	
	public List<Pedido> buscarPedidos(){
		return repository.findAll();
	}
	
	//Criar pedido
	public Pedido inserir(Pedido pedido) {
		return repository.save(pedido);
	}
	
	//Atualizar pedido
	public Pedido atualizar(Long id, Pedido c) {
		Pedido a = repository.findById(id).orElse(null);
		if (a != null) {
			c.setId(id);
			return repository.save(c);
		} else {
			return null;
		}
	}
	
	//Deletar por id
	public ResponseEntity<String> deletar(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return ResponseEntity.status(HttpStatus.SC_OK).body("Pedido deletado.");
		}
		throw new ResourceNotFoundException("Pedido não encontrado.");
	}
	
}
