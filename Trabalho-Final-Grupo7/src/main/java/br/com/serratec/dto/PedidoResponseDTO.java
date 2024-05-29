//package br.com.serratec.dto;
//
//import java.time.LocalDate;
//import java.util.HashSet;
//import java.util.Set;
//
//import br.com.serratec.entity.Carrinho;
//import br.com.serratec.entity.Pedido;
//import br.com.serratec.enums.StatusEnum;
//
//public class PedidoResponseDTO {
//
//	private LocalDate dataPedido;
//	private StatusEnum status;
//	private Double totalCarrinho = 0.0;
//	private Set<CarrinhoRequestDTO> carrinho = new HashSet<>();
//
//	public PedidoResponseDTO(Pedido pedido) {
//		this.status = pedido.getStatus();
//		this.dataPedido = pedido.getDataPedido();
//		for (Carrinho carrinho : pedido.getCarrinhos()) {
//			CarrinhoRequestDTO processado = new CarrinhoRequestDTO(carrinho);
//			this.totalCarrinho += processado.getTotal();
//			this.carrinho.add(processado);
//		}
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
//	public LocalDate getDataPedido() {
//		return dataPedido;
//	}
//
//	public void setDataPedido(LocalDate dataPedido) {
//		this.dataPedido = dataPedido;
//	}
//
//	public Set<CarrinhoRequestDTO> getCarrinho() {
//		return carrinho;
//	}
//
//	public void setCarrinho(Set<CarrinhoRequestDTO> carrinho) {
//		this.carrinho = carrinho;
//	}
//
//	public Double getTotalCarrinho() {
//		return totalCarrinho;
//	}
//
//	public void setTotalCarrinho(Double totalCarrinho) {
//		this.totalCarrinho = totalCarrinho;
//	}
//
//}