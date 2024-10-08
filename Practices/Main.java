public class Main {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int temp;
        System.out.println("origional array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
for (int i = 0; i < arr.length; i++) 
{  
        for(int j = i + 1; j < arr.length; j++)
        
{
    if(arr[i] < arr[j])
    {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
}
        System.out.println("reverse array");
        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i] + " ");
        }}}