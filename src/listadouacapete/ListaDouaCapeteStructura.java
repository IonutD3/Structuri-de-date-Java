class StructuraLista
{
    public String dData;
    public int iData;
    public StructuraLista next;

    public StructuraLista(int id, String dd)
    {
        dData = dd;
        iData = id;
        next = null;
    }

    public void afiseazaElement()
    {
        System.out.print(" " + dData);
    }
}