package entidade;

public class TaxiRide {

    private Boolean isNightSurcharge;
    private Long distanceInMile;

    public Boolean getNightSurcharge() {
        return isNightSurcharge;
    }

    public void setIsNightSurcharge(Boolean nightSurcharge) {
        isNightSurcharge = nightSurcharge;
    }

    public Long getDistanceInMile() {
        return distanceInMile;
    }

    public void setDistanceInMile(Long distanceInMile) {
        this.distanceInMile = distanceInMile;
    }
}
