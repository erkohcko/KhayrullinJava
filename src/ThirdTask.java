import java.util.Scanner;

public class ThirdTask {
    public void findAllTheDigits() {
        Scanner scan = new Scanner(System.in);
        int e = scan.nextInt();
        int[] q = new int[e];
        for (int i = 0; i < e; i++) {
            q[i] = scan.nextInt();
        }
        for (int i = 0; i < q.length; i++) {
            if (q[i] % 3 == 0) {
                System.out.println(q[i]);
            }
        }
    }
}
