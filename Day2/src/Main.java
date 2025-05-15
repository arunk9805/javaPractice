import com.arun.models.Book;
import com.arun.models.Student;
import com.arun.models.Library;

public class Main{
    public static void main(String[] args) {
        Book vardan = new Book("Vardan", "Prem Chand", 200);
        vardan.setPrice(500);
        System.out.println(vardan.getPrice());
        int[] marks = {89,99,97,95,96};
        Student std = new Student("Arun", "001", marks);
//        System.out.print(std);
        Library lib = new Library();
        lib.addBook(new Book("Pride & Justice", "Albert", 600));
        lib.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 1200));
        lib.addBook(new Book("1984", "George Orwell", 1000));
        lib.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1500));
        lib.listBook();
    }
}