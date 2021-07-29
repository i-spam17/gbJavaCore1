package homeWork3;

public class Apple extends Fruit {

    public Apple(float weight, int quantity) {
        super(weight, quantity);
        System.out.println("Вырастили яблоки в количестве " + quantity + ", весом каждое - " + weight);
    }

    @Override
    Apple[] addFruitsArray() {
        Apple[] apples = new Apple[getQuantity()];
//        for (int i = 0; i < apples.length; i++) {
//            apples[i] = ("apple" + i);
//        }
//        System.out.println("Сложили яблоки в кучу - " + Arrays.toString(apples));
        return apples;

    }


}
