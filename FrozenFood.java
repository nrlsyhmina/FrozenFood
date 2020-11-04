public class FrozenFood
{
    private String foodName;
    private double amountCharge;
    
    public FrozenFood(String fN, double aC) {
        foodName = fN;
        amountCharge = aC;
    }
    
    public String getFoodName() {
        return foodName;
    }
    
    public double getAmountCharge() {
        return amountCharge;
    }
    
    public double calcGovTax() {
        return amountCharge*5/100;
    }
    
    public String toString() {
        return " " + foodName +"\t\t:" + amountCharge +"\t\t" + calcGovTax();
    }
}
