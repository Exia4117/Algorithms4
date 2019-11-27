package chapter1.chapter1_3;

public class ex14 {
    private String[] a = new String[1];
    private int N = 0;

    private void resize(int max) {
        String[] tmp = new String[max];
        for (int i = 0; i < N; i++) {
            tmp[i] = a[i];
        }
        a = tmp;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(String s) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = s;
    }

    public String dequeue() {
        String tmp = a[0];
        for (int i = 0; i < N; i++) {
            a[i] = a[i + 1];
        }
        N--;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return tmp;
    }
}
