import static java.lang.Math.floor;

public class Factory {
    static int[] productionSpeed = Machine.getSpeed();
    static int items = 28;
    static int produced = 0;
    static float sum;
    public static void addMachine(){

    }
    public static void produce(){
        System.out.println("dzień: Produced: Produced total:");
        int i = 0;
        double dayliProducts;
        do{
            i++;
            dayliProducts =floor(sum);

            items -= dayliProducts;
            produced += dayliProducts;

            System.out.println( i  +"         "+ dayliProducts + "              " +  produced);

        }while(items >= dayliProducts);
    }
    public static void calculatingProductionSpeed() {
        for(int i = 0; i < productionSpeed.length; i++) sum += productionSpeed[i];
        sum = sum/productionSpeed.length;
    }
}
