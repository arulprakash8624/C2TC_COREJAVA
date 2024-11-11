package com.tns.ifet.daythree;
import java.util.Scanner;

class father{
    int a,b;
}
class son extends father
{
    int c;
    void in()
    {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);
    }
}
class daughter extends father
{
    int c;
    void out()
    {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);
    }
}
public class _03_inheritance_herichical {
    public static void main(String args[])
    {
        son ob1=new son();
        daughter ob2=new daughter();
        ob1.in();
        ob2.out();
    }
}
