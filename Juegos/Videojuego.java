//A. SAMUEL MOLINA MORALES

class Videojuego extends Juego{
  //ATRIBUTOS
  private String plataforma;

  //CONSTRUCTOR POR DEFECTO
  public Videojuego(){
    this.plataforma = "PS4";
  }

  //CONSTRUCTOR CON VALORES
  public Videojuego(String nom, double pre, String plat){
    super(nom, pre);
    this.plataforma = plat;
  }

  //GET
  public String getPlataforma(){
    return this.plataforma;
  }

  //SET
  public void setPlataforma(String plat){
    this.plataforma = plat;
  }

  //METODO DESCUENTO VIDEOJUEGO
  public double descuento(){
    double desc = 20 * this.precio / 100;
    double descVideojuego;
    if ((desc) > 10) {
      descVideojuego = this.precio - desc;
    }else {
      descVideojuego = super.descuento();
    }
    return descVideojuego;
  }

  //TO STRING
  public String toString(){
    return super.toString() + ". El Videojuego esta disponible en " + this.plataforma;
  }

}
