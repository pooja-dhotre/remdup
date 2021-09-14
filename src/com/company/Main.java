package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        int i,j;
        StringBuffer str=new StringBuffer();
        Scanner in;


        str.append(in.nextLine());

        for (i=0;i<str.length();++i)
        {
            for (j=0;j<str.length()-1;j++)
            {
                if (str.charAt(i)==str.charAt(j))
                    str.deleteCharAt(j);
            }
        }
        System.out.println("Removed String: " + str);

    }
}







