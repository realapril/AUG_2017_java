import java.util.Scanner;

public class NO3_MakingaCircleShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number to make a circle shape (should be bigger than 10) : ");
//        System.out.print("원의 크기를 입력하세요(단, 10 이상) : ");
        float num = sc.nextInt();

        float a= Math.round(num/2);
        for(float i=0; i<Math.floor(num/2); i++) {
            for(int j=0; j<Math.round((0.34*a)*(0.34*a));j++) {
                System.out.print(" ");
            }
            for(int k=0; k<(2*num-2*(Math.round((0.34*a)*(0.34*a)))); k++ ) {
                System.out.print("*");
            }a-=1; System.out.println();
        }

        int b= 1;
        for(float i=0; i<Math.floor(num/2); i++) {
            for(int j=0; j<Math.round((0.34*b)*(0.34*b));j++) {
                System.out.print(" ");
            }
            for(int k=0; k<(2*num-2*(Math.round((0.34*b)*(0.34*b)))); k++ ) {
                System.out.print("*");

            } b+=1; System.out.println();
        }
    }
}
