import java.util.function.*;

class Testerr{ 
    public String hello(int a) {
        return "Value="+ a;
    }
    Function<Integer,String> hello2 =(i)->"Value="+i;
    Function<Integer,String> hello3 =(i)-> {
         i=i+100;
         return "Value="+ i;
    };
    public static void main(String[] args) {
        Testerr t = new Testerr();
        System.out.println(t.hello(25));
    }
}