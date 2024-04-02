import java.util.Scanner;  
import java.lang.Math;  
public class ArmstrongNumber
{  
    // function to check if the number is an Armstrong or not  
    static boolean isArmstrong(int num)   
    {   
        int temp, digits=0, last=0, sum=0;   
        temp = num; 
        for(; temp > 0; temp = temp/10)
        {
            digits++;
        }
        temp = num;   
        for(; temp > 0; temp = temp/10) 
        {   
            last = temp % 10;   
            sum +=  (Math.pow(last, digits));   
        }  
        if(num == sum)   
            return true;      
        else 
            return false;
    }   
    //driver code      
        public static void main(String args[])     
    {     
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        n = sc.nextInt();  
        if ( isArmstrong(n) ) 
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }   
}