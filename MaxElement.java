

import java.util.*;

public class MaxElement{  
    static void sort(int[] a, int n){  
        int tmp = 0;  
        for(int i = 0; i < n; i++){  
            for(int j = 1; j < n - i; j++){  
                if(a[j - 1] > a[j]){  
                    tmp = a[j-1];  
                    a[j - 1] = a[j];  
                    a[j] = tmp;  
                }  
            }  
        }  
    }  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int a[] = new int[n+1];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        sort(a, n);
        System.out.println("Maximum element : " + a[n-1]);
    }
    
}
