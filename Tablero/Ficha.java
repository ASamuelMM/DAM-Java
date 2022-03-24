class Ficha{
  //ATRIBUTO
  private String forma;

  //CONSTRUCTOR
  public Ficha(){
    this.forma = "X";
  }

  public Ficha(String equipo){
    if (equipo == "X" || equipo == "x") {
      this.forma = "X";
    }else if (equipo == "O" || equipo == "o") {
      this.forma = "O";
    }
  }

  public String toString(){
    return this.forma;
  }

}
