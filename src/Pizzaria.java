public class Pizzaria {
    public float caixa;
    private Pedido lista[];
    public Pizzaria() {
        caixa = 0;
        lista = new Pedido[2];
    }

    public boolean receberPedido(Pedido novo) {
        int pos = 0;
        while((pos < lista.length) && (lista[pos] != null)) {
            pos++;
        }
        if(pos < lista.length) {
            lista[pos] = novo;
            caixa += novo.getValor();
            System.out.println("Pedido Nº" + pos);
            System.out.println("Pedido recebido do Cliente: " + novo.getCliente().getNome());
            prepararPedido(novo);
            return true;
        }
        return false;
    }

    public void prepararPedido(Pedido novo) {
        System.out.println("Preparando o Pedido: " + novo.getSabor() + " de valor: R$" + novo.getValor());
        entregarPedido(novo);
    }

    public void entregarPedido(Pedido novo) {
        System.out.println("Pedido Entregue ao Cliente " + novo.getCliente().getNome() + " Sabor: " + novo.getSabor());
        System.out.println("////////////////////////////////////////////////////////");
        System.out.println();
    }
}
