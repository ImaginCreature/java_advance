package oop.advanced.model.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateSeqFile extends Frame implements ActionListener {
    private TextField account, name, balance;
    private Button enter, done;
    private DataOutputStream output;

    public CreateSeqFile() {
        super("Client Information File Creation");
        try {
            output = new DataOutputStream(new FileOutputStream("client1.doc"));
        } catch (IOException e1) {
            System.err.println(e1.toString());
            System.exit(1);
        }
        setSize(250, 150);
        setLayout(new GridLayout(4, 2));
        add(new Label("account Number"));
        account = new TextField();
        add(account);

        add(new Label("name"));
        name = new TextField(20);
        add(name);

        add(new Label("balance"));
        balance = new TextField(20);
        add(balance);

        enter = new Button("input");
        enter.addActionListener(this);
        add(enter);

        done = new Button("exit");
        done.addActionListener(this);
        add(done);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addRecord();
        if(e.getSource() == done) try{
            output.close();
        }catch (IOException io) {
            System.err.println(io.toString());
        }
        System.exit(0);
    }

    private void addRecord() {
        String accountNo = "";
        Double money = 0.0;
        if (!account.getText().equals("")) {
            try {
                accountNo = String.valueOf(account.getText());
                if (accountNo != null) {
                    output.writeUTF(accountNo);
                    output.writeUTF(name.getText());
//                    money = new Double(balance.getText());
//                    output.writeDouble(balance.doubleValue());
                }
            } catch (NumberFormatException e) {
                System.err.println(e.toString());
            } catch (IOException e2) {
                System.err.println(e2.toString());
                System.exit(1);
            }
        }
    }
    public static void main(String[] args) {
        new CreateSeqFile();
    }
}
