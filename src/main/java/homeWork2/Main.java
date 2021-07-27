package homeWork2;

public class Main {
    public static int dimensionArrayX = 4;
    public static int dimensionArrayY = 4;

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] validSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        String[][] invalidSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8", "123"},
                {"13", "14", "15", "16"},
        };

        String[][] validSymbolsArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] invalidSymbolsArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "|", "12"},
                {"13", "14", "15", "16"}};

        System.out.println(transformArrayAndSum(validSizeArray));

        System.out.println(invalidSizeArray.length);
        System.out.println(invalidSizeArray[1].length);
        try {
            System.out.println(transformArrayAndSum(invalidSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        System.out.println(transformArrayAndSum(validSymbolsArray));
        System.out.println(transformArrayAndSum(invalidSymbolsArray));
    }

    public static int transformArrayAndSum(String[][] myArray) throws MyArraySizeException, MyArrayDataException {

        for (int i = 0; i < myArray.length; i++) {
            if (myArray.length != dimensionArrayX) {
                throw new MyArraySizeException("Заданная высота массива не соответствует " + dimensionArrayX);
            }
        }


        for (String[] strings : myArray) {
            for (int j = 0; j < myArray.length; j++) {
                if (strings.length != dimensionArrayY) {
                    throw new MyArraySizeException("Заданная длина массива не соответствует " + dimensionArrayY);
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не верный символ в " + i + " строке, " + j + " столбце массива!");
                }
            }
        }
        return sum;
    }
}