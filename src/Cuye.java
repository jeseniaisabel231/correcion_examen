import java.util.Scanner;

public class Cuye extends ComidaSerrana{
    //atributos
    String Chef;
    //constructor


    public Cuye(String nombre) {
        super(nombre);
    }
    //get y set


    public String getChef() {
        return Chef;
    }

    public void setChef(String chef) {
        Chef = chef;
    }
    //metodos personalisados
    @Override
    public void entradatos_sierra(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del chef: ");
        Chef=entrada.nextLine();
    }
    @Override
    public void salida_sierra(){
        System.out.print("Nombre del chef: "+getChef());
    }
}
