class Main12 {
     public static void main(String[] args){
    int arr[]={1,3,5,6};
    int n=arr.length;
    int tar=7;
     //int newarr[]=new int [arr.length+1];
     for(int i=0;i<arr.length;i++){
         if(tar==arr[i]){
             System.out.print(i);
             break;
         }
         if(tar!=arr[i]){
            System.out.println(n);
         }
        //else if(arr[i]!=tar)
            /*newarr[i]=arr[i];
            newarr[n]=tar;
            for(int j=0;j<newarr.length;j++){
                if(tar==newarr[j]){
                    System.out.println(j);
                }
            }*/
       
         
     }
      
         }
    
     }
