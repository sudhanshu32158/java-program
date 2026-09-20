class BinaryCode
{ public static void main(String args[])
    {  
        System.out.println("MIN value of int: " + Integer.MIN_VALUE);
        System.out.println("MAX value of int: " + Integer.MAX_VALUE);
        System.out.println("int.BYTES: " + Integer.BYTES);
        int x=5;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toOctalString(x));
        //#charecter:it has been made around char data type,it will have all methods and attributes for char data type varible
        //#command to see the charecter class:javap java.lang charecter
        //#unicodes: universal codes to represnt charecters
        //#converting:String Number into Int we use parseInt() method of Integer class
        //#Function:parseInt(String s)
        //function: universal accessible by object of every class
        //method:accessible by object of  specific class
        // compare two no we use compare()method of int //result of compare :=+ve:n1>n2, -ve:n1<n2, result: 0:n1=n2
        // int n1,n2:Integer.compare(n1,n2);
        //Syntex:Integer.compare(n1,n2);



    }
}