public class HourlyWage extends Employee {

    private int hourly_rate;

    public HourlyWage(long id, String name, int hourly_rate) {

        super(id, name);
        this.hourly_rate = hourly_rate;
    }


    @Override
    public double Avgmonthsalary(){
        return 20.8 *8 * hourly_rate;
    }
}
