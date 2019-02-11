import java.util.Comparator;

public class COmporator implements Comparator<Employee> {



    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.Avgmonthsalary() < o2.Avgmonthsalary()){
            return -1;

        }

        else if (o1.Avgmonthsalary()>o2.Avgmonthsalary()){
            return 1;
        }

        else
            return o1.getName().compareTo(o2.getName());

    }
}
