class Main{
  public static void main(String[] args) {

    //-------CLASE ELECTRODOMESTICO-------
    System.out.println("=======|CLASE ELECTRODOMESTICO|=======");
    Electrodomestico frigorifico = new Electrodomestico();
    Electrodomestico lavadora = new Electrodomestico(199.99, "Blanco", "D", 23.800);

    //Imprimir
    System.out.println("POR DEFECTO: " + frigorifico);
    System.out.println("CON VALORES: " + lavadora);

    //Modificar valores con SET
    System.out.println("Valores de LAVADORA modificados con SET");
    lavadora.setPrecioBase(399.99);
    lavadora.setColor("Metalizado");
    lavadora.setConsumoEnergetico("A");
    lavadora.setPeso(35);

    //Comprobar valores con GET
    System.out.println("-GET del Precio Base: " + lavadora.getPrecioBase());
    System.out.println("-GET del Color: " + lavadora.getColor());
    System.out.println("-GET del Consumo Energetico: " + lavadora.getConsumoEnergetico());
    System.out.println("-GET del Peso: " + lavadora.getPeso());

    //Calcular el precio final
    System.out.println("--Precio Final: " + lavadora.calcularPrecioFinal());

  }
}
