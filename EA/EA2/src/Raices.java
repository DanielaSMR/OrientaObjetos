public class Raices {

    private int a;
    private int b;
    private int c;

    public Raices(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices(){

        double funcionPos = (-b + Math.sqrt(((b*b)-(4*a*c)))/(2*a));
        double funcionNeg = (-b - Math.sqrt(((b*b)-(4*a*c)))/(2*a));
        System.out.println("Solucion 1: " + funcionPos + "\n" + "Solucion 2: " + funcionNeg);
    
    }

    public void obtenerRaiz(){

        int funcion = -b/(2*a);
        System.out.println("Obtener Raiz: " + funcion);

    }

    public double getDiscriminante(){
        return (b*b)-(4*a*c);
    }

    public boolean tieneRaices(){
        if(getDiscriminante() > 0){
            return true;
        }else 
            return false;

    }

    public boolean tieneRaiz(){
        if(getDiscriminante() == 0){
            return true;
        }else 
            return false;

    }

    public void calcular(){
        if(tieneRaices() == true){
            obtenerRaices();
        }else if(tieneRaiz() == true){
            obtenerRaiz();
        }else{
            
        }
    }


}
