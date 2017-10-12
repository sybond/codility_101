import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int res=0;
        if (A.length<2) {
            if (A[0]<0 || A[0]>1) {
                res=1;
            } else {
                res=A[0]+1;    
            }
        } else {
            int startIdx=0;
            Arrays.sort(A);
            for (int i=0; i<A.length; i++) {
//                System.out.printf("i=%d A[i]=%d\n",i,A[i]);
                if (A[i]>0) {
                    startIdx=i;
                    break;
                } else {
                    if (i==A.length-1)
                    res=1;
                    startIdx=i;
                }
            }
            int beforeVal=A[startIdx];
            if (startIdx<A.length-1 && beforeVal==1) {    
            for (int i=startIdx+1; i<A.length; i++) {
                if (A[i]-beforeVal>1) {
                    res=beforeVal+1;
                    break;
                } else {
                    beforeVal=A[i];
                    if (i==A.length-1) {
                        res=A[i]+1;
                    }
                }
            }  
            } else {
                res=1;
            }         
        }
        return res;
    }
}
