import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class GadgetShop implements ActionListener
{
    private JFrame frame;

    private JLabel ModelLabel;
    private JLabel PriceLabel;
    private JLabel WeightLabel;
    private JLabel SizeLabel;
    private JLabel CreditLabel;
    private JLabel MemoryLabel;
    private JLabel PhoneNumberLabel;
    private JLabel DurationLabel;
    private JLabel DownloadLabel;
    private JLabel DisplayNumberLabel;

    private JTextField Model;
    private JTextField Price;
    private JTextField Weight;
    private JTextField Size;
    private JTextField Credit;
    private JTextField Memory;
    private JTextField PhoneNumber;
    private JTextField Duration;
    private JTextField Download;
    private JTextField DisplayNumber;

    private JButton AddMobileButton;
    private JButton AddMP3Button;
    private JButton ClearButton;
    private JButton DisplayAllButton;
    private JButton MakeACallButton;
    private JButton DownloadMusicButton;
    private JButton QuitButton;
    
    

    private ArrayList <Gadget> gadgetShop;
    private ArrayList <Mobile> GadgetShop;
    private ArrayList <MP3> Gadgetshop;
    
    
    public GadgetShop()
    {

        Font font = new Font("Arial",Font.BOLD,20);
        UIManager.put("Label.font", font);

        frame = new JFrame ("GadgetShop");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(14,2));

        contentPane.add(new JLabel("Model"));
        Model = new JTextField(15);
        contentPane.add(Model);

        contentPane.add(new JLabel("Price"));

        Price = new JTextField(15);
        contentPane.add(Price);

        contentPane.add(new JLabel("Weigth"));

        Weight = new JTextField(15);
        contentPane. add(Weight);

        contentPane.add(new JLabel("Size"));

        Size = new JTextField(15);
        contentPane.add(Size);

        contentPane.add(new JLabel("Credit"));

        Credit = new JTextField(15);
        contentPane.add(Credit);

        contentPane.add(new JLabel("Memory"));

        Memory = new JTextField(15);
        contentPane.add(Memory);

        contentPane.add(new JLabel("PhoneNumber"));

        PhoneNumber = new JTextField(15);
        contentPane.add(PhoneNumber);

        contentPane.add(new JLabel("Duration"));

        Duration = new JTextField(15);
        contentPane.add(Duration);

        contentPane.add(new JLabel("Download"));

        Download = new JTextField(15);
        contentPane.add(Download);

        contentPane.add(new JLabel("DisplayNumber"));

        DisplayNumber = new JTextField(15);
        DisplayNumber.setText("-1");
        contentPane.add(DisplayNumber);

        AddMobileButton = new JButton("AddMobile");
        contentPane.add(AddMobileButton);
        AddMobileButton.addActionListener(this);

        DisplayAllButton = new JButton("Display all");
        contentPane.add(DisplayAllButton);
        DisplayAllButton.addActionListener(this);

        MakeACallButton = new JButton("Make A Call");
        contentPane.add(MakeACallButton);
        MakeACallButton.addActionListener(this);

        DownloadMusicButton = new JButton("Download Music");
        contentPane.add(DownloadMusicButton);
        DownloadMusicButton.addActionListener(this);

        ClearButton = new JButton("Clear");
        contentPane.add(ClearButton);
        ClearButton.addActionListener(this);
        
        AddMP3Button = new JButton("AddMP3");
        contentPane.add(AddMP3Button);
        AddMP3Button.addActionListener(this);
        
        QuitButton = new JButton("Quit");
        contentPane.add(QuitButton);
        QuitButton.addActionListener(this);

        

        

        frame.pack();
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        if(command.equals("Open")) {
            open();
        }

        if(command.equals("Quit")) {
            quit();
        }

        if(command.equals("Clear")) {
            clear();
        }
        
        if(command.equals("AddMobile")) {
            AddMobile();
        }
        
        if(command.equals("Display all")) {
            Displayall();
        }
        
         if(command.equals("Make A Call")) {
            MakeACall();
        }
        
        if(command.equals("Download Music")) {
            DownloadMusic();
        }
        
        if(command.equals("AddMP3")) {
            AddMP3();
        }
    }
    
    public void open()
    {
        System.out.println("Welcome to Gadget");
    }

    public void quit()
    {
        System.out.println("Thank you for using Gadget");
        System.exit(0);

    }
    
     public void AddMobile()
    {
        String Model = getModel();
        double Price = getPrice();
        int Weight = getWeight();
        String Size = getSize();
        int Credit = getCredit();
        int Memory = getMemory();
        int PhoneNumber = getPhoneNumber();
        int Duration = getDuration();
        int Download = getDownload();
        
        
        
        JOptionPane.showMessageDialog(frame,"A new mobile for sale has been added.");
        
        
        
        
                                    
    }
    
    public void Displayall()
    {
        
        
    }
    
    public void MakeACall()
    {
        int Duration = getDuration();
        
        JOptionPane.showMessageDialog(frame,"Your Duration of this call is over");
    }
    
    public void DownloadMusic()
    {
        
    }
    
    public void AddMP3()
    {
        String Model = getModel();
        double Price = getPrice();
        int Weight = getWeight();
        String Size = getSize();
        int Credit = getCredit();
        int Memory = getMemory();
        int Duration = getDuration();
        int Download = getDownload();
        
        
        
        JOptionPane.showMessageDialog(frame,"A new MP3 for sale has been added.");
        
    }
    
    public String getModel()
    {
        String modelUserInput = Model.getText();
        return modelUserInput;
    }

    public double getPrice()
    {
        try{
            double priceUserInput = Double.parseDouble(Price.getText());
            return priceUserInput;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Error! Price needs to be a number.");
            return -1;
        }
    }
    
    public String getSize()
    {
        String sizeUserInput = Size.getText();
        return sizeUserInput;
    }
    
    public int getWeight()
    {   
        try{
            int WeightUserInput = Integer.parseInt(Weight.getText());
            return WeightUserInput;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Error! Weight needs to be a number.");
            return -1;
        }
    }
    
    public int getCredit()
    {   
        try{
            int CreditUserInput = Integer.parseInt(Credit.getText());
            return CreditUserInput;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Error! Credit needs to be a number.");
            return -1;
        }
    }
    
    public int getMemory()
    {
        try{
            int MemoryUserInput = Integer.parseInt(Memory.getText());
            return MemoryUserInput;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Error! Memory needs to be a number.");
            return -1;
        }
    }
    
    public int getPhoneNumber()
    {
        try{
            int PhoneNumberUserInput = Integer.parseInt(PhoneNumber.getText());
            return PhoneNumberUserInput;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Error! PhoneNumber needs to be a number.");
            return -1;
        }
    }
    
    public int getDuration()
    {
        try{
            int DurationUserInput = Integer.parseInt(Duration.getText());
            return DurationUserInput;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Error! Duration needs to be a number.");
            return -1;
        }
    }
    
    public int getDownload()
    {
        try{
            int DownloadUserInput = Integer.parseInt(Download.getText());
            return DownloadUserInput;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Error! Download needs to be a number.");
            return -1;
        }
    }
    
    public int getDisplayNumber()
    {
        
        try{ 
            int DisplayNumberUserInput = Integer.parseInt(DisplayNumber.getText());
            return DisplayNumberUserInput;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame, "Error! DisplayNumber needs to be a number.");
            return -1;
        }
    }
    
    public void clear()
    {
        Model.setText(null);
        Price.setText(null);
        Weight.setText(null);
        Size.setText(null);
        Credit.setText(null);
        Memory.setText(null);
        PhoneNumber.setText(null);
        Duration.setText(null);
        Download.setText(null);
        DisplayNumber.setText(null);

    
    }

}
