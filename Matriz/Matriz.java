class Matriz{
  private int matriz[][];
  private int filas;
  private int columnas;

  //CONSTRUCTOR
  public Matriz(){
    this.filas = 8;
    this.columnas = 8;
    this.matriz = new int[filas][columnas];
    rellenarMatriz(0);
  }

  public Matriz(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.matriz = new int[filas][columnas];
  }

  public void rellenarMatriz(int numero){
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = numero;
      }
    }
  }

  public void rellenarMatrizFila(){
    //Rellena cada fila con su numero de fila
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = i;
      }
    }
  }

  public void rellenarMatrizColumna(){
    //Rellena cada columna con su numero de columna
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = j;
      }
    }
  }

  public void rellenarMatrizPosicion(){
    //Rellena cada posicion con su numero de posicion
    int posicion = 0;
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = posicion;
        posicion++;
      }
    }
  }

  public void rellenarMatrizFilaMasCol(){
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = i+j;
      }
    }
  }

  public void rellenarMatrizFilaPorCol(){
    for(int i = 0; i < this.filas; i++){
      for (int j = 0; j < this.columnas; j++){
        this.matriz[i][j] = i*j;
      }
    }
  }

  public void lineaHorizontal(){
    for (int i = 0; i < this.columnas; i++){
      System.out.print("----");
    }
    System.out.println("--");
  }

  //TO STRING
  public void imprimir(){
    lineaHorizontal();
    for(int i = 0; i < this.filas; i++){
      System.out.print(" | ");
      for (int j = 0; j < this.columnas; j++){
        System.out.print(this.matriz[i][j]);
        System.out.print(" | ");
      }
      System.out.println("");
      lineaHorizontal();

    }
  }
}
