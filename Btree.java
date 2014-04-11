class Btree <Type extends Comparable <Type>>
{
    static final int MAX_NUM_NODES = 4;
    static final int MIN_NUM_NODES = 2;
    private int numValues;
    private Object values[];
    private Btree children[];
    
    //array must be at least of size MIN_NUM_NODES
    public Btree(Type array[])
    {
        if(array.length > Btree.MAX_NUM_NODES)
        {
            throw new RuntimeException("Too many values");
        }
        else if(array.length < Btree.MIN_NUM_NODES)
        {
            throw new RuntimeException("Too few values");
        }
        
        this.values = new Object[Btree.MAX_NUM_NODES];
        this.children = new Btree[Btree.MAX_NUM_NODES];
        this.numValues = array.length;
        
        for(int i=0; i<array.length; i++)
        {
            values[i] = array[i];
        }
    }
    
    public Btree()
    {
        
    }
}

