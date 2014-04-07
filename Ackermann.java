import static java.lang.System.out;
import java.util.Scanner;

public class Ackermann {

    public static void main(String[] args) {
        int first,second,choice;
        Scanner sc = new Scanner(System.in);
        do{
        out.print("Press 1 to use Ackermann's function or press 2 to escape:\n");
        choice = sc.nextInt();
        if(choice != 2){
        out.print("Please type in the numbers you would like to examine:\n");
        out.print("First number: ");
        first = sc.nextInt();
        out.print("\nSecond number: ");
        second = sc.nextInt();
        out.print("\nThe result using Ackermann's function is : " + Ackermann(first,second) + "\n");
        }
        }while(choice != 2);
    }
    
    public static int Ackermann(int m,int n){   
        if(m == 0){
            return n+1; 
        }
        else if( n == 0){
            return Ackermann(m-1,1);
        }
        else{           
            return Ackermann(m-1,Ackermann(m,n-1));
        }  
    }
    
}
