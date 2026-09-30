class ElementLista
{
    private StructuraLista Primul;

    public ElementLista()
    {
        Primul = null;
    }

    public boolean ListaGoala()
    {
        return (Primul == null);
    }

    public void insereazaPrimul(int id, String dd)
    {
        StructuraLista oLista =
            new StructuraLista(id, dd);

        oLista.next = Primul;
        Primul = oLista;
    }

    public StructuraLista stergePrimul()
    {
        if(Primul == null)
            return null;

        StructuraLista temp = Primul;
        Primul = Primul.next;

        return temp;
    }

    public void afiseazaLista()
    {
        System.out.print(
            "Lista (de la Primul --> la Ultimul): "
        );

        StructuraLista curent = Primul;

        if(curent == null)
        {
            System.out.print("Lista goala");
        }
        else
        {
            while(curent != null)
            {
                curent.afiseazaElement();
                curent = curent.next;
            }
        }

        System.out.println();
    }

    public StructuraLista Gaseste(int cheie)
    {
        StructuraLista curent = Primul;

        while(curent != null)
        {
            if(curent.iDentif == cheie)
                return curent;

            curent = curent.next;
        }

        return null;
    }

    public StructuraLista sterge(int cheie)
    {
        StructuraLista curent = Primul;
        StructuraLista anterior = null;

        while(curent != null &&
              curent.iDentif != cheie)
        {
            anterior = curent;
            curent = curent.next;
        }

        if(curent == null)
            return null;

        if(curent == Primul)
            Primul = Primul.next;
        else
            anterior.next = curent.next;

        return curent;
    }

    public String pozitieElement(int id)
    {
        StructuraLista curent = Primul;

        while(curent != null)
        {
            if(curent.iDentif == id)
                return curent.dData;

            curent = curent.next;
        }

        return null;
    }
}
