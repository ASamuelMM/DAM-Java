//A. SAMUEL MOLINA MORALES
class Arbol extends Planta{
  //ATRIBUTOS
  private double altura;
  private int edad;

  //CONSTRUCTOR
  public Arbol(){
    this.altura = 5;
    this.edad = 15;
  }

  public Arbol(String nom, String tipo, double alt, int anios){
    super(nom, tipo);
    this.altura = alt;
    this.edad = anios;
  }

  //GET
  public double getAltura(){
    return this.altura;
  }

  public int getEdad(){
    return this.edad;
  }

  //SET
  public void setAltura(double alt){
    this.altura = alt;
  }

  public void setEdad(int anios){
    this.edad = anios;
  }

  //TO STRING
  public String toString(){
    return super.toString() + ". Tiene una altura de " + this.altura + " metros" + " y la edad es " + this.edad + " anios";
  }
}
