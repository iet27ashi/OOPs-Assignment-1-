import java.util.Scanner;
public class chk_pos_Neg{  
public static void main(String[] args)   
{  

Scanner scn = new Scanner(System.in);
System.out.println("enter the num to be cheked :") ;
int num = scn.nextInt();

if(num>0)  
{  
System.out.println("The number is positive.");  
}  

else if(num<0)  
{  
System.out.println("The number is negative.");  
}  
//executes when the above two conditions return false  
else  
{  
System.out.println("The number is zero which is neither positive nor negative");  
}  
}  
}  