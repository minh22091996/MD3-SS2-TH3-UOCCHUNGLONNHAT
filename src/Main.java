import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        int c = 1;
        if(a==0||b==0){
            System.out.printf("%d va %d khong co uoc chung",a , b);
        }else {
            for(int i = 1 ; i <= a && i <= b ; i ++){
                if(a % i == 0 && b % i == 0){
                    c= i;
                }
            }
            System.out.printf("%d la uoc chung lon nhat cua %d va %d", c , a , b );
        }
    }
}
