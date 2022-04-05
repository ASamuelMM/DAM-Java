//A. SAMUEL MOLINA MORALES

class Zorro extends Animal{
  //ATRIBUTOS
  private int diasVisita;

  //CONSTRUCTOR POR DEFECTO
  public Zorro(){
    this.diasVisita = 10;
  }

  //CONSTRUCTOR CON VALORES
  public Zorro(String esp, int animal, String comida, int patas, int dias){
    super(esp, animal, comida, patas);
    this.diasVisita = dias;
  }

  //GET
  public int getDiasVisita(){
    return this.diasVisita;
  }

  //SET
  public void setDiasVisita(int dias){
    this.diasVisita = dias;
  }

  //METODO CHISTE
  public String chiste(){
    return "¿Por que cruzo el Zorro la carretera? Para comerse a las gallinas";
  }

  //METODO INCREMENTAR DIA
  public int otroDiaMas(){
    return this.diasVisita + 1;
  }

  //TO STRING
  public String toString(){
    return super.toString() + ". Ha estado en la granja " + this.diasVisita + " dias";
  }
}
