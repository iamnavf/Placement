class decimaltoocta{
 public static void main(String args[]){
    int [] arr=new int [100];
    int n=2345;
    int i=0;
    while(n>0){
    arr[i]=n%8;
  
     n=n/8;
    i++;
    }
 for(int j=i-1;j>=0;j--){
    System.out.print(arr[j]);
 }
 }
}