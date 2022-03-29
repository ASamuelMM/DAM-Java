import java.util.ArrayList;

class Mesa extends Mueble{
  //ATRIBUTOS
  private int numPatas;

  //CONSTRUCTOR POR DEFECTO
  public Mesa(){
    this.numPatas = 4;
  }

  //CONSTRUCTOR CON VALORES
  public Mesa(String mat, ArrayList<Integer> medidas, int patas){
    super(mat, medidas);
    this.numPatas = patas;
  }

  //GET
  public int getNumPatas(){
    return this.numPatas;
  }

  //SET
  public void setNumPatas(int patas){
    this.numPatas = patas;
  }

  //TO STRING
  public String toString(){
    return super.toString() + ". La mesa tiene " + this.numPatas + " patas";
  }
}
