class Main{
  public static void main(String[] args) {

    System.out.println("A. SAMUEL MOLINA MORALES");

    //------CLASE JUEGO------
    System.out.println("------CLASE JUEGO------");
    Juego miJuego = new Juego();
    Juego miOtroJuego = new Juego("F1 2022", 48.50);

    //Imprimir
    System.out.println(miJuego);
    System.out.println(miOtroJuego);

    //Cambiar valores con SET
    miJuego.setNombre("Horizon");
    miJuego.setPrecio(59.99);

    //Mostrar datos con GET
    System.out.println("GET nombre juego: " + miJuego.getNombre());
    System.out.println("GET precio juego: " + miJuego.getPrecio());

    //Metodo de Descuento()
    System.out.println("-Precio con descuento: " + miOtroJuego.descuento());
    System.out.println("-Precio Original: " + miOtroJuego.getPrecio());


    //------CLASE VIDEOJUEGO------
    System.out.println("------CLASE VIDEOJUEGO------");
    Videojuego miVideojuego = new Videojuego();
    Videojuego miOtroVideojuego = new Videojuego("FIFA", 59.99, "PS5");

    //Imprimir
    System.out.println(miVideojuego);
    System.out.println(miOtroVideojuego);

    //Cambiar valores con SET
    miVideojuego.setPlataforma("PC");

    //Mostrar datos con GET
    System.out.println("GET plataforma Videojuego: " + miVideojuego.getPlataforma());

    //Metodo de Descuento() de Videojuego
    System.out.println("-Precio con descuento: " + miOtroVideojuego.descuento());
    System.out.println("-Precio Original: " + miOtroVideojuego.getPrecio());

    //------CLASE JUEGO DE MESA------
    System.out.println("------CLASE JUEGO DE MESA------");
    JuegoMesa miJuegoMesa = new JuegoMesa();
    JuegoMesa miOtroJuegoMesa = new JuegoMesa("Monopoly", 40.99, 2, 8);

    //Imprimir
    System.out.println(miJuegoMesa);
    System.out.println(miOtroJuegoMesa);

    //Cambiar valores con SET
    miJuegoMesa.setMin(4);
    miJuegoMesa.setMax(12);

    //Mostrar datos con GET
    System.out.println("GET Minimo jugadores: " + miJuegoMesa.getMin());
    System.out.println("GET Maximo jugadores: " + miJuegoMesa.getMax());

  }
}
