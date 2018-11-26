import java.util.Arrays;

public class SortedArrayParity {
    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];

        Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

        for (int t = 0; t < A.length; ++t)
            A[t] = B[t];
        return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */
    }

    public int[] sortArrayByParityNewArray(int[] A) {
        int[] ans = new int[A.length];
        int t = 0;

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];

        return ans;
    }

    public int[] sortArrayByParityInPlace(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }

    public int[] sortArrayByParityTwoIndex(int[] A) {

        int[] result = new int[A.length];
        int startingPoint = 0;
        int endingPoint = result.length-1;
        for(int i=0;i<A.length;i++){
            if(A[i]%2 == 0){
                result[startingPoint] = A[i];
                startingPoint++;
            }else{
                result[endingPoint] = A[i];
                endingPoint--;
            }
        }

        return result;
    }


}
