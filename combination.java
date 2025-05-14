class combination{
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int n=arr.length;
        int want1=0;
        int want2=0;
        
        int comb1=0;
        int comb2=0;
        int comb3=0;
        int target=7;
        for(int i=0;i<n;i++){
            comb1=arr[i];
            comb2=arr[1];
            if(want1==target){
                System.out.println(arr[1]+" "+" "+arr[1]);
            }
            else if(want1!=target){
                want2=target-want1;
                for(int j=0;j<n;j++){
                    if(want2==arr[j]){
                        comb3=want2;
                    }
                }
            }
        }
        System.out.println(comb1+" "+comb2+" "+comb3);
    }
}