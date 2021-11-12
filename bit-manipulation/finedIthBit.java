public class finedIthBit {
    public static void main(String[] args) {
        int n = 12;
        int i = 2;
        int mask = 1<<i;
        if((n&mask)==0)System.out.println(0);
        else System.out.println(1);

    }
    
}
