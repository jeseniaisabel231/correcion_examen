import java.util.Scanner;

public class ComidaCosteña extends ComidaTipica {
    //atributos
    String ingredientePrincipal;
    String Region;

    //constructor

    public ComidaCosteña(String nombre) {
        super(nombre);
    }

    public String getIngredientePrincipal() {
        return ingredientePrincipal;
    }

    public String getRegion() {
        return Region;
    }

    public void setIngredientePrincipal(String ingredientePrincipal) {
        this.ingredientePrincipal = ingredientePrincipal;
    }

    public void setRegion(String region) {
        Region = region;
    }

    //metodo personalisado
    public void entradatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el ingrediente principal del plato: ");
        ingredientePrincipal= entrada.nextLine();

        System.out.print("Ingrese la region de ese plato: ");
        Region= entrada.nextLine();

        setIngredientePrincipal(ingredientePrincipal);
        setRegion(Region);
    }
    public void salida(){
        System.out.println("Nombre del plato: "+getNombre());
        System.out.println("Su ingrediente principal es: "+getIngredientePrincipal());
        System.out.println("La region a la que pertenece es: "+getRegion());
    }
}
