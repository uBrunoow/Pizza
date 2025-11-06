
// Classe Builder - Construtor da Pizza
public class PizzaBuilder {
    // Atributos obrigatórios
    String massa;
    String molho;

    // Atributos opcionais com valores padrão
    String queijo = "Mozzarella";
    boolean bacon = false;
    boolean presunto = false;
    boolean cebola = false;
    boolean tomate = false;
    boolean oregano = false;
    int tamanho = 30;

    // Métodos de construção com interface fluente
    public PizzaBuilder comMassa(String massa) {
        this.massa = massa;
        return this;  // Retorna this para encadeamento
    }

    public PizzaBuilder comMolho(String molho) {
        this.molho = molho;
        return this;
    }

    public PizzaBuilder comQueijo(String queijo) {
        this.queijo = queijo;
        return this;
    }

    public PizzaBuilder comBacon() {
        this.bacon = true;
        return this;
    }

    public PizzaBuilder comPresunto() {
        this.presunto = true;
        return this;
    }

    public PizzaBuilder comCebola() {
        this.cebola = true;
        return this;
    }

    public PizzaBuilder comTomate() {
        this.tomate = true;
        return this;
    }

    public PizzaBuilder comOregano() {
        this.oregano = true;
        return this;
    }

    public PizzaBuilder comTamanho(int tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    // Método para construir o objeto final
    public Pizza build() {
        // Validação
        if (massa == null || molho == null) {
            throw new IllegalArgumentException("Massa e molho são obrigatórios");
        }
        return new Pizza(this);
    }
}