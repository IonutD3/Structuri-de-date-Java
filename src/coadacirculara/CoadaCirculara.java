import java.io.*;

public class CoadaAp {

    public static void main(String[] args) throws IOException {

        Coada OCoada = new Coada(10);

        OCoada.insertLeft(10);
        OCoada.insertLeft(20);
        OCoada.insertLeft(30);
        OCoada.insertLeft(40);

        OCoada.removeLeft();
        OCoada.removeLeft();
        OCoada.removeLeft();

        OCoada.insertLeft(50);
        OCoada.insertLeft(60);
        OCoada.insertLeft(70);
        OCoada.insertLeft(80);
        OCoada.insertLeft(90);

        OCoada.removeRight();

        System.out.println("EX5");
        System.out.println("Elem introduse:");
        OCoada.afiseaza();

        System.out.println("Folosim BubbleSort");

        OCoada.bubbleSort();

        System.out.println("Sirul ordonat:");
        OCoada.afiseaza();

        System.out.println("Primul element:");
        System.out.println(OCoada.peekFront());

        System.out.println("EX3");
        System.out.print("Introduceti 'Coada' sau 'Stiva': ");
        System.out.println("");
        System.out.flush();

        String input = getString();

        if (input.equals("Coada")) {

            System.out.println("A fost aleasa metoda de afisare coada");

            while (!OCoada.CoadaGoala()) {

                int n = OCoada.removeLeft();

                System.out.print(n + " ");
            }

            System.out.println("");
        }

        else if (input.equals("Stiva")) {

            System.out.println("A fost aleasa metoda de afisare stiva");

            while (!OCoada.StivaGoala()) {

                int value = OCoada.pop();

                System.out.println(
                    "A fost extras elementul: " + value
                );
            }

            System.out.println("");
        }

        else {

            System.out.println("Optiune invalida!");
        }
    }

    public static String getString() throws IOException {

        InputStreamReader isr =
            new InputStreamReader(System.in);

        BufferedReader br =
            new BufferedReader(isr);

        return br.readLine();
    }
}
