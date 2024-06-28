public class p8 {
    public static void main(String[] args) {
        int x =4;
        int y = 5;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("After swap no");
        x= x+y;
        y = x-y;
        x=x-y;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    
}
