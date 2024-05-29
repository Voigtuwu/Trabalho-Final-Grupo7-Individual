package br.com.serratec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.entity.Pedido;
import br.com.serratec.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> listar(){
		return ResponseEntity.ok(pedidoService.buscarPedidos());
	}
	
	@PostMapping
	public ResponseEntity<Pedido> inserir(@RequestBody Pedido pedido){
		return ResponseEntity.ok(pedidoService.inserir(pedido));
	}
	
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        return pedidoService.deletar(id);
        }
	
//	@PutMapping("/{id}")
//	public ResponseEntity<Pedido> atualizar(@PathVariable Long id, @RequestBody Pedido pedido){
//		Pedido a = service.atualizar(id, pedido);
//		if(a != null) {
//			return ResponseEntity.ok(a);
//		}else {
//			throw new 
//		}
//	}
	
}