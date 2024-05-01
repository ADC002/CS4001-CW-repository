public class Gadget
{
    private String Model;
    private double Price;
    private int Weight;
    private String Size;

 public Gadget(String theModel, double thePrice, int theWeight, String theSize)
 {
    Model = theModel;
    Price = thePrice;
    Weight = theWeight;
    Size = theSize;
    
    
     
 }
 
 public String getModel()
 {
     return Model;
 }
 
 public double getPrice()
 {
     return Price;
 }
 
 public int getWeight()
 {
     return Weight;
 }
 
 public String getSize()
 {
     return Size;
 }
 
 public void display()
 {
     System.out.println("Model" + Model);
     System.out.println("Price£" + Price);
     System.out.println("Weight" + Weight);
     System.out.println("Size" + Size);
     
     
     
 }
 
}