public class Dolphin extends Animal implements Swim{
    private int swimmingSpeed =30;
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
        System.out.println("Dolphin: I have eaten fish.");
    }
    public Dolphin(String Dolphin){
        setNameOfAnimal(Dolphin);
    }
    public Dolphin(){
        this("Dolphin");
    }
    @Override
    public void swimming() {
    System.out.println("Dolphin: I am swimming at the speed "+swimmingSpeed);
    }
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

}
