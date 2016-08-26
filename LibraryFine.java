import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int dayDue = sc.nextInt();
        int monthDue = sc.nextInt();
        int yearDue = sc.nextInt();
        int fine = 0;
        
        if (year > yearDue) {
            fine = 10000;
        } else if (year == yearDue && month > monthDue) {
            fine = (month - monthDue) * 500;
        } else if (year == yearDue && month == monthDue && day > dayDue) {
            fine = (day - dayDue) * 15;
        }
        System.out.println(fine);
    }
}