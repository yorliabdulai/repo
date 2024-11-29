
public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private int speed=40;
    private int soundLevel;

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public Tiger(String Tiger) {
        setNameOfAnimal(Tiger);
    }
    public Tiger(){
        this("Tiger");
    }
    @Override
    public void eatingCompleted() {
     System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am moving at the speed "+speed);
    }
}
