class Patten{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                System.out.print(1+" ");
                else
                System.out.print(0+" ");
            }
            System.out.println(" ");
        }
        for(int k=0;k<=n;k++){
            for(int l=0;l<=n;l++){
                if(k==3||l==3)
                System.out.print(" * ");
                else
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print(i + "");
            }
            // print new line for each row
            System.out.println();
        }
    }

    }
