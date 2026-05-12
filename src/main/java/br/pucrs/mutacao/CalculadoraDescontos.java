package br.pucrs.mutacao;

public class CalculadoraDescontos {

    public double calcularPrecoFinal(double preco, double percentualDesconto) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preco nao pode ser negativo");
        }

        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("Percentual de desconto deve estar entre 0 e 100");
        }

        double desconto = preco * percentualDesconto / 100;
        return preco - desconto;
    }

    public boolean freteGratis(double valorCompra) {
        return valorCompra >= 100;
    }

    public String classificarCliente(int comprasNoAno) {
        if (comprasNoAno >= 10) {
            return "VIP";
        }

        if (comprasNoAno >= 5) {
            return "REGULAR";
        }

        return "NOVO";
    }

    public double aplicarCupom(String cupom, double preco) {
        if ("PROMO10".equals(cupom)) {
            return preco * 0.90;
        }

        if ("PROMO20".equals(cupom)) {
            return preco * 0.80;
        }

        return preco;
    }
}
