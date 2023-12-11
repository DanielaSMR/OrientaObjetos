import java.util.*;

public class Persona {

    /*Zona atributos */
    private String nombre = " ";
    private int edad = 0;
    private char sexo = ' ';
    // final para hacer el valor constante
    private final static char sexo_def = 'H';
    private int peso = 0;
    private int altura = 0;

    private int contPersonas;

    private final static int INFRAPESO_DEF = -1;
    private final static int IDEALPESO_DEF = 0;
    private final static int SOBREPESO_DEF = 1;


    /*Zona constructores */
    public Persona(){

        contPersonas++;
        
    }

    public Persona(String nombre,int edad,char sexo){

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

        contPersonas++;

    }

    public Persona(String nombre,int edad,char sexo,int peso,int altura){
        
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

        contPersonas++;

    }

    /*Zona metodos */

    public boolean esMayorDeEdad(int edad){

        if(edad >= 18){
            return true;
        }else
            return false;

    }

    public void comprobarSexo(char sexo){
    
        if(sexo == 'H'){
            this.sexo = 'H';
        }else if(sexo == 'M'){
            this.sexo = 'M';
        }else{
            this.sexo = sexo_def;
        }

    }


    public int calcularIMC(int peso,int altura){
        int IMC = peso / (altura*altura);

        if(IMC < 20){
            return INFRAPESO_DEF;
        }else if(IMC >= 20 && IMC <= 25){
            return IDEALPESO_DEF;
        }else{
            return SOBREPESO_DEF;
        }

    }

    public String toString(){

        return "Paciente: " + nombre + " \n" + "Edad: " + edad + "años \n" + "Sexo: " + sexo + "Peso: " + peso + "kg \n" + "Altura: " + altura + "metros";
    
    }

    
    /*Zona de get y set */

    //Atributo de clase == estatico
    //Atributo de objeto == dinamico

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getContPersonas() {
        return contPersonas;
    }

    public void setContPersonas(int contPersonas) {
        this.contPersonas = contPersonas;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Escribe tu edad");
        int edad = sc.nextInt();
        System.out.println("Escribe tu sexo");
        char sexo;
        sexo = sc.next().charAt(0);
        System.out.println(sexo);
        System.out.println("Escribe tu peso");
        int peso = sc.nextInt();
        System.out.println("Escribe tu altura");
        int altura = sc.nextInt();

        Persona Dan = new Persona(nombre, edad, sexo, peso, altura);

        Persona Mar = new Persona(nombre,edad,sexo);

        Persona Sol = new Persona();

        

    }

}
