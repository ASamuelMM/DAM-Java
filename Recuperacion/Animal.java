//A. SAMUEL MOLINA MORALES

class Animal{
  //ATRIBUTOS
  private String especie;
  protected int numAnimales;
  protected String comidaFav;
  private int numPatas;

  //CONSTRUCTOR POR DEFECTO
  public Animal(){
    this.especie = "Zorro";
    this.numAnimales = 5;
    this.comidaFav = "Salchichon";
    this.numPatas = 4;
  }

  //CONSTRUCTOR CON VALORES
  public Animal(String esp, int animal, String comida, int patas){
    this.especie = esp;
    this.numAnimales = animal;
    this.comidaFav = comida;
    this.numPatas = patas;
  }

  //GET
  public String getEspecie(){
    return this.especie;
  }

  public int getNumAnimales(){
    return this.numAnimales;
  }

  public String getComidaFav(){
    return this.comidaFav;
  }

  public int getNumPatas(){
    return this.numPatas;
  }

  //SET
  public void setEspecie(String esp){
    this.especie = esp;
  }

  public void setNumAnimales(int animal){
    this.numAnimales = animal;
  }

  public void setComidaFav(String comida){
    this.comidaFav = comida;
  }

  public void setNumPatas(int patas){
    this.numPatas = patas;
  }

  //METODO CHISTE
  public String chiste(){
    return "¿Por que cruzo " + this.especie + " la carretera? Porque hay que ser tonto pa cruzar por los coches";
  }

  //METODOS PATAS TOTALES
  public int totalPatas(){
    return this.numAnimales * this.numPatas;
  }

  //TO STRING
  public String toString(){
    return "El animal es un " + this.especie + " y hay " + this.numAnimales + ". Su comida favorita es " + this.comidaFav + " y tienen " + this.numPatas + " patas";
  }
}
