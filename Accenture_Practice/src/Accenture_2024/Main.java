package Accenture_2024;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> n = new ArrayList<>();
        while (scanner.hasNextInt()) {
            n.add(scanner.nextInt());
        }
        System.out.print(primeconstruction(n));
    }

    public static Integer primeconstruction(List<Integer> n) {
        List<Integer> p = new ArrayList<>();
        p.add(3);
        p.add(4);
        p.add(5);
        p.add(1);
        

        int q = Integer.MAX_VALUE;
        for (int num : n) {
            if (num < q) {
                q = num;
            }
        }
        n.remove(Integer.valueOf(q));

        List<Integer> temp = new ArrayList<>();
        if (q % 2 == 0) {
            return null;
        }
        for (int i : p) {
            for (int j : n) {
                if (i % j == q) {
                    temp.add(i);
                }
            }
            if (temp.size() == n.size()) {
            	System.out.println(i);
                return i;
            }
            temp.clear();
        }
        System.out.println("none");
        return null;
    }
}