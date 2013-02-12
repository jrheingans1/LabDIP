package dip.lab2;


public class BaggageServiceTipCalculator {
    private double min = 0.00;
    private double max = 100.00;
   
    private double good = 0.20;
    private double fair = 0.15;
    private double poor = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 5.00; // set default value
    }

    public double getTipForBaggeHandler() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + good);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fair);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poor);
                break;
        }

        return tip;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
