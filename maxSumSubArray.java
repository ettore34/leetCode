

// find the max sum subArray of a afixed sized K 

// Example input 
// [4,2,1,7,8,1,2,8,1,0]

public class maxSumSubArray
{
    public static int findmax(int[] arr, int window)
    {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for(int i = 0  ; i < arr.length; i++)
        {
            currentRunningSum += arr[i];

            if(i >= window )
            {
                maxValue = Math.max(maxValue, currentRunningSum );
                //keeps the window at the appropiate size
                currentRunningSum -= arr[i - (window-1)];
            }

        }

        return maxValue;
    } 



    public static void main (String[] args)
    {
        System.out.println( findmax(new int[] {4,2,1,7,8,1,2,8,1,0} , 3 ) );
    }
}