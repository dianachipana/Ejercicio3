import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j, k, indice, central, li, ls, diferencia, neultimo;
        int[] ne = new int[]{2, 4, 10, 12, 18, 20, 30, 36, 38, 48, 54, 56, 70, 80, 86, 88, 102, 112, 118};
        int[] norbitales = new int[]{2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 6};
        String[] num_orbitales = {"1", "2", "2", "3", "3", "4", "3", "4", "5", "4", "5", "6", "4", "5", "6", "7", "5", "6", "7"};
        String[] tipo_orbitales = {"s", "s", "p", "s", "p", "s", "d", "p", "s", "d", "p", "s", "f", "d", "p", "s", "f", "d", "p"};
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\ningrese el nombre del atomo");
            String name = scan.nextLine();
            if (name.equals("Exit")) {
                break;
            }
            System.out.println("ingrese su número atomico");
            indice = Integer.parseInt(scan.nextLine());  // Read user input
            if (indice == 0) {
                System.out.format("%s %s %s ", "1", "S", "0");
            }
            int valor = 0;
            for (int i = 0; i < 19; i++) {
                if (ne[i] >= indice) {
                    valor = i;
                    break;
                }
            }


            for (j = 0; j < valor; j++) {
                System.out.format("%s%s%s ", num_orbitales[j], tipo_orbitales[j], norbitales[j] + "");
            }
            diferencia = ne[valor] - indice;
            if (diferencia == 0) {
                System.out.format("%s%s%s ", num_orbitales[valor], tipo_orbitales[valor], norbitales[valor]);
            } else {
                System.out.format("%s%s%s \n", num_orbitales[valor], tipo_orbitales[valor], norbitales[valor] - diferencia);
            }

        }
    }
}
