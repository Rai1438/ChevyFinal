public class Chevy {
    private int year;
    private double mileage;
    private double fuelEfficiency;
    private double basePrice;
    private String name;
    private String color;
    private boolean luxury;
    private boolean fourwheel;
    private boolean sport;
    private String make;
    private double priceWithUpgrades;
    private double GrandTotal;

    public Chevy(){
        make = "Chevorlet";
        name = "Trax";
        year = 2021;
        mileage = 0;
        fuelEfficiency = 35.0;
        basePrice = 16000.0;
        color = "White";
    }
    public Chevy(int year, double mileage, double fuelEfficiency, double basePrice, String name, String color, boolean luxury, boolean fourwheel, boolean sport){
        this.make = "Chevorlet";
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.name = name;
        this.color = color;
        this.luxury = luxury;
        this.fourwheel = fourwheel;
        this.sport = sport;

    }
    public void calcPrice(){
        double taxRate = .122;
        double luxuryPrice = .2* basePrice;
        double fourwheelPrice = 3500.0;
        double sportPrice = .15* basePrice;

        double Total = basePrice;
        if (luxury == true){
            Total += luxuryPrice;
        }
        if (fourwheel == true){
            Total += fourwheelPrice;
        }
        if (sport == true){
            Total += sportPrice;
        }
        setPriceWithUpgrades(Total);
        setGrandTotal(Total + (Total * taxRate));
    }

    public int compareTo(Chevy otherChevy){
        if(this.mileage < otherChevy.mileage){
            return -1; // This Chevy has lower mileage
        }
        else if (this.mileage > otherChevy.mileage) {
            return 1;  // This Chevy has higher mileage
        }
        else {
            return 0;  // Both Chevys have the same mileage
        }
    }
    public boolean equals(Chevy other) {
        return this.make.equals(other.make) &&
                this.color.equals(other.color) &&
                this.mileage < 200 && other.mileage < 200;
    }
    public String toString (){
        String str = "";
        str += year + " Chevrolet " + name + "(" + color + ")\n";
        str += "\tBase Price:\t\t$" + basePrice + "\n";
        str += "\tMiles:\t\t\t" + mileage + "\n";
        str += "\tFuel Efficiency: \t" + fuelEfficiency + "mpg" + "\n";
        str += "\tPackages:";
        str += "\n\t\t";
        if (luxury) {
            str += "-Luxury Package\n\t\t";
        }
        if (fourwheel){
            str += "-FWD Package\n\t\t";
        }
        if (sport) {
            str += "-Sports Package\n\t\t";
        }
        if (!sport && !fourwheel && !luxury ) {
            str += "- None\n\t\t";
        }
        str += "\n";
        str += "\tPrice With Upgrades:\t" + getPriceWithUpgrades() + "\n\t";
        str += "Final Price With Tax:\t" + getGrandTotal() + "\n\t";
        return str;
    }

    public String getName() {
        return name;
    }
    public int getYear(){
        return year;
    }
    public double getMileage(){
        return mileage;
    }
    public double getfuelEfficiency(){
        return fuelEfficiency;
    }
    public double getBasePrice(){
        return basePrice;
    }
    public String getColor(){
        return color;
    }
    public String getMake(){
        return make;
    }
    public boolean getLuxury(){
        return luxury;
    }
    public boolean getfourWheel(){
        return fourwheel;
    }
    public boolean getSport(){
        return sport;
    }
    public double getPriceWithUpgrades(){
        return priceWithUpgrades;
    }
    public double getGrandTotal(){
        return GrandTotal;
    }
    /////////////////// SETTERS /////////////////////////
    public void setYear(int newYear) {
        year = newYear;
    }
    public void setMileage(double newMileage){
        mileage = newMileage;
    }
    public void setFuelEfficiency(double newFuelEfficiency){
        fuelEfficiency = newFuelEfficiency;
    }
    public void setBasePrice(double newBasePrice){
        basePrice = newBasePrice;
    }
    public void setModel(String newName) {
        name = newName;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void setluxury(boolean newluxury){
        luxury = newluxury;
    }
    public void setfourwheel(boolean newfourwheel){
        fourwheel = newfourwheel;
    }
    public void setsport(boolean newsport){
        sport = newsport;
    }
    public void setPriceWithUpgrades(double newPriceWithUpgrades){
        priceWithUpgrades = newPriceWithUpgrades;
    }
    public void setGrandTotal(double newGrandTotal){
        GrandTotal = newGrandTotal;
    }
}
