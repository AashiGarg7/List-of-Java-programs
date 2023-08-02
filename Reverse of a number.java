import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int rev=0,x=0;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while(num>0){
            rev = rev*10 + num%10;
            num=num/10;
        }
        System.out.print("Reverse of the no. is: "  + rev); 

    }
};
