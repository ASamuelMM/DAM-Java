class Cable{
  //ATRIBUTOS
  private double longitud;
  private String entrada;
  private String salida;
  private boolean transmision;

  //CONSTRUCTOR
  public Cable(){
    this.longitud = 1.5;
    this.entrada = "usb";
    this.salida = "usb-C";
    this.transmision = true;
  }

  public Cable(double longi, String entr, String sale, boolean datos){
    this.longitud = longi;
    this.entrada = entr;
    this.salida = sale;
    this.transmision = datos;
  }

  //GET
  public double getLongitud(){
    return this.longitud;
  }

  public String getEntrada(){
    return this.entrada;
  }

  public String getSalida(){
    return this.salida;
  }

  public boolean getTransmision(){
    return this.transmision;
  }

  //SET
  public void setLongitud(double longi){
    this.longitud = longi;
  }

  public void setEntrada(String entr){
    this.entrada = entr;
  }

  public void setSalida(String sale){
    this.salida = sale;
  }

  public void setTransmision(boolean datos){
    this.transmision = datos;
  }

  //TO STRING
  public String toString(){
    return "El cable tiene " + this.longitud + " metros, una entrada tipo " + this.entrada + " con la salida tipo " + this.salida + " . ¿Permite la transmision de datos?: " + this.transmision;
  }
}
