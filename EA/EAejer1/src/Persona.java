import java.util.*;

import javax.management.StringValueExp;

public class Persona {

    /*Zona atributos */
    private String nombre = " ";
    private int edad = 0;
    private char sexo = sexo_def;
    // final para hacer el valor constante
    private final static char sexo_def = 'H';
    private int peso = 0;
    private float altura = 0;
    private String DNI;

    static int contPersonas;
    
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

    public Persona(String nombre,int edad,char sexo,int peso,float altura){
        
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        DNI = generaDNI();

        contPersonas++;

    }

    /*Zona metodos */

    public boolean esMayorDeEdad(int edad){

        if(edad >= 18){
            return true;
        }else
            return false;

    }

    public static char comprobarSexo(char sexo){
    
        if(sexo == 'H'){
            return sexo = 'H';
        }else if(sexo == 'M'){
            return sexo = 'M';
        }else{
            return sexo = sexo_def;
        }

    }


    

    public int calcularIMC(float altura,int peso){
        if(peso == 0 && altura == 0){
            return INFRAPESO_DEF;
        }else{
            float IMC = (float)peso / (altura*altura);

            if(IMC < 20){
                return INFRAPESO_DEF;
            }else if(IMC >= 20 && IMC <= 25){
                return IDEALPESO_DEF;
            }else{
                return SOBREPESO_DEF;
            }
        }
    }

    public String toString(){

        return "Paciente: " + nombre + " \n" + "Edad: " + edad + "años \n" + "Sexo: " + sexo + "\n" + "Peso: " + peso + "kg \n" + "Altura: " + altura + "Cm" + "\n";
    
    }

    private String generaDNI(){
        
        String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        int[] num = new int[8];
        String dNI = "";
        int division = 0;

        do{
            if(division > 22){
                dNI = "";
            }
            for(int cont = 0; cont < num.length-1;cont++){
                dNI += (int) (Math.random()*8+1);
            }

            int DNINum = Integer.parseInt(dNI.substring(0, 7));
            division = DNINum % 23;

        }while(division > 22);

        dNI += letra[division];
                
        return dNI;

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

    public float getAltura() {
        return altura;
    }

    public int getContPersonas() {
        return contPersonas;
    }

    public void setContPersonas(int contPersonas) {
        this.contPersonas = contPersonas;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Escribe tu edad");
        int edad = sc.nextInt();

        System.out.println("Escribe tu sexo");
        char sexo = sc.next().charAt(0);
        sexo = comprobarSexo(sexo);

        System.out.println("Escribe tu peso");
        int peso = sc.nextInt();

        System.out.println("Escribe tu altura");
        float altura = sc.nextFloat();


        Persona Dan = new Persona(nombre, edad, sexo, peso, altura);

        Persona Mar = new Persona(nombre,edad,sexo);

        Persona Sol = new Persona();


        System.out.println(Dan.calcularIMC(Dan.altura,Dan.peso));
        System.out.println(Mar.calcularIMC(Mar.altura,Mar.peso));
        System.out.println(Sol.calcularIMC(Sol.altura,Sol.peso));

        System.out.println("Es mayor de edad?" + Dan.esMayorDeEdad(Dan.edad));
        System.out.println("Es mayor de edad?" + Mar.esMayorDeEdad(Mar.edad));
        System.out.println("Es mayor de edad?" + Sol.esMayorDeEdad(Sol.edad));
        System.out.println();

        System.out.println(Dan.toString());
        System.out.println(Mar.toString());
        System.out.println(Sol.toString());

        System.out.println("El DNI es: " + Dan.DNI);

        System.out.println("Has creado: " + Persona.contPersonas);



    }

}
