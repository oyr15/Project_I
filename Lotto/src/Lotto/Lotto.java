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
 

 public static void main(String args[]){
  Lotto bb=new Lotto();
  bb.setSize(660,330);
  bb.setVisible(true);
 }
  

 public Lotto(){
  super("Looto by hanjoong");  
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
  
  ok = new JButton(new ImageIcon("imageLotto/start.png"));
  close = new JButton(new ImageIcon("imageLotto/close.png"));
  reset = new JButton(new ImageIcon("imageLotto/reset.png"));
  title = new JLabel(new ImageIcon("imageLotto/title.png"));
  lotto1 = new JLabel(new ImageIcon("imageLotto/lotto1.png"));
  lotto2 = new JLabel(new ImageIcon("imageLotto/lotto2.png"));
  lotto3 = new JLabel(new ImageIcon("imageLotto/lotto3.png"));
  lotto4 = new JLabel(new ImageIcon("imageLotto/lotto3.png"));
  lotto5 = new JLabel(new ImageIcon("imageLotto/lotto2.png"));
  lotto6 = new JLabel(new ImageIcon("imageLotto/lotto4.png"));
  
  ok.setBounds(110,250,130,30); 
  close.setBounds(390,250,130,30);
  title.setBounds(140,20,350,43);
  reset.setBounds(250,250,130,30);
  lotto1.setBounds(20,100,100,100);
  lotto2.setBounds(120,100,100,100);
  lotto3.setBounds(220,100,100,100);
  lotto4.setBounds(320,100,100,100);
  lotto5.setBounds(420,100,100,100);
  lotto6.setBounds(520,100,100,100);
  
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
   int ball[] = new int[45];
   for(int i = 0; i < ball.length; i++ ){
    ball[i] = i + 1;
   }
      int temp = 0;
      int j = 0;
      for(int i = 0; i < 100 ; i++){
       j= (int)(Math.random() * 45);
       temp = ball[0];
       ball[0] = ball[j];
       ball[j] = temp;
      }
      lotto1.setIcon(new ImageIcon("imageLotto/"+ball[0]+".png"));
      lotto2.setIcon(new ImageIcon("imageLotto/"+ball[1]+".png"));
      lotto3.setIcon(new ImageIcon("imageLotto/"+ball[2]+".png"));
      lotto4.setIcon(new ImageIcon("imageLotto/"+ball[3]+".png"));
      lotto5.setIcon(new ImageIcon("imageLotto/"+ball[4]+".png"));
      lotto6.setIcon(new ImageIcon("imageLotto/"+ball[5]+".png"));
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
