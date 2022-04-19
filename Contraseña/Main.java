class Main{
  public static void main(String[] args) {

    //-------CLASE PASSWORD-------
    System.out.println("=======|CLASE PASSWORD|=======");
    Password miPass = new Password();
    Password passValores = new Password(5, "abcdefg");

    //Imprimir
    System.out.println("POR DEFECTO: " + miPass);
    System.out.println("CON VALORES: " + passValores);



  }
}
