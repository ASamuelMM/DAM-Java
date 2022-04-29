class Main{
  public static void main(String[] args) {

    //_____________PRUEBAS CLASE GATO_____________
    System.out.println("---------|PRUEBAS GATO|---------");
    Gato miGato = new Gato("Lucas", 0);

    System.out.println(miGato); //Prueba el constructor de gato y mascota

    //Prueba los metodos que la clase Gato implementa de la interfaz
    System.out.println(miGato.onomatopeya());
    System.out.println(miGato.durmiendo());
    System.out.println(miGato.comiendo());
    miGato.excretando(); //Prueba tambien la funcion heredada limpiarExcrementos()
    System.out.println("-Cacas: " + miGato.getCacas());
    System.out.println("-Pipis: " + miGato.getPipis());
    System.out.println("-Hijos probables del Gato: " + miGato.follando());

    System.out.println("-Aumentar el nivel de amistad: " + miGato.acariciar());

  }
}
