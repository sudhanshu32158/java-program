import java.util.Scanner;
class Result{
    public static void main(String args[])
    
{
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name");
        String name =sc.nextLine();

        System.out.println("enter roll number");
        String rollno=sc.nextLine();
        System.out.println("enter marks of english");
        String m1=sc.nextLine();

System.out.println("enter marks of java");
String m2=sc.nextLine();

System.out.println("marks of DSA");
String m3=sc.nextLine();

int English= Integer.parseInt(m1);
int java=Integer.parseInt(m2);
int DSA= Integer.parseInt(m3);
System.out.println("English+java+DSA");
System.out.println((English+java+DSA)/3);

int comparison =Integer.compare(English,java);
System.out.println(comparison);

}
}

