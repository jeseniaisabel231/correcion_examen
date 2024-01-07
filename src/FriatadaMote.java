import java.util.Scanner;

public class FriatadaMote extends Granos {
    //atributo
    String Chef;
    //constructor

    public FriatadaMote(String nombre, String tipo_grano) {
        super(nombre, tipo_grano);
    }
    //metodos get y set

    public String getChef() {
        return Chef;
    }

    public void setChef(String chef) {
        Chef = chef;
    }
    //metodos personalizados
    @Override
    public void entradatos_sierra(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del chef: ");
        Chef=entrada.nextLine();
    }
    @Override
    public void salida_sierra(){
        System.out.println("Nombre del chef: "+getChef());
    }
}
