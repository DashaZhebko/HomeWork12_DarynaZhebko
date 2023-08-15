import java.util.Arrays;
import java.util.Random;

public class HomeWork12 {
    public static final int EL_COUNT = 7;
    public static void main(String[] args) {
        int [] mas1 = new int[EL_COUNT];
        int [] mas2 = new int[EL_COUNT];
        int count = 0;
        Random random = new Random();

        for (int i = 0; i < EL_COUNT; i++) {
            mas1[i] = random.nextInt(10);
            mas2[i] = random.nextInt(10);
        }

        Arrays.sort(mas1);
        Arrays.sort(mas2);
        System.out.println("Перший масив: " + Arrays.toString(mas1));
        System.out.println("Другий масив: " + Arrays.toString(mas2));
        System.out.print("Співпали елементи: ");
        for (int i = 0; i < EL_COUNT; i++) {
            if (mas1[i]==mas2[i]){
                count++;
                System.out.print(i + "-й ; ");
            }


        }
        System.out.println();
        System.out.println("Кількість співпадінь: "+count);
    }
}
