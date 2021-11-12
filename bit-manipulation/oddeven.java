import java.util.*; 

public class oddeven {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        int n =5;
        if((n & 1)==0){
            System.out.println(n+" is EVEN");
        }else{
            System.out.println(n+" is ODD");
        }
    }
}
