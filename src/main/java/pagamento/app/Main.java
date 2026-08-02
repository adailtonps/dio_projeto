package main.java.pagamento.app;

import main.java.pagamento.model.Pedido;
import main.java.pagamento.service.PagamentoService;
import main.java.pagamento.strategy.BoletoPagamento;
import main.java.pagamento.strategy.CartaoPAgamento;
import main.java.pagamento.strategy.PixPagamento;

import java.math.BigDecimal;

public class Main {
    static void main(String[] args) {
        Pedido pedido = new Pedido("PED-001", new BigDecimal("250"));

        PagamentoService service = new PagamentoService();

        service.processarPagamento(
                pedido,
                new PixPagamento()
        );

        service.processarPagamento(
                pedido,
                new BoletoPagamento()
        );

        service.processarPagamento(
                pedido,
                new CartaoPAgamento()
        );
    }
}
