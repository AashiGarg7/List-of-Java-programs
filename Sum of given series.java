import java.util.Scanner;
class Main
{
	public static void main(String[] args) {//series: 1-2+3-4+5-6...
		Scanner sc = new Scanner(System.in);
        int ans=0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                ans -= i;
            }
            else{
                ans += i;
            }
        }
        System.out.print(ans);
    }
};
