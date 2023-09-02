package Coding_Caprice.string;

public class reverse_word_151 {
    public static String reverseWords(String s) {
        String[]temp = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = temp.length-1; i >0 ; i--) {
            res.append(temp[i]);
            res.append(" ");
        }
        res.append(temp[0]);
        return res.toString();
    }
}
