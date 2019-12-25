
package array;

import java.util.Scanner;

public class Array {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []array={10,20,30,40};
        int sum=0;
        for(int num:array){
            sum=sum+num;
        }
        System.out.println("SUM OF AN ARRAY IS:"+sum);
    }
    
}
