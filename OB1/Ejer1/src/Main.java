public class Main {
    public static void main(String[] args) throws Exception {
        //Creo una instancia de un objeto para luego llamar a las funciones de Aleatorio
        Aleatorio num1 = new Aleatorio();

        System.out.println(Math.max(num1.numeroAleatorio1(), num1.numeroAleatorio2()));
    }
}
