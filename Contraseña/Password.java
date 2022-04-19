class Password{
  //ATRIBUTOS
  private int longitud;
  private String contrasena;

  //CONSTRUCTOR POR DEFECTO
  public Password(){
    this.longitud = 8;
    this.contrasena = "aaaaaaaa";
  }

  public Password(int longitud, String contrasena){
    this.longitud = longitud;

    if (contrasena.length() == longitud) {
      this.contrasena = contrasena;
    }
    else if (contrasena.length() < this.longitud) {
      while (contrasena.length() < longitud){
        contrasena += "0";
      }
      this.contrasena = contrasena;
    }
    else{
      String contrasenaRecortada = "";
      for (int i = 0; i < longitud; i++) {
        contrasenaRecortada += contrasena.charAt(i);
      }
      this.contrasena = contrasenaRecortada;
    }

  }

  //CONSTRUCTOR CON VALORES

  //GET

  //SET

  //TO STRING
  public String toString(){
    return "La contraseña de tamaño " + this.longitud + " es " + this.contrasena;
  }

}
