package cycle2;
import java.io.*;
import java.util.*;

public class Palindrome{
    public static void main(String[] args)
    {
        String rev="",str;
        char r;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        str=sc.nextLine();
        for(i=str.length()-1;i>=0;i--)
        {
            r=str.charAt(i);
            rev=rev+r;
        }
        if(str.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}