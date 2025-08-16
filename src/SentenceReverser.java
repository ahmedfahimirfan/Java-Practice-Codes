import java.util.Scanner;
public class SentenceReverser {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String temp = "";
        String ans = "";

        for(int i=0;i<=str.length()-1;i++)     //checks individual String
        {
            if(str.charAt(i)!=' ')             //checks till a ' ' and then saves that those String in temp
            {
                temp+=str.charAt(i);
            }
            else
            {
                ans =  temp + " " + ans;       //if Space is found then saves it on ans with a ' ' at the Front
                temp="";                       //Resets temp
            }
        }
        ans = temp + " " + ans;                //the last word in input is saved in ans for the last time to avoid error
        System.out.print(ans);
    }
}
