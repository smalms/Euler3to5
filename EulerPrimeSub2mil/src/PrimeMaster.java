/**
 * Created by Steven on 6/19/2016.
 */
public class PrimeMaster {
    public static void main(String[] args) {
        long curNum = 2;
        long total=0;
        long cap= 2000000;
        while (curNum<=cap){
            if (isPrime(curNum)){
                total+=curNum;
            }
            curNum+=1;
        }
        System.out.println(total);
    }


    public static boolean isPrime(long n) {
        if (n > 2 && (n & 1) == 0)
            return false;
        // only odd factors need to be tested up to n^0.5
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}