package objects;

/**
 * Created by jpmc on 9/28/2016.
*/
public class Animal
{
   private int numLegs;
   private String Aname;
   private boolean canSwim = true;

    public void setNumLegs(int numLegs)
    {
        this.numLegs = numLegs;
    }

    public int getNumLegs()
    {
        return numLegs;
    }

    public String getAname()
    {
        return Aname;
    }

    public void setAname(String aname)
    {
        Aname = aname;
    }

    public boolean getisCanSwim()
    {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim)
    {
        this.canSwim = canSwim;
    }

    public String tibon()
    {
        return "Type : " + Aname + "\n" + "Number of Legs: " + numLegs + "\n" + "Can ths swim: " + canSwim;
    }
}