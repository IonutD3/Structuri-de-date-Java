public class ListaAp1
{
    public static void main(String[] args)
    {
        ElementLista LegLista =
            new ElementLista();

        LegLista.insereazaPrimul(1, "a");
        LegLista.insereazaPrimul(2, "b");
        LegLista.insereazaPrimul(3, "c");
        LegLista.insereazaPrimul(4, "d");

        LegLista.afiseazaLista();

        String current =
            LegLista.pozitieElement(1);

        if(current != null)
            System.out.println(
                "Elementul este: " + current
            );
        else
            System.out.println(
                "Nu exista elementul cu cheia 1"
            );

        StructuraLista f =
            LegLista.Gaseste(4);

        if(f != null)
            System.out.println(
                "A fost gasit elementul cu cheia "
                + f.iDentif
            );
        else
            System.out.println(
                "Nu exista o astfel de inregistrare!"
            );

        StructuraLista d =
            LegLista.sterge(2);

        if(d != null)
            System.out.println(
                "A fost stearsa inregistrarea cu cheia "
                + d.iDentif
            );
        else
            System.out.println(
                "Nu exista nici o astfel de inregistrare!"
            );

        while(!LegLista.ListaGoala())
        {
            StructuraLista oLegatura =
                LegLista.stergePrimul();

            System.out.print("Sters ");
            oLegatura.afiseazaElement();
            System.out.println();
        }

        LegLista.afiseazaLista();
    }
}
