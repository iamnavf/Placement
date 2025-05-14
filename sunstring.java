class sunstring{
    public static void main(String[] args) {
        String str1="hello boyss";
        StringBuffer str2=new StringBuffer(str1);
       String str3=str2.substring(3,7);

        System.out.println(str3);
    }
}