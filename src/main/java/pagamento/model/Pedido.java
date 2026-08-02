package main.java.pagamento.model;

import java.math.BigDecimal;

public class Pedido {
    private final String id;
    private final BigDecimal valor;

    public Pedido(String id, BigDecimal valor) {
        if(id == null || id.isBlank()){
            throw new IllegalArgumentException("ID do pedido obrigatório!");
        }
        if(valor == null || valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Valor inválido!");
        }
        this.id = id;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
