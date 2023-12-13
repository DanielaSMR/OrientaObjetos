public class Raices {

    private int a = 3;
    private int b = 7;
    private int c = 9;

    public void obtenerRaices(){

        double funcionPos = (-b + Math.sqrt(((b*b)-(4*a*c)))/(2*a));
        double funcionNeg = (-b - Math.sqrt(((b*b)-(4*a*c)))/(2*a));
        System.out.println("Solucion 1: " + funcionPos + "\n" + "Solucion 2: " + funcionNeg);
    
    }

    public void obtenerRaiz(){

        int funcion = (-b)/(2*a);
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

}
