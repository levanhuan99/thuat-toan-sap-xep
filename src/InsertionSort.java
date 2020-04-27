import java.util.Arrays;

public class InsertionSort {

    public static void insertionSortAlgorithm(int[] arr) {
       for (int i=1;i<arr.length;i++){
           int j=i-1;
           int keyValue=arr[i];
           while (j>=0 && keyValue<arr[j]){     //nếu đổi vị trí của điều kiện trong while này thì sẽ sai Index -1 out of bounds for length
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=keyValue;
           System.out.println(Arrays.toString(arr));
       }
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {                 //nếu có phần tử nào nhỏ hơn arr[i] thì gán minIdex cho nó để mình lấy vị trí đó để swqp với vị trí thứ i;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {                                //kiểm tra xem index hiện tại có khác i = nếu có thì
                swap(arr, i, minIndex);                          //đổi chỗ giá trị tại vị trí index mới với giá trị vị trí i
            }
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void bubbleSortAlgorithm(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {                    //vòng lặp đầu tiên sẽ đẩy thằng to nhất xuống cuối: i=0.đẩy n-1 lần thì sẽ sort xong
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int swap = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = swap;
    }


    public static void main(String[] args) {
        int[] arr = {5,4,3,2};
        System.out.println("----insertion-----");
        InsertionSort.insertionSortAlgorithm(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("---selection-----");
        InsertionSort.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("----bubble-------");
        InsertionSort.bubbleSortAlgorithm(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
