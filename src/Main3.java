import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên 1: ");
        System.out.print("Tên: ");
        String name1 = sc.nextLine();
        System.out.print("Tuổi: ");
        int age1 = sc.nextInt();
        System.out.print("Số lượng điểm: ");
        int numScores1 = sc.nextInt();
        double[] scores1 = new double[numScores1];
        System.out.println("Nhập điểm:");
        for (int i = 0; i < numScores1; i++) {
            scores1[i] = sc.nextDouble();
        }
        Student student1 = new Student(name1, age1, scores1);
        System.out.println("\nNhập thông tin Sinh viên 2: ");
        System.out.print("Tên : ");
        String name2 = sc.next();
        System.out.print("Tuổi : ");
        int age2 = sc.nextInt();
        System.out.print("Số lượng điểm : ");
        int numScores2 = sc.nextInt();
        double[] scores2 = new double[numScores2];
        System.out.println("Nhập điểm :");
        for (int i = 0; i < numScores2; i++) {
            scores2[i] = sc.nextDouble();
        }
        Student student2 = new Student(name2, age2, scores2);
        System.out.println("\nThông tin Sinh viên 1: ");
        student1.displayInfo();
        System.out.println("Điểm trung bình : " + student1.calculateAverage());

        System.out.println("\nThông tin Sinh viên 2: ");
        student2.displayInfo();
        System.out.println("Điểm trung bình: " + student2.calculateAverage());

        if (student1.calculateAverage() > student2.calculateAverage()) {
            System.out.println("\nSinh viên 1 có điểm trung bình cao hơn. ");
        } else if (student1.calculateAverage() < student2.calculateAverage()) {
            System.out.println("\nSinh viên 2 có điểm trung bình cao hơn. ");
        } else {
            System.out.println("\nCả hai sinh viên có điểm trung bình bằng nhau.");
        }
    }
}