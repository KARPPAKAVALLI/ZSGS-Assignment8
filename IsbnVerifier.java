class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int n=10,x=0,len=0;
        for(int i=0;i<stringToVerify.length();i++){
            if(stringToVerify.charAt(i)=='-')
                continue;
            else if(stringToVerify.charAt(i)=='X' && i==stringToVerify.length()-1){
                x+=n*10;
                len++;
                n--;
            }
            else if(!Character.isDigit(stringToVerify.charAt(i)))
                return false;
            else{
                x+=n*(stringToVerify.charAt(i)-'1'+1);
                n--;
                len++;
            }
        }
        return x%11==0 && len==10;
    }

}
