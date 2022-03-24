//A. SAMUEL MOLINA MORALES
class Planta{
  //ATRIBUTOS
  private String nombre;
  private String tipo;

  //CONSTRUCTOR
  public Planta(){
    this.nombre = "Amapola";
    this.tipo = "Flor";
  }

  public Planta(String nom, String tipo){
    this.nombre = nom;
    this.tipo = tipo;
  }

  //GET
  public String getNombre(){
    return this.nombre;
  }

  public String getTipo(){
    return this.tipo;
  }

  //SET
  public void setNombre(String nom){
    this.nombre = nom;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  //TO STRING
  public String toString(){
    return "El nombre de la planta es " + this.nombre + " y es del tipo " + this.tipo;
  }
}
