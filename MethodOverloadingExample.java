class Demo 
{
    int i=50;

    void display()
    {
        System.out.println("I am display");
    }

    void display(int i)
    {
        System.out.println(i);
    }

    void display(String s)
    {
        System.out.println(s);
    }

    void display(int i,int j)
    {
        System.out.println("Sum :"+(i+j));
    }
}

public class MethodOverloadingExample {
    public static void main(String args[])
    {
        Demo ob = new Demo();
        ob.display();
        ob.display(500);
        ob.display("Hare Krishna");
        ob.display(10, 10);
    } 
}
