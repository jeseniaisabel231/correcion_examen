import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion=0;
        //instanciacion
        ComidaCosteña plato1=new ComidaCosteña("Ceviche");
        System.out.println("Plato "+plato1.getNombre());
        plato1.entradatos();
        Ceviche plato6 = new Ceviche("Ceviche");
        plato6.entradatos();
        plato1.salida();
        plato6.salida();

        System.out.println(" ");
        ComidaSerrana plato2= new ComidaSerrana("Cuye");
        System.out.println("Plato "+plato2.getNombre());
        plato2.entradatos_sierra();

        Cuye plato7= new Cuye("Cuye");
        plato7.entradatos_sierra();
        plato2.salida_sierra();
        plato7.salida_sierra();

        System.out.println(" ");
        ComidaSerrana plato4= new ComidaSerrana("Mote y Fritada");
        System.out.println("Plato "+ plato4.getNombre());
        plato4.entradatos_sierra();

        FriatadaMote plato3 = new FriatadaMote("Mote y fritada","mote");
        plato3.entradatos_sierra();
        plato4.salida_sierra();
        plato3.salida_sierra();
        while(true) {
            try {
                Scanner casa = new Scanner(System.in);
                System.out.println("Te gusta algunos de estos platos: ");
                System.out.println("'1' (gusta)");
                System.out.println("'0' (no gusta)");
                opcion = casa.nextInt();
            } catch (Exception e) {
                System.out.println("Error no se aceptan letras, ingresa lo siguiente:");
                System.out.println("'1' (gusta)");
                System.out.println("'0' (no gusta)");
            }
            if(opcion>0){
                break;
            }
        }

    }
}