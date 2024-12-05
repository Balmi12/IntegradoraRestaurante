package utez.edu.integradoraRestaurante.food;

public enum Food {
    // Enumeradores comida y bebidas (Se deben de agregar 29 mas con los mismo atributos)
    // NOTA: En image se debe de poner una url de una imagen de la comida o bebida, esto en las 29 faltantes

    PIZZA(1,"Pizza", 100.00, "Pepperoni", "https://2trendies.com/hero/2023/04/pizzapepperoni.jpg?width=1200");







    // Atributos, constructor y getters, (no es necesario modificarlo)
    private final int id;
    private final String name;
    private final double price;
    private final String type;
    private final String image;

    Food(int id, String name, double price, String type, String image){
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.image = image;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getImage() {
        return image;
    }
}
