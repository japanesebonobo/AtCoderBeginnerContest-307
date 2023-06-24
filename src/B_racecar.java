import java.util.*;

public class B_racecar  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S[] = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.next();
        }
        scanner.close();

        String ans = "No";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                String input = S[i] + S[j];
                String reverse = new StringBuilder(input).reverse().toString();
                // 入力文字列と逆順文字列を比較する
                if (input.equals(reverse)) {
                    ans = "Yes";
                    System.out.println(ans);
                    System.exit(0);
                }
            }
        }
        System.out.println(ans);
    }
}

