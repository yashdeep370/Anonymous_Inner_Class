public class anonymous {
    public static void main(String[] args) {
        outer o = new outer();
        o.display();
    }
}

abstract class My
{
    abstract public void show();
}

class outer
{
    public void display()
    {
        My m = new My()
        {
            public void show()
            {
                System.out.println("hello");
            }
        };
        m.show();
    }
}
