class Cuenta{
  //ATRIBUTOS
  private String titular;
  private double saldo;

  //CONSTRUCTOR POR DEFECTO
  public Cuenta(){
    this.titular = "";
    this.saldo = 0;
  }

  //CONSTRUCTOR TITULAR OBLIGATORIO
  public Cuenta(String tit){
    this.titular = tit;
  }

  //CONSTRUCTOR CANTIDAD OPCIONAL
  public Cuenta(String tit, double saldo){
    this.titular = tit;
    if (saldo>0) {
      this.saldo = saldo;
    }else{
      this.saldo = 0;
    }
  }

  //GET
  public String getTitular(){
    return this.titular;
  }

  public double getSaldo(){
    return this.saldo;
  }

  //SET
  public void setTitular(String tit){
    this.titular = tit;
  }

  public void setSaldo(double saldo){
    if (saldo>0) {
      this.saldo = saldo;
    }
  }

  //TO STRING
  public String toString(){
    return "El titular de la cuenta es " + this.titular + " y tiene un saldo de " + this.saldo + " euros";
  }

  //-----METODOS ESPECIALES------

  //METODO INGRESAR
  public void ingresar(double dinero){
    if (dinero > 0) {
      this.saldo += dinero;
    }
  }

  //METODO RETIRAR
  public void retirar(double dinero){

    if (dinero > 0) {
      this.saldo -= dinero;
    }

    if (this.saldo < 0) {
      this.saldo = 0;
    }
  }

}
