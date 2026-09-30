class StructuraLista
{
    public int iDentif;
    public String dData;
    public StructuraLista next;

    public StructuraLista(int id, String dd)
    {
        iDentif = id;
        dData = dd;
        next = null;
    }

    public void afiseazaElement()
    {
        System.out.print("{" + iDentif + ", " + dData + "} ");
    }
}