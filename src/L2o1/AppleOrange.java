package L2o1;

public class AppleOrange {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[5]; 
        fruits[0] = new Fruit(); 
        fruits[1] = new Apple(); 
        fruits[2] = new Orange(); 
        fruits[3] = new GoldenDelicious(); 
        fruits[4] = new McIntosh(); 
        for(Fruit f1: fruits){ 
            f1.saySomething(); 
        }  
        Fruit[] apples = new Apple[3]; 
        apples[0] = new Apple(); 
        apples[1] = new GoldenDelicious(); 
        apples[2] = new McIntosh(); 
        for(Fruit f2: apples){ 
            ((Apple)(f2)).saySomething("Hello");
        } 

    }
}

class Fruit {
    public Fruit() {
    }

    public void saySomething() {
        System.out.println("I am a fruit");
    }
}

class Apple extends Fruit {
    public Apple() {
    }
    public void saySomething() {
        System.out.println("I am an apple");
    }
    public void saySomething(String s) {
        System.out.println("Apple says: " + s);
    }
}

class Orange extends Fruit{
    public Orange() {
    }
    public void saySomething() {
        System.out.println("I am an orange");
    }
}

class GoldenDelicious extends Apple {
    public GoldenDelicious() {
    }
    public void saySomething() {
        System.out.println("I am a Golden Delicious");
    }
}

class McIntosh extends Apple {
    public McIntosh() {
    }
    public void saySomething(String s) {
        System.out.println("McIntosh says: " + s);
    }
}