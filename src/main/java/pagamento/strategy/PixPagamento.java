package main.java.pagamento.strategy;

import main.java.pagamento.model.Pedido;

public class PixPagamento implements MetodoPagamento {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println(
                "\nPagamento PIX realizado!"
        );
        System.out.println(
                "Pedido: "+pedido.getId()
        );
        System.out.println(
                "Valor: R$ "+pedido.getValor()
        );
    }
}
