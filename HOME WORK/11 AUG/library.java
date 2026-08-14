import java.util.ArrayList;
import java.util.List;
abstract class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean isAvailable;

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }
    public abstract int getLoanPeriod();

    public void displayDetails() {
        System.out.println("Item ID      : " + itemId);
        System.out.println("Title        : " + title);
        System.out.println("Available    : " + isAvailable);
        System.out.println("Loan Period  : " + getLoanPeriod() + " days");
    }
}
interface Borrowable {
    void borrowItem();
    void returnItem();
}
class Book extends LibraryItem implements Borrowable {

    public Book(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    public int getLoanPeriod() {
        return 14; 
    }

    @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book \"" + title + "\" borrowed successfully.");
        } else {
            System.out.println("Book \"" + title + "\" is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("Book \"" + title + "\" returned successfully.");
    }
}
class Magazine extends LibraryItem {

    public Magazine(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    public int getLoanPeriod() {
        return 0; 
    }
}
class DVD extends LibraryItem implements Borrowable {

    public DVD(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    public int getLoanPeriod() {
        return 7; 
    }

    @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD \"" + title + "\" borrowed successfully.");
        } else {
            System.out.println("DVD \"" + title + "\" is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("DVD \"" + title + "\" returned successfully.");
    }
}
class Librarian {
    private List<LibraryItem> items;

    public Librarian() {
        items = new ArrayList<>();
    }
    public void addItem(LibraryItem item) {
        items.add(item);
    }
    public void displayAllItems() {
        System.out.println("\n===== LIBRARY ITEMS =====");

        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println("-------------------------");
        }
    }
}
public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book book = new Book("Java Programming", 101);
        Magazine magazine = new Magazine("Tech Monthly", 102);
        DVD dvd = new DVD("Java Tutorial DVD", 103);
        Librarian librarian = new Librarian();
        librarian.addItem(book);
        librarian.addItem(magazine);
        librarian.addItem(dvd);
        librarian.displayAllItems();
        System.out.println("BORROWING");
        book.borrowItem();
        dvd.borrowItem();
        System.out.println("Attempting to borrow Magazine \"" 
                           + magazine.title + "\"...");

        if (magazine instanceof Borrowable) {
            ((Borrowable) magazine).borrowItem();
        } else {
            System.out.println("Magazine \"" + magazine.title
                    + "\" cannot be borrowed. It is reference-only.");
        }
        librarian.displayAllItems();
        System.out.println("\n===== RETURNING ITEMS =====");
        book.returnItem();
        dvd.returnItem();
        librarian.displayAllItems();
    }
}
