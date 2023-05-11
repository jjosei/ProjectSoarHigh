public class Main {
    public static void main(String[] args) {
        Aircraft helicopter = new Aircraft();
        FlyingObjects flyerr = helicopter;
        movement muevee = helicopter;


        muevee.accelerate();


        muevee.land();
    }
}
