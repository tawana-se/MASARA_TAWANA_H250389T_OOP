package Lab04;

public class CompanyDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Kudzai", 2000);
        Manager m = new Manager("Nyasha", 3500, 800);
        Developer d = new Developer("Tatenda", 3000, 10);
        
        e.describe();
        m.describe();
        d.describe();
    }
}