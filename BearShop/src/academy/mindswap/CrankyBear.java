package academy.mindswap;

public class CrankyBear extends Bear{

    private boolean sing;
    private String typeOfBear = "Cranky Bear";

    public CrankyBear(String name) {
        super(name);
        this.sing = false;
    }

    public boolean didSing() {
        return sing;
    }

    @Override
    public void talk() {
        if(getBatteryLevel()>50){
            System.out.println("I love you!");
            setBatteryLevel(getBatteryLevel() - 10);
            return;
        }
        sing();
    }

    public void sing(){
        if (!didSing()){
            System.out.println("And I find it kind of funny\n" +
                    "I find it kind of sad\n" +
                    "The dreams in which I'm dying\n" +
                    "Are the best I've ever had");
            this.sing = true;
            return;
        }
        System.out.println("I have already sang you a sad song :(");
    }

    public String getTypeOfBear() {
        return typeOfBear;
    }
}
