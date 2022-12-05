package CAT;

public class Dog extends Animal {
    public Dog(String name, int age, Owner owner) {
        super(name, age, owner);
    }

    @Override
    public void doVoice() {
        System.out.println(name + " do bark");
    }    
}
