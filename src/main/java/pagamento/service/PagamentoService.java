package main.java.pagamento.service;

import main.java.pagamento.model.Pedido;
import main.java.pagamento.strategy.MetodoPagamento;

public class PagamentoService {
    public void processarPagamento(
            Pedido pedido,
            MetodoPagamento metodoPagamento
    ){
        if(metodoPagamento ==null){
            throw new IllegalArgumentException("Método de pagamento obrigatório!");
        }
        metodoPagamento.pagar(pedido);
    }
}
