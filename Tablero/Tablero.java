class Tablero{
  private Ficha matriz[][];
  private int filas;
  private int columnas;

  //CONSTRUCTOR
  public Tablero(){
    this.filas = 3;
    this.columnas = 3;
    this.matriz = new Ficha[filas][columnas];
    //rellenarMatriz(0);
  }

  public Tablero(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.matriz = new Ficha[filas][columnas];
  }

  //FUNCION RELLENAR TABLERO CON X
  public void rellenarTableroPorDefecto(Ficha fichaUno){
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = fichaUno;
      }
    }
  }

  //FUNCION RELLENAR TABLERO CON X Y O
  public void rellenarTableroXO(){
    Ficha fichaX = new Ficha();
    Ficha fichaO = new Ficha("O");
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        if ((i + j) % 2 == 0) {
          this.matriz[i][j] = fichaX;
        }else this.matriz[i][j] = fichaO;
      }
    }
  }

/*
  //FUNCION QUE INDICA LAS POSICIONES
  public void rellenarTableroPosicion(){
    int posicion = 0;
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = posicion;
        posicion++;
      }
    }
  }
*/

  //FUNCION QUE DELIMITA EL TABLERO
  public void lineaHorizontal(){
    for (int i = 0; i < this.columnas; i++){
      System.out.print("----");
    }
    System.out.println("--");
  }

  //FUNCION IMPRIMIR TABLERO
  public void imprimir(){
    lineaHorizontal();
    for(int i = 0; i < this.filas; i++){
      System.out.print(" | ");
      for (int j = 0; j < this.columnas; j++){
        System.out.print(this.matriz[i][j].getForma());
        System.out.print(" | ");
      }
      System.out.println("");
      lineaHorizontal();
    }
  }

}
