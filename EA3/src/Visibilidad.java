import java.util.Scanner;

public class Visibilidad {
    public static void main(String[] args) {
        String persona1 = "Lucas";
        String persona2 = "Pau";
        String persona3 = "Daniela";
        String persona4 = "Lucia";

        int num = 0;
        int b = 0;
        String persona = "", jhos;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;

        for(int i = 0;i < 10;i++){
            num = (int) (Math.random()*3+1);

            System.out.println("Ingrese Cadena");
            switch(num){
                case 1:
                if(cont1 == 0){
                    persona = persona1;
                    cont1++;

                    b=persona.charAt(i);
                    jhos=Integer.toBinaryString(b);
                    System.out.println(jhos+"\n");
                    break;
                }
                case 2:
                if(cont2 == 0){
                    persona = persona2;
                    cont2++;

                    b=persona.charAt(i);
                    jhos=Integer.toBinaryString(b);
                    System.out.println(jhos+"\n");
                    break;
                }
                case 3:
                if(cont3 == 0){
                    persona = persona3;
                    cont3++;

                    b=persona.charAt(i);
                    jhos=Integer.toBinaryString(b);
                    System.out.println(jhos+"\n");
                    break;
                }
                case 4:
                if(cont4 == 0){
                    persona = persona4;
                    cont4++;

                    b=persona.charAt(i);
                    jhos=Integer.toBinaryString(b);
                    System.out.println(jhos+"\n");
                    break;
                }
            }
            
        }
    }
}
