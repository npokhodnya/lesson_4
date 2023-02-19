import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        var a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(reverso(a));
    }

    public static LinkedList<Integer> reverso(LinkedList<Integer> orig) {
        int size = orig.size();
        var res = new LinkedList<Integer>();
        for (int i = 1; i <= size; i++) {
            var tmp = orig.get(size - i);
            res.add(tmp);
        }
        return res;
    }
}