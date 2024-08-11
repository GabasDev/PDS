package polimorfismo;

public class Animal {
    private int patas;

    public Animal(int patas) {
        this.patas = patas;
    }

    public void comer() {
        System.out.println("Animal está comendo...");
    }

    public int getPatas() {
        return patas;
    }
}
