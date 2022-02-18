package academy.mindswap;

public class Shop {
    private String name;
    private static int count = 1;

    public Shop(String name) {
        this.name = name;
    }

    public Bear createBear(String bearName){
        if(count%2 == 0 && count%5!=0){
            Bear bear = new Bear(bearName);
//            System.out.println(count);
            count++;
            return bear;

        }
        else if(count%5 == 0){
            Bear crankyBear = new CrankyBear(bearName);
//            System.out.println(count);
            count++;
            return  crankyBear;
        }
        else{
            Bear drunkBear = new DrunkBear(bearName);
//            System.out.println(count);
            count++;
            return  drunkBear;
        }
    }
}
