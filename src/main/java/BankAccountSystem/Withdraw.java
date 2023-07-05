
package BankAccountSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Withdraw {
    
    //Component Declaration
    JFrame f = new JFrame("Withdraw");
    JPanel pnlSaving, pnlChecking, pnlMainPanel;
    GridBagConstraints c;
    JButton btnConfirmChecking, btnConfirmSavings;
    JTextField txtChecking, txtSaving;
    JTabbedPane WithdrawPane;
    
    public Withdraw(){
    
    
    //Savings Panel Component Initialization/////////////////////////
    User user1 = new User();
    
    JLabel lblBalanceTell = new JLabel("Your Balance Is:");
    lblBalanceTell.setAlignmentX(Component.RIGHT_ALIGNMENT);
    lblBalanceTell.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
    JLabel lblBalanceGetSavings = new JLabel(+user1.GetSavingsBalance()+" php");
    lblBalanceGetSavings.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
    JLabel lblEnterPrompt = new JLabel("Enter your amount here: ");
    lblEnterPrompt.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
    btnConfirmSavings = new JButton("Confirm Withdrawal");
    btnConfirmSavings.setFont(new Font("Segoe UI", Font.BOLD, 12));
    btnConfirmSavings.setBackground(Color.white);
    
    txtSaving = new JTextField(20);
    //Savings Panel Panel Setting
    pnlSaving = new JPanel();
    pnlSaving.setLayout(new GridBagLayout());
    pnlSaving.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 5;
    c.gridy = 0;
    pnlSaving.add(lblBalanceTell, c);
    
    c.gridx = 6;
    c.gridy = 0;
    pnlSaving.add(lblBalanceGetSavings, c);
    
    c.gridx = 5;
    c.gridy = 2;
    pnlSaving.add(lblEnterPrompt, c);
    
    c.gridx = 6;
    c.gridy = 2;
    pnlSaving.add(txtSaving, c);
    
    c.gridx = 6;
    c.gridy = 3;
    pnlSaving.add(btnConfirmSavings,c);
    
    //Checking Panel Component Declaration
     JLabel lblBalanceTellCheck = new JLabel("Your Balance Is:");
    lblBalanceTellCheck.setFont(new Font("Segoe UI", Font.BOLD, 12));
 
    
    JLabel lblBalanceGetChecking = new JLabel(+user1.GetCheckingBalance()+" php");
    lblBalanceGetChecking.setFont(new Font("Segoe UI", Font.BOLD, 12));
    
    JLabel lblEnterPromptChecking = new JLabel("Enter your amount here: ");
    lblEnterPromptChecking.setFont(new Font("Segoe UI", Font.BOLD, 12));
     
    btnConfirmChecking = new JButton("Confirm Withdrawal");
    btnConfirmChecking.setFont(new Font("Segoe UI", Font.BOLD, 12));
    btnConfirmChecking.setBackground(Color.white);
    
    txtChecking = new JTextField(20);
    //Checking Panel Panel Setting
    pnlChecking = new JPanel();
    pnlChecking.setLayout(new GridBagLayout());
    pnlChecking.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 5;
    c.gridy = 0;
    pnlChecking.add(lblBalanceTellCheck, c);
    
    c.gridx = 6;
    c.gridy = 0;
    pnlChecking.add(lblBalanceGetChecking, c);
    
    c.gridx = 5;
    c.gridy = 2;
    pnlChecking.add(lblEnterPromptChecking, c);
    
    c.gridx = 6;
    c.gridy = 2;
    pnlChecking.add(txtChecking, c);
    
    c.gridx = 6;
    c.gridy = 3;
    pnlChecking.add(btnConfirmChecking,c);
    
    
    //JTabPane Setting
    WithdrawPane = new JTabbedPane();
    WithdrawPane.add("Savings Account",pnlSaving);
    WithdrawPane.add("Checkings Account", pnlChecking);
    //MainPanel Setting
    
    pnlMainPanel = new JPanel();
    pnlMainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    pnlMainPanel.setLayout(new BoxLayout(pnlMainPanel, BoxLayout.Y_AXIS));
    JLabel lblWithdrawTitle = new JLabel("Withdraw");
    lblWithdrawTitle.setFont(new Font("Segoe UI", Font.BOLD, 25));
    lblWithdrawTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
    pnlMainPanel.add(WithdrawPane);
    
    //Frame Setting
    f.setContentPane(pnlMainPanel);
    f.pack();
    centerFrame();
    f.setVisible(true);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
}
    
     public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - f.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - f.getHeight()) / 2);
        f.setLocation(x, y);
    }
     
     
}
