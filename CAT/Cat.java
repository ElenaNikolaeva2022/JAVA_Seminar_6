package CAT;

public class Cat extends Animal {

    public Cat(String name, int age, Owner owner) {
        super(name, age, owner);
    }

    @Override
    public void doVoice() {
        System.out.println(name + " do meow");
    }
}