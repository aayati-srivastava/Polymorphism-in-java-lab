// Base class
class LibraryUser {
    String name;

    LibraryUser(String name) {
        this.name = name;
    }

    void logEntry() {
        System.out.println(name + " entered the library.");
    }

    void displayInfo() {
        System.out.println("User: " + name);
    }
}

// Student subclass
class Student extends LibraryUser {
    Student(String name) {
        super(name);
    }

    void borrowBooks() {
        System.out.println(name + " borrowed books.");
    }

    void accessComputers() {
        System.out.println(name + " is accessing library computers.");
    }
}

// Faculty subclass
class Faculty extends LibraryUser {
    Faculty(String name) {
        super(name);
    }

    void reserveBooks() {
        System.out.println(name + " reserved books.");
    }

    void accessResearchDB() {
        System.out.println(name + " is accessing research databases.");
    }
}

// Guest subclass
class Guest extends LibraryUser {
    Guest(String name) {
        super(name);
    }

    void browseBooks() {
        System.out.println(name + " is browsing books.");
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        // Upcasting: store specialized users as general LibraryUser
        LibraryUser[] users = new LibraryUser[3];

        users[0] = new Student("Aayati");
        users[1] = new Faculty("Dr. Sharma");
        users[2] = new Guest("Visitor");

        System.out.println("📚 Library Entry Log 📚\n");

        for (LibraryUser user : users) {
            user.logEntry(); // Common operation for all users
            user.displayInfo();

            // Downcast if needed for specialized actions
            if (user instanceof Student) {
                ((Student) user).borrowBooks();
                ((Student) user).accessComputers();
            } else if (user instanceof Faculty) {
                ((Faculty) user).reserveBooks();
                ((Faculty) user).accessResearchDB();
            } else if (user instanceof Guest) {
                ((Guest) user).browseBooks();
            }

            System.out.println();
        }
    }
}
