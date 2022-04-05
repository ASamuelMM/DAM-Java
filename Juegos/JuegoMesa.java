//A. SAMUEL MOLINA MORALES

class JuegoMesa extends Juego{
  //ATRIBUTOS
  private int min;
  private int max;

  //CONSTRUCTOR POR DEFECTO
  public JuegoMesa(){
    this.min = 1;
    this.max = 10;
  }

  //CONSTRUCTOR CON VALORES
  public JuegoMesa(String nom, double pre, int minimo, int maximo){
    super(nom, pre);
    this.min = minimo;
    this.max = maximo;
  }

  //GET
  public int getMin(){
    return this.min;
  }

  public int getMax(){
    return this.max;
  }

  //SET
  public void setMin(int minimo){
    this.min = minimo;
  }

  public void setMax(int maximo){
    this.max = maximo;
  }

  //TO STRING
  public String toString(){
    return super.toString() + ". El juego de mesa es para minimo " + this.min + " personas y maximo " + this.max + " personas";
  }
}
