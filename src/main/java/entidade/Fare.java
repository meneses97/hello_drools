package entidade;

public class Fare {
    private int nightSurcharge;
    private int rideFare;

    public Fare() {
        nightSurcharge = 0;
        rideFare = 0;
    }

    public int getNightSurcharge() {
        return nightSurcharge;
    }

    public void setNightSurcharge(int nightSurcharge) {
        this.nightSurcharge = nightSurcharge;
    }

    public int getRideFare() {
        return rideFare;
    }

    public void setRideFare(int rideFare) {
        this.rideFare = rideFare;
    }

    public int getTotalFare() {
        return nightSurcharge + rideFare;
    }
}
