class Adaptador{
  //ATRIBUTOS
  private int potenciaEntrada;
  private int potenciaSalida;
  private int numPuertos;

  //CONSTRUCTOR
  public Adaptador(){
    this.potenciaEntrada = 240;
    this.potenciaSalida = 55;
    this.numPuertos = 1;
  }

  public Adaptador(int potEnt, int potSal, int puerto){
    this.potenciaEntrada = potEnt;
    this.potenciaSalida = potSal;
    if (puerto <= 2) {
      this.numPuertos = puerto;
    }
  }

  //GET
  public int getPotenciaEntrada(){
    return this.potenciaEntrada;
  }

  public int getPoteniaSalida(){
    return this.potenciaSalida;
  }

  public int getNumPuertos(){
    return this.numPuertos;
  }

  //SET
  public void setPotenciaEntrada(int potEnt){
    this.potenciaEntrada = potEnt;
  }

  public void setPotenciaSalida(int potSal){
    this.potenciaSalida = potSal;
  }

  public void setNumPuertos(int puerto){
    this.numPuertos = puerto;
  }

  //TO STRING
  public String toString(){
    return "El adaptador tiene una potencia de entrada de " + this.potenciaEntrada + " una potencia de salida de " + this.potenciaSalida + " y " + this.numPuertos + " puertos";
  }
}
