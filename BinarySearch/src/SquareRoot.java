public class SquareRoot {

    public static void main(String[] args) {
        int a = 8;
        System.out.println(squareRoot(a));
    }

    public static int squareRoot(int x) {
        int low = 1;
        int high = x;
        int result = 0;
       while (low<=high)
       {
           int mid=(low+high)/2;
           if(mid*mid==x){
               result= mid;
               return result;
           }
           else if(mid*mid>x)
               high=mid-1;
           else{
               result= mid;
               low=mid+1;
           }

       }
        return result;
    }
}