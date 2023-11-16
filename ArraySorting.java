import java.util.Arrays;

public class ArraySorting {
        public static void main(String[] args) {
            int[] array = new int[args.length];
//ghj
            for (int i = 0; i < args.length; i++) {
                    array[i] = Integer.parseInt(args[i]);
            }

            // Виведення початкового масиву
            System.out.print("base: ");
            printArray(array);

            // Сортування від найменшого до найбільшого
            int[] ascArray = Arrays.copyOf(array, array.length);
            Arrays.sort(ascArray);
            System.out.print("asc: ");
            printArray(ascArray);

            // Сортування від найбільшого до найменшого
            int[] descArray = Arrays.copyOf(array, array.length);
            Arrays.sort(descArray);
            reverseArray(descArray);
            System.out.print("desc: ");
            printArray(descArray);

            // Сортування від країв (найбільші на краях)
            int n = array.length;
            int[] innerArray = new int[n];
            Arrays.sort(array);
            int[] descendingArray = Arrays.copyOf(array, array.length);
            reverseArray(descendingArray);

            int left = 0;
            int right = n - 1;
            boolean insertLeft = true;

            for (int i = 0; i < n; i++) {
                if (insertLeft) {
                    innerArray[left] = descendingArray[i];
                    left++;
                    insertLeft = false;
                } else {
                    innerArray[right] = descendingArray[i];
                    right--;
                    insertLeft = true;
                }
            }

            System.out.print("inner: ");
            printArray(innerArray);
        }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}