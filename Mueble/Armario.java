import java.util.ArrayList;

class Armario extends Mueble{
  //ATRIBUTOS
  private String tipoPuerta;
  private int numBaldas;

  //CONSTRUCTOR POR DEFECTO
  public Armario(){
    this.tipoPuerta = "Batiente";
    this.numBaldas = 4;
  }

  //CONSTRUCTOR CON VALORES
  public Armario(String mat, ArrayList<Integer> medidas, String puerta, int baldas){
    super(mat, medidas);
    this.tipoPuerta = puerta;
    this.numBaldas = baldas;
  }

  //GET
  public String getTipoPuerta(){
    return this.tipoPuerta;
  }

  public int getNumBaldas(){
    return this.numBaldas;
  }

  //SET
  public void setTipoPuerta(String puerta){
    this.tipoPuerta = puerta;
  }

  public void setNumBaldas(int baldas){
    this.numBaldas = baldas;
  }

  //METODO SUPERFICIE PARA ARMARIO
  public int superficie(){
    int superficieMueble = super.superficie();
    return superficieMueble * this.numBaldas;
  }

  //TO STRING
  public String toString(){
    return super.toString() + ". El armario tiene el tipo de puerta " + this.tipoPuerta + " con " + this.numBaldas + " baldas";
  }
}
