import java.util.*;

public class A_WeeklyRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N*7];
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < N*7; i++) {
            A[i] = scanner.nextInt();
            ans += A[i];
            cnt ++;
            if (cnt == 7) {
                System.out.println(ans);
                cnt = 0;
                ans = 0;
            }
        }
        scanner.close();
    }
}

