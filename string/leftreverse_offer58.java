package Coding_Caprice.string;

public class leftreverse_offer58 {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        int p = n%len;
        if(p==0){
            return s;
        }
        String res = s.substring(p)+s.substring(0,p);
        return res;
    }
}
