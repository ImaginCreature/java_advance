package oop.advanced.model.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ReadSeqFile extends Frame implements ActionListener {
    private TextField account, name, balance;
    private Button next, done;
    private DataInputStream input;  // 필드에 입력된 account, name, balance 의 스트링 객체를 담는 객체

    public ReadSeqFile() {
        super("Read client's information.");
/*        try{
            input = new DataInputStream(new FileInputStream("client.doc"));
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e1) {
            System.err.println(e1.toString());
//            e1.printStackTrace();
            System.exit(1);
        }*/
        setSize(250, 150);
        setLayout(new GridLayout(4,2));
        account = new TextField();
        account.setEditable(false); // false : 읽기 전용
        add(account);
        add(new Label("Name"));
        name = new TextField(20);
        name.setEditable(false);
        add(name);

        // balance Frame 에 붙이기
        add(new Label("Balance"));
        balance = new TextField(20);
        balance.setEditable(false);
        add(balance);

        next = new Button("Print");
        next.addActionListener(this);   // this = frame
        add(next);
        setVisible(true);

        done = new Button("cancel");
        done.addActionListener(this);   // this = frame
        add(done);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next) readRecord(); // 데이터를 한 레코드씩 읽는 메서드
        else closeFile();
    }

    private void closeFile() {
        try{
            input.close();
            System.exit(0);
        }catch(IOException io){
            System.err.println(io.toString());
            System.exit(1); //exception 처리를 해서 종료되면 1 값.
        }
    }

    public void readRecord() {
        String accountNumber;
        double balance;
        String nameData;

        // exception은 범위가 넓은 것부터 좁은 것으로 좁혀간다.
        try{
            accountNumber = input.readUTF();
            nameData = input.readUTF();
            balance = input.readDouble();

            this.account.setText(String.valueOf(accountNumber));
            this.name.setText(nameData);
            this.balance.setText(String.valueOf(balance));

        } catch (EOFException e1){
            closeFile();

        } catch (IOException e2){
            System.err.println(e2.toString());

        } catch (Exception e3) {
            System.err.println();
        }
    }

    public static void main(String[] args) {
        new ReadSeqFile();
    }
}
