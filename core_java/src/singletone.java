public class singletone
{
    private static singletone obj = new singletone();
    public String string;

    private singletone()
    {
        string = "Singletone program";
    }

    //Declaring static method
    public static singletone getInstance()
    {
        return obj;
    }

    public static void main(String args[])
    {
        singletone text = singletone.getInstance();
        //original string
        System.out.println("Original String:");
        System.out.println(text.string);

        //text in upper case
        System.out.println("String in Upper Case:");
        text.string = (text.string).toUpperCase();
        System.out.println(text.string);
    }
}

