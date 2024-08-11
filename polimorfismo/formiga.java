package polimorfismo;

public class formiga extends Animal {
    
    public void formiga(){
        super(6);
    }

    @Override
    public void andar(){
        System.out.println ("Animal está andando...");
    }
}