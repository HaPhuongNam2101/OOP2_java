import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int length = sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int width = sc.nextInt();

        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("Chiều dài và chiều rộng hình chữ nhật: " + rectangle.display());
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());

        System.out.println("Nhập chiều dài mới: ");
        length = sc.nextInt();
        System.out.println("Nhập chiều rộng mới: ");
        width = sc.nextInt();

        rectangle.setLength(length);
        rectangle.setWidth(width);
        System.out.println("Chiều dài và chiều rộng hình chữ nhật sau khi thay đổi : " + rectangle.display());
        System.out.println("Chu vi hình chữ nhật sau khi thay đổi: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật sau khi thay đổi: " + rectangle.getArea());
    }
}