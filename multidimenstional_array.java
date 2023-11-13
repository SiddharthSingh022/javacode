import java.util.Scanner;
public class multidimenstional_array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input daal");

        int row=sc.nextInt();
        int collum=sc.nextInt();
        int [] marks;
        int [][] flats;
        flats=new int [row][collum];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        System.out.println("printing a 2d array using for loop");
        for(int i=0;i<flats.length;i++){
             for(int j=0;j<flats[i].length;j++){
                System.out.println(flats[i][j]);
            }
        }
}}
 