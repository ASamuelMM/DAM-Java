import java.util.ArrayList;

class Cargador{
  //ATRIBUTOS
  private Cable cableCargador;
  private Adaptador adaptadorCargador;
  private Cable segundoCable;

  //CONSTRUCTOR
  public Cargador(){
    this.cableCargador = new Cable();
    this.adaptadorCargador = new Adaptador();
  }

  //GET
  public Cable getCableCargador(){
    return this.cableCargador;
  }

  public Adaptador getAdaptadorCargador(){
    return this.adaptadorCargador;
  }

  //AÑADIR OTRO CABLE
  public void meterCable(int puertos){
    if (puertos < 2) {
      this.segundoCable = new Cable();
    }
  }

  //UTILIDAD DE LOS CABLES
  ArrayList<Cable> listaCables = new ArrayList<Cable>;
  public void utilidadCable(ArrayList<String> arrayList){
    for(int i, i < arrayList.size(), i++){
      if (adaptadorCargador.getTransmision() == true && adaptadorCargador.getEntrada() == "micro usb") {
        listaCables.add(i);
      }
    }



  //TO STRING
  public String toString(){
    return "EL CABLE DEL CARGADOR ES: " + this.cableCargador + "\n" + "EL ADAPTADOR DEL CARGADOR ES: " + this.adaptadorCargador + this.segundoCable;
  }
}
