import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. you want to search: ");
        int num = sc.nextInt();
        int code=0,ind=0;
        int arr1 [] = {1,3,5,2,7,9,56,4,89,67};
        for(int i=0; i< arr1.length; i++){
            if(arr1[i] == num){
                code=1;
                ind=i;
            }
            else{
                continue;
            }
        }
        if(code == 1){
        System.out.println("Found! At index: "+ind);}
        else{
            System.out.println(-1);
        } 
	}
}
