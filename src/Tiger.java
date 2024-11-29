
public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private int speed=40;
    private int soundLevelOfRoar;

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

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public Tiger(String Tiger) {
        setNameOfAnimal(Tiger);
    }

    @Override
    public void eatingCompleted() {
     System.out.println("Tiger: I have eaten meat");
    }

    @Override
    public void walking() {
     System.out.println("I am walking at the speed "+speed+"mph");
    }
}
