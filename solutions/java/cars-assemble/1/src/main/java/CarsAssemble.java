public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double prpH = 0.0;

        if(speed > 0 && speed < 5){
            prpH = speed * 221;
        }
        if(speed > 4 && speed < 9){
            prpH = speed * 221 * 0.9;
        }

        if(speed == 9){
            prpH = speed * 221 * 0.8;
        }

        if(speed == 10){
            prpH = speed * 221 * 0.77;
        }

        return prpH;
    }

    public int workingItemsPerMinute(int speed) {
         int wipM = (int)(productionRatePerHour(speed) / 60);
        return wipM;
    }
}
