class Strongnum{
    public static void main(String[] args) {
    for(int k=1;k<=1000;k++){
        int z=k;
        int n=k;
        int sum=0;
        while(n>0){
        int a=n%10;
        int j=1;
        for(int i=1;i<=a;i++){
            j*=i;
        }
        n=n/10;
        sum=j+sum;
        }
        if(sum==z){
            System.out.println("its is strong number"+z);
        }
    }
}
}