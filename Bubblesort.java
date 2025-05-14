class Bubblesort{
    public static void main(String[] args) {
        int temp;
        int [] arr={32,64,45,45};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int loop:arr)
        System.out.println(loop);
    }
}