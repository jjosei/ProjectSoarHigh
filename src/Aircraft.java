public class Aircraft extends FlyingObjects implements movement{
    @Override
    public void takeoffTime() {
        System.out.println("Ranges between 1 to 3 minutes for all aircraft");
    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName() + " is taking off.");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " is increasing speed.");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing.");
    }
}
