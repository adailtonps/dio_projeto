package main.java.pagamento.strategy;

import main.java.pagamento.model.Pedido;
import org.w3c.dom.ls.LSOutput;

public class CartaoPAgamento implements MetodoPagamento{
    @Override
    public void pagar(Pedido pedido) {
        if (pedido.getValor()
                .compareTo(new java.math.BigDecimal("5000"))>0){
            throw new RuntimeException("Pagamento no cartão acima do limite permitido"
            );
        }
        System.out.println("\nPagamento no cartão aprovado!");
        System.out.println("Valor: R$ "+pedido.getValor());
    }
}
