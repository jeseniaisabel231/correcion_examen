import java.util.Scanner;

public class ComidaSerrana extends ComidaTipica{
    //atributos
    String ingredientePrincipal_s;
    String region_s;
    //constructor

    public ComidaSerrana(String nombre) {
        super(nombre);
    }
    //get y set

    public String getingredientePrincipal_s() {
        return ingredientePrincipal_s;
    }

    public String getregion_s() {
        return region_s;
    }

    public void setingredientePrincipal_s(String ingredientePrincipal_c) {
        this.ingredientePrincipal_s = ingredientePrincipal_c;
    }

    public void setregion_s(String region_c) {
        this.region_s = region_c;
    }

    public void entradatos_sierra(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el ingrediente principal del plato: ");
        ingredientePrincipal_s= entrada.nextLine();

        System.out.print("Ingrese la region de ese plato: ");
        region_s= entrada.nextLine();

        setingredientePrincipal_s(ingredientePrincipal_s);
        setregion_s(region_s);
    }

    public void salida_sierra(){
        System.out.println("Su ingrediente principal es: "+getingredientePrincipal_s());
        System.out.println("La region a la que pertenece es: "+getregion_s());
    }
}
