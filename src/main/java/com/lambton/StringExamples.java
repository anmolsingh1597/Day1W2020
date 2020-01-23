package com.lambton;


import java.util.Scanner;
import java.lang.String;
public class StringExamples {
    public static void main(String[] args) {
        char c = 'A' + 5;
        String c1 = "A";
        int ch = c;
        System.out.println(c);
        String y = "Hello";
        String z = new String("Hello ");
        z = z.concat("World");

        System.out.println("Y=" + y);

        System.out.println("Z= " + z);

        //Attempt 2 starts here!!

        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello";
        String s4 = s1;
        String s5 = new String(s2);
        String s6 = new String();
        s6 = "World";
        String s7 = new String("Hello");
        System.out.println("s1 =" + s1);
        System.out.println("s2 =" + s2);
        System.out.println("s3 =" + s3);
        System.out.println("s4 =" + s4);
        System.out.println("s5 =" + s5);
        System.out.println("s6 =" + s6);
        System.out.println("s7 =" + s7);
        if (s1 == s3) {
            System.out.println("s1(" + s1 + ") = s3(" + s3 + ")");
        } else {
            System.out.println("s1(" + s1 + ") <> s3(" + s3 + ")");
        }
        if (s1.equals(s3)) {
            System.out.println("s1(" + s1 + ") = s3(" + s3 + ")");
        } else {
            System.out.println("s1(" + s1 + ") <> s3(" + s3 + ")");
        }
        if (s2 == s7) {
            System.out.println("s2(" + s2 + ") = s7(" + s7 + ")");
        } else {
            System.out.println("s2(" + s2 + ") <> s7(" + s7 + ")");
        }
        if (s1.equals(s7)) {
            System.out.println("s1(" + s1 + ") = s7(" + s7 + ")");
        } else {
            System.out.println("s1(" + s1 + ") NOT equals s7(" + s7 + ")");
        }
        if (s2.equals(s6)) {
            System.out.println("s2(" + s2 + ") equals s6(" + s6 + ")");
        } else {
            System.out.println("s2" + s2 + ") NOT equals s6(" + s6 + ")");
        }
        s1 = s1.replace("Hello", "World");
        System.out.println(s1);
        s1 = s1.toLowerCase();
        System.out.println(s1);
       /* s1=s7.intern();
        System.out.println(s1);*/
        int a = 100;
        int b = 200;
        int d = a + b;
        String str = String.format("%d + %d = %d", a, b, d);
        System.out.println(str);
        str = String.join("  ", "Welcome", "to", "Lambton", "Toronto", "Ca");
        System.out.println(str);
//        method();
//        function();
        printStrings();
//        alphaMain();
    }

    private static void alphaMain() {
        int alphabet;
        String c = new String("Welcome To Toronto");
        System.out.println(c);
        int n = c.length();
        System.out.println(n);
        for (int i = 0; i <= 6; i++) {


            for (int j = i ; j <= i; j++) {

                alphabet = c.charAt(j);
                System.out.print((char) alphabet);

            }

            System.out.println();
        }


    }

    private static void printStrings() {
         int i,j,count=0,icnt=0;
        String s="Welcome to Toronto";
        char[] ch= s.toCharArray();
        int length= ch.length;
       // int n= s.length();
        for( i=0;i<length;i++)
        {
            if(i==0)
                System.out.println(ch[0]);
            else
            {
                if(count+1>=length)
                {break;}
                else
                {
                    for(j=count+1;j<i+count+2;j++)
                    {
                        icnt++;
                        if(j>=length)
                            break;
                        else
                            System.out.print(ch[j]);
                    }
                    count=count+icnt;
                    icnt=0;
                }
                System.out.println();
            }
        }
    }



    public static void method() {
        String s = new String("Welcome to Toronto");
        char[] c = s.toCharArray();
        int q = s.length();
        System.out.println(q);
        int count = 0, temp = 0;

        for (int i = 0; i < q; i++) {
            if (i == 0)
                System.out.println(c[0]);
            else if (count + 1 >= q) {
                break;
            } else {
                for (int j = count + 1; j < i +2+ count; j++) {
                    temp++;
                    if (j >= q)
                        break;
                    else
                        System.out.println(c[j]);
                }
                count = count + temp;
                temp = 0;

            }
            System.out.println(" ");
        }
    }


/*public static void function(){
 String c=new String("Welcome To Toronto");
 System.out.println(c);
 int q=c.length();
 System.out.println(q);
 int count=0;

 char g=c.charAt(5);
    System.out.println(g);
 for(int i=0;i<=q;i++){
     for(int j=0;j<=i;){
         if (j<=q) {
             char g = c.charAt(j);
             System.out.println(g);
//         count=count+1;
            j= j++;
         }
         else break;
     }
 System.out.println();
}*/
//          for (int j=i; j>=0; j--) {
//              System.out.print(s.charAt(j));
//              System.out.println(c[j]);
//              count = count++;
//              j = j++;
//
//
//              System.out.println("");


          }



