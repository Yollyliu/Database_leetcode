public class LineToString {
    public static void main(String[] args) {

    }

    public int[] numberOfLinesOne(int[] widths, String S) {
        int[] res = new int[2];
        if(S.isEmpty()) return res;
        for(char c : S.toCharArray()){
            int index = c-'a';
            if(res[1]+widths[index]>100){
                res[0]++;
                res[1]=widths[index];
            }else{
                res[1]+=widths[index];
            }
        }
        res[0]++;
        return res;
    }

    public int[] numberOfLinesTwo(int[] widths, String s) {
        int[] res = new int[2];
        int tempSum = 0;
        int count = 0;

        for(int i=0;i<s.length();i++) {
            int x = widths[s.charAt(i) - 'a'];

            if(tempSum + x <= 100) {
                tempSum+=x;
            } else {
                count++;
                tempSum = x;
            }
        }

        return new int[] {tempSum > 0 ? count+1 : count, tempSum};
    }
}
