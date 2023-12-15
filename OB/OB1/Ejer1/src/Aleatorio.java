import java.util.Random;

public class Aleatorio {
     private int numero1;
    private int numero2;
    private Random numeroRandom1 = new Random();
    private Random numeroRandom2 = new Random();

    //se ponen en privado las variables ya que luego las fuciones seran publicas

    public int numeroAleatorio1(){
        //creo la funcion que me dara el numAleatorio1 y 2 para despues llamarla desde el main
        
        return numero1 = numeroRandom1.nextInt(1000);

    }

    public int numeroAleatorio2(){
        
        return numero2 = numeroRandom2.nextInt(1000);

    }

    

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public Random getNumeroRandom1() {
        return numeroRandom1;
    }

    public void setNumeroRandom1(Random numeroRandom1) {
        this.numeroRandom1 = numeroRandom1;
    }

    public Random getNumeroRandom2() {
        return numeroRandom2;
    }

    public void setNumeroRandom2(Random numeroRandom2) {
        this.numeroRandom2 = numeroRandom2;
    }
}
