import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String [] args){








        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new FixedPayment(1,"Boohdan", 2000));
        employeeList.add(new HourlyWage(2,"Artur", 100));
        employeeList.add(new FixedPayment(3,"Kate", 2700));
        employeeList.add(new FixedPayment(4,"Sofa", 1900));
        employeeList.add(new HourlyWage(5,"Slavik", 125));
        employeeList.add(new HourlyWage(6,"Roman", 100));

        Collections.sort(employeeList, new COmporator());
        for (int i = 0; i < 5; i++) {
            System.out.println(employeeList.get(i));;

        }
        for (int i = employeeList.size()-1; i > employeeList.size()-4; i--) {
            System.out.println(employeeList.get(i).getId());

        }








    }
}
