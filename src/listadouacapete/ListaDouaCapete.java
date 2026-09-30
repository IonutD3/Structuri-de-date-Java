public class ListaDouaCapete
{
    public static void main(String[] args)
    {
        ElementLista LegLista =
            new ElementLista();

        LegLista.insereaza(22, "a", true);
        LegLista.insereaza(44, "b", true);
        LegLista.insereaza(66, "c", true);

        LegLista.insereaza(11, "d", false);
        LegLista.insereaza(33, "e", false);
        LegLista.insereaza(55, "f", false);

        System.out.println("Lista initiala:");
        LegLista.afiseazaLista();

        LegLista.stergePrimul();
        LegLista.stergePrimul();

        System.out.println("Dupa stergerea primelor doua elemente:");
        LegLista.afiseazaLista();
    }
}
