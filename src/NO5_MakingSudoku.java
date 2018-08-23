import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class NO5_MakingSudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number");
//        System.out.println("숫자 입력");

        int num = sc.nextInt();
        Integer [] arr=new Integer[num];

        for (int i=0; i<arr.length;i++) {
            arr[i]=i+1;
        }
        int adjustnum=0; //sometimes I get numbers smaller than zero, but the sudoku should be filled with natural numbers
        int internval=0;

        if(num%6==0) {
            internval=1;
        }else if(num%3==0){

            Random random = new Random();
            int x = random.nextInt(1);
            if (x == 1) {internval=1;}
            else if(x == 0) {internval=2;}
        }else if(num==2){

            internval= 1;
        }else if(num%2==0){

            Random random = new Random();
            int x = random.nextInt(1);
            if (x == 1) {internval=1;}
            else if(x == 0) {internval=3;}
        }else {


            Random random = new Random();
            int x = random.nextInt(3);
            if (x == 1) {internval=1;}
            else if(x == 2) {internval=2;}
            else if(x == 0) {internval=3;}
            else if(x == 3) {internval=4;}
        }

        Collections.shuffle(Arrays.asList(arr));
        for (int k=0; k<arr.length;k++) {
            for(int j=0; j<num;j++) {
                System.out.print(arr[j]+adjustnum+"  ");
                if(arr[j]+adjustnum>=num-(internval-1)){arr[j]-=num;}
            }
            adjustnum+=internval;
            System.out.println();
        }
    }
}
