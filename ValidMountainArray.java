public class ValidMountainArray {

    public static void main(String[] args) {

    }

    public static boolean validMountainArray(int[] A) {

        if(A==null || A.length<3){return false;}

            boolean inc=false;
            boolean dec=false;
            int len=A.length;
            for(int i=1;i<len;i++){
                if(!dec && A[i-1]<A[i]){
                    inc=true;
                }
                if((!inc && A[i]<=A[i-1])||(dec && A[i]>=A[i-1])){
                    return false;
                }
                if(inc & A[i]<A[i-1]){
                    dec=true;
                }
            }


        return inc && dec;

    }

    public static boolean validMountainArraySec(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }



}
