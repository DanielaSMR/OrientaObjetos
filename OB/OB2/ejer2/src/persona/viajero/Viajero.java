package persona.viajero;

import java.util.Scanner;

public class Viajero {
    private String dNI;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String direccion;
    //creamos en la clase viajero un campo estatico que vaya contando cada vez que creamos una instancia
    static int almacen;

    //Constructor(Tiene el mismo nombre que la clase)
    public void Viajero(String dNI,String nombre,String apellido,String nacionalidad,String direccion){

        this.dNI = dNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        almacen++;

    }

    //Creamos otro constructor donde los valores esten por defecto y no recibira ningun parametro
    public void Viajero(){

        this.dNI = "0";
        this.nombre = "nulo";
        this.apellido = "nulo";
        this.nacionalidad = "nulo";
        this.direccion = "nulo";
        almacen++;
    }

    public void getInfo(String Formato){
        Scanner sc = new Scanner(System.in);

        if(Formato.equals("pausado")){
            System.out.println(dNI);
            sc.nextLine();
            System.out.println(nombre);
            sc.nextLine();
            System.out.println(apellido);
            sc.nextLine();
            System.out.println(nacionalidad);
            sc.nextLine();
            System.out.println(direccion);

        }else if(Formato.equals("normal")){
            System.out.println(dNI);
            System.out.println(nombre);
            System.out.println(apellido);
            System.out.println(nacionalidad);
            System.out.println(direccion);

        }

    }

    //Se quita el public porque quiero que sea package private
    String getdNI() {
        return dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    void setdNI(String dNI) {
        dNI = dNI;
    }
}
