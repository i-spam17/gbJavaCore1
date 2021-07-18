package homeWork1;

public class Competitors {
    private final String name;
    private final int jumping;
    private final int endurance;

    public Competitors(String name, int jumping, int endurance) {
        this.name = name;
        this.jumping = jumping;
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public int getJumping() {
        return jumping;
    }

    public int getEndurance() {
        return endurance;
    }

}
