class J0806_5{
    public static void sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum +=arr[i];
        }
        System.out.println("Sum of array values: " + sum);
    }
    public static void main(String[] args){
        int arr[] = {3,4,2,1,5};
        sum(arr);
    }
}