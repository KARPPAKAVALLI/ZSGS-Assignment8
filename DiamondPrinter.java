import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {

    List<String> printToList(char a) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    
    List<String> ans=new ArrayList<>();
    char c='A';
    int n=(a-'A'+1)*2-1;
    for(int i=0;i<=n/2;i++){
            String s="";
            for(int j=0;j<n;j++){
                if(i+j==n/2||j==n/2+i)
                    s+=c;
                else
                    s+=" ";
            }
            c++;
            ans.add(s);
        }
        c=a;
        for(int i=n/2+1;i<n;i++){
            String s="";
            c--;
            for(int j=0;j<n;j++){
                if(n-i-1+j==n/2||j==n/2+n-i-1)
                    s+=c;
                else
                    s+=" ";
            }
            ans.add(s);
        }
    return ans;
    }
}
