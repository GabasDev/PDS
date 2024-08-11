package polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("TERROR");
        Formiga formiga = new Formiga(); 
        Peixe peixe = new Peixe("BOIA");

        cachorro.brinca();
        cachorro.setNome("CARAMELO"); 
        System.out.println("Nome do Dog: " + cachorro.getNome()); 

        formiga.andando(); 

        peixe.setNome("Peixe descolado");
        peixe.comer(); 
        peixe.nadando(); 
        System.out.println("Nome do peixe: " + peixe.getNome()); 
    }
}
