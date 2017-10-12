class Solution {
    public int solution(int N) {
        String res=Integer.toBinaryString(N);
        String[] parts=res.split("1");
        int tmp=0;
        for (int i=0; i<parts.length; i++) {
            if (tmp<parts[i].length()) tmp=parts[i].length();
        }
     //   System.out.printf("S=%d\n",parts.length);
        return tmp;
    }
}
