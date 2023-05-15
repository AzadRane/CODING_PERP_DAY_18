class A 
{
    int i;

    A()
    {
        i=0;
    }

    A(int x)
    {
        i=x;
    }


    void display()
    {
        System.out.println("I am A's constructor");
        System.out.println(i);
    }



}


class B extends  A
{
    int g;

    B()
    {   super() ;    //writing super() in default constructor is optional 
        g=1;

    }

    B(int x,int y)
    {
        super(x);
        g=y;
    }

    void display()
    {
        super.display();

        System.out.println("I am in B's Constructor");
        System.out.println(g);
    }

} 






public class SuperDemo
{
    public static void main(String args[])
    {
        A aob = new A(5);
        aob.display();
        A aob1 = new A();
        aob1.display();
        B bob = new B();
        bob.display();
        B bob1 = new B(20, 30);
        bob1.display();
    }
}