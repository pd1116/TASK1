
import java.util.*;

public class TASK1 {

    public static String[] names(String[] names1, String[] names2) {
        Set<String> result = new HashSet<>(Arrays.asList(names1));
        result.addAll(Arrays.asList(names2));
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Number of elements in First Array : ");
        int num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Number of elements in Second Array : ");
        int num2 = input2.nextInt();
        String[] names1 = new String[num1];
        String[] names2 = new String[num2];
        Scanner n1 = new Scanner(System.in);
        System.out.println("Insert elements in First Array : ");
        for (int i = 0; i < num1; i++) {
            names1[i] = n1.next();
        }
        Scanner n2 = new Scanner(System.in);
        System.out.println("Insert elements in Second Array : ");
        for (int i = 0; i < num2; i++) {
            names2[i] = n2.next();
        }

        System.out.println(String.join(", ", TASK1.names(names1, names2)));
        input1.close();
        input2.close();
        n1.close();
        n2.close();
    }
}
