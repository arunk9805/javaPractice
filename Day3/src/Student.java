public class Student extends Person{
    private String university;

    public Student (String name, int age, String university) {
        super(name,age);
        this.university = university;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + name + ". I have completed my graduation from " + university + " and, I am " + age +" years olds.");
    }
}
