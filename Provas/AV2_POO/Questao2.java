package AV2_POO;

import java.util.ArrayList;
import java.util.Date;

public class Questao2 {
    public static void main(String[] args) {

        ArrayList<Evento> eventos = new ArrayList<>();
        eventos.add(new Evento("Cinema", new Date(), 30.00, "filme Barbie", 100, new Categoria("Cinema")));
        eventos.add(new Evento("Show", new Date(), 100.00, "show Ed Sheeran", 300, new Categoria("Show")));
        eventos.add(new Evento("Palestra", new Date(), 20.00, "Palestra: mulher no mercado de trabalho", 150, new Categoria("Palestra")));
        eventos.add(new Evento("Museu", new Date(), 35.00, "Museu de Artes", 50, new Categoria("Museu")));
        eventos.add(new Evento("Festival de Comida", new Date(), 40.00, "Festival com comidas típicas", 120, new Categoria("Festival")));

        ArrayList<Pedido> pedidos = new ArrayList<>();
        Date dataAtual = new Date();

        Pedido pedido1 = new Pedido(1, dataAtual, 0.0, 1);
        PedidoItem pedido1Item1 = new PedidoItem("Cinema", 2, 30.00);
        PedidoItem pedido1Item2 = new PedidoItem("Show", 1, 100.00);

        System.out.println("Pedido 1:");
        for (PedidoItem item : new PedidoItem[]{pedido1Item1, pedido1Item2}) {
            System.out.println("Evento: " + item.getNomeEvento());
            System.out.println("Quantidade de ingressos pedidos: " + item.getQtdeIngresso());
        }
        System.out.println("---------------");

        pedido1.inserirItensPedido(pedido1Item1);
        pedido1.inserirItensPedido(pedido1Item2);

        for (PedidoItem item : pedido1.getItensPedido()) {
            for (Evento evento : eventos) {
                if (evento.getNomeEvento().equals(item.getNomeEvento())) {
                    int novaQuantidade = evento.getQtdIngressos() - item.getQtdeIngresso();
                    if (novaQuantidade >= 0) {
                        evento.setQtdIngressos(novaQuantidade);
                    } else {
                        System.out.println("Desculpa! Não temos mais ingresso disponível para esse evento: " + evento.getNomeEvento());
                    }
                }
            }
        }

        pedido1.alterarStatus(2);
        double totalPagarPedido1 = pedido1.calcularTotalPagar();
        System.out.println("Valor total a pagar do primeiro pedido é: " + totalPagarPedido1);
        System.out.println("---------------");

        Pedido pedido2 = new Pedido(2, dataAtual, 0.0, 1);
        PedidoItem pedido2Item1 = new PedidoItem("Palestra", 3, 20.00);
        PedidoItem pedido2Item2 = new PedidoItem("Museu", 2, 35.00);

        System.out.println("Pedido 2:");
        for (PedidoItem item : new PedidoItem[]{pedido2Item1, pedido2Item2}) {
            System.out.println("Evento: " + item.getNomeEvento());
            System.out.println("Quantidade de ingressos pedidos: " + item.getQtdeIngresso());
        }
        System.out.println("---------------");

        pedido2.inserirItensPedido(pedido2Item1);
        pedido2.inserirItensPedido(pedido2Item2);
        for (PedidoItem item : pedido2.getItensPedido()) {
            for (Evento evento : eventos) {
                if (evento.getNomeEvento().equals(item.getNomeEvento())) {
                    int novaQuantidade = evento.getQtdIngressos() - item.getQtdeIngresso();
                    if (novaQuantidade >= 0) {
                        evento.setQtdIngressos(novaQuantidade);
                    } else {
                        System.out.println("Desculpa! Não temos mais ingresso disponível para esse evento:  " + evento.getNomeEvento());
                    }
                }
            }
        }

        pedido2.alterarStatus(2); 
        double totalPagarPedido2 = pedido2.calcularTotalPagar(); 
        System.out.println("Valor total a pagar do segundo pedido é: " + totalPagarPedido2);
        System.out.println("---------------");

        pedidos.add(pedido1);
        pedidos.add(pedido2);
    }
}

