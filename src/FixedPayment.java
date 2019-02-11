public class FixedPayment extends Employee {
   public int fixed_payment;

    public FixedPayment(long id, String name, int fixed_payment) {


        super(id, name);
        this.fixed_payment = fixed_payment;
    }


    @Override
    public double Avgmonthsalary(){
        return fixed_payment;
    }
}
