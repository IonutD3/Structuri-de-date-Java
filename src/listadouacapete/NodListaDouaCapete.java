class ElementLista
{
    private StructuraLista Primul;
    private StructuraLista Ultimul;

    public ElementLista()
    {
        Primul = null;
        Ultimul = null;
    }

    public boolean ListaGoala()
    {
        return (Primul == null);
    }

    public void insereaza(int id, String dd, boolean AF)
    {
        StructuraLista oLista =
            new StructuraLista(id, dd);

        // AF = true -> inserare la inceput
        if(AF == true)
        {
            if(ListaGoala())
                Ultimul = oLista;

            oLista.next = Primul;
            Primul = oLista;
        }

        // AF = false -> inserare la sfarsit
        else
        {
            if(ListaGoala())
                Primul = oLista;
            else
                Ultimul.next = oLista;

            Ultimul = oLista;
        }
    }

    public String stergePrimul()
    {
        if(ListaGoala())
            return null;

        String temp = Primul.dData;

        if(Primul.next == null)
            Ultimul = null;

        Primul = Primul.next;

        return temp;
    }

    public void afiseazaLista()
    {
        System.out.print(
            "Lista (de la Primul --> la Ultimul): "
        );

        StructuraLista curent = Primul;

        while(curent != null)
        {
            curent.afiseazaElement();
            curent = curent.next;
        }

        System.out.println();
    }
}
