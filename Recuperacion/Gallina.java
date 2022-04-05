//A. SAMUEL MOLINA MORALES

class Gallina extends Animal{
  //ATRIBUTOS
  private int huevosDia;
  private int diasPoniendo;
  private int huevosTotales;

  //CONSTRUCTOR POR DEFECTO
  public Gallina(){
    this.huevosDia = 3;
    this.diasPoniendo = 10;
    this.huevosTotales = totalHuevos();
  }

  //CONSTRUCTOR CON VALORES
  public Gallina(String esp, int animal, String comida, int patas, int huevos, int dias){
    super(esp, animal, comida, patas);
    this.huevosDia = huevos;
    this.diasPoniendo = dias;
    this.huevosTotales = totalHuevos();
  }

  //GET
  public int getHuevosDia(){
    return this.huevosDia;
  }

  public int getDiasPoniendo(){
    return this.diasPoniendo;
  }

  public int getHuevosTotales(){
    return this.huevosTotales;
  }

  //SET
  public void setHuevosDia(int huevos){
    this.huevosDia = huevos;
  }

  public void setDiasPoniendo(int dias){
    this.diasPoniendo = dias;
  }

  //METODO CHISTE
  public String chiste(){
    return "¿Por que cruzo la Gallina la carretera? Para llegar al otro lado";
  }

  //METODO HUEVOS TOTALES
  public int totalHuevos(){
    return this.huevosDia * this.diasPoniendo;
  }

  //METODO CALCULAR PICOS
  public int picos(){
    return this.numAnimales;
  }

  //TO STRING
  public String toString(){
    return super.toString() + ". La gallina pone " + this.huevosDia + " al dia, durante " + this.diasPoniendo + " dias, con un total de " + this.huevosTotales + " huevos";
  }
}
