package homeWork3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример числового массива:");
        ChangeArray<Integer> integerChangeArray = new ChangeArray<>(2, 3, 1, 2, 3, 4, 5);
        integerChangeArray.changePlaceElementsArray();

        System.out.println("Пример символьного массива:");
        ChangeArray<Character> characterChangeArray = new ChangeArray<>(1, 2, '@', '#', '3', '$', '%');
        characterChangeArray.changePlaceElementsArray();
        System.out.println("------------------");

        Fruit apple = new Apple(1.0f, 5);
        Fruit orange = new Orange(1.5f, 3);

        System.out.println("Создался массив яблок - " + Arrays.toString(apple.addFruitsArray()));

        FruitsBox<Apple> appleFruitsBox1 = new FruitsBox(apple.addFruitsArray(), 3, apple);
        FruitsBox<Orange> orangeFruitsBox1 = new FruitsBox(orange.addFruitsArray(), 5, orange);
        FruitsBox<Apple> appleFruitsBox2 = new FruitsBox(apple.addFruitsArray(), 10, apple);

        System.out.println("вес коробки с яблоками равен - " + appleFruitsBox1.calcWeight());
        System.out.println("вес коробки с яблоками равен - " + orangeFruitsBox1.calcWeight());

        System.out.println("Сравниваем коробки - " + appleFruitsBox1.compareBox(orangeFruitsBox1));

        //создал массивы фруктов с помощью ArrayList
        apple.addFruit(apple);
        orange.addFruit(orange);

        //пересыпаю фрукты в коробки
        appleFruitsBox1.pourFruitIntoBox(appleFruitsBox2);

        //вопросы, на которые я не смог найти ответов:
        //1. как наполнить массив в методе addFruit , чтобы наглядно посмотреть результат работы метода в консоли?
        //2. в продолжении 1 вопроса - как распечатать результат работы метода pourFruitIntoBox?

    }


}
