package MyOwnLinkedList;

import java.util.Iterator;


public class MyLinkedList<E> {

    private Node<E> head = null, tail = null;
    private int size = 0;

    MyLinkedList() {}

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E element) {
        Node<E> node = new Node<E>(element);

        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public void addLast(E element) {
        Node<E> node = new Node<E>(element);

        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void add(int index, E element) {
        Node<E> node = new Node<E>(element);

        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        else if(index == 0) addFirst(element);
        else if(index == size) addLast(element);


        Node<E> previousNode = head;
        for(int i = 0; i< (index -1); i++) {
            previousNode = previousNode.next;
        }

        node.next = previousNode.next;
        previousNode.next = node;

        size++;
    }


    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E> {

        Node<E> curr = head;

        public boolean hasNext() {
            return curr != null;
        }
        public E next() {
            E element = curr.element;
            curr = curr.next;
            return element;
        }
    } 

    private class Node<Er> {
        Er element;
        Node<Er> next;

        Node(Er element) { element = this.element; }
    }
}