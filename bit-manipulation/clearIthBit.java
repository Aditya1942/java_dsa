public class clearIthBit {
    public static void main(String[] args) {
        int n =309;
        int i= 4;
        int mask = (~(1<<i));
       System.out.println(mask);
       System.out.println(n&mask); 
    }
}
