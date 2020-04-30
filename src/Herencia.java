public class Herencia {
    public static void main(String[] args) {
        clasePadre clasePadre = new clasePadre(5,1.92,true,'h', (byte) 20);
        System.out.println(clasePadre.toString());

        claseHija claseHija = new claseHija((byte)3,2);
        System.out.println(claseHija.toString());
        clasePadre.mfkmf();

        ClaseHijastra claseHijastra = new ClaseHijastra(6,1.52,false);
        System.out.println(claseHijastra.toString());
        System.out.println(claseHijastra.equals("\n" + claseHija));
        System.out.println(claseHijastra.hashCode());

        ClaseEmergencia claseEmergencia = new ClaseEmergencia();
        claseEmergencia.mostrarEdad();
    }
}
