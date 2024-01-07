1. Que son los setters y getters?
   Son metodos utilizados en Jva para proteger los datos, un getter devuelve el valor de una variable mientras
   que un setter establece o actualiza el valor de una variable.
   EJEMPLO CON CODIGO
   import java.util.Scanner;

public class gatito {
    //atributos
    public String nombre;
    public String raza;
    public String color;

    //constructor

    public gatito(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    //metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //metodo entrada de datos
    public void salidaDatos(){
        System.out.println("nombre: " + getNombre());
        System.out.println("color: " + getColor());
        System.out.println("raza: " + getRaza());
    }
    public void entradaDatos(){
        Scanner amor= new Scanner(System.in);
        System.out.println("Ingrese el nombre del gato que desea cambiar: ");
        nombre=amor.nextLine();
        setNombre(nombre);
    }
}

   
2. Indique la secuencia de comandos de git que permiten clonar un repositorio traer los ultimos cambios
   y una ves actualizar los cambios.
   *git clone= permite clonar el repositorio
   *git commint=permite actualizar los cambios realizados
   *git push= "empujar" envia los cambios realizados al repositorio
   *git add= permite anadir documentos

3. Pra que se utiliza "try y catch" en java
   Es un evento que ocurre durante la ejecucion de un programa que rompe el flujo normal de la ejecuccion.
   import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        //ejercicio de IMC
        double peso, altura, IMC;

        Scanner entrada = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Ingrese su peso: ");
                peso = entrada.nextDouble();
            }catch(Exception Error){
                System.out.println("Ingrese solo numeros positivos");
                peso=0;
                entrada.nextLine();
            }
            if (peso > 0) {
                break;
            }
        }

        while(true){
            try{
                System.out.println("Ingrese su altura: ");
                altura = entrada.nextDouble();
            }catch(Exception Error){
                System.out.println("Ingrese solo numeros positivos");
                altura=0;
                entrada.nextLine();
            }
            if (altura > 0) {
                break;
            }
        }
        IMC = peso/(altura*altura);
        System.out.println("Su indice de masa corporal es: " + IMC);
    }
}

4. Defina Programacion orientada a objetos y el concepto de constructores
Poo es la manera mas util para reutilizar codigo y facilitar el proceso a los desarrolladores, estto tiene:
clases, metodos, objetos y atributos.
Constructor inicializan los atributos de un objeto
Tipos de constructores: Constructor vacio y constructor con parametros.
