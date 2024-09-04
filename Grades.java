import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        System.out.println("enter your percentage");
        Scanner scn = new Scanner(System.in);
        int Percentage = scn.nextInt();
        if(Percentage >= 90){
            System.out.println("Grade A");
        }
        else if (Percentage>=80){
            System.out.println("Grade B");
        }
        else if (Percentage>=70 ){
            System.out.println("Grade C");
        } 
        else if(Percentage>=60){
            System.out.println("Grade D");
        }
        else if(Percentage>= 40){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
        }
        
    }

