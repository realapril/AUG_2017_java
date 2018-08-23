import java.util.Scanner;

public class No4_MakingaStarShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to make a star shape");
//        System.out.println("원하는 별 크기의 숫자를 입력하세요");

        int num = sc.nextInt();
        int star=1;
        int blank= num+1;

        //A star is divided into 3 parts: one head, one body, and 2 legs.
        //This part is : a head

        //별을 머리, 몸통, 다리부분으로 나눠서 실행
        //여기는 머리부분

        for(int i=0; i<num+1; i++) {
            for(int j=0; j<blank+(num+1)*4; j++) {
                System.out.print(" ");}
            for(int k=0; k<star; k++) {
                System.out.print("*");
            }
            blank -=1;		star+=2;
            System.out.println();}

        // From now on : a body
        //여기부터 별 몸통
        blank=num+1;
        star=6*blank+1;
        int tim=0;

        for(int i=0; i<num+1; i++) {
            for(int k=0; k<tim+2*(num+1); k++) {
                System.out.print(" ");
            }tim+=2;
            for(int j=0; j<star; j++) {
                System.out.print("*");
            }star-=4;
            System.out.println();
        }

        //From now on: legs
        //여기부터 별다리
        blank=num+1;
        int frame=num+1;
        for(int i=0; i<num+1+3 ; i++){
            for(int k=0; k<(6*frame+4); k++) {
                if(k<(3*(num+1)+blank-3)) {
                    System.out.print(" ");
                }else {
                    if(k<(3*(num+1)+2*blank)) {
                        System.out.print("*");
                    } else { if(k<3*(num+1)+2*frame+1){
                        System.out.print(" ");}
                    else {if(k<=5*(num+1)+frame+3) {
                        System.out.print("*");}
                    }}}}
            System.out.println();
            frame+=1;blank-=1;
        }
        System.out.println();
    }
}
