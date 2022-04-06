class Main{
  public static void main(String[] args) {
    Tablero tresEnRaya = new Tablero();
    Ficha fichaX = new Ficha();
    Ficha fichaO = new Ficha("O");
    tresEnRaya.rellenarTableroPorDefecto(fichaO);
    tresEnRaya.imprimir();


    tresEnRaya.rellenarTableroXO();
    tresEnRaya.imprimir();

    /*
    1. TABLERO VACIO
    2. ¿DONDE PONEMOS LA FICHA?
    3. POSICION
    4. PONEMOS EN POSICION LA FICHA QUE TOQUE
    */

  }
}
