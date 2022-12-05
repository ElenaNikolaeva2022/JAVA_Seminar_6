package CAT;

public class Animal {

    protected String name;
    protected int age;
    protected Owner owner;

    public Animal(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getOwnerNumber() {
        return owner.getNumber();
    }

    public void doVoice() {

    }

    public String toString() {
        return "[" + name + "] {" + age + "}";
    }
}
