public class Main4 {
    public static void main(String[] args) {
// Tạo đối tượng Fan 1
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Vàng ");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Xanh ");
        fan2.setOn(false);

        System.out.println("Thông tin của Quạt 1: ");
        System.out.println(fan1.toString());

        System.out.println("\nThông tin của Quạt 2: ");
        System.out.println(fan2.toString());
    }
}
