//A. SAMUEL MOLINA MORALES

class Juego{
  //ATRIBUTOS
  private String nombre;
  protected double precio;

  //CONSTRUCTOR POR DEFECTO
  public Juego(){
    this.nombre = "TLOU";
    this.precio = 39.99;
  }

  //CONSTRUCTOR CON VALORES
  public Juego(String nom, double pre){
    this.nombre = nom;
    this.precio = pre;
  }

  //GET
  public String getNombre(){
    return this.nombre;
  }

  public double getPrecio(){
    return this.precio;
  }

  //SET
  public void setNombre(String nom){
    this.nombre = nom;
  }

  public void setPrecio(double pre){
    this.precio = pre;
  }

  //METODO DESCUENTO
  public double descuento(){
    return this.precio - 10;
  }

  //TO STRING
  public String toString(){
    return "El juego " + this.nombre + " cuesta " + this.precio + " euros";
  }
}
