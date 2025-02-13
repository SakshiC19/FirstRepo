import java.util.Scanner;

public class sumOfNaturalNum
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A Number :");
        int num=scanner.nextInt();
        System.out.println("Sum of Natural Number : ");
        System.out.println((num*(num+1)/2));
    }
}