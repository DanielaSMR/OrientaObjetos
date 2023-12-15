public class Password {
    private int longitud = 8;
    private String contrasenya;//??

    public Password(){

        contrasenya = generarPassword();

    }

    public Password(int longitud){

        this.longitud = longitud;
        contrasenya = generarPassword();
        
    }

    public String generarPassword(){
        
        int num;
        String contras = "";

        for(int i = 0; i <= longitud;i++){
            num = (int) (Math.random()*3+0);
            if(num == 0){
                contras += (char)(Math.random()*26 + 'a');
            }else if(num == 1){
                contras += (int)(Math.random()*8+1);
            }else if (num == 2){
                contras += (char)(Math.random()*26 + 'A');
            }
        }

        return contras;

    }

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
