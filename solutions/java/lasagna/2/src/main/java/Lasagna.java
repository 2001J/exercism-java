public class Lasagna {
 
    public int expectedMinutesInOven(){return 40;}

   
    public int remainingMinutesInOven(int minsInTheOven){
        return new Lasagna().expectedMinutesInOven() - minsInTheOven;
    }

    
    public int preparationTimeInMinutes(int layers){return 2 * layers;}

    
    public int totalTimeInMinutes(int layers, int minsInTheOven){
        return new Lasagna().preparationTimeInMinutes(layers) + minsInTheOven;
    }
}
