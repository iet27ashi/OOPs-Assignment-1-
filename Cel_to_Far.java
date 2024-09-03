
import java.util.Scanner;
class Cel_to_Far{
    public static void main(String args[]){

    
    Scanner scn = new Scanner(System.in);
    System.out.println("enter the temp:");
    int Temp = scn.nextInt();
    Converter T = new Converter(); 
   float result = T.conv(Temp);
   System.out.println("now temp is in deg celcius:"+ result);


}}
 class Converter{
    float T_at_Cel;
    float Temp;
    public float conv(float Temp){
        return (Temp - 32)*5/9;
 }
    }
