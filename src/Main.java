import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Aircraft helicopter = new Aircraft();
        movement muevee = helicopter;


        //muevee.accelerate();
        //muevee.land();

        LinkedList<movement> locomote = new LinkedList<>();
        locomote.add(helicopter);
        locomote.add(muevee);

        takeoffer(locomote);
        accelerator(locomote);
        lander(locomote);

    }

    private static void takeoffer(LinkedList<movement> muevee) {

        for (var vehicle : muevee) {
            vehicle.takeoff();
        }
    }

    private static void accelerator(LinkedList<movement> muevee) {

        for (var vehicle : muevee) {
            vehicle.accelerate();
        }
    }

    private static void lander(LinkedList<movement> muevee) {

        for (var vehicle : muevee) {
            vehicle.land();
        }
    }
}
