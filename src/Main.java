public class Main {
    public static void main(String[] args) {
       Cliente filiphe = new Cliente("Filiphe N");
       Pedido pedido1 = filiphe.fazerPedido("Napolitana", 34.99f);

       Cliente gabriel = new Cliente("Gabriel");
       Pedido pedido2 = gabriel.fazerPedido("Calabresa", 24.99f);

       Pizzaria pizzaNapoli = new Pizzaria();
       pizzaNapoli.receberPedido(pedido1);
       pizzaNapoli.receberPedido(pedido2);

    }
}