package homeWork1;

public class Man extends Competitors implements CanRun, CanJump {

    public Man(String name, int jumping, int endurance) {
        super(name, jumping, endurance);
        System.out.println("Создался новый Человек- " + name + ". Параметры: прыгучесть- " + jumping + ", выносливость- " + endurance);
    }

    @Override
    public void run(Treadmill treadmill) {
        if (getEndurance() >= treadmill.getLength()) {
            System.out.println("Человек- " + getName() + " бежит по беговой дорожке!");
        } else {
            System.out.println("Человек- " + getName() + " не может пробежать по беговой дорожке!");
        }
    }

    @Override
    public void jump(Wall wall) {
        if (getJumping() >= wall.getHeight()) {
            System.out.println("Человек- " + getName() + " прыгает через стену!");
        } else {
            System.out.println("Человек- " + getName() + " не может перепрыгнуть через стену!");
        }
    }
}
