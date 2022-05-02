/*
------------------------
|   Electrodomestico   |
|----------------------|
| - precioBase         |
| - color              |
| - consumoEnergetico  |
| - peso               |
|----------------------|
| + precioFinal()      |
|----------------------|
*/

public class Electrodomestico{
  private double precioBase;
  private String color;                 //Blanco, Negro, Rojo, Azul, Metalizado.
  private String consumoEnergetico;
  private double peso;

  // No es necesario utilizar listas dinámicas ni, por tanto, ArrayList.
  // Se declaran aquí y no dentro de las funciones porque se van a utilizar más de una vez.
  String colores[] = {"blanco","negro","rojo","azul","metalizado"};
  String consumos[] = {"F","E","D","C","B","A","AA","AAA"};

  // NUEVO -> final static == const
  private final static double PRECIO = 100;
  private final static String COLOR = "blanco"; // Para escribir COLOR cada vez que queramo poner el color por defecto.
  private final static String CONSUMO = "F";
  private final static double PESO = 20;

  //Constructores
  public Electrodomestico(){
    this(PRECIO,COLOR,CONSUMO,PESO);            //Llama al constructor con parámetros.
  }
  public Electrodomestico(double precioBase, String consumoEnergetico){
    this(precioBase,COLOR,consumoEnergetico,PESO);
  }
  public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso){
    this.precioBase = precioBase;
    this.setColor(color);
    this.setConsumoEnergetico(consumoEnergetico);
    this.peso = peso;
  }
  public Electrodomestico(Electrodomestico electrodomestico){
    this(electrodomestico.precioBase,electrodomestico.color,electrodomestico.consumoEnergetico,electrodomestico.peso);
  }

  // Set y Get
  public void setPrecioBase(double precioBase){
    this.precioBase = precioBase;
  }
  public void setColor(String color){
    this.color = COLOR;
    color = color.toLowerCase();
    if (comprobar(color, colores) >= 0) {
      this.color = color;
    }
  }
  public void setConsumoEnergetico(String consumoEnergetico){
    this.consumoEnergetico = CONSUMO;
    consumoEnergetico = consumoEnergetico.toUpperCase();
    if (comprobar(consumoEnergetico, consumos) >= 0) {
      this.consumoEnergetico = consumoEnergetico;
    }
  }
  public void setPeso(double peso){
    this.peso = peso;
  }


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

  //METODO COMPROBAR
  private boolean comprobarBoolean(String elemento, String[] lista){
    boolean encontrado = false;

    //this.color = COLOR;              //Por defecto.
    //color = color.toLowerCase();
    for (int i = 0 ; i < lista.length && !encontrado ; i++){
      if (lista[i].equals(elemento)){
        encontrado = true;
        //this.color = color;
      }
    }
    return encontrado;
  }
  /*
  private void comprobarCodigoEnergetico(String codigo){
    boolean encontrado = false;
    this.consumoEnergetico = CONSUMO;              //Por defecto.
    codigo = codigo.toUpperCase();
    for (int i = 0 ; i < codigos.length && !encontrado ; i++){
      if (codigos[i].equals(codigo)){
        encontrado = true;
        this.consumoEnergetico = codigo;
      }
    }
  }
  */
  // Podemos mejorar comprobarCodigoEnergetico para que devuelva la posición en la que ha encontrado la letra:
  private int comprobar(String elemento, String[] lista){
    boolean encontrado = false;

    int posicion = -1;
    for (int i = 0 ; i < lista.length && !encontrado ; i++){
      if (lista[i].equals(elemento)){
        encontrado = true;
        posicion = i;
      }
    }
    return posicion; //Porque si no el i++ devuelve la siguiente posición.
  }

  public double precioFinal(){
    return this.precioBase + extraPeso() + extraEficiencia() + extraColor();

  }

  private double extraPeso(){
    int rango = (int)(this.peso/20);  // Cada 20kg que aumenta el peso
    return rango*30;                  // El precio aumenta 30€
  }
  private double extraEficiencia(){
    /*
    |F| E| D| C| B|  A| AA|AAA|
    |0|20|40|60|80|100|120|140|
    */
    // hemos mejorado comprobarCodigoEnergetico() para que devuelva la posición.
    int posicion = comprobar(this.consumoEnergetico, consumos);
    return posicion*20;
  }
  private double extraColor(){
    double descuento = 0;
    if ((this.color).equals(COLOR)) descuento = -20;
    return descuento;
  }

  // EXTRA: Pensar en la posible refactorización de los métodos comprobarColor() y comprobarCodigoEnergetico()

  public String toString(){
    return "El precio base es  " + this.precioBase + ", el color es " + this.color + ", el consumo es " + this.consumoEnergetico + ", el peso es "+ this.peso + ".\nEl precio final es: " + precioFinal() + ".";
  }
}
