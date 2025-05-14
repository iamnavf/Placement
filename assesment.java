import java.util.*;
class assesment {
    public static void main(String[] args) {
        int [][]arr={{5,4,7},{1,8,3},{9,6,2}};
        int row= arr.length;
        int col=arr[0].length;
        int count=0;
        int []temp= new int [row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[count++]=arr[i][j];
            }
        }
        Arrays.sort(temp);
        System.out.print("the third largest in the array is :"+temp[temp.length-3]);
    }
}