import java.util.Scanner;

public class Parincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la longitud de la contraseña");
        int largo = sc.nextInt();

        Password contra = new Password(largo);
        
        System.out.println(contra.contrasenya);
    }


}
