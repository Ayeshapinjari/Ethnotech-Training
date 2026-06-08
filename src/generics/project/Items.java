package generics.project;

public class Items <T,U,V>{ // multiple generics
    T name;
    U d;
    V b;

    public Items(T name, U d, V b) {
        this.name = name;
        this.d = d;
        this.b = b;
    }

    public T getName() {
        return name;
    }

    public U getD() {
        return d;
    }

    public V getB() {
        return b;
    }
}
