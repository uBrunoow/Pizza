public class TestePizzaComBuilder {
    public static void main(String[] args) {
        // Exemplo 1: Pizza simples
        Pizza pizzaSimples = Pizza.builder()
                .comMassa("Tradicional")
                .comMolho("Tomate")
                .build();

        System.out.println("Pizza Simples:");
        System.out.println(pizzaSimples);
        System.out.println();

        // Exemplo 2: Pizza com vários ingredientes
        Pizza pizzaCompleta = Pizza.builder()
                .comMassa("Integral")
                .comMolho("Tomate")
                .comQueijo("Parmesão")
                .comBacon()
                .comPresunto()
                .comCebola()
                .comTomate()
                .comOregano()
                .comTamanho(40)
                .build();

        System.out.println("Pizza Completa:");
        System.out.println(pizzaCompleta);
        System.out.println();

        // Exemplo 3: Pizza vegetariana
        Pizza pizzaVegetariana = Pizza.builder()
                .comMassa("Integral")
                .comMolho("Branco")
                .comQueijo("Mozzarella")
                .comCebola()
                .comTomate()
                .comOregano()
                .comTamanho(35)
                .build();

        System.out.println("Pizza Vegetariana:");
        System.out.println(pizzaVegetariana);
        System.out.println();

        // Exemplo 4: Pizza com bacon e presunto
        Pizza pizzaCarne = Pizza.builder()
                .comMassa("Tradicional")
                .comMolho("Tomate")
                .comBacon()
                .comPresunto()
                .comTamanho(40)
                .build();

        System.out.println("Pizza de Carne:");
        System.out.println(pizzaCarne);
    }
}