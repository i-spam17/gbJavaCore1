package homeWork3;

public class Orange extends Fruit {
    public Orange(float weight, int quantity) {
        super(1.5f, quantity);
        System.out.println("Вырастили апельсины в количестве " + quantity + ", весом каждый - " + weight);
    }

    @Override
    Orange[] addFruitsArray() {
        Orange[] orange = new Orange[getQuantity()];
//        for (int i = 0; i < orange.length; i++) {
//            orange[i] = ("orange" + i);
//        }
        return orange;
    }

}
