//package br.com.serratec.dto;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//import br.com.serratec.entity.Pedido;
//import br.com.serratec.entity.Usuario;
//import br.com.serratec.enums.StatusEnum;
//
//public class PedidoRequestDTO {
//
//	private Usuario cliente;
//    private StatusEnum status;
//    private Set<Long> produtoIds;
//    private Map<Long, Integer> produtosQuantidade;
//	
//	public PedidoRequestDTO() {
//		
//	}
//	
//	public PedidoRequestDTO(Pedido pedido) {
//		status = pedido.getStatus();
//		cliente = pedido.getUsuario();
//		produtosQuantidade = new HashMap<>();
//	}
//
//	public StatusEnum getStatus() {
//		return status;
//	}
//
//	public void setStatus(StatusEnum status) {
//		this.status = status;
//	}
//
//	public Map<Long, Integer> getProdutosQuantidade() {
//		return produtosQuantidade;
//	}
//
//	public void setProdutosQuantidade(Map<Long, Integer> produtosQuantidade) {
//		this.produtosQuantidade = produtosQuantidade;
//	}
//
//	public Usuario getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Usuario cliente) {
//		this.cliente = cliente;
//	}
//
//	public Set<Long> getProdutoIds() {
//		return produtoIds;
//	}
//
//	public void setProdutoIds(Set<Long> produtoIds) {
//		this.produtoIds = produtoIds;
//	}
//}