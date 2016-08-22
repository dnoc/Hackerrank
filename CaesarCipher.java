import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String input = sc.nextLine();
        char[] cipher = input.toCharArray();
        int increment = sc.nextInt();
        for (int i = 0; i < cipher.length; i++) {
            if (Character.isLetter(cipher[i])) {
                if (cipher[i] == 'z') {
                    cipher[i] = (char) ('a' + (increment - 1));
                } else if (cipher[i] == 'Z') {
                    cipher[i] = (char) ('A' + (increment));
                } else {
                    cipher[i] = (char) (cipher[i] + increment);
                }
            }
        }
        System.out.println(cipher);
    }
}