package Coding_Caprice.string;

class reversestr_541 {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[]res=s.toCharArray();
        char temp;
        int end = n%(2*k);
        if(n<=k){
            for(int i = 0;i<n/2;i++){
                temp=res[i];
                res[i]=res[n-i-1];
                res[n-i-1]=temp;
            }
            return String.valueOf(res);
        }
        for(int i = 0;i<n/(2*k);i++){
            for (int j = 0; j < k/2; j++) {
                int left = i*2*k + j;
                int right = i*2*k+k-1-j;
                temp=res[left];
                res[left]=res[right];
                res[right]=temp;
                System.out.println(left);
                System.out.println(right);
            }
            System.out.println(i+"   "+String.valueOf(res));
        }
        if(end<k){
            for(int i = 0;i<end/2;i++){
                temp = res[i+n-end];
                res[i+n-end] = res[n-i-1];
                res[n-i-1] = temp;
            }
        }
        else if(end>=k){
            for(int i = 0;i<k/2;i++){
                temp = res[i+n-end];
                res[i+n-end] = res[n-end+k-i-1];
                res[n-end+k-i-1] = temp;
            }
        }
        return String.valueOf(res);
    }
}
