package homeWork3;

//import java.util.Arrays;
//
//public class ChangeArray<T> {
//    private int arrayLength;
//    public int elementArrayOne;
//    public int elementArrayTwo;
//    public int changeVar;
//
//    public ChangeArray(int arrayLength, int elementArrayOne, int elementArrayTwo) {
//        this.arrayLength = arrayLength;
//        this.elementArrayOne = elementArrayOne;
//        this.elementArrayTwo = elementArrayTwo;
//    }
//
//    public void changePlaceElementsArray() {
//        int[] testArr = new int[arrayLength];
//        for (int i = 0; i < arrayLength; i++) {
//            testArr[i] = i;
//        }
//        System.out.println("Создаем тестовый массив: \n" + Arrays.toString(testArr));
//        changeVar = testArr[elementArrayOne];
//        testArr[elementArrayOne] = testArr[elementArrayTwo];
//        testArr[elementArrayTwo] = changeVar;
//        System.out.println("Меняем элемент массива - " + elementArrayOne + " на элемент массива - " + elementArrayTwo +
//                "\n" + Arrays.toString(testArr));
//    }
//}

import java.util.Arrays;

public class ChangeArray<T> {
    private T[] testArr;
    public int elementArrayOne;
    public int elementArrayTwo;

    @SafeVarargs
    public ChangeArray(int elementArrayOne, int elementArrayTwo, T... testArr) {
        this.testArr = testArr;
        this.elementArrayOne = elementArrayOne;
        this.elementArrayTwo = elementArrayTwo;
    }

    public T[] getArray() {
        return testArr;
    }

    public void setArray(T[] array) {
        this.testArr = array;
    }

    public void changePlaceElementsArray() {
        System.out.println("Создаем тестовый массив: \n" + Arrays.toString(testArr));
        T changeVar = testArr[elementArrayOne];
        testArr[elementArrayOne] = testArr[elementArrayTwo];
        testArr[elementArrayTwo] = (T) changeVar;
        System.out.println("Меняем элемент массива - " + elementArrayOne + " на элемент массива - " + elementArrayTwo +
                "\n" + Arrays.toString(testArr));
    }

    @Override
    public String toString() {
        return "ChangeArray{" +
                "testArr=" + Arrays.toString(testArr) +
                '}';
    }
}
