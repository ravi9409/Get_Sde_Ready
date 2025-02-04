public class SquareRootBinarySearch {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        if(x==1) return 1;
        if(x==2) return 1;
        int result=0;
        for (int i=0;i<x;i++){
            if(i*i==x) {
                result = i;
                break;
            }
            else if (i*i<x)
                continue;
            else if(i*i>x) {
                result = i - 1;
                break;
            }
        }
        return result;
    }
}