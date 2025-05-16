public class Employee extends Person implements Payable {
    private double baseSalary;
    private double bonus;

    public Employee(String name, int age, double baseSalary, double bonus) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", an employee. My total salary is ₹" + calculateSalary());
    }
}
