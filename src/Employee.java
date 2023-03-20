public class Employee extends Hotel_admin{
    private String creditianals;


    public Employee(String creditianals) {
        super();
        this.creditianals = creditianals;
    }

    public String getCreditianals() {
        return creditianals;
    }

    public void setCreditianals(String creditianals) {
        this.creditianals = creditianals;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "creditianals='" + creditianals + '\'' +
                '}';
    }

    public void add(){

    }

    public void update(){

    }
}
