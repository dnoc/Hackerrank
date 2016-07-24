import java.io.*;
import java.util.*;

public class Solution {
     
    private static Boolean isPresent(int arrivalTime) { return arrivalTime <= 0; }
    
    public static void main(String[] args) {
        int cutoff;
        int presentCount;
        int numberOfCases;
        int numberOfStudents;
        
        Scanner sc = new Scanner(System.in);
        numberOfCases = sc.nextInt();        
             
        for (int i = 0; i < numberOfCases; i++) {
            presentCount = 0;
            numberOfStudents = sc.nextInt();    
            cutoff = sc.nextInt();
            
            for (int j = 0; j < numberOfStudents; j++) {
                if (isPresent(sc.nextInt())) { presentCount++; }
            }
            
            if (presentCount < cutoff) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}