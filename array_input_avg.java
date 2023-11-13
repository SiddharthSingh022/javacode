import java.util.Scanner;
public class array_input_avg {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//input lene ke liye
        System.out.println("kitne input chahiye???:");
        int n=input.nextInt();
        int array[]=new int [n];
        // array me input lene ke liye
        for(int i=0;i<n;i++){
        array[i]=input.nextInt();
        }
        //input sahit arrray print krwane liye
        System.out.println("printing new wlwment");
        for (int i=0;i<n;i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println();
//sum of input in array
   int sum=0;
   for(int element:array){
    sum=sum+element;
   }
   //printing sum
   System.out.println(sum);
   //printing average in array
  System.out.println(sum/array.length);
    }
}

// import java.util.Scanner;
// public class practice{
//     public static void main(String[]args){
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter no of rows");
//         int a=input.nextInt();
//         System.out.println("enter no of coloum");
//         int b=input.nextInt();
//         int array[][]=new int [a][b];
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//             array[i][j]=input.nextInt();
//             }
//         }
//         System.out.println("array");
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b/2 + 1;j++){
//         System.out.print(array[i][j] + " ");
//             }
//             for(int j = b/2 + 1; j<b; j++){
//                 System.out.println(array[i][j] + " ");
//             }
//         }

//     }
// }
