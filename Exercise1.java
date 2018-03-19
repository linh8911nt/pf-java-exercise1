import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Điểm Vật Lý:");
        float physical = scanner.nextFloat();

        System.out.println("Điểm Hóa Học:");
        float chemistry = scanner.nextFloat();

        System.out.println("Điểm Sinh Học:");
        float biological = scanner.nextFloat();

        float sum = physical + chemistry + biological;
        float mediumScore = sum/3;

        System.out.println("Tổng điểm:" + sum);
        System.out.println("Điểm trung bình:" + mediumScore);

    }
}
