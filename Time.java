public class time {
    private int hh, mm, ss;
    public time(){
        hh=mm=ss=12;
    }
    public time(int h, int m, int s){
        this.hh = h;
        this.mm = m;
        this.ss = s;
    }
    public void show(){
        System.out.printf("%02d:%02d:%02d\n",hh,mm,ss);
    }
    public void Add(time t){
        this.hh += t.hh;
        this.mm += t.mm;
        this.ss += t.ss;
    }
    public void Add(time t1, time t2){
        ss = t1.ss + t2.ss;
        mm = t1.mm + t2.mm + ss/60;
        hh = t1.hh + t2.hh + mm/60;
        ss %= 60;
        mm %= 60;
    }
    public static void main(String[] args) {
        time t1 = new time();
        time t2 = new time();
        time t3 = new time(12,5,12);
        t1.show();
        t3.show();
        t2.Add(t1,t3);
        t2.show();
        t1.Add(t3);
        t1.show();
    }
}