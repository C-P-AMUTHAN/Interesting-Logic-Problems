import java.util.*;
public class PhoneNumber {
    public static void phoneNo(int num[]) {
        int iter = 0;
        int start = 0;
        int i;
        while(iter < 10) {
            int sum  = 0;
            start = num[iter];
            for(i=iter; i<10; i++) {
                sum += num[i];
                if(start%2==0 && sum%2!=0) {
                    System.out.print(sum+" ");
                    break;
                }else if(start%2!=0 && sum%2==0) {
                    System.out.print(sum+" ");
                    break;
                }
            }
            iter = i+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile no: ");
        int[] num = new int[10];
        for(int i=0; i<10; i++) {
            num[i] = sc.nextInt();
        }
        phoneNo(num);
        sc.close();
    }
}


// example
// no = 9 4 4 3 4 4 7 0 9 9
// 9(odd) sum = 9 + 4 = 13 + 4 = 17 + 3 = 20(even) print 20
// 4(even) sum = 4 + 4 = 8 + 7 = 15(odd) print 15