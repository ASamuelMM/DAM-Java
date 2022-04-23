//A. SAMUEL MOLINA MORALES
/*
|-------------------------|
|     Electrodomestico    |
|-------------------------|
| - precioBase            |
| - color                 |
| - consumoEnergetico     |
| - peso                  |
|-------------------------|
| + precioFinal()         |
|-------------------------|
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Electrodomestico{
  //ATRIBUTOS
  private double precioBase;
  private String color;  //SOLO PUEDE SER: Blanco, Negro, Rojo, Azul, Metalizado
  private String consumoEnergetico;
  private double peso;

  private final static double PRECIO = 100;
  private final static String COLOR = "Blanco"; //Para escribir COLOR cada vez que queramos pones Blanco
  private final static String CONSUMO = "F";
  private final static double PESO = 20;


  //CONSTRUCTOR
  public Electrodomestico(){
    /*
    this.precioBase = 100;
    this.color = "Blanco";
    this.consumoEnergetico = "F";
    this.peso = 20;
    */
    this(PRECIO, COLOR, CONSUMO, PESO);  //LLama al constructor por parametros
  }

  public Electrodomestico(double precio, String consumo){
    /*
    this.precioBase = precio;
    this.consumoEnergetico = consumo;
    */
    this(precio, COLOR, consumo, 20);
  }

  public Electrodomestico(double precio, String color, String consumo, double peso){
    this.precioBase = precio;
    this.color = color;
    this.consumoEnergetico = consumo;
    this.peso = peso;
  }

  public Electrodomestico(Electrodomestico electrodomestico){
    this.precioBase = electrodomestico.precioBase;
    this.color = electrodomestico.color;
    this.consumoEnergetico = electrodomestico.consumoEnergetico;
    this.peso = electrodomestico.peso;
    //this(electrodomestico.precioBase, electrodomestico.color, electrodomestico.consumoEnergetico, electrodomestico.peso)
  }

  //GET
  public double getPrecioBase(){
    return this.precioBase;
  }

  public String getColor(){
    return this.color;
  }

  public String getConsumoEnergetico(){
    return this.consumoEnergetico;
  }

  public double getPeso(){
    return this.peso;
  }

  //SET
  public void setPrecioBase(double precio){
    this.precioBase = precio;
  }

  public void setColor(String color){
    comprobarColor(color);
  }

  public void setConsumoEnergetico(String consumo){
    this.consumoEnergetico = consumo;
  }

  public void setPeso(double peso){
    this.peso = peso;
  }

  //TO STRING
  public String toString(){
    return "El electrodomestico tiene un precio base de " + this.precioBase + "  euros," + "\n"
         + "el color es " + this.color + ", con un consumo energetico " + this.consumoEnergetico + "\n"
         + "y pesa " + this.peso + " kilos";
  }

  //COMPROBAR COLOR
  private void comprobarColor(String color){
    //Crear un array, recorrer la lista si esta el color
    //si esta se le asigna el color, sino es blanco
    String[] listaColores = {"Blanco", "Negro", "Rojo", "Azul", "Metalizado"};
    for (int i = 0; i < listaColores.length; i++) {
      if (color == listaColores[i]) {
        this.color = color;
      }else {
        this.color = COLOR;
      }
    }
  }

  //PRECIO FINAL
  //Lista con los consumos energeticos, buscar la posicion, devuelve la posicion y se multiplica
  //por 20€
  public double calcularPrecioFinal(){
    ArrayList<String> listaConsumos = new ArrayList<>(Arrays.asList("F", "E", "D", "C", "B", "A", "AA", "AAA"));
    double precioFinal = this.precioBase;
    for (int i = 0; i < listaConsumos.size(); i++) {
      if (this.consumoEnergetico == listaConsumos.get(i)) {
        int posicion = listaConsumos.indexOf(this.consumoEnergetico);
        precioFinal += posicion * 20;
      }
    }
    if (this.color == COLOR) {
      precioFinal -= 20;
    }
    return precioFinal;
  }

}
