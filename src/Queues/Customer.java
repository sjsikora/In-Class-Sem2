package Queues;

public class Customer {
    private int order;
    private String name;

    public Customer(int order, String name) {
        this.order = order;
        this.name = name;
    }

    public int getOrder() {return this.order;}
    public void setOrder(int order) {this.order = order;}
    public String getName() {return this.name; }
    public void setName(String name) {this.name = name;}
    public String toString() {return "Order: " + this.order + ", Name: " + this.name;}

    
}
