import java.util.ArrayList;
import java.util.Scanner;

class Main{

  public static int sumaPatasPicos(int patas, int picos){
    return patas + picos;
  }

  public static void main(String[] args) {

    System.out.println("--------------------A. SAMUEL MOLINA MORALES--------------------");
    System.out.println("____________________PARTE DE LAS CLASES___________________");

    //-------CLASE ANIMAL-------
    System.out.println("=======CLASE ANIMAL=======");
    Animal miAnimal = new Animal();
    Animal animalSalvaje = new Animal("Elefante", 12, "hiervas", 4);

    //Imprimir
    System.out.println("POR DEFECTO: " + miAnimal);
    System.out.println("CON VALORES: " + animalSalvaje);

    //Modificar valores con SET
    System.out.println("Valores de miAnimal modificados con SET");
    miAnimal.setEspecie("Canario");
    miAnimal.setNumAnimales(6);
    miAnimal.setComidaFav("Alpiste");
    miAnimal.setNumPatas(2);

    //Comprobar valores con GET
    System.out.println("-GET de la especie: " + miAnimal.getEspecie());
    System.out.println("-GET del numero de animales: " + miAnimal.getNumAnimales());
    System.out.println("-GET de la comida favorita: " + miAnimal.getComidaFav());
    System.out.println("-GET del numero de patas: " + miAnimal.getComidaFav());

    //Chiste del Animal
    System.out.println(animalSalvaje.chiste());

    //-------CLASE ZORRO-------
    System.out.println("=======CLASE ZORRO=======");
    Zorro miZorro = new Zorro();
    Zorro zorroSalvaje = new Zorro("Zorro", 22, "huerfanos", 4, 15);

    //Imprimir
    System.out.println("POR DEFECTO: " + miZorro);
    System.out.println("CON VALORES: " + zorroSalvaje);

    //Modificar valores con SET
    System.out.println("Valores de miZorro modificados con SET");
    miZorro.setDiasVisita(9);

    //Comprobar valores con GET
    System.out.println("-GET de los dias de visita: " + miZorro.getDiasVisita());

    //Chiste del Zorro
    System.out.println(zorroSalvaje.chiste());

    //Incrementar un dia de visita
    System.out.println("-Aumenta en otro dia la visita: " + miZorro.otroDiaMas());


    //-------CLASE GALLINA-------
    System.out.println("=======CLASE GALLINA=======");
    Gallina miGallina = new Gallina();
    Gallina gallinaSalvaje = new Gallina("Gallina", 50, "lo que le eches", 2, 5, 12);

    //Imprimir
    System.out.println("POR DEFECTO: " + miGallina);
    System.out.println("CON VALORES: " + gallinaSalvaje);

    //Modificar valores con SET
    System.out.println("Valores de miGallina modificados con SET");
    miGallina.setHuevosDia(4);
    miGallina.setDiasPoniendo(20);

    //Comprobar valores con GET
    System.out.println("-GET de los huevos por dia: " + miGallina.getHuevosDia());
    System.out.println("-GET del numero de dias poniendo: " + miGallina.getDiasPoniendo());
    System.out.println("-GET del total de huevos: " + miGallina.getHuevosTotales());

    //Chiste del Animal
    System.out.println(gallinaSalvaje.chiste());


    System.out.println("______________________PARTE ANTES DE LAS CLASES_________________________");
    System.out.println("A. SAMUEL MOLINA MORALES");

    //Metodo que calcula los picos que hay
    int totalPicos = gallinaSalvaje.picos();
    System.out.println("Total de picos: " + totalPicos);

    //Metodo que calcula las patas que hay
    int totalPatas = animalSalvaje.totalPatas() + zorroSalvaje.totalPatas() + gallinaSalvaje.totalPatas();
    System.out.println("Total de patas: " + totalPatas);

    //Metodo que calcula la suma de patas y picos
    System.out.println("La suma de las patas y los picos: " + sumaPatasPicos(totalPatas, totalPicos));

    //ZORRO MATA GALLINAS
    //Scanner sc = new Scanner(System.in);

    //int muertes = sc.nextInt();
    //int gallinasMuertas = 0;

    //for (int i = 1; sc.nextInt() != -1 && gallinasMuertas < gallinaSalvaje.getNumAnimales() ; i++ ) {
    //  gallinasMuertas
    //}
  }
}
