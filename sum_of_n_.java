import java.util.Scanner;
public class sum_of_n_ {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
            int sum = 0;
              for(int i = 1; i<=n; i++){
                  sum = sum +i;
            
              }
              System.out.println("sum=" + sum);

        }
    }

