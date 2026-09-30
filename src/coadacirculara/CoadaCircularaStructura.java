import java.io.*;

class Coada {

    private int dimensiune;
    private int[] CoadaSir;
    private int primul;
    private int ultimul;
    private int nrCelule;

    public Coada(int s) {
        dimensiune = s;
        CoadaSir = new int[dimensiune];
        primul = 0;
        ultimul = -1;
        nrCelule = 0;
    }

    // Insereaza la dreapta / sfarsitul cozii
    public void insert(int j) {
        if (CoadaPlina()) {
            System.out.println("Coada este plina!");
            return;
        }

        ultimul++;

        if (ultimul == dimensiune)
            ultimul = 0;

        CoadaSir[ultimul] = j;
        nrCelule++;

        System.out.println("insert " + j);
    }

    // Elimina din stanga / inceputul cozii
    public int remove() {
        if (CoadaGoala()) {
            System.out.println("Coada este goala!");
            return -1;
        }

        int temp = CoadaSir[primul];

        primul++;

        if (primul == dimensiune)
            primul = 0;

        nrCelule--;

        System.out.println("remove " + temp);

        return temp;
    }

    // Afiseaza primul element fara sa-l elimine
    public int peekFront() {
        if (CoadaGoala()) {
            System.out.println("Coada este goala!");
            return -1;
        }

        System.out.println("EX2");
        System.out.println("Primul element este: ");

        return CoadaSir[primul];
    }

    public boolean CoadaGoala() {
        return nrCelule == 0;
    }

    public boolean CoadaPlina() {
        return nrCelule == dimensiune;
    }

    public int size() {
        return nrCelule;
    }

    // Inserare la stanga
    public void insertLeft(int j) {
        if (CoadaPlina()) {
            System.out.println("Coada este plina!");
            return;
        }

        if (nrCelule == 0) {
            primul = 0;
            ultimul = 0;
        }
        else {
            primul--;

            if (primul < 0)
                primul = dimensiune - 1;
        }

        CoadaSir[primul] = j;
        nrCelule++;

        System.out.println("insert stanga " + j);
    }

    // Eliminare din stanga
    public int removeLeft() {
        if (CoadaGoala()) {
            System.out.println("Coada este goala!");
            return -1;
        }

        int temp = CoadaSir[primul];

        primul++;

        if (primul == dimensiune)
            primul = 0;

        nrCelule--;

        if (nrCelule == 0) {
            primul = 0;
            ultimul = -1;
        }

        System.out.println("remove stanga " + temp);

        return temp;
    }

    // Eliminare din dreapta
    public int removeRight() {
        if (CoadaGoala()) {
            System.out.println("Coada este goala!");
            return -1;
        }

        int temp = CoadaSir[ultimul];

        ultimul--;

        if (ultimul < 0)
            ultimul = dimensiune - 1;

        nrCelule--;

        if (nrCelule == 0) {
            primul = 0;
            ultimul = -1;
        }

        System.out.println("remove dreapta " + temp);

        return temp;
    }

    // Afisare in ordinea reala a cozii circulare
    public void afiseaza() {

        if (CoadaGoala()) {
            System.out.println("Coada este goala!");
            return;
        }

        int index = primul;

        for (int j = 0; j < nrCelule; j++) {

            System.out.print(CoadaSir[index] + " ");

            index++;

            if (index == dimensiune)
                index = 0;
        }

        System.out.println();
    }

    // Bubble Sort crescator
    public void bubbleSort() {

        if (nrCelule < 2)
            return;

        // Copiem elementele cozii intr-un vector temporar
        int[] temp = new int[nrCelule];

        int index = primul;

        for (int i = 0; i < nrCelule; i++) {
            temp[i] = CoadaSir[index];

            index++;

            if (index == dimensiune)
                index = 0;
        }

        // Bubble Sort
        int out, in;

        for (out = nrCelule - 1; out > 0; out--) {

            for (in = 0; in < out; in++) {

                if (temp[in] > temp[in + 1]) {

                    int aux = temp[in];
                    temp[in] = temp[in + 1];
                    temp[in + 1] = aux;
                }
            }
        }

        // Punem elementele sortate inapoi in coada
        index = primul;

        for (int i = 0; i < nrCelule; i++) {

            CoadaSir[index] = temp[i];

            index++;

            if (index == dimensiune)
                index = 0;
        }
    }

    // Pop pentru comportament de tip stiva:
    // elimina din dreapta
    public int pop() {
        return removeRight();
    }

    // Verifica daca exista elemente pentru pop
    public boolean StivaGoala() {
        return CoadaGoala();
    }
}
