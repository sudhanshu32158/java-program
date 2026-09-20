//Scanner: is used to take input from user 
//it is written in java.untill.*;
//scanner has some functions L:
//1)nextInt() - to take integer input
//2)nextLine() - to take string input/multiple words sentence
//3)nextDouble() - to take double input
//4)nextFloat() - to take float input
//nextLong() - to take long input
//next():for one word string input

import java.util.*;
class MyScanner
{
    public static void main(String args[])
    {Scanner Obj = new Scanner(System.in);
        int number1,number2;
        number1=Obj.nextInt();
        number2=Obj.nextInt();
        System.out.println("First number is:"+number1);
        System.out.println("Second number is:"+number2);
    }
}
