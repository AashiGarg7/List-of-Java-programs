import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int fact=1;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            fact *= i; 
        }
        System.out.print("The factorial of the number is: "+fact);
    }
};
