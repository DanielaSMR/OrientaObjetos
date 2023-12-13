public class Password {
    private int longitud = 8;
    static String contrasenya;//??

    public Password(){

        contrasenya = generarPassword();

    }

    public Password(int longitud){

        this.longitud = longitud;
        contrasenya = generarPassword();
        
    }

    /*public String generarPassword(){
        
        for(int i = 0; i <= longitud;i++){
            contrasenya += (Math.random()*9 + 'a');
        }

        return contrasenya;

    }*/

    public int getLogintud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getcontrasenya() {
        return contrasenya;
    }


}
