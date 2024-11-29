public class Dolphin extends Animal implements Swim{
    private int swimmingSpeed;
    private String color;

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I am eating delicious fish");
    }
    public Dolphin(String Dolphin){
        setNameOfAnimal(Dolphin);
    }

    @Override
    public void swimming() {
    System.out.println("Dolphin: I am swimming at the "+swimmingSpeed+" of 70 nautical miles per hour");
    }
}
