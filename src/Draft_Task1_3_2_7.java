import java.util.Arrays;

//        Пример _ ППППППППППППППППППППППППППППППППППП
// Java Program to find maximum in arr[]
class Draft_Task1_3_2_7 {

    // Метод для поиска наибольшего элемента массива.
    static int largest() {
        int v1 = 12;
        int v2 = 75;
        int v3 = -7;
        int v4 = 12405;
        int v5 = 980;

        int arr[] = {v1, v2, v3, v4, v5};  // Или так можно: int[] arr = new int[] { v1, v2, v3, v4, v5, v6, v7, v8 };
        System.out.println("Задаем массив arr[]: " + Arrays.toString(arr));

        int i;

        // Объявляем переменную для максимального элемента: max.
        int max = arr[0];

        // Перебираем элементы массива и сравниваем каждый элемент с текущим максимумом.
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Задание: \n7.  Напишите метод, который возвращает наибольший элемент " +
                "массива\n\nРешение: ");

        System.out.println("наибольший элемент массива: " + largest());
    }
}
//        Конец Примера _ КККККККККККККККК







////        Пример 1 ППППППППППППППППППППППППППППППППППП
//// Java Program to find maximum in arr[]
//class Draft_Task1_3_2_7 {
//    static int arr[] = {10, 324, 45, 90, 9808};
//
//    // Method to find maximum in arr[]
//    static int largest()
//    {
//        int i;
//
//        // Initialize maximum element
//        int max = arr[0];
//
//        // Traverse array elements from second and
//        // compare every element with current max
//        for (i = 1; i < arr.length; i++)
//            if (arr[i] > max)
//                max = arr[i];
//
//        return max;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Задание: \n7.  Напишите метод, который возвращает наибольший элемент " +
//                "массива\n\nРешение: ");
//
//        System.out.println("наибольший элемент массива: " + largest());
//    }
//}
////        Конец Примера 1 КККККККККККККККК







