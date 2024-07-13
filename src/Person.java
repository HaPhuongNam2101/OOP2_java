public class Person { // Tên lớp public phải trùng với tên file
    public String name;
    public int age;// Thuộc tính
    public String gender = "Nam";
/*
    Các thuộc tính thì có giá trị mặc định, nếu không quy định giá trị thì
    giá trị mặc định sẽ phụ thuộc vào kiểu dữ liệu(int: 0, double: 0.0)
*/
    public Person(int age,String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

   public Person() {
   }
   public String hello() {
        return this.name + "Xin chào ";
   }
   public void go(String from) {
       System.out.println(this.name + "Đang đi đến " + from);
   }
}
/*
Lớp: là khuôn mẫu sinh ra các đối tượng cụ thể
Lớp thì có:
 + Thuộc tính: dữ liệu mà các đối tượng có, đại diện cho các đặc điểm của đối tượng - biến toàn cục trong java
  ~ biến thuộc tính
    * Constructor: là một hàm thực hiện tạo ra các đối tượng, constructor thì có tên trùng vơi tên lớp, và không
    có gái trị trả về, có thể nhiều constructor
    - Khi không khai báo constructor nào thì tự động có constructor rỗng,
    nếu construc khác thì construc mặc định vừa nói sẽ không còn
    * Phương thức (Method, Hàm, Function) đại diện cho hành động của các đối tượng
*/
