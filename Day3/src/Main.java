public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Arun", 25);
        p1.introduce();

        Student std1 = new Student("Rohit", 22, "Heritage Institute of Technology");
        std1.introduce();

        Teacher t1 = new Teacher("Mohan Upadhayay", 62, "Quantum Mechanics");
        t1.introduce();

        Employee emp  = new Employee("Anand", 27, 28000, 6000);
        emp.introduce();
        System.out.println("Calculated Salary: " + emp.calculateSalary());
    }
}