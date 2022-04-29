class Mascota{
  //ATRIBUTOS
  protected String nombre;
  protected int nivelAmistad;

  //CONSTRUCTOR POR DEFECTO
  public Mascota(){
    this.nombre = "";
    this.nivelAmistad = 0;
  }

  public Mascota(String nom, int nivel){
    this.nombre = nom;
    this.nivelAmistad = nivel;
  }

  //GET Y SET
  public String getNombre(){
    return this.nombre;
  }

  public int getNivelAmistad(){
    return this.nivelAmistad;
  }

  public void setNombre(String nom){
    this.nombre = nom;
  }

  public void setNivelAmistad(int nivel){
    this.nivelAmistad = nivel;
  }

  //TO STRING
  public String toString(){
    return "El nombre de la mascota es " + this.nombre + " y su nivel de amistad es " + this.nivelAmistad;
  }

  //METODOS
  public int acariciar(){
    return this.nivelAmistad + 3;
  }

  public void limpiarExcrementos(int excrementos){
    if (excrementos > 3) {
      excrementos = 0;
    }
  }
}
