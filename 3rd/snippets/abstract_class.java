abstract class Animal {

    String name;

    public String getName() {
        return this.name;
    }

    public abstract void walk();
}


class Cat extends Animal {
    public void walk() {
        //
    }
}
