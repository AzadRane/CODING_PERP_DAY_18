class A 
{
    static String s = "HELLO HARISH";

    static void display()
    {
        System.out.println(s);
    }
}

class B extends A
{
//    super.display();     if i write this i get error i dont know why
}

public class SubclassInheritStaticMethod{
    
    public static void main(String args[])
    {
       B.display();
    }
}
