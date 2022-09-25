import java.util.Scanner;
public class Input
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Username: ");

        String username = obj.nextLine();
        System.out.println("Username is = " +username);
    }
}