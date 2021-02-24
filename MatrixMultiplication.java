import java.io.*;
import java.util.*;
public class MatrixMultiplication
{
    public static void main(String []args)throws Exception{
        Scanner s=new Scanner(System.in);
        //for first matrix
        int n1=s.nextInt();//row
        int m1=s.nextInt();//columns
        int [][]arr1=new int [n1][m1];
        for(int i=0;i<n1;i++){
          for(int j=0;j<m1;j++){
              arr1[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
               System.out.print(arr1[i][j]+" ");
              //  arr1[i][j]=s.nextInt();
            }
            System.out.println();
        }
        //for second matrix
        int n2=s.nextInt();//row
        int m2=s.nextInt();//columns
        int [][]arr2=new int [n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                arr2[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
               // arr2[i][j]=s.nextInt();
            }
          System.out.println();
        }
        if(m1!=n2){
            System.out.println("invalid input");
            return;
        }
        //result matrix
        int [][]product=new int[n1][m2];//size of product matrix will be  arr1  row(n1) and arr2  col(m2)
        for(int i=0;i< product.length;i++){
            for(int j=0;j<product[i].length;j++){
                for(int k=0;k<n1;k++){
                    product[i][j]+=arr1[i][k] * arr2[k][j];// prod row is equal to arr1 row and prod col  is equal to arr2 col.
                }
            }
        }
        for(int i=0;i< product.length;i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
