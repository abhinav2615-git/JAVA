@FunctionalInterface
interface Abc
{
    void f1();

    default void f2(){
        System.out.println("I am default method");
    }
    static void f3(){
        System.out.println("I am statc method");
    }
}

class Bcd implements Abc{
    @Override
    public void f1(){
        System.err.println("Hello f1");
    }
}

public class AbxTest{
    public static void main (String[]args){
        Bcd b = new Bcd();
        
    } 
}
abstract class Abc{
    abstract void f1();
}

public class AbxTest{
    public static void main (String[]args){
        Bcd b = new Bcd();
        b.f1();
    } 
}