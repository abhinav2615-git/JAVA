public class Time {

    int hh, mm, ss;

    void input(int h, int m, int s) {
        hh = h;
        mm = m;
        ss = s;
    }

    void show() {
        System.out.println("Hours: " + hh);
        System.out.println("Minutes: " + mm);
        System.out.println("Seconds: " + ss);
    }

    public static void main(String[] args) {
        Time t = new Time();  
        t.input(10, 45, 30);   
        t.show();              
}
}