package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Bear simpleBear = new Bear("Tó");
        CrankyBear crankyBear = new CrankyBear("Sad Tó");
        DrunkBear drunkbear = new DrunkBear("Party Tó");

        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.rechargeBatteries();
        simpleBear.talk();
        System.out.println(simpleBear.getBatteryLevel());
        System.out.println();

        crankyBear.talk();
        crankyBear.talk();
        crankyBear.talk();
        crankyBear.talk();
        crankyBear.talk();
        crankyBear.talk();
        crankyBear.talk();
        crankyBear.talk();
        System.out.println();

        System.out.println(drunkbear.getRandomNumber());
        drunkbear.talk();
        System.out.println(drunkbear.getRandomNumber());
        System.out.println();
        drunkbear.talk();
        System.out.println(drunkbear.getRandomNumber());
        System.out.println();
        drunkbear.talk();
        System.out.println(drunkbear.getRandomNumber());
        System.out.println();
        drunkbear.talk();
        System.out.println(drunkbear.getRandomNumber());
        System.out.println();

        Shop shop1 = new Shop("Bear Store");



        System.out.println(shop1.createBear("Bear 1").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 2").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 3").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 4").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 5").getTypeOfBear());
        System.out.println();
        System.out.println(shop1.createBear("Bear 6").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 7").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 8").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 9").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 10").getTypeOfBear());
        System.out.println();
        System.out.println(shop1.createBear("Bear 11").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 12").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 13").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 14").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 15").getTypeOfBear());
        System.out.println();
        System.out.println(shop1.createBear("Bear 11").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 12").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 13").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 14").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 15").getTypeOfBear());
        System.out.println();
        System.out.println(shop1.createBear("Bear 11").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 12").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 13").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 14").getTypeOfBear());
        System.out.println(shop1.createBear("Bear 15").getTypeOfBear());
        System.out.println();
        System.out.println(shop1.createBear("Bear 15").getTypeOfBear());



//        System.out.println(crankyBear.getName());
        System.out.println();
        System.out.println(drunkbear.getBatteryLevel());

        Bear[] bears = new Bear[20];

        for (int i= 0; i< bears.length; i++){
            bears[i] = shop1.createBear("bear");
        }

        System.out.println(drunkbear.getTypeOfBear());

    }
}
