public class VarTest {

    public void variablePractice(String name, int age, String clg, int year, String topic) {
        System.out.println("My name is " + name + "I am " + age+ " years old graduated from " + clg + " in "+ year +" currently working on " + topic);
    }

    public static void main(String[] args) {
        int age = 25, year = 2024;
        String name = "Arun", clg ="HITK", topic= "Java and React";

        VarTest obj = new VarTest();
        obj.variablePractice(name, age, clg, year, topic);
    }
}
