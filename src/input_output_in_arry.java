import java.util.Scanner;
public class input_output_in_arry {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[]= new int[size];


        //input

        for(int i=0;i<size;i++){
            number[i] = sc .nexInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }
    }
}
