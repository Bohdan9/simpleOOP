public abstract class Employee {

    public int id_counter;
    private long id;
    private String name;

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Counter(){
        id_counter++;
        id = id_counter;
    }


    public abstract double Avgmonthsalary();

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", Avgmonthlysalary= " + Avgmonthsalary();

    }
}
