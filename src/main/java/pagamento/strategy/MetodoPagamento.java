package main.java.pagamento.strategy;

import main.java.pagamento.model.Pedido;

public interface MetodoPagamento {
    void pagar(Pedido pedido);
}
