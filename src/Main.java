import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("введите скорость в км/ч ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();

        System.out.print("введите скорость в м/c ");
        Scanner sc1 = new Scanner(System.in);
        int s2 = sc1.nextInt();

        if (s1 > s2 * 3.6) {
            System.out.println("Скорость в км/ч больше");
        }
        if (s1 < s2 * 3.6) {
            System.out.println("Скорость в м/c больше");
        }
        if (s1 == s2 * 3.6) {
            System.out.println("Скорости ровны");
        }
    }}
