package academy.mindswap;

public class DrunkBear extends Bear{
    private int randomNumber;
    private String typeOfBear = "Drunk Bear";


    public DrunkBear(String name) {
        super(name);
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    @Override
    public void talk() {

        this.randomNumber = (int) (Math.random() * (10 - 2)) + 2;

        if(getBatteryLevel()>0 && randomNumber>2){
            System.out.println("I love you!");
            setBatteryLevel(getBatteryLevel()-10);
            return;
        }
        if(getBatteryLevel()>0 && randomNumber<=2){
            System.out.println("I'm drunk, don't bother me!");
            return;
        }
        System.out.println("Batteries died. Please change them.");
    }

    public String getTypeOfBear() {
        return typeOfBear;
    }

}
