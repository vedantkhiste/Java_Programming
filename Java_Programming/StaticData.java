class Demo
{
    public int i;
    static public int j = 21;

    public Demo()
    {
        this.i = 11;
    }
}
class staticData
{
    public static void main(String[])
    {
        System.out.println(Demo.java);
        Demo dobj = new Demo();
        System.out.println(dobj.i);
    }
}