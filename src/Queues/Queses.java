package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queses {
    public static void main(String[] args) {

        //The Queue is an interface, so we cant create an object of it.
        Queue<Customer> queue = new LinkedList<Customer>();
        queue.offer(new Customer(1, "Lily"));
        queue.offer(new Customer(2, "John"));
        queue.offer(new Customer(3, "Jack"));


    }
}