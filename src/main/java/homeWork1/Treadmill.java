package homeWork1;

public class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
        System.out.println("Создалось препятствие - Дорожка, длинной - " + length);
    }

    public int getLength() {
        return length;
    }

    public void runOnATreadmill(CanRun runner) {
        runner.run(Treadmill.this);
    }
}
