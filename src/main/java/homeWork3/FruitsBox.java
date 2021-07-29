package homeWork3;


public class FruitsBox<T> {
    private T[] fruitsArray;
    private int sizeBox;
    private Fruit fruit;

    public FruitsBox(T[] fruitsArray, int sizeBox, Fruit fruit) {
        if (fruit.getQuantity() <= sizeBox) {
            this.sizeBox = sizeBox;
        } else {
            System.out.println("Коробка слишком маленькая!");
        }
        this.fruitsArray = fruitsArray;
        this.fruit = fruit;
        System.out.println("Создалась коробка размером " + sizeBox);
    }

    public void pourFruitIntoBox(FruitsBox<T> fruitsBox) {
        fruit.getFruitArrayList().addAll(fruit.getFruitArrayList());
        fruit.getFruitArrayList().clear();
    }

    public float calcWeight() {
        return fruit.getQuantity() * fruit.getWeight();
    }

    public boolean compareBox(FruitsBox fruitsBoxToCompare) {
        return Math.abs(calcWeight() - fruitsBoxToCompare.calcWeight()) <= 0.001;
    }

//    public T[] replaceFruits () {
//        return null;
//    }

}
