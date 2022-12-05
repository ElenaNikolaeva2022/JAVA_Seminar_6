package Animals;

import java.util.Objects;

public class Cat extends Animal {

    public Cat(String name, int age, Owner owner) {
        super(name, age, owner);
    }

    @Override
    public void doVoice() {
        System.out.println(name + " do meow");
    }

    // Если объекты равны по equals, то у них одинаковый hashcode
    // Если у объектов одинаковый hashcode, то ничего сказать нельзя

    // Если из А следует В, то из отрицания В следует отрицание А
    // Если у объектов разный hashcode, то они 100% разные

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat anotherCat = (Cat) obj;
            return name.equals(anotherCat.name);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
