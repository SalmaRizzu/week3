public class bINDING 
{
    public void display()
    {
        System.out.println("Dynamic binding");
    }
    public static void print()
    {
        System.out.println("Static binding");
    }
    public static void main(String args[])
    {
        bINDING b=new bINDING();
        b.display();
        print();
    }
    
