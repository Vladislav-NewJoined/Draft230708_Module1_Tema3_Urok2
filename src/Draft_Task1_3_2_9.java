import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!!!!!!!!!!!!!!
public class Draft_Task1_3_2_9 {
    public static void main(String[] args) {
        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
                "массив, но без отрицательных чисел\n\nРешение: ");

        System.out.println("\nМетод getPositives создан. Из него получаем следующие выходные данные:");
        List<Integer> getPositives = getPositives();
        System.out.println("Исходный массив без отрицательных чисел: " + getPositives.toString());
    }

    //  Создаем метод для обработки исходного массива
    static List<Integer> getPositives() {
        int v1 = 0;
        int v2 = 1;
        int v3 = 2;
        int v4 = 3;
        int v5 = 4;
        int v6 = -5;
        int v7 = -6;
        int v8 = 7;

        int[] inputs = new int[] { v1, v2, v3, v4, v5, v6, v7, v8 };
        List<Integer> getPositives = new ArrayList<>();
        System.out.println("Исходный массив: " + Arrays.toString(inputs));

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] >= 0)
                getPositives.add(inputs[i]);

        }
        //  Делаем возврат return динамического массива
        return getPositives;


    }


}
//        Конец Примера _ КККККККККККККККК







////        Пример 9 ППППППППППППППППППППППППППППППППППП Работает, теперь нужно в отдельный метод записать
////  https://translated.turbopages.org/proxy_u/en-ru.ru.29f25ce8-64adadee-e288e803-74722d776562/https/stackoverflow.com/questions/51447573/fill-array-with-elements-from-another-array
//public class Draft_Task1_3_2_9 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
//                "массив, но без отрицательных чисел\n\nРешение: ");
//        int[] array = {12, 0, -22, 0, 43, 545, -4, -55, 12, 43, 0, -999, -87};
//        List<Integer> arr2 = new ArrayList<>();
//
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] >= 0)
//                arr2.add(array[i]);
//        }
////        System.out.println(Arrays.toString(new List[]{arr3}));
////        System.out.println(arr3.toString());
//        System.out.println(arr2);
//
//    }
//}
////        Конец Примера 9 КККККККККККККККК








////        Пример 8 ППППППППППППППППППППППППППППППППППП Работает, теперь нужно в отдельный метод записать
////  https://translated.turbopages.org/proxy_u/en-ru.ru.29f25ce8-64adadee-e288e803-74722d776562/https/stackoverflow.com/questions/51447573/fill-array-with-elements-from-another-array
//public class Draft_Task1_3_2_9 {
//    public static void main(String[] args) {
//        int[] ints = getDetails();
//        System.out.println(Arrays.toString(ints));
//    }
//    static int[] getDetails() {
//        int v1 = 0;
//        int v2 = 1;
//        int v3 = 2;
//        int v4 = 3;
//        int v5 = 4;
//        int v6 = -5;
//        int v7 = -6;
//        int v8 = 7;
//
//        return new int[] { v1, v2, v3, v4, v5, v6, v7, v8 };
//    }
//
//
//}
////        Конец Примера 8 КККККККККККККККК








////        Пример 7 ППППППППППППППППППППППППППППППППППП
////  https://translated.turbopages.org/proxy_u/en-ru.ru.29f25ce8-64adadee-e288e803-74722d776562/https/stackoverflow.com/questions/51447573/fill-array-with-elements-from-another-array
//public class Draft_Task1_3_2_9 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
//                "массив, но без отрицательных чисел\n\nРешение: ");
//        int[] arr = new int[8];
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число - первый элемент массива (часть эл-тов должны быть " +
//                "отрицательными): ");
//        int e1 = scanner.nextInt();
//        arr[0] = e1;
//        System.out.print("Введите второй элемент массива: ");
//        int e2 = scanner.nextInt();
//        arr[1] = e2;
//        System.out.print("Введите третий элемент массива: ");
//        int e3 = scanner.nextInt();
//        arr[2] = e3;
//        System.out.print("Введите четвертый элемент массива: ");
//        int e4 = scanner.nextInt();
//        arr[3] = e4;
//        System.out.print("Введите пятый элемент массива: ");
//        int e5 = scanner.nextInt();
//        arr[4] = e5;
//        System.out.print("Введите шестой элемент массива: ");
//        int e6 = scanner.nextInt();
//        arr[5] = e6;
//        System.out.print("Введите седьмой элемент массива: ");
//        int e7 = scanner.nextInt();
//        arr[6] = e7;
//        System.out.print("Введите восьмой элемент массива: ");
//        int e8 = scanner.nextInt();
//        arr[7] = e8;
//
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//
//
//
//
//        int[] arr1 = new int[0];
//        int count1 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0)
//                arr1[count1++] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr1));
//
//
//    }
//}
////        Конец Примера 7 КККККККККККККККК








////        Пример 6 ППППППППППППППППППППППППППППППППППП
////  https://translated.turbopages.org/proxy_u/en-ru.ru.29f25ce8-64adadee-e288e803-74722d776562/https/stackoverflow.com/questions/51447573/fill-array-with-elements-from-another-array
//public class Draft_Task1_3_2_9 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
//                "массив, но без отрицательных чисел\n\nРешение: ");
//        int[] arr = new int[8];
//        int[] newArr = new int[]{};
//        int i = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число - первый элемент массива (часть эл-тов должны быть " +
//                "отрицательными): ");
//        int e1 = scanner.nextInt();
//        arr[0] = e1;
//        if (e1 >= 0) {
//            i = i;
//            newArr[i] = e1;
//            i++;
//        }
//        System.out.print("Введите второй элемент массива: ");
//        int e2 = scanner.nextInt();
//        arr[1] = e2;
//        if (e2 >= 0) {
//            i = i;
//            newArr[i] = e2;
//            i++;
//        }
//        System.out.print("Введите третий элемент массива: ");
//        int e3 = scanner.nextInt();
//        arr[2] = e3;
//        if (e3 >= 0) {
//            i = i;
//            newArr[i] = e3;
//            i++;
//        }
//        System.out.print("Введите четвертый элемент массива: ");
//        int e4 = scanner.nextInt();
//        arr[3] = e4;
//        if (e4 >= 0) {
//            i = i;
//            newArr[i] = e4;
//            i++;
//        }
//        System.out.print("Введите пятый элемент массива: ");
//        int e5 = scanner.nextInt();
//        arr[4] = e5;
//        System.out.print("Введите шестой элемент массива: ");
//        int e6 = scanner.nextInt();
//        arr[5] = e6;
//        System.out.print("Введите седьмой элемент массива: ");
//        int e7 = scanner.nextInt();
//        arr[6] = e7;
//        System.out.print("Введите восьмой элемент массива: ");
//        int e8 = scanner.nextInt();
//        arr[7] = e8;
//
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
////        int[] newArr = new int[arr.length];
////        List<Integer> newArr = new ArrayList<>();
////        newArr.add("111");
////        System.out.println(a.toString());
//
////        for (int i = 0; i < arr.length; i++) {
////            if (arr[i] > 0) {
//////                newArr.add(Integer.valueOf(arr[i]));
//////                newArr.set(i, Integer.valueOf(arr[i]));
////                newArr[i] = arr[i];
//////            } else {
//////                continue;
////            }
////            i++;
////        }
//        System.out.println(Arrays.toString(newArr));
//    }
//}
////        Конец Примера 6 КККККККККККККККК








////        Пример 5 ППППППППППППППППППППППППППППППППППП
////  https://translated.turbopages.org/proxy_u/en-ru.ru.29f25ce8-64adadee-e288e803-74722d776562/https/stackoverflow.com/questions/51447573/fill-array-with-elements-from-another-array
//public class Draft_Task1_3_2_9 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
//                "массив, но без отрицательных чисел\n\nРешение: ");
//        int[] arr = new int[8];
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число - первый элемент массива (часть эл-тов должны быть " +
//                "отрицательными): ");
//        int e1 = scanner.nextInt();
//        arr[0] = e1;
//        System.out.print("Введите второй элемент массива: ");
//        int e2 = scanner.nextInt();
//        arr[1] = e2;
//        System.out.print("Введите третий элемент массива: ");
//        int e3 = scanner.nextInt();
//        arr[2] = e3;
//        System.out.print("Введите четвертый элемент массива: ");
//        int e4 = scanner.nextInt();
//        arr[3] = e4;
//        System.out.print("Введите пятый элемент массива: ");
//        int e5 = scanner.nextInt();
//        arr[4] = e5;
//        System.out.print("Введите шестой элемент массива: ");
//        int e6 = scanner.nextInt();
//        arr[5] = e6;
//        System.out.print("Введите седьмой элемент массива: ");
//        int e7 = scanner.nextInt();
//        arr[6] = e7;
//        System.out.print("Введите восьмой элемент массива: ");
//        int e8 = scanner.nextInt();
//        arr[7] = e8;
//
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        List<Integer> newArr = new ArrayList<>();
////        newArr.add("111");
////        newArr.add("112");
////        newArr.add("113");
////        System.out.println(a.toString());
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
////                newArr.add(Integer.valueOf(arr[i]));
////                newArr.set(i, Integer.valueOf(arr[i]));
//                newArr.add(arr[i]);
////            } else {
////                continue;
//            }
//            i++;
//        }
//        System.out.println(newArr.toString());
//    }
//}
////        Конец Примера 5 КККККККККККККККК








////        Пример 4 ППППППППППППППППППППППППППППППППППП Массив в массиве 3
////  https://translated.turbopages.org/proxy_u/en-ru.ru.29f25ce8-64adadee-e288e803-74722d776562/https/stackoverflow.com/questions/51447573/fill-array-with-elements-from-another-array
//public class Draft_Task1_3_2_9 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
//                "массив, но без отрицательных чисел\n\nРешение: ");
//        int[] arr = new int[] {4, 6, 1, 2, 1, 2, 1, 2, 3, 5, 4, 7, 4, 1, 5, 1, 5, 6};
//        int[] newArr1 = new int[2];
//        newArr1[0] = arr[2];
//        newArr1[1] = arr[3];
//        System.out.println(Arrays.toString(newArr1));
//
//        // или
//        int[] newArr2 = Arrays.copyOfRange(arr, 2, 4);
//        System.out.println(Arrays.toString(newArr2));
//
//    }
//}
////        Конец Примера 4 КККККККККККККККК








////        Пример 3 ППППППППППППППППППППППППППППППППППП Массив в массиве 2
////  https://translated.turbopages.org/proxy_u/en-ru.ru.29f25ce8-64adadee-e288e803-74722d776562/https/stackoverflow.com/questions/51447573/fill-array-with-elements-from-another-array
//public class Draft_Task1_3_2_9 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
//                "массив, но без отрицательных чисел\n\nРешение: ");
//        int[] a = {1, 2, 3, 4};
//        int[] b = new int[100];
//        for (int i = 0; i < b.length; i += a.length) {
//            System.arraycopy(a, 0, b, i, 4);
//        }
//        System.out.println(Arrays.toString(b));
//    }
//}
////        Конец Примера 3 КККККККККККККККК








////        Пример 2 ППППППППППППППППППППППППППППППППППП Массив в массиве 1, видео youtube
////  https://youtu.be/BONaPdqaaEg
//public class Draft_Task1_3_2_9 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
//                "массив, но без отрицательных чисел\n\nРешение: ");
//        double[] mas1 = new double[15];
//
//        int positiveNum = 0;
//        int i1 = 0;
//        for (double element1:mas1) {
//            mas1[i1] = Math.random() * 100 / 50;
//            if (mas1[i1] > 0) {
//                positiveNum++;
//            }
//            i1++;
//        }
//        System.out.println("Первый массив:");
//        System.out.println(Arrays.toString(mas1));
//        System.out.println();
//
//        double[] mas2 = new double[positiveNum];
//        int i2 = 0;
//        int i3 = 0;
//        for (double element2:mas1) {
//            if (mas1[i2]>0) {
//                mas2[i3] = mas1[i2];
//                i2++;
//            }
//            i3++;
//        }
//        System.out.println("Второй массив:");
//        System.out.println(Arrays.toString(mas1));
//        System.out.println();
//    }
//}
////        Конец Примера 2 КККККККККККККККК








////        Пример 1 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_2_9 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.  Напишите метод, который принимает массив чисел, а возвращает исходный " +
//                "массив, но без отрицательных чисел\n\nРешение: ");
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Введите первую строку: ");
//            String s1 = scanner.nextLine();
//            System.out.print("Введите вторую строку: ");
//            String s2 = scanner.nextLine();
//
//
//        int[] a = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
//        System.out.println(Arrays.toString(a));
//    }
//
//    static String findLongestString(String s1, String s2) {
//        String longest = s1;
//        if (s2.length() > longest.length()) {
//            longest = s2;
//        }
//        System.out.println("Самая длинная строка: " + longest);
//
//        return longest;
//    }
//}
////        Конец Примера 1 КККККККККККККККК








