public class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + name + ". I am Teacher of " + subject + " and, I am " + age +" years old.");
    }
}
