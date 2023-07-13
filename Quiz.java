

public class Quiz {

    public static void main(String[] args) {
        student S1 = new student("James Cameron", 650001, 2022, 3.56);
        student S2 = new student("Jannifer Kim ", 650002, 2022, 1.26);
        student S3 = new student("Jonathan Joestar", 650003, 2022, 3.69);

        S1.ShowDetails();
        S1.ChangeID(650004, "admin");
        S1.ShowDetails();

        S2.UpdateGPA(1.00, "admin");
        S2.ShowDetails();

        S3.ShowDetails();
        S3.ChangeName("Joseph Joestar", "admin");
        S3.ShowDetails();

        S1.ChangeName("No Name", "student");
    }
}

class student {
    private String Name;
    private int ID;
    private int admsnY;
    private double GPA;

    public void ShowDetails() {
        System.out.println("ID : " + ID);
        System.out.println("Name : " + Name);
        System.out.println("GPA : " + String.format("%.2f", GPA));
        System.out.println("Admission Year : " + admsnY + "\n");
    }

    student(String name, int id, int adminY, double gpa) {
        this.Name = name;
        this.ID = id;
        this.admsnY = adminY;
        this.GPA = gpa;
    }

    public void ChangeName(String newName, String Mode) {
        if (Mode == "admin") {
            System.out.println("Changed " + this.Name + "'s Name to " + newName + "\n");
            this.Name = newName;
        } else {
            System.out.println("!You cannot access this function!");
        }
    }

    public void ChangeID(int id, String Mode) {
        if (Mode == "admin") {
            System.out.println("Changed " + this.Name + "'s ID to " + id + "\n");
            this.ID = id ;
        } else {
            System.out.println("!You cannot access this function!");
        }
    }

    public void UpdateGPA(double newgpa, String Mode) {
        if (Mode == "admin") {
            System.out.println("Updated " + this.Name + " GPA " + this.GPA + " to " + newgpa + "\n");
            this.GPA = newgpa;
        } else {
            System.out.println("!You cannot access this function!");
        }
    }
}
