public class Sqrt {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
        long i=0;
        while(i*i<=x){

            i++;
        }
        return (int) i-1;
    }
}
