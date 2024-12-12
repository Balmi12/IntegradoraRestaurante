package utez.edu.integradoraRestaurante.food;

public enum Food {
    // Enumeradores comida y bebidas (Se deben de agregar 29 mas con los mismo atributos)
    // NOTA: En image se debe de poner una url de una imagen de la comida o bebida, esto en las 29 faltantes

    PIZZA(1,"Pizza", 100.00, "Pepperoni", "https://2trendies.com/hero/2023/04/pizzapepperoni.jpg?width=1200"),
    HAMBURGUEZA(2, "Hamburguesa", 80.00, "Doble carne con queso", "https://imag.bonviveur.com/hamburguesa-clasica.webp"),
    CARNEASADA(3, "Taco", 30.00, "Carne asada", "https://mojo.generalmills.com/api/public/content/KIVwKMkmX0mcxyYnGcQSyA_gmi_hi_res_jpeg.jpeg?v=25af9e9b&t=16e3ce250f244648bef28c5949fb99ff"),
    SUSHI(4, "Sushi", 150.00, "Salmon y aguacate", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBvYiZlUmozhXxnHUtgMxwoI-qj0-0RcaKrw&s"),
    ENSALADA(5, "Ensalada", 50.00, "César", "https://myplate-prod.azureedge.us/sites/default/files/styles/large/public/2024-01/GreekSaladChicken2_527x323.jpg?itok=uQvq2bAg"),
    HOGDOG(6, "Hot Dog", 40.00, "Con queso y tocino", "https://editorialtelevisa.brightspotcdn.com/dims4/default/712f530/2147483647/strip/true/crop/1024x1024+0+0/resize/1000x1000!/quality/90/?url=https%3A%2F%2Fk2-prod-editorial-televisa.s3.us-east-1.amazonaws.com%2Fbrightspot%2F69%2F9b%2Fb46e99b242069e53bd9c7df70236%2Fhot-dogs.jpg"),
    BURRITO(7, "Burrito", 90.00, "Pollo y frijoles", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Burrito_chihuahuense_de_chile_verde.jpg/800px-Burrito_chihuahuense_de_chile_verde.jpg"),
    NACHOS(8, "Nachos", 70.00, "Con queso y jalapeños", "https://mojo.generalmills.com/api/public/content/MJYMoQ0lUkezBkK5ql2cSg_gmi_hi_res_jpeg.jpeg?v=c5e8a159&t=16e3ce250f244648bef28c5949fb99ff"),
    LASAGNA(9, "Lasagna", 120.00, "Carne y queso", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ73xyJnJvRAGkOybHGbacQQa8a-uAArfOgMQ&s"),
    CALZONE(10, "Calzone", 110.00, "Jamón y queso", "https://www.pequerecetas.com/wp-content/uploads/2009/03/Calzone.jpg"),
    BAGEL(11, "Bagel", 45.00, "Con salmón ahumado", "https://d36fw6y2wq3bat.cloudfront.net/recipes/bagel-de-jamon-queso-y-lechuga/900/bagel-de-jamon-queso-y-lechuga_version_1645433573.jpg"),
    PAVOYESPINACA(12, "Wrap", 60.00, "Pavo y espinaca", "https://www.gourmet.cl/wp-content/uploads/2016/09/wrap-de-pollo.jpg-editada.jpg"),
    PANINI(13, "Panini", 85.00, "Jamón y queso suizo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSewMW3FO7NHUkKl93XMqRcBDnaVmaS2FdPCw&s"),
    RAVIOLES(14, "Ravioles", 130.00, "Espinaca y ricotta", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPTb1BnGf7VHhuvuTDzOcEw8vdGjPNLTG5Ig&s"),
    TARTA(15, "Tarta", 95.00, "De limón", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRaEFICsVSbR7L763yMtW1UXu1DUuOizP5kKA&s"),
    CEVICHE(16, "Ceviche", 110.00, "Camarón", "https://mandolina.co/wp-content/uploads/2024/08/ceviche-de-camarones.png"),
    CURRY(17, "Curry", 140.00, "Pollo al curry", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0AnPImVzTMdQ_-uiVBwyziaV_Fhdd0tvPfQ&s"),
    SOPA(18, "Sopa", 50.00, "De tortilla", "https://www.unileverfoodsolutions.com.mx/dam/global-ufs/mcos/NOLA/calcmenu/recipes/MX-recipes/general/sopa-de-tortilla/main-header.jpg"),
    RAMEN(19, "Ramen", 150.00, "Con huevo y cerdo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRoEtf9a-kd-tgMC-CkxoXtJfjl1VWZtaAk7Q&s"),
    POLLOFRITO(20, "Pollo Frito", 80.00, "Crujiente", "https://comedera.com/wp-content/uploads/sites/9/2018/08/pollo-frito.jpg"),
    EMPANADA(21, "Empanada", 25.00, "Carne molida", "https://www.allrecipes.com/thmb/Y27H5OTWhnRdiSkSymsoB9TBPBc=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Empanadas-Beef-Turnovers-215231-Beauty-4x3-78c4aff374e14de4a247672e17f6a6e2.jpg"),
    AREPA(22, "Arepa", 35.00, "De queso", "https://c.files.bbci.co.uk/1400C/production/_93723918_thinkstockphotos-627042504.jpg"),
    SHAWARA(23, "Shawarma", 100.00, "Pollo especiado", "https://cusiworld.com/wp-content/uploads/2024/05/shawarma-de-pollo-cusi.jpeg"),
    FALAFEL(24, "Falafel", 75.00, "Con salsa de yogurt", "https://recetasarabes.com/wp-content/uploads/2021/07/receta-falafel.jpg"),
    PAELLA(25, "Paella", 200.00, "De mariscos", "https://mahatmarice.com/wp-content/uploads/2019/10/Paella_AuthenticGrains.jpg"),
    BAGUETTE(26, "Baguette", 55.00, "De jamón serrano", "https://assets.unileversolutions.com/recipes-v2/219363.png"),
    CHURRO(27, "Churro", 20.00, "Relleno de chocolate", "https://www.allrecipes.com/thmb/qq9s8jlKplKUDEo3Gtk15EAJpHc=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/ALR-recipe-24700-churros-VAT-hero-03-4x3-a7f6af1860934b0385f84ab9f13f2613.jpg"),
    GELATO(28, "Gelato", 40.00, "De pistacho", "https://s1.abcstatics.com/media/bienestar/2020/07/19/helados-pistacho-kVJE--1248x698@abc.jpg"),
    BROWNIE(29, "Brownie", 30.00, "Con nueces", "https://cdn.recetasderechupete.com/wp-content/uploads/2019/11/Brownie.jpg");



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
