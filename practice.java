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
// //naya array ka input
//         System.out.println("enter second row");
//         int c=input.nextInt();
//         System.out.println("enter second collum");
//         int d=input.nextInt();
//         int dkx[][]=new int [c][d];
//         for(int i=0;i<c;i++);{
//             for(int j=0;j<d;j++){
//                 System.out.printf(dkx[c][d]+" ");
//             }
//         }

//     }
// }



//printing arrays
// import java.util.Scanner; 
// class main{
//     public static void main(String[]args){
        
//         Scanner sc = new Scanner(System.in); 
//         int n = sc.nextInt(); 
//         for(int i =1;i<=10;i=i+1){
//             // int prod = n*i; 
//             // System.out.println(prod);
//             // System.out.printf("%d x %d=%d",n,i,n*i);
//             System.out.println(n + " x " +i +" = " + n*i);
//         }
//     }
// }



//practic  java
import java.util.Scanner;
public class practice{
    public static void main(String[]args){
        boolean isSorted = true;
int [] arr = {1, 12, 3, 4, 5, 34, 67};
for(int i=0;i<arr.length-1;i++){
    if(arr[i] > arr[i+1]){
        isSorted = false;
        break;
    }
}
if(isSorted){
    System.out.println("The Array is sorted");
}
else{
    System.out.println("The Array is not sorted");
}
    }
}