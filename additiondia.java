class additiondia{
    public static void main(String[] args) {
        int n=2;
        int num=0;
        int right=0;
        int i;
        int j;
        int a[][]={{1,5,5},{4,5,6},{7,5,5}};
        for( i=0;i<a.length;i++){
            for( j=0;j<a[1].length;j++){
                if(i==j){
                    num=a[i][j]+num;
                }
                else if(i+j==n){
                    right=a[i][j]+right;
                }
            }
        }
        System.out.print(num+" ");
        System.out.println(right+" ");



        //transpose




        for(i=0;i<a.length;i++){
            for( j=0;j<a[1].length;j++){
                System.err.print(a[j][i]+" ");
            }
        System.out.println();
    }
        //replace

         for(i=0;i<a.length;i++){
            for( j=0;j<a[1].length;j++){
                if(a[i][j]==5){
                a[i][j]=7;
                }
                System.out.print(a[i][j]+" ");
            }
        System.out.println();
    }





    //sorting without use if sort

    
         for(i=0;i<a.length;i++){
            for( j=0;j<a[1].length;j++){
                if(a[i][j]<=a[i][j+1]){
                a[i][j]=a[i][j+1];
                }
                System.out.print(a[i][j]+" ");
            }
        System.out.println();

         for(i=0;i<a.length;i++){
            for( j=0;j<a[0].length-1;j++){
                if(i==0||j==0){
                System.out.print(a[i][j]+" ");
                }
                
            }
        System.out.println();
    }
}
}
}