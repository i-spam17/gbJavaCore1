package homeWork3;

import java.util.ArrayList;

public abstract class Fruit {
    private float weight;
    private int quantity;
    private ArrayList<Fruit> fruitArrayList = new ArrayList<>();

    public Fruit(float weight, int quantity) {
        this.weight = weight;
        this.quantity = quantity;
    }

    public void addFruit(Fruit fruit) {
        fruitArrayList.add(fruit);
    }

    public ArrayList<Fruit> getFruitArrayList() {
        return fruitArrayList;
    }

    public void setFruitArrayList(ArrayList<Fruit> fruitArrayList) {
        this.fruitArrayList = fruitArrayList;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    abstract Fruit[] addFruitsArray();

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", quantity=" + quantity +
                '}';
    }
}
