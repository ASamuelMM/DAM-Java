import java.util.ArrayList;
import java.util.Arrays;

class Mueble{
  //ATRIBUTOS
  private String material;
  protected ArrayList<Integer> dimensiones;

  //CONSTRUCTOR POR DEFECTO
  public Mueble(){
    this.material = "Madera";
    this.dimensiones = new ArrayList<Integer>(Arrays.asList(50,50,50));
  }

  //CONSTRUCTOR CON VALORES
  public Mueble(String mat, int ancho, int profundo, int alto){
    this.material = mat;
    this.dimensiones = new ArrayList<Integer>(Arrays.asList(ancho, profundo, alto));
  }

  public Mueble(String mat, ArrayList<Integer> medidas){
    this.material = mat;
    this.dimensiones = medidas;
  }

  //GET
  public String getMaterial(){
    return this.material;
  }

  public ArrayList<Integer> getDimensiones(){
    return this.dimensiones;
  }

  //SET
  public void setMaterial(String mat){
    this.material = mat;
  }

  public void setDimensiones(int ancho, int profundo, int alto){
    this.dimensiones = new ArrayList<Integer>(Arrays.asList(ancho, profundo, alto));
  }

  public void setDimensiones(ArrayList<Integer> medidas){
    this.dimensiones = medidas;
  }

  //METODO SUPERFICIE
  protected int superficie(){
    return this.dimensiones.get(0) * this.dimensiones.get(1);
  }

  //TO STRING
  public String toString(){
    return "El mueble es de " + this.material + " y su ancho es " + this.dimensiones.get(0) + ", su profundo es " + this.dimensiones.get(1) + " y su alto es " + this.dimensiones.get(2);
  }
}
