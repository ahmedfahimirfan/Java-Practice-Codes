import java.util.Scanner;
public class StringCypher {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Message: ");
        String str = sc.nextLine();
        System.out.print("Enter the Key: ");
        int key = sc.nextInt();
        System.out.print("Encrypt? Write 'E'\nDecrypt? Write 'D'\n");
        String str_input = sc.next();
        if(str_input.equals("E"))
        {
            for (int i = 0; i <= str.length() - 1; i++)                 //checks individual String and shifts them according to the key.
            {
                int encrypt_ascii = (int) str.charAt(i) + key;
                char encrypt_char = (char) encrypt_ascii;
                System.out.print(encrypt_char);
            }
            System.out.println();
        }
        else if (str_input.equals("D"))
        {
            for (int i = 0; i <= str.length() - 1; i++)                 //checks individual String and shifts
            {
                int encrypt_ascii = (int) str.charAt(i) - key;
                char encrypt_char = (char) encrypt_ascii;
                System.out.print(encrypt_char);
            }
            System.out.println();
        }
    }
}