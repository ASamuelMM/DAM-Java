//A.SAMUEL MOLINA MORALES
import java.util.ArrayList;
import java.util.Arrays;

class Main{
  public static void main(String[] args){

    //-----CLASE MUEBLE-----
    System.out.println("-------CLASE MUEBLE-------");
    Mueble miMueble = new Mueble();
    Mueble miMuebleValores = new Mueble("Aluminio", 150, 150, 60);
    ArrayList<Integer> dimensiones = new ArrayList();
    dimensiones.add(90);
    dimensiones.add(70);
    dimensiones.add(45);
    Mueble miTercerMueble = new Mueble("Plastico", dimensiones);
    //Imprimir
    System.out.println("--MUEBLE POR DEFECTO--");
    System.out.println(miMueble);

    System.out.println("--MUEBLE CON VALORES--");
    System.out.println(miMuebleValores);

    System.out.println("--MUEBLE CON ARRAY--");
    System.out.println(miTercerMueble);

    //Cambiar atributos con set
    miMueble.setMaterial("Oro");
    miMueble.setDimensiones(10, 10, 5);

    //Mostrar atributos con get
    System.out.println(miMueble.getMaterial());
    System.out.println(miMueble.getDimensiones());

    //Metodo de Superficie
    System.out.println("--METODO SUPERFICIE--");
    System.out.println(miMueble.superficie());

    //-----CLASE MESA-----
    System.out.println("-------CLASE MESA-------");
    Mesa miMesa = new Mesa();
    Mesa miMesaValores = new Mesa("Aluminio", dimensiones, 3);
    //Imprimir
    System.out.println("--MESA POR DEFECTO--");
    System.out.println(miMesa);

    System.out.println("--MESA CON VALORES--");
    System.out.println(miMesaValores);

    //Cambiar atributos con set
    miMesa.setNumPatas(2);

    //Mostrar atributos con get
    System.out.println(miMesa.getNumPatas());

    //-----CLASE ARMARIO-----
    System.out.println("-------CLASE ARMARIO-------");
    Armario miArmario = new Armario();
    Armario miArmarioValores = new Armario("Madera de roble", dimensiones, "Corredera", 5);
    //Imprimir
    System.out.println("--ARMARIO POR DEFECTO--");
    System.out.println(miArmario);

    System.out.println("--ARMARIO CON VALORES--");
    System.out.println(miArmarioValores);

    //Cambiar atributos con set
    miArmario.setTipoPuerta("Plegable");
    miArmario.setNumBaldas(3);

    //Mostrar atributos con get
    System.out.println(miArmario.getTipoPuerta());
    System.out.println(miArmario.getNumBaldas());

    //Metodo de Superficie
    System.out.println("--METODO SUPERFICIE--");
    System.out.println(miArmarioValores.superficie());
  }
}
