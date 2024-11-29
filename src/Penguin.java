public class Penguin extends Animal implements Swim, Walk{
    public Penguin(String Penguin){
        setNameOfAnimal(Penguin);
    }
    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    private boolean isSwimming;
    private  int walkSpeed;
    private int swimSpeed;
    @Override
    public void eatingFood(){
        System.out.println("Penguin: I am eating food");
    }
    @Override
    public void eatingCompleted() {
     System.out.println("Penguin: I have finished eating delicious fish");
    }

    @Override
    public void swimming() {
    System.out.println("Penguin is swimming");
    }

    @Override
    public void walking() {
    System.out.println("Penguine is walking");
    }
}
