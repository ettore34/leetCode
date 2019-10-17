


public class smallestSubArray
{
    public static int smallestSubArray( int[] arr , int targetSum )
    {

        int minimumWindowSize = Integer.MAX_VALUE; 
        int currentWindowSum =0;
        int windowStart = 0;

        for(int windowEnd =0 ; windowEnd < arr.length ; windowEnd++)
        {
            currentWindowSum += arr[windowEnd];

            while(currentWindowSum >= targetSum)
            {
                minimumWindowSize = Math.min(minimumWindowSize, windowEnd - windowStart +1);
                currentWindowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minimumWindowSize;

    }



    public static void main( String[] args )
    {
        int[] input = new int[]{ 1,2,3,4,5,6,7,8,98,7} ;
        int targetSum = 8;

        System.out.println( smallestSubArray(input, targetSum));
        

    }


}