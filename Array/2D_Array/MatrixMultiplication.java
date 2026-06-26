
import java.util.*;
public class MatrixMultiplication {
    public static int[][] matrixMultiplication(int mat1[][],int mat2[][]){
        
        int res[][]=new int[mat1.length][mat2[0].length];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                for(int k=0;k<mat1[0].length;k++){
                    res[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        return res;


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row of mat1");
        int m=sc.nextInt();//row of mat1;
        System.out.println("Enter col of mat1 // row of mat2");
        int n=sc.nextInt();//col of mat1 and rows of mat2
        System.out.println("Enter col of mat2");
        int p=sc.nextInt();//col of mat2;
        int mat1[][]=new int[m][n];
        int mat2[][]=new int[n][p];
        System.out.println("Enter elements of mat1: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter element of mat 2");
         for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                mat2[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Resultant matrix: ");
       int res[][]= matrixMultiplication(mat1, mat2);
       for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
                
            }
            System.out.println();

        }
        
    }
}

