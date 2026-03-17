class Company {
    private int count,itemsNo,rack[];
    public Company(int size){
        count=0;
        itemsNo=1;
        rack=new int [size];
    }
     public void generateMobile(){
try {
    while(count==rack.length){
        wait();
    }
    rack[count++]=++itemsNo;
    
    Thread.sleep(100);
    System.out.println("Mobile "+itemsNo+" is generated");
    notify();
    itemsNo++;
} catch (Exception e) {
    System.out.println(e.getMessage());
}
     }
     public void wrapMobile(String uname){
        try{
            while (count==0){
                wait();
            }
            int id=rack[--count];
            System.out.println("Mobile"+id+"Wrapped by"+uname);
            notify();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
     }
}
class Producer extends Thread{
    private Company comp;
    public Producer(Company c){
        comp=c;
    }
    public void run(){
        try{
            comp.generateMobile(getName());
            sleep(100);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class InterThreadTester{

}