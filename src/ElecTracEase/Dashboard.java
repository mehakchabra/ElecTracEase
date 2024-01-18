package ElecTracEase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    String acctype, meter;
    Dashboard(String acctype, String meter){
        this.acctype = acctype;
        this.meter = meter;

        setExtendedState(JFrame.MAXIMIZED_BOTH); //To have a frame of Full Screen Size

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/ebs.png"));
        Image image = imageIcon.getImage().getScaledInstance(1280,700,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel imageLable = new JLabel(imageIcon2);
        add(imageLable);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        //As Admin Signin
        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image customerImage = customerImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(customerImage));
        newcustomer.setBackground(new Color(160, 202, 202));
        newcustomer.addActionListener(this);


        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image customerdetailsImage = customerdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(customerdetailsImage));
        customerdetails.setBackground(new Color(134, 160, 160));
        customerdetails.addActionListener(this);
        menu.add(customerdetails);

        JMenuItem depositdetails = new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon depositdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
        Image depositdetailsImage = depositdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(depositdetailsImage));
        depositdetails.setBackground(new Color(160, 202, 202));
        depositdetails.addActionListener(this);
        menu.add(depositdetails);

        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatebillImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image calculatebillImage = calculatebillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(calculatebillImage));
        calculatebill.setBackground(new Color(134, 160, 160));
        calculatebill.addActionListener(this);
        menu.add(calculatebill);

        //As User Signin
        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem upinfo =new JMenuItem("Update Information");
        upinfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon upinfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image upinfoImage = upinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        upinfo.setIcon(new ImageIcon(upinfoImage));
        upinfo.setBackground(new Color(160, 202, 202));
        upinfo.addActionListener(this);
        info.add(upinfo);

        JMenuItem viewInfo =new JMenuItem("View Information");
        viewInfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon viewInfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewInfoImage = viewInfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewInfo.setIcon(new ImageIcon(viewInfoImage));
        viewInfo.setBackground(new Color(134, 160, 160));
        viewInfo.addActionListener(this);
        info.add(viewInfo);


        JMenu user = new JMenu("User");
        user.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem paybill =new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon paybillImg = new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image paybillImage = paybillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(paybillImage));
        paybill.setBackground(new Color(160, 202, 202));
        paybill.addActionListener(this);
        user.add(paybill);

        JMenuItem billdetails =new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon billdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image billdetailsImage = billdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(billdetailsImage));
        billdetails.setBackground(new Color(134, 160, 160));
        billdetails.addActionListener(this);
        user.add(billdetails);

        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem genBill =new JMenuItem("Generate Bill");
        genBill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon genBillImg = new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image genBillImage = genBillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genBill.setIcon(new ImageIcon(genBillImage));
        genBill.setBackground(new Color(160, 202, 202));
        genBill.addActionListener(this);
        bill.add(genBill);

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem notepad =new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon notepadImg = new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadImage = notepadImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadImage));
        notepad.addActionListener(this);
        notepad.setBackground(new Color(160, 202, 202));
        utility.add(notepad);


        JMenuItem calculator =new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatorImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculatorImage = calculatorImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImage));
        calculator.setBackground(new Color(134, 160, 160));
        calculator.addActionListener(this);
        utility.add(calculator);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem eexit =new JMenuItem("Exit");
        eexit.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon eexitImg = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image eexitImage = eexitImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        eexit.setIcon(new ImageIcon(eexitImage));
        eexit.setBackground(new Color(160, 202, 202));
        eexit.addActionListener(this);
        exit.add(eexit);

        if (acctype.equals("Admin")){
            menuBar.add(menu);
        }
        else {
            menuBar.add(info);
            menuBar.add(user);
            menuBar.add(bill);
        }

        menuBar.add(utility);
        menuBar.add(exit);


        setLayout(new FlowLayout()); //Using FlowLayout
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if (msg.equals("New Customer")) {
            new NewCustomer();
        } else if (msg.equals("Customer Details")) {
            new CustomerDetails();
        } else if (msg.equals("Deposit Details")) {
            new DepositDetails();
        } else if (msg.equals("Calculate Bill")) {
            new CalculateBill();
        } else if (msg.equals("View Information")) {
            //new ViewInformation(meter);
        } else if (msg.equals("Update Information")) {
            //new UpdateInformation(meter_pass);
        } else if (msg.equals("Bill Details")) {
            //new BillDetails(meter_pass);
        } else if (msg.equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Notepad")) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Exit")) {
            setVisible(false);
            new Login();
        } else if (msg.equals("Pay Bill")) {
            //new PayBill(meter_pass);
        } else if (msg.equals("Generate Bill")) {
            //new GenerateBill(meter_pass);
        }
    }

    public static void main(String[] args) {
        new Dashboard("","");
    }
}
