import java.util.Scanner;
public class SentenceReverser {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String temp = "";
        String ans = "";

        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)!=' ')
            {
                temp+=str.charAt(i);
            }
            else
            {
                ans =  temp + " " + ans;
                temp="";
            }
        }
        ans = temp + " " + ans;
        System.out.print(ans);
    }
}
