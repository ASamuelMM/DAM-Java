class Main{
  public static void main(String[] args) {

    //-------CLASE CUENTA-------
    System.out.println("=======|CLASE CUENTA|=======");
    Cuenta cuentaVacia = new Cuenta();
    Cuenta cuentaTitular = new Cuenta("Elon Musk");
    Cuenta cuentaCompleta = new Cuenta("Amancio Ortega", 3895690123.55);

    //Imprimir
    System.out.println("POR DEFECTO: " + cuentaVacia);
    System.out.println("CON TITULAR: " + cuentaTitular);
    System.out.println("COMPLETA: " + cuentaCompleta);

    //Modificar valores con SET
    System.out.println("Valores de cuentaCompleta modificados con SET");
    cuentaCompleta.setTitular("Samuel");
    cuentaCompleta.setSaldo(4321.56);

    //Comprobar valores con GET
    System.out.println("-GET del Titular: " + cuentaCompleta.getTitular());
    System.out.println("-GET de la cantidad: " + cuentaCompleta.getSaldo());

    //Metodo Ingresar
    cuentaCompleta.ingresar(50.60);
    System.out.println("Nuevo saldo tras ingreso: " + cuentaCompleta.getSaldo());

    //Metodo Retirar
    cuentaCompleta.retirar(250);
    System.out.println("Nuevo saldo tras retiro: " + cuentaCompleta.getSaldo());
  }
}
