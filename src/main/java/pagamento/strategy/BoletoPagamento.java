package main.java.pagamento.strategy;

import main.java.pagamento.model.Pedido;

public class BoletoPagamento implements MetodoPagamento{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println(
                "\nBoleto gerado com sucesso!"
        );
        System.out.println(
                "Pedido: "+pedido.getId()
        );
    }
}
