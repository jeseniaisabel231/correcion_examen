public class Granos extends ComidaSerrana{
    //Atributos
    String tipo_grano;
    //constrcutor

    public Granos(String nombre, String tipo_grano) {
        super(nombre);
        this.tipo_grano = tipo_grano;
    }
    //set y get

    public String getTipo_grano() {
        return tipo_grano;
    }

    public void setTipo_grano(String tipo_grano) {
        this.tipo_grano = tipo_grano;
    }

}
