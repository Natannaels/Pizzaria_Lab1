public class Pedido {
    private Cliente cliente;
    private String sabor;
    private float valor;

    public Pedido(Cliente cliente, String sabor, float valor) {
        this.cliente = cliente;
        this.sabor = sabor;
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getSabor() {
        return sabor;
    }

    public float getValor() {
        return valor;
    }
}
