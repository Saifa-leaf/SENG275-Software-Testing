

public class SICI {
    public double SI(double principle, double interestRate, int time) {
        double r = interestRate/100;
        return principle*r*time;
    }

    public double CI(double principle, double rateOfInterest, int time) {
        double r = rateOfInterest/100;
        double u = Math.pow(1+r, time);
        return principle*u-principle;
    }

}