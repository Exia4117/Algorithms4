package chapter1.chapter1_3;

public class LinkList {
    private Node first;

    public LinkList(String obj) {
        first = new Node();
        this.first.item = obj;
        this.first.next = null;
    }

    private class Node {
        String item;
        Node next;
    }

    public void add(String obj) {
        Node oldFirst = first;
        first = new Node();
        first.item = obj;
        first.next = oldFirst;
    }

    //@1.3.19

    public void deleteTail() {
        if (first == null) return;
        if (first.next == null) {
            first = first.next;
            return;
        }
        Node p = first;
        Node q = first;
        while (p.next != null) {
            q = p;
            p = p.next;
        }
        q.next = null;
    }

    //@1.3.20
    public void delete(int k) {
        if (first == null || k <= 0) return;
        if (k == 1) {
            first = first.next;
            return;
        }

        Node p = first;
        while (k > 2 && p != null) {
            p = p.next;
            k--;
        }

        if (k != 2 || p == null || p.next == null) {
            throw new RuntimeException("The size less than k");
        }else {
            p.next = p.next.next;
        }


    }

    //@1.3.21
    public boolean find(String key){
        Node p = first;
        while(p != null){
            if(p.item.equals(key)){
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public void printAll() {
        Node p = first;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        LinkList test = new LinkList("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.printAll();
        test.deleteTail();
        test.add("5");
        test.add("88");
        test.add("101");
        test.add("12345");
        test.deleteTail();
        test.printAll();
        test.delete(5);
        test.printAll();
        test.delete(2);
        test.printAll();
        test.delete(1);
        test.printAll();
        System.out.println(test.find("123"));
        System.out.println(test.find("11"));
        System.out.println(test.find("88"));

    }
}
