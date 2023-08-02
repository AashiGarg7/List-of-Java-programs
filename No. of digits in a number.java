import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int NumOfDigits=0;
        while(num>0){
            num=num/10;
            NumOfDigits++;
        }
        System.out.println("Number of digits are: "+NumOfDigits);

    }
};
