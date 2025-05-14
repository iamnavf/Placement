   class Pronic{
    public static void main(String[] args) {
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





        //abudant
        int sum=0;
        int fact=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                fact=i;
        }
        sum=fact;
        if(sum>n)
        System.out.println("its abdunt");

}
}