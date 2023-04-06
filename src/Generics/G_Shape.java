package Generics;


public class G_Shape<E> {

    public static void main(String[] args) {
        G_Shape<String> shape1 = new G_Shape<String>("Circle");
        G_Shape<Integer> shape2 = new G_Shape<Integer>(1);

        System.out.println(shape1.getId());
        System.out.println(shape2.getId());
    }

    // The type of the id is E, which is a generic type. It can be any type.
    // The type of the id is decided when the object is created.


    E id;

    public G_Shape(E id) {
        this.id = id;
    }

    public E getId() {
        return id;
    }
    
}
