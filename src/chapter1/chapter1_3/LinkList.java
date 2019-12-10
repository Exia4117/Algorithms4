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
        } else {
            p.next = p.next.next;
        }


    }

    //@1.3.21
    public boolean find(String key) {
        Node p = first;
        while (p != null) {
            if (p.item.equals(key)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    //@1.3.24
    public void removeAfter(Node node) {
        if (node.next == null || node == null) {
            return;
        }
        node.next = node.next.next;
    }

    //@1.3.25
    public void insertAfter(Node node, Node insert) {
        if (node == null || insert == null) {
            return;
        }
        insert.next = node.next;
        node.next = insert;
    }

    //@1.3.26
    public void remove(String key) {
        if (first == null) {
            return;
        }
        if (first.item.equals(key)) {
            first = first.next;
        }
        Node p = first;
        while (p.next != null) {
            if (p.next.item.equals(key)) {
                p.next = p.next.next;
                continue;
            }
            p = p.next;
        }
    }

    //@1.3.27
    public int max(Node head) {
        int max = Integer.MIN_VALUE;
        if (head == null) {
            return 0;
        }
        Node p = head;
        while (p != null) {
            if(max < Integer.parseInt(p.item)){
                max = Integer.parseInt(p.item);
            }
            p = p.next;
        }

        return max;
    }

    //@1.3.30
    public Node Reverse(Node head){
        Node next = head;
        Node pre = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public Node ReverseRecursive(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        Node second = head.next;
        Node rest = ReverseRecursive(second);
        second.next = head;
        head.next = null;
        return rest;
    }

    public void printAll() {
        Node p = first;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println(" ");
    }

    public Node findNodebyK(int k) {
        if (k == 1) {
            return this.first;
        }
        if (k < 1) {
            throw new RuntimeException("illegal k");
        }
        Node p = first;
        while (p != null && k > 1) {
            p = p.next;
            k--;
        }
        if (k != 1 || p == null) {
            throw new RuntimeException("k is more than length of linkedlist");
        } else {
            return p;
        }

    }

    public static void main(String[] args) {
        LinkList test = new LinkList("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.printAll();
        test.deleteTail();
        test.add("5");
        test.add("6");
        test.add("7");
        test.add("8");
        test.deleteTail();
        test.printAll();
        test.delete(5);
        test.printAll();
        test.delete(2);
        test.printAll();
        test.delete(1);
        test.printAll();
        test.add("9");
        test.add("10");
        test.add("11");
        test.add("12");
        test.add("13");

        test.printAll();
        System.out.println(test.findNodebyK(4).item);
        System.out.println(test.find("8"));
        System.out.println(test.find("11"));
        System.out.println(test.find("7"));
        test.removeAfter(test.findNodebyK(7));
        test.printAll();

        test.insertAfter(test.findNodebyK(3), new LinkList("14").first);
        test.printAll();

        for (int i = 0; i < 5; i++) {
            test.add("233");
            test.add(Integer.toString(i));
        }
        test.printAll();

        test.remove("233");
        test.printAll();
        System.out.println(test.max(test.first));
        System.out.println(test.max((test.findNodebyK(11))));
        test.first = test.Reverse(test.first);
        test.printAll();
        test.first = test.ReverseRecursive(test.first);
        test.printAll();

    }
}
