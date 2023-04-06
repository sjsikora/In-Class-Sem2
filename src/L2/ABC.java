package L2;

public class ABC {
    public static void main(String[] args) {

        // Here, when we declare C, Java goes to the first class in the hierarchy A and run its constructor, then it goes
        // to the subclass B, then finally C. So, the output is A, B, C.

        C c = new C();
        System.out.println(c);

    }
}

class A {

    public A() {
        // Java implictly adds a super() to the constructor. If you added it yourself, then it also works.
        // This also means that if there was only a constructor with arugments, then java will error out.
        System.out.println("A");
    }
}

class B extends A {

    public B() {
        System.out.println("B");
    }

}
// The final keywords means that the class can not be extended anymore
final class C extends B {

    public C() {
        System.out.println("C");
    }
}