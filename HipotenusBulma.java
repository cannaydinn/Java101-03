import java.util.Scanner;
public class HipotenusBulma{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Üçgenin kısa kenarını giriniz: ");
        int kisaKenar = sc.nextInt();

        System.out.print("Üçgenin uzun kenarını giriniz: ");
        int uzunKenar = sc.nextInt();

        System.out.print("Üçgenin hipotenüsünü giriniz: ");
        int hipotenüs = sc.nextInt();

        int u = (kisaKenar + uzunKenar + hipotenüs) / 2;

        double alan = Math.sqrt(u * (u - kisaKenar) * (u - uzunKenar) * (u - hipotenüs));

        System.out.println("Üçgenin Alanı : " + alan);



    }
}