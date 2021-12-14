import static java.lang.Math.floor;

public class Main {
    static int items = 28;
    static int produced = 0;
    static int[] productionSpeed = {2,3,5};
    static float sum;
    float avreageSpeed;
    public static void main(String[] args) {
        calculatingProductionSpeed();

        System.out.println("dzień: Produced: Produced total:");
        calculatingProductsDone();
        System.out.println();
        }

    public static void calculatingProductionSpeed() {
        for(int i = 0; i < productionSpeed.length; i++) sum += productionSpeed[i];
        sum = sum/productionSpeed.length;
    }

    public static void calculatingProductsDone(){
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
}
