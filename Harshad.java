class Harshad{
    public static void main(String[] args) {
        /*for(int i=1;i<=100;i++){
        int n=i;
        int k=i;
        int a;
        int sum=0;
        while(n>0){
            a=n%10;
            sum+=a;
            n/=10;
        }
        if(k%sum==0){
            System.out.print("it is Harshad"+i+"::::::");
        }
    }*/
    int n=37;
    int val;
        for(int i=1;i<100;i++){
            val=i*(i+1);
            if(n==val){
              System.out.println("its pronic"+i+" "+(i+1));
            }  
}
        if(n!=val){
        System.out.println("its is not pronic");
        }
}
}