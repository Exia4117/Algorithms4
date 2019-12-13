package chapter1.chapter1_5;

public class UF {
    private int[] id;   //分量id
    private int count;  //分量数量

    public UF(int N) {   //以整数标识（0到N-1)初始化N个触点
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {     //在p和q之间添加一条连接
    //TODO
    }

    public int find(int p) {     //p（0到N-1)所在分量的标识符
    //TODO
    }

    public boolean connected(int p, int q) {      //如果p和q存在于同一个分量中则返回true
        return find(p) == find(q);
    }

    public int count() {     //连通分量的数量
        return count;
    }
}
