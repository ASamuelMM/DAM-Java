class Ficha{
  //ATRIBUTO
  private String color;
  private String forma;

  //CONSTRUCTOR POR DEFECTO
  public Ficha(){
    this.forma = "X";
    this.color = "azul";
  }

  //CONSTRUCTOR CON VALORES
  public Ficha(String equipo){
    if (equipo == "X" || equipo == "O") this.forma = "O";
  }

  public Ficha(String equipo, String color){
    if (equipo == "X" || equipo == "O") this.forma = equipo;
    this.color = color;
  }

  public Ficha(Ficha ficha){
    this.forma = ficha.forma;
    this.color = ficha.color;
  }

  //GET
  public String getForma(){
    return this.forma;
  }

  public void setForma(String equipo){
    this.forma = equipo;
  }

  //SET
  public String getColor(){
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String toString(){
    return this.forma;
  }

}
