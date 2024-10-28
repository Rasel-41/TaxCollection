package q1;

public class TaxCollection {
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;
    public static final double RATE1 = 0.10;
    public static final double RATE2 = 0.25;
    public static final double RATE1_SINGLE_LIMIT = 32000;
    public static final double RATE_MARRIED_LIMIT = 64000;
    public double income;
    public int status;

    public TaxCollection(double income, int status) {
      this.income = income;
      this. status = status;
    }

    public double getTax() {

        double tax_1 = 0;
        double tax_2 = 0;
        if (status == SINGLE) {
            if (income <= RATE1_SINGLE_LIMIT) {
                tax_1 = income * RATE1;
            } else {
                tax_1 = RATE1 * RATE1_SINGLE_LIMIT;
                tax_2 = RATE_MARRIED_LIMIT * (income - RATE1_SINGLE_LIMIT);
            }
        }
        else {
            if(income<=RATE_MARRIED_LIMIT){
                tax_1 = RATE1*income;
            }
            else {
                tax_1 = RATE1*RATE_MARRIED_LIMIT;
                tax_2 = RATE2*(income-RATE_MARRIED_LIMIT);
            }
        }
return tax_1+tax_2;
    }

}
