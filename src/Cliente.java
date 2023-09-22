public class Cliente {

    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public Pedido fazerPedido(String sabor, float valor) {
        Pedido novo = new Pedido(this, sabor, valor);

        return novo;
    }


}

