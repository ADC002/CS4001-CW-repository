/**
 * This is the inheritance and constructors where the Gadget superclass will be extended with Mobile which will be a subclass.
 */
public class Mobile extends Gadget
{   
    private int Credit;

    public Mobile(String theModel, double thePrice, int theWeight, String theSize, int theCredit)
    {
        super(theModel, thePrice, theWeight, theSize);
        Credit = theCredit;    
    }

    public int getCredit()
    {
        return Credit;
    }

    public void Credit(int Credit)
    {
        if(Credit > 0)
            Credit += Credit;

        else{
            System.out.println("Please enter the positive credit number for calling");   

     }}

    public void makeCall(String PhoneNumber, int Duration) {

        if( Credit >= Duration) {

            System.out.println("Credit" + PhoneNumber + "for" + Duration + "Minutes");
            Credit -=Duration;

        } else{
            System.out.println("You dont have enough credit to make a call");   
        }}

    public void display(){
        super.display();
        System.out.println("Credit" + Credit + "Minutes");
    }

}