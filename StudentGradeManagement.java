import java.util.Scanner; 
public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Marks in subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
            sc.nextLine(); // consume newline
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name: " + names[i] + ", Marks: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j]);
                if (j < 2) System.out.print(", ");
            }
            System.out.println();
        }

        sc.close();
        
    }
}
