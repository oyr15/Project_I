package Lotto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.*; 
import java.awt.event.*; 

import javax.swing.*;

public class Lotto extends JFrame implements ActionListener{
  JButton ok;
  JButton close;
  JButton reset;
  JLabel title;
  JLabel lotto1;
  JLabel lotto2;
  JLabel lotto3;
  JLabel lotto4;
  JLabel lotto5;
  JLabel lotto6;
  JLabel label;
 

 public static void main(String args[]){
  Lotto bb=new Lotto();
  bb.setSize(660,400);
  bb.setVisible(true);
 }
  

 public Lotto(){
  super("I조 로또추첨프로그램");  
  this.addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) {System.exit(0);}});
     try{
     UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
     SwingUtilities.updateComponentTreeUI(Lotto.this);
     }catch(Exception e){ }
     writeTest();
     start_display();
 }
 void writeTest(){
  
 }

 public void start_display(){
  Container cpane=getContentPane();
  cpane.setLayout(null);
  Color bg=new Color(230,230,250);
  Color kg=new Color(188,210,238);
  cpane.setBackground(bg);
  
  //ok = new JButton(new ImageIcon("./imageLotto/start.jpeg"));
  //close = new JButton(new ImageIcon("imageLotto/close.jpeg"));
  //reset = new JButton(new ImageIcon("imageLotto/reset.jpeg"));
  
  //cpane.add(new JButton("OK"));
  //cpane.add(new JButton("close"));
  //cpane.add(new JButton("reset"));
  
  ok = new JButton("START");
  close = new JButton("CLOSE");
  reset = new JButton("RESET");
  
  label = new JLabel("created by I");
  label.setForeground(Color.BLACK);
  label.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
  
  title = new JLabel(new ImageIcon("./imageLotto/title.png"));
  lotto1 = new JLabel(new ImageIcon("./imageLotto/lotto1.png"));
  lotto2 = new JLabel(new ImageIcon("./imageLotto/lotto2.png"));
  lotto3 = new JLabel(new ImageIcon("./imageLotto/lotto3.png"));
  lotto4 = new JLabel(new ImageIcon("./imageLotto/lotto3.png"));
  lotto5 = new JLabel(new ImageIcon("./imageLotto/lotto2.png"));
  lotto6 = new JLabel(new ImageIcon("./imageLotto/lotto4.png"));
  
  ok.setBounds(110,250,130,30); 
  close.setBounds(390,250,130,30);
  title.setBounds(160,20,120,80);
  reset.setBounds(250,250,130,30);
  lotto1.setBounds(20,120,100,100);
  lotto2.setBounds(120,120,100,100);
  lotto3.setBounds(220,120,100,100);
  lotto4.setBounds(320,120,100,100);
  lotto5.setBounds(420,120,100,100);
  lotto6.setBounds(520,120,100,100);
  label.setBounds(new Rectangle(300, 50, 300, 50));
  
  
  cpane.add(label);
  
  cpane.add(ok);
  cpane.add(close);
  cpane.add(title);
  cpane.add(reset);
  cpane.add(lotto1);
  cpane.add(lotto2);
  cpane.add(lotto3);
  cpane.add(lotto4);
  cpane.add(lotto5);
  cpane.add(lotto6);
  
  ok.addActionListener(this);
  close.addActionListener(this);
  reset.addActionListener(this);
 }
 
 public void actionPerformed(ActionEvent e){
  
  
  if(e.getSource() == ok){
   int ball[] = new int[45];  //로또 번호는 1부터 45까지
   for(int i = 0; i < ball.length; i++ ){
    ball[i] = i + 1; //i=0이면 ball[0]은 1
   }
      int temp = 0; //임시값 저장
      int j = 0;
      for(int i = 0; i < 100 ; i++){ //랜덤화
       j= (int)(Math.random() * 45);  //랜덤한 값을 j에 저장
       temp = ball[0];  //ball[0]을 temp에 임시 저장
       ball[0] = ball[j];  //랜덤값 ball[j]를 ball[0]에 저장
       ball[j] = temp;		//임시저장한 값을 ball[j]에 저장
      }
      lotto1.setIcon(new ImageIcon("./imageLotto/"+ball[0]+".png"));
      lotto2.setIcon(new ImageIcon("./imageLotto/"+ball[1]+".png"));
      lotto3.setIcon(new ImageIcon("./imageLotto/"+ball[2]+".png"));
      lotto4.setIcon(new ImageIcon("./imageLotto/"+ball[3]+".png"));
      lotto5.setIcon(new ImageIcon("./imageLotto/"+ball[4]+".png"));
      lotto6.setIcon(new ImageIcon("./imageLotto/"+ball[5]+".png"));
  }else if(e.getSource() == close){
   System.exit(0);
  }else if(e.getSource() == reset){
   lotto1.setIcon(new ImageIcon("imageLotto/lotto1.png"));
   lotto2.setIcon(new ImageIcon("imageLotto/lotto2.png"));
   lotto3.setIcon(new ImageIcon("imageLotto/lotto3.png"));
   lotto4.setIcon(new ImageIcon("imageLotto/lotto3.png"));
   lotto5.setIcon(new ImageIcon("imageLotto/lotto2.png"));
   lotto6.setIcon(new ImageIcon("imageLotto/lotto4.png"));
  }
  

 }

}