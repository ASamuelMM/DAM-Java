class Main{
  public static void main(String[] args) {

    //A. SAMUEL MOLINA MORALES

    //-------CLASE ELECTRODOMESTICO-------
    System.out.println("=======|CODIGO ELECTRODOMESTICO REFACTORIZADO|=======");
    //Comprueba el constructor por defecto con variables
    Electrodomestico frigorifico = new Electrodomestico();

    //Comprueba el constructor con parametros, 
    Electrodomestico lavadora = new Electrodomestico(650.50, "D");

    Electrodomestico miElectrodomestico = new Electrodomestico(lavadora); //Comprueba el constructor con un objeto de la clase

    //Imprimir
    System.out.println("--CONSTRUCTOR DEFECTO: " + frigorifico);
    System.out.println("--CONSTRUCTOR PARAMETROS: " + lavadora);
    System.out.println("--CONSTRUCTOR COPIA: " + miElectrodomestico);

    //Modificar valores con SET
    System.out.println("Valores de LAVADORA modificados con SET");
    lavadora.setPrecioBase(399.99);
    lavadora.setColor("Amarillo");
    lavadora.setConsumoEnergetico("A");
    lavadora.setPeso(35);

    //Comprobar valores con GET
    System.out.println("-GET del Precio Base: " + lavadora.getPrecioBase());
    System.out.println("-GET del Color: " + lavadora.getColor());
    System.out.println("-GET del Consumo Energetico: " + lavadora.getConsumoEnergetico());
    System.out.println("-GET del Peso: " + lavadora.getPeso());


  }
}
