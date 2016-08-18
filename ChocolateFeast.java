import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int k = 0; k < i; k++) {
            int dollars = sc.nextInt();
            int cost = sc.nextInt();
            int wrapperCost = sc.nextInt();
            
            System.out.println(buyChocolate(dollars, cost, wrapperCost));
        }
    }
    
    public static int buyChocolate(int dollars, int cost, int wrapperCost) {
        int countChocolate = 0;
        int wrappers = 0;
        while (dollars >= cost) {
            dollars -= cost;
            countChocolate++;
            wrappers++;
        }
        
        while (wrappers >= wrapperCost) {
            wrappers -= wrapperCost;
            countChocolate++;
            wrappers++;
        }
        return countChocolate;
    }
}