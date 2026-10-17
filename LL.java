import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter sorted elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original linked list:");
        System.out.println(list);

       
        for (int i = 0; i < list.size() - 1; ) {

            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i + 1);
            } else {
                i++;
            }
        }

        System.out.println("After removing duplicates:");
        System.out.println(list);

        sc.close();
    }
}