import java.util.Scanner;

public class NO2_MakingaDiamondShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to make a damond shape");
        //System.out.println("원하는 마름모 크기의 숫자를 입력하세요");
        int num = sc.nextInt();
        int star=1;
        int blank= num;

        for(int i=0; i<num; i++) {
            for(int j=0; j<blank; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<star; k++) {
                System.out.print("*");
            }
            star+=2;
            blank-=1;
            System.out.println();
        }

        blank=0;

        for(int i=0; i<num+1; i++) {
            for(int j=0; j<blank; j++) {
                System.out.print(" ");
            }
            for(int k=0; k< star; k++) {
                System.out.print("*");
            }
            star-=2;
            blank+=1;

            System.out.println();
        }

    }
}
