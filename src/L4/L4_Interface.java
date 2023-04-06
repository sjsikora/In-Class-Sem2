package L4;

public class L4_Interface {
    public interface Edible {
        public abstract String howToEat();
    }


    public class Orange implements Edible {
        public String howToEat() {
            return "Orange: Make orange juice";
        }
    }

    public class Chicken implements Edible {
        public String howToEat() {
            return "Chicken: Fry it";
        }
    }
}
