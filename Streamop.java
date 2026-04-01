import java.util.stream.Stream;
void main(){
    Stream<Integer> s1 = Stream.generate(()->(int)(Math.random()*100)).limit(10);
    Stream<Integer>s2=s1.map(x->x+5);
    Stream<Integer> s3=s2.sorted();
    Stream<Integer>s4=s3.filter(x->x%2==0);
    Stream<Integer> s5=s4.filter(x->x>40);
    int sum=s5.reduce(0, (a,b)->a+b);
    System.out.println("Sum: "+sum);
    s5.forEach(System.out::println);
}