class automarphic{
    public int square(int a){
    int b;
    int c;
    while(a>0){
        b=a%10;
        c=b*b;
        a=a/10;
    }
    return c;
}
}
class Main{
    public static void main(String[] args) {
        automarphic m=new automarphic();
        System.out.print(m.square(5));

    }
}