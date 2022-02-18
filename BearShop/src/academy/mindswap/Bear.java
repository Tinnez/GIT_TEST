package academy.mindswap;

public class Bear {
    private String name;
    private int batteryLevel;
    private String typeOfBear = "Simple Bear";


    public Bear(String name) {
        this.name = name;
        this.batteryLevel = 100;
    }

    public String getName() {
        return name;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void talk(){
        if(this.batteryLevel>0){
            System.out.println("I love you!");
            this.batteryLevel -= 10;
            return;
        }
        System.out.println("Batteries died. Please change them.");
    }

    public void rechargeBatteries(){
        setBatteryLevel(100);
    }

    public String getTypeOfBear() {
        return typeOfBear;
    }
}
