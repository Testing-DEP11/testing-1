// public class Java2 {
//     public static void main(String[] args) {
//         System.out.println("another java file is added");
//         System.out.println("text file was added");
//     }
// }

public class Java2{
    public int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Java2 math = new Java2();
        int result = math.add(3,5);
        System.out.println(result);
    }
}

