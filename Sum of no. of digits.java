import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x=0;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while(num>0){
            x += num%10;
            num=num/10;
        }
        System.out.print("The sum of digits is: " + x);

    }
};
