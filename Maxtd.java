import java.util.*;
class Maxtd{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row;
        int col;
        int i;
        int j;
        int max=0;
        System.out.println("enter the no.of row");
        row=scan.nextInt();
          System.out.println("enter the no.of col");
        col=scan.nextInt();
        int [][]a=new int [row][col];
        System.out.println("enter the array element");
        for( i=0;i<row;i++){
            for(j=0;j<col;j++){
            System.out.print("["+ i + "]" + "["+ j + "]"+" :");
            a[i][j]=scan.nextInt();
            for(int arr:a[i][j])
            
            }
        }
          for( i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(max>a[i][j]){
                max=a[i][j];
                System.out.print(max+" ");
                }
                else{
                    max=0;
                }
            }
            System.out.println(" ");
            
        }
         
        
    }
}