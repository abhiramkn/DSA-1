import java.util.*;
// Compress String and ount ex aaabbc - a3b2c1
public class codedsa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(s.charAt(i));
                if (count > 1) {
                    System.out.print(count);
                }
                count = 1;
            }
        }
    }
}
