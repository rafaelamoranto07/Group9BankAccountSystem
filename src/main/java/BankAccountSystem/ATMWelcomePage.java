
package BankAccountSystem;

import javax.swing.*;
import java.awt.*;

public class ATMWelcomePage {
    
    JFrame f  = new JFrame("Welcome To Bank Account Mangement System");
    private JButton registerButton;
    private JButton loginButton;

    public ATMWelcomePage() {
        f.setTitle("ATM Welcome Page");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 300);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setResizable(true);

        JLabel welcomeLabel = new JLabel("WELCOME TO THE BANK ACCOUNT MANAGER!");
        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        welcomeLabel.setBounds(85, 63, 420, 19);
        
        JLabel dywt = new JLabel ("Do you want to:");
        dywt.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        dywt.setBounds(225, 100, 200, 19);

        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        registerButton.setBackground(Color.white);
        registerButton.setBounds(175, 155, 84, 19);
        
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        loginButton.setBackground(Color.white);
        loginButton.setBounds(315, 155, 84, 19);
        
        f.add(welcomeLabel);
        f.add(dywt);
        f.add(registerButton);
        f.add(loginButton);
        
    }

}

