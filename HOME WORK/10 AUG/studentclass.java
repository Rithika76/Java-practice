import java.util.Scanner;

class Student {
    int id;
    String name;
    int m1, m2, m3, m4, m5;
    int tot;
    double avg;
    char g;
    void acceptDetails(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter 5 marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        TAndA();
        Grade();
    }
    void TAndA() {
        tot = m1 + m2 + m3 + m4 + m5;
        avg = tot / 5.0;
    }
    void Grade() {
        if (avg >= 90) g = 'A';
        else if (avg >= 75) g = 'B';
        else if (avg >= 60) g = 'C';
        else if (avg >= 50) g = 'D';
        else g = 'F';
    }
    void Result() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5);
        System.out.println("Tot: " + tot);
        System.out.println("Avg: " + avg);
        System.out.println("G: " + g);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.acceptDetails(sc);
        s1.Result();
    }
}
