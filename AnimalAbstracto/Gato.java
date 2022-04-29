//CLASE GATO IMPLEMENTA LA INTERFAZ ANIMAL_INTERFAZ
import java.util.Random;
class Gato extends Mascota implements Animal_Interfaz {
  //ATRIBUTOS
  private int cacas;
  private int pipis;

  //CONSTRUCTOR
  public Gato(String nom, int nivel){
    super(nom, nivel);
    this.cacas = 0;
    this.pipis = 0;
  }

  public int getCacas(){
    return this.cacas;
  }

  public int getPipis(){
    return this.pipis;
  }

  //TO STRING
  public String toString(){
    return super.toString();
  }

  public String onomatopeya(){
    return "Miau";
  }

  public String durmiendo(){
    return "Zzzz" + " RrrrrRrrr";
  }

  public String comiendo(){
    String alimentacion = "peces";
    return "El gato come " + alimentacion;
  }

  public void excretando(){
    this.cacas += 1;
    this.pipis += 2;
    limpiarExcrementos(this.cacas);
  }

  public double follando(){
    Random random = new Random();
    int aleatorio = random.nextInt(1 + 10);
    double hijos = aleatorio * 0.9;
    return hijos;
  }
}

//CLASE GATO EXTIENDE ANIMAL
/*
class Gato extends Animal{

  public String onomatopeya(){
    return "Miau";
  }

  public String durmiendo(){
    return super.durmiendo() + " RrrrrRrrr";
  }

  public String comiendo(){
    this.alimentacion = "peces";
    return "Yo como " + this.alimentacion;
  }
}
*/
