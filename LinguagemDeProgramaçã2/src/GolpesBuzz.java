public class GolpesBuzz {
    //atributos
    private boolean BraçoEsticado;
    private boolean mao ;


    //Métodos
    // Dois golpes básicos do Buzz
    public void Esmurrar () {
        mao = false ;
        BraçoEsticado = true ;
        System.out.println("Murro realizado");
        BraçoEsticado = false ;

    }
    public void GolpeKarate (){
        mao = true ;
        BraçoEsticado = true ;
        System.out.println("Golpe de Karatê realizado");
        BraçoEsticado = false ;

    }
}
