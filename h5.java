public class h5 {
    public static void main(String[] args) {
        int w = 4;
        int g = 5;
        int k =8;
        int A =2;
        int c = 0;
        System.out.println("w"+w);
        System.out.println("g"+g);
        System.out.println("k"+k);
        System.out.println("A"+A);
        //w will move to A A to k k to g g to w
        System.out.println("After swap");
        c=A;
        A = w;
        w = k;
        g=k;
        k=c;
        c=g;
        //g=k;
        w=c;
        System.out.println("w"+w);
        System.out.println("g"+g);
        System.out.println("k"+k);
        System.out.println("A"+A);
    }
}
