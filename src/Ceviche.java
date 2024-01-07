import java.util.Scanner;

public class Ceviche extends ComidaCosteña{
    //atributos
    String Chef;
    //Constructor
    public Ceviche(){

    }
    //set y get

    public String getChef() {
        return Chef;
    }

    public void setChef(String chef) {
        Chef = chef;
    }
    //metodo personalisado
    @Override
    public void entradatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del chef: ");
        Chef=entrada.nextLine();
    }
    public void salida(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del chef: ");
        Chef=entrada.nextLine();
    }
}
