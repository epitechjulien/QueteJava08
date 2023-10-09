public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    // Eagle at the floor.
    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf(this.getName() + " takes off in the sky.\n");
        }
    }

    @Override
    public int ascend(int altitude) {
        if (this.flying) {
            this.altitude += altitude;
            System.out.printf(this.getName() + " flies upward, altitude: " + this.altitude + "\n");
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        if (this.flying && this.altitude > 0) {
            System.out.printf("glides into the air.\n");
        }
    }

    @Override
    public int descend(int altitude) {
        if (this.flying) {
            this.altitude -= altitude;
            System.out.printf(this.getName() + " flies downward, altitude: " + this.altitude + "\n");
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude > 1) {
            System.out.printf(this.getName() + " is too high, it can't land.\n");
        } else {
            System.out.printf(this.getName() + " lands on the ground.\n");
            this.flying = false;
        }
    }

}
