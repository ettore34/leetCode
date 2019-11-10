

public class strManipExample
{
    public static void main(String[] args )
    {
        String a = " hello im a string to manipulate";

        System.out.println(reverse(a));

    } 







    //O(n) time-complexity O(n) Space
    public static String reverse( String mystring)
    {

        StringBuilder answer = new StringBuilder();
        int len = mystring.length() - 1;

        for(int i = len ; i > -1 ; i--)
        {
            answer.append(mystring.charAt(i));
        }
        
        return(answer.toString());
    }


    //O(n) time-complexity O(n) Space
    public static String replaceSpace(String mystring)
    {
        StringBuilder answer = new StringBuilder();
        int len = mystring.length();
        for(int i = 0 ; i < len ; i++)
        {
            if(mystring.charAt(i) != ' ')
                answer.append(mystring.charAt(i));
            else
                answer.append("_");

        }

        return answer.toString();
    }


}