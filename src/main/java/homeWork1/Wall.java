package homeWork1;

public class Wall {
    int height;

    public Wall(int height) {
        this.height = height;
        System.out.println("Создалось препятствие - Стена, высотой - " + height);
    }

    public int getHeight() {
        return height;
    }

    public void jumpThroughWall(CanJump jumper) {
        jumper.jump(this);
    }

}
