package utez.edu.integradoraRestaurante.customer;

public enum Customer {
    // Enumeradores de clkiente (Aqui se deben de agregar unos 9 mas con los atributos que tiene el primero)
    ERIK(1,"Erik", "Balmaceda"),
    EMILIANO(2,"Emiliano", "Rodriguez");






    // Contructor, getters y setters (No es necesario Modificar)
    private final int id;
    private final String name;
    private final String lastName;


    Customer(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}