public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while(end >=start)
        {
            int mid = start +(end-start)/2;
            if (num/mid == mid && num%mid==0 ) return true;
            if ( (float)num/ (float)mid < (float)mid )
            {
                end =mid -1;
                continue;
            }
            else
            {
                start = mid +1;
                continue;
            }
        }
        return false;
    }

    public boolean isPerfectSquareOneLine(int num) {

        double sr = Math.sqrt(num);
        return ((sr - Math.floor(sr)) == 0);
    }


    boolean isPerfectSquareSecond(int num) {
        int index = 0;

        if( num == 1 || num == 0 )
            return true;

        for( index = 1; index <= num / index; index++ )
            if( index * index == num )
                return true;

        return false;
    }
}
