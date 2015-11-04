/**
 * Created by Ling on 2015-11-04.
 */
public class HeapQuiz {
    int id = 0;
    public static void main (String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
//        System.out.println("hq0's id is: " + hq[0].id);
        System.out.println("hq1's id is: " + hq[1].id);
//        System.out.println("hq2's id is: " + hq[2].id);
        System.out.println("hq3's id is: " + hq[3].id);
        System.out.println("hq4's id is: " + hq[4].id);
    }
}
