import java.awt.Font;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.*;

public class cilent extends JFrame {

  Socket socket;
  BufferedReader br;
  PrintWriter out;
//Declare components
  private JLabel heading = new JLabel("Cilent Area");
  private JTextArea messageArea = new JTextArea();
  private JTextField messageInput = new JTextField();
  private Font font = new Font("Roboto", Font.BOLD, 20);

  // constructor
public cilent() {
  try {
    // System.out.println("Sending request to server");
    // socket=new Socket("127.0.0.1",7777);
    // System.out.println("connection done");
    // br=new BufferedReader(new InputStreamReader(socket.getInputStream());
    // out =new PrintWriter(socket.getOutputStream());

    createGUI();
    // startReading();
    // startWriting();
  
  }catch(Exception e){
    //TODO: handle eception
  }

}
private void createGUI(){
  //gui code.........
  this.setTitle("Cilent messager[END]");
  this.setSize(600, 600);
  this.setLocationRelativeTo(null);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  //coding for component
  heading.setFont(font);
  messageArea.setFont(font);
  messageInput.setFont(font);
  //frame layout set
  this.setLayout(new BorderLayout());
  //adding

}
}