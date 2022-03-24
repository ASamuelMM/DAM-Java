class Main{
  public static void main(String[] args) {

    System.out.println("A. Samuel Molina Morales");

    Cable miCable = new Cable(2, "usb", "microUsb", false);
    Adaptador miAdaptador = new Adaptador(300, 60, 2);
    Cargador miCargador = new Cargador();

    System.out.println(miAdaptador);

    int puertos = miCargador.getAdaptadorCargador().getNumPuertos();
    miCargador.meterCable(puertos);
    System.out.println(miCargador);
    
  }
}
