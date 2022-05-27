package Lesson2.LinkedList;

import java.util.LinkedList;

public class MyLinkedList<T> {

    private MyNode<T> lastNode = null;
    private MyNode<T> firstNode = null;

    private int size = 0;


    public void add(T elem) {
        MyNode<T> last = lastNode;
        MyNode<T> node = new MyNode<>(lastNode, null, elem);
        if (last == null) {
            firstNode = node;
            lastNode = firstNode;
        } else {
            last.afterNode = node;
            lastNode = node;
        }
        size++;
    }

    public T remove(T elem) {
        T returnElem = null;
        if (size > 0) {
            MyNode<T> node = firstNode;
            do {
                if (node.element.equals(elem)) {
                    MyNode<T> before = node.beforeNode;
                    MyNode<T> after = node.afterNode;
                    if (before != null) {
                        before.afterNode = after;
                    } else {
                        firstNode = after;
                    }
                    if (after != null) {
                        after.beforeNode = before;
                    }
                    size--;
                    returnElem = node.element;
                    break;
                }
                node = node.afterNode;
            }
            while (node != null);
        }
        return returnElem;
    }

    public T getFirst() {
        return firstNode.element;
    }
    public T getLast() {
        return lastNode.element;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        MyNode<T> node = firstNode;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(node.element.toString()).append(" ");
            node = node.afterNode;
        }
        return stringBuilder.toString();
    }
    public void toString1() {
        StringBuilder stringBuilder = new StringBuilder();
        MyNode<T> node = firstNode;
        for (int i = 0; i < size; i++) {
            System.err.println("#" + i + node.beforeNode + " | " + node.element + " | " + node.afterNode);
            node = node.afterNode;
        }
    }


    class MyNode<T> {
        protected MyNode<T> beforeNode;
        protected MyNode<T> afterNode;
        protected T element;

        public MyNode(MyNode<T> beforeNode, MyNode<T> afterNode, T element) {
            this.beforeNode = beforeNode;
            this.afterNode = afterNode;
            this.element = element;
        }
    }
}
