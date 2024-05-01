/**
 * This is the inheritance and constructors where the Gadget superclass will be extended with MP3, which will be a subclass.
 */
public class MP3 extends Gadget
{
    private int Memory;

    public MP3(String theModel, double thePrice, int theWeight, String theSize, int theMemory)
    {
        super(theModel, thePrice, theWeight, theSize);
        Memory = theMemory;
    }

    public int getMemory()
    {
        return Memory;
    }

    public void DownloadMusic(int MemoryRequired){
        if(Memory >= MemoryRequired) {
            Memory -= MemoryRequired;
            System.out.println("Music Downloaded Successfully.");

        } else {
            System.out.println("You dont have enough memory to download this music.");
        }
    }

    public void DeleteMusic(int MemoryFreed) {
        Memory += MemoryFreed;
        System.out.println("Music deleted successfully.");
    }

    public void display()
    {
        super.display();
        System.out.println("Memory" + Memory + "Component");
    }

}