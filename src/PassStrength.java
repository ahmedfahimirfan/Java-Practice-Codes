import java.util.Scanner;
public class PassStrength {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your Password: ");
        String str = sc.nextLine();
        int uppercase=0, lowercase=0, digits=0, specialchar=0;

        if(str.length()>=8)             //Checks if the pass is greater or eql to 8 characters
        {
            for(int i=0;i<=str.length()-1;i++)      //Enters Loop to check individual Character
            {
                char charac = str.charAt(i);
                if(charac>='A' && charac<='Z')
                {
                    uppercase++;
                }
                else if (charac>='a' && charac<='z')
                {
                    lowercase++;
                }
                else if (charac>='0' && charac<='9')
                {
                    digits++;
                }
                else
                {
                    specialchar++;
                }
            }
            if(uppercase>0 && lowercase>0 && digits>0 && specialchar>0)     //If every counter is greater than 0 then pass is Strong
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");        //Or else weak
            }
        }
        else
        {
            System.out.println("False");            //Weak cause pass length is not met
        }
    }
}