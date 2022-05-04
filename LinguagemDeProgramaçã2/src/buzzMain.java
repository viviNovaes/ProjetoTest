public class buzzMain {
    public static void main ( String [] args){
        Buzz buzz1 = new Buzz();
        buzz1.getAsasStatus();
        buzz1.abreAsas();
        buzz1.getAsasStatus();

        buzz1.getCapaceteStatus();
        buzz1.AbreFechaCapacete();
        buzz1.getCapaceteStatus();

        buzz1.getLaserStatus();
        buzz1.DisparaLaser();
        buzz1.getLaserStatus();

        System.out.println(buzz1.frases(1));
        System.out.println(buzz1.frases(2));
        System.out.println(buzz1.frases(3));
        System.out.println(buzz1.frases(4));
        System.out.println(buzz1.frases(5));
        System.out.println(buzz1.frases(6));

        GolpesBuzz buzz2 = new GolpesBuzz();
        buzz2.Esmurrar();
        buzz2.GolpeKarate();
    }
}
