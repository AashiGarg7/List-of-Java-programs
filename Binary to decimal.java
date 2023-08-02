import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int ans=0,y=1,x;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while(num>0){
            x = num%10;
            ans += x*y;
            num=num/10;
            y *= 2;
        }
        System.out.print("The decimal number is: " +ans);
    }
};
