package homeWork1;

public class Robot extends Competitors implements CanJump, CanRun {

    public Robot(String name, int jumping, int endurance) {
        super(name, jumping, endurance);
        System.out.println("Создался новый Робот- " + name + ". Параметры: прыгучесть- " + jumping + ", выносливость- " + endurance);
    }

    @Override
    public void jump(Wall wall) {
        if (getJumping() >= wall.getHeight()) {
            System.out.println("Робот- " + getName() + " прыгает через стену, высотой - " + wall.getHeight());
        } else {
            System.out.println("Робот- " + getName() + " не может перепрыгнуть через стену, высотой - " + wall.getHeight());
        }
    }

    @Override
    public void run(Treadmill treadmill) {
        if (getEndurance() >= treadmill.getLength()) {
            System.out.println("Робот- " + getName() + " бежит по беговой дорожке, длинной - " + treadmill.getLength());
        } else {
            System.out.println("Робот- " + getName() + " не может пробежать по беговой дорожке, длинной - " + treadmill.getLength());
        }
    }


}




