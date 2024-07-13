
public class Student {
    private String name;
    private int age;
    private double[] scores;
    public Student(String name, int age, double[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public void displayInfo() {
        System.out.println("Tên : " + name);
        System.out.println("Tuổi: " + age);
        System.out.print("Điểm số:  ");
    }
    public double calculateAverage() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
