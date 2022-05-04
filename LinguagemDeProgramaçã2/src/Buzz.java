// Capacete retrátil
// 6 frases
// Dispara Laser
// Braço articulado para golpes
// Abra asas

public class Buzz {
    public void getAsasStatus() {
        if (asas == true){
            System.out.println("Asas abertas");
        } else {
            System.out.println("Asas fechadas");
        }
    }
    public void getCapaceteStatus() {
        if (capacete == true){
            System.out.println("Capacete aberto");
        } else {
            System.out.println("Capacete fechado");
        }
    }
    public void getLaserStatus() {
        if (laser == true){
            System.out.println("Dispara laser");
        } else {
            System.out.println("Desliga laser");
        }
    }


    //Atributos
    private boolean asas;
    private boolean capacete;
    private boolean BraçoEsticado;
    private boolean laser;

    //Métodos
    public void abreAsas (){
        if (asas == true){
            asas = false ;
        } else {
            asas = true ;
        }
    }
    public String frases (int frase){
        switch (frase){
            case  1 :
               return  "Ao infinito e além!" ;
            case  2 :
               return  "Isto não é voar. Isto é cair, com estilo!" ;
            case  3 :
                return  "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!" ;
            case  4 :
                return  "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta." ;
            case  5 :
                return  " Nunca duvidei de mim mesmo, Comandante, e não vou começar agora! " ;
            case  6 :
                return  " Nunca duvidei de mim mesmo, Comandante, e não vou começar agora! " ;

        }
        return "";
    }
    public void AbreFechaCapacete (){
        if (capacete == true){
            capacete = false ;
        } else {
            capacete  = true ;
        }
    }
    public void DisparaLaser () {
        if (laser == true){
            laser = false ;
        } else {
            laser = true ;
        }
    }

}

