package polimorfismo;

public class Principal {
    public static void main (){
        Animal animal = new Animal(4);
        Cachorro cachorro = new Cachorro ("TERROR");
        Formiga formiga = new Formiga ();
        Peixe peixe = new Peixe("BOIA");

        cachorro.brinca();
        cachorro.setnome("CARAMELO");
        System.out.println ("Nome do Dog: " + cachorro.getNome());

        formiga.andando();

        peixe.setnome("Peixe descolado");
        peixe.comer();
        peixe.nadando();
        System.out.println ("Nome do peixe:" + peixe.getNome());
    }
}