class Main{
  public static void main(String[] args) {
    Tablero tresEnRaya = new Tablero();
    Ficha miFicha = new Ficha();
    tresEnRaya.rellenarTableroPorDefecto(miFicha);
    tresEnRaya.imprimir();
  }
}
