// Classe Pizza - Produto Final
public class Pizza {
    private final String massa;
    private final String molho;
    private final String queijo;
    private final boolean bacon;
    private final boolean presunto;
    private final boolean cebola;
    private final boolean tomate;
    private final boolean oregano;
    private final int tamanho;

    // Construtor privado - só pode ser chamado pelo Builder
    Pizza(PizzaBuilder builder) {
        this.massa = builder.massa;
        this.molho = builder.molho;
        this.queijo = builder.queijo;
        this.bacon = builder.bacon;
        this.presunto = builder.presunto;
        this.cebola = builder.cebola;
        this.tomate = builder.tomate;
        this.oregano = builder.oregano;
        this.tamanho = builder.tamanho;
    }

    // Método estático para obter o Builder
    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    // Getters
    public String getMassa() { return massa; }
    public String getMolho() { return molho; }
    public String getQueijo() { return queijo; }
    public boolean temBacon() { return bacon; }
    public boolean temPresunto() { return presunto; }
    public boolean temCebola() { return cebola; }
    public boolean temTomate() { return tomate; }
    public boolean temOregano() { return oregano; }
    public int getTamanho() { return tamanho; }

    @Override
    public String toString() {
        return "Pizza{" +
                "massa='" + massa + '\'' +
                ", molho='" + molho + '\'' +
                ", queijo='" + queijo + '\'' +
                ", bacon=" + bacon +
                ", presunto=" + presunto +
                ", cebola=" + cebola +
                ", tomate=" + tomate +
                ", oregano=" + oregano +
                ", tamanho=" + tamanho +
                '}';
    }
}
