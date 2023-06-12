package grooming;

public class ArrayList1 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,1,2,3,4,1};
        int max=1,count=1;
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                count++;
            }
            else{
                {
                    if (max<count)

                    max=count;
                    count=1;
                }
            }
        }
        System.out.println(max);
    }
}
