public class App {
    public static void main(String[] args) throws Exception {
        //Ejercicio If
      int numeroif = -5;
      if(numeroif > 0){System.out.println("Positivo");}
      else if(numeroif < 0){System.out.println("Negativo");}
      else{System.out.println("Cero");}
      System.out.println("*=*=*=*=*=*=*=*=");
      //Ejercicio while
      int numeroWhile = 0;
      while (numeroWhile < 3){
        System.out.println(numeroWhile);
        numeroWhile += 1;
      }
      System.out.println("*=*=*=*=*=*=*=*=");
      //Ejercicio Do While
      numeroWhile = 1;
      do{
        System.out.println(numeroWhile);
        numeroWhile += 1;
      }while(numeroWhile < 1);
      System.out.println("*=*=*=*=*=*=*=*=");
      //Ejercicio For
      for(int numeroFor = 0; numeroFor <= 3; numeroFor ++){
        System.out.println(numeroFor);
      }
      System.out.println("*=*=*=*=*=*=*=*=");
      //Ejercicio Switch
      String estacion = "ninguno";
      switch(estacion){
        case "otoño": {System.out.println("Otoño");}
        case "invierno": {System.out.println("Invierno");}
        case "primavera": {System.out.println("Primavera");}
        case "verano": {System.out.println("Verano");}
        default: {System.out.println("No es una estacion");}

      }
    }
}
