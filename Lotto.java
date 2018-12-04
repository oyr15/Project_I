
package Lotto;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.*; 
import java.awt.event.*; 

import javax.swing.*;
import javax.swing.JOptionPane;






public class Lotto extends JFrame implements ActionListener{

	int count=0;

	JButton ok;
	JButton close;
	JButton reset;
	JButton change;
	JLabel title;
	JLabel lotto1;
	JLabel lotto2;
	JLabel lotto3;
	JLabel lotto4;
	JLabel lotto5;
	JLabel lotto6;
	JLabel label;
	JLabel label2;

	JLabel result1;
	JLabel result2;
	JLabel result3;
	JLabel result4;
	JLabel result5;
	JLabel result6;
	JLabel result7;

	
	JLabel rank_result;
	JLabel rank_main;
	JLabel rank1;
	JLabel rank2;
	JLabel rank3;
	JLabel rank4;
	JLabel rank5;
	
	
	JLabel rotationA;
	JLabel rotationB;
	JLabel rotationC;
	JLabel rotationD;
	JLabel rotationE;


	JLabel AN0 = new JLabel(); 
	JLabel AN1 = new JLabel(); 
	JLabel AN2 = new JLabel();
	JLabel AN3 = new JLabel();
	JLabel AN4 = new JLabel();
	JLabel AN5 = new JLabel();

	JLabel BN0 = new JLabel(); 
	JLabel BN1 = new JLabel(); 
	JLabel BN2 = new JLabel();
	JLabel BN3 = new JLabel();
	JLabel BN4 = new JLabel();
	JLabel BN5 = new JLabel();

	JLabel CN0 = new JLabel(); 
	JLabel CN1 = new JLabel(); 
	JLabel CN2 = new JLabel();
	JLabel CN3 = new JLabel();
	JLabel CN4 = new JLabel();
	JLabel CN5 = new JLabel();

	JLabel DN0 = new JLabel(); 
	JLabel DN1 = new JLabel(); 
	JLabel DN2 = new JLabel();
	JLabel DN3 = new JLabel();
	JLabel DN4 = new JLabel();
	JLabel DN5 = new JLabel();


	JLabel EN0 = new JLabel(); 
	JLabel EN1 = new JLabel(); 
	JLabel EN2 = new JLabel();
	JLabel EN3 = new JLabel();
	JLabel EN4 = new JLabel();
	JLabel EN5 = new JLabel();


	JPanel pane;

	final JTextField inputrowField = new JTextField(10);
	final JTextField originalField = new JTextField(10);
	final JTextField changeField = new JTextField(10);

	GridBagConstraints gbc = new GridBagConstraints();

	


	public static void main(String args[]){
		Lotto bb=new Lotto();
		bb.setSize(950, 1100);
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

	public Lotto(String str)
	{

	}


	void writeTest(){

	}

	public void start_display(){
		Container cpane=getContentPane();
		cpane.setLayout(null);
		Color bg=new Color(230,230,250);
		Color kg=new Color(188,210,238);
		cpane.setBackground(bg);


		ok = new JButton("START");
		close = new JButton("CLOSE");
		reset = new JButton("RESET");
		change = new JButton("번호바꾸기");

		label = new JLabel("created by I");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));

		label2 = new JLabel("제 835회 당첨결과");
		label2.setFont(new Font("HY동녘M", Font.PLAIN, 25));

		rotationA = new JLabel("A");
		rotationA.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		rotationB = new JLabel("B");
		rotationB.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		rotationC = new JLabel("C");
		rotationC.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		rotationD = new JLabel("D");
		rotationD.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		rotationE = new JLabel("E");
		rotationE.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));




		title = new JLabel(new ImageIcon("./imageLotto/title.png"));
		lotto1 = new JLabel(new ImageIcon("./imageLotto/lotto1.png"));
		lotto2 = new JLabel(new ImageIcon("./imageLotto/lotto2.png"));
		lotto3 = new JLabel(new ImageIcon("./imageLotto/lotto3.png"));
		lotto4 = new JLabel(new ImageIcon("./imageLotto/lotto3.png"));
		lotto5 = new JLabel(new ImageIcon("./imageLotto/lotto2.png"));
		lotto6 = new JLabel(new ImageIcon("./imageLotto/lotto4.png"));

		result1 = new JLabel(new ImageIcon("./imageLotto/9.png"));
		result2 = new JLabel(new ImageIcon("./imageLotto/10.png"));
		result3 = new JLabel(new ImageIcon("./imageLotto/13.png"));
		result4 = new JLabel(new ImageIcon("./imageLotto/28.png"));
		result5 = new JLabel(new ImageIcon("./imageLotto/38.png"));
		result6 = new JLabel(new ImageIcon("./imageLotto/45.png"));
		result7 = new JLabel(new ImageIcon("./imageLotto/35.png"));

		pane = new JPanel(new GridBagLayout());


		rank_result = new JLabel("등수");
		rank_result.setFont(new Font("", Font.PLAIN, 30));
		rank_result.setForeground(Color.red);
		
		rank_main = new JLabel("");
		rank1 = new JLabel("");
		rank2 = new JLabel("");
		rank3= new JLabel("");
		rank4 = new JLabel("");
		rank5 = new JLabel("");
		
		rank_main.setFont(new Font("", Font.PLAIN, 30));
	      rank_main.setForeground(Color.red);
	      rank1.setFont(new Font("", Font.PLAIN, 30));
	      rank1.setForeground(Color.red);
	      rank2.setFont(new Font("", Font.PLAIN, 30));
	      rank2.setForeground(Color.red);
	      rank3.setFont(new Font("", Font.PLAIN, 30));
	      rank3.setForeground(Color.red);
	      rank4.setFont(new Font("", Font.PLAIN, 30));
	      rank4.setForeground(Color.red);
	      rank5.setFont(new Font("", Font.PLAIN, 30));
	      rank5.setForeground(Color.red);

		ok.setBounds(110,250,130,30); 
		close.setBounds(390,250,130,30);
		title.setBounds(160,20,120,80);
		reset.setBounds(250,250,130,30);
		change.setBounds(530,250,130,30);

		lotto1.setBounds(80,120,100,100);
		lotto2.setBounds(180,120,100,100);
		lotto3.setBounds(280,120,100,100);
		lotto4.setBounds(380,120,100,100);
		lotto5.setBounds(480,120,100,100);
		lotto6.setBounds(580,120,100,100);
		
		
		label.setBounds(new Rectangle(300, 50, 300, 50));
		label2.setBounds(new Rectangle(300, 300, 300, 50));
		result1.setBounds(50, 350, 100, 100);
		result2.setBounds(150, 350, 100, 100);
		result3.setBounds(250, 350, 100, 100);
		result4.setBounds(350, 350, 100, 100);
		result5.setBounds(450, 350, 100, 100);
		result6.setBounds(550, 350, 100, 100);
		result7.setBounds(650, 350, 100, 100);
		rotationA.setBounds(100, 500, 40, 50);
		rotationB.setBounds(100, 600, 40, 50);
		rotationC.setBounds(100, 700, 40, 50);
		rotationD.setBounds(100, 800, 40, 50);
		rotationE.setBounds(100, 900, 40, 50);
		
		
		rank_result.setBounds(780,70,130,30);
		rank_main.setBounds(780,120,100,100);
		rank1.setBounds(780,480,100,100);
		rank2.setBounds(780,580,100,100);
		rank3.setBounds(780,680,100,100);
		rank4.setBounds(780,780,100,100);
		rank5.setBounds(780,880,100,100);




		cpane.add(label);
		cpane.add(label2);
		cpane.add(ok);
		cpane.add(close);
		cpane.add(title);
		cpane.add(change);
		cpane.add(reset);
		cpane.add(lotto1);
		cpane.add(lotto2);
		cpane.add(lotto3);
		cpane.add(lotto4);
		cpane.add(lotto5);
		cpane.add(lotto6);
		cpane.add(result1);
		cpane.add(result2);
		cpane.add(result3);
		cpane.add(result4);
		cpane.add(result5);
		cpane.add(result6);
		cpane.add(result7);
		cpane.add(rotationA);
		cpane.add(rotationB);
		cpane.add(rotationC);
		cpane.add(rotationD);
		cpane.add(rotationE);
		
		cpane.add(rank_result);
		cpane.add(rank_main);
		cpane.add(rank1);
		cpane.add(rank2);
		cpane.add(rank3);
		cpane.add(rank4);
		cpane.add(rank5);
		
		
		AN0.setSize(100, 100);
		AN0.setLocation(150, 480);

		cpane.add(AN0); 
		AN1.setSize(100, 100);
		AN1.setLocation(250, 480);
		cpane.add(AN1); 
		AN2.setSize(100, 100);
		AN2.setLocation(350, 480);
		cpane.add(AN2); 
		AN3.setSize(100, 100);
		AN3.setLocation(450, 480);
		cpane.add(AN3); 
		AN4.setSize(100, 100);
		AN4.setLocation(550, 480);
		cpane.add(AN4); 
		AN5.setSize(100, 100);
		AN5.setLocation(650, 480);
		cpane.add(AN5);
		BN0.setSize(100, 100);
		BN0.setLocation(150, 580);

		cpane.add(BN0); BN1.setSize(100, 100);
		BN1.setLocation(250, 580);
		cpane.add(BN1); BN2.setSize(100, 100);
		BN2.setLocation(350, 580);
		cpane.add(BN2); BN3.setSize(100, 100);
		BN3.setLocation(450, 580);
		cpane.add(BN3); BN4.setSize(100, 100);
		BN4.setLocation(550, 580);
		cpane.add(BN4); BN5.setSize(100, 100);
		BN5.setLocation(650, 580);
		cpane.add(BN5);
		CN0.setSize(100, 100);
		CN0.setLocation(150, 680);
		cpane.add(CN0); CN1.setSize(100, 100);
		CN1.setLocation(250, 680);
		cpane.add(CN1); CN2.setSize(100, 100);
		CN2.setLocation(350, 680);
		cpane.add(CN2); CN3.setSize(100, 100);
		CN3.setLocation(450, 680);
		cpane.add(CN3); CN4.setSize(100, 100);
		CN4.setLocation(550, 680);
		cpane.add(CN4); CN5.setSize(100, 100);
		CN5.setLocation(650, 680);
		cpane.add(CN5);
		DN0.setSize(100, 100);
		DN0.setLocation(150, 780);
		cpane.add(DN0); DN1.setSize(100, 100);
		DN1.setLocation(250, 780);
		cpane.add(DN1); DN2.setSize(100, 100);
		DN2.setLocation(350, 780);
		cpane.add(DN2); DN3.setSize(100, 100);
		DN3.setLocation(450, 780);
		cpane.add(DN3); DN4.setSize(100, 100);
		DN4.setLocation(550, 780);
		cpane.add(DN4); DN5.setSize(100, 100);
		DN5.setLocation(650, 780);
		cpane.add(DN5);
		EN0.setSize(100, 100);
		EN0.setLocation(150, 880);
		cpane.add(EN0); EN1.setSize(100, 100);
		EN1.setLocation(250, 880);
		cpane.add(EN1); EN2.setSize(100, 100);
		EN2.setLocation(350, 880);
		cpane.add(EN2); EN3.setSize(100, 100);
		EN3.setLocation(450, 880);
		cpane.add(EN3); EN4.setSize(100, 100);
		EN4.setLocation(550, 880);
		cpane.add(EN4); EN5.setSize(100, 100);
		EN5.setLocation(650, 880);
		cpane.add(EN5);



		gbc.gridx = 1;
		gbc.gridy = 1;
		pane.add(new JLabel("행 입력:"), gbc);
		
		
		gbc.gridx = 1;
		gbc.gridy = 10;
		pane.add(new JLabel("바꿀 자리:"),gbc);

		
		gbc.gridx = 1;
		gbc.gridy = 20;
		pane.add(new JLabel("변경 번호:"),gbc);

		gbc.anchor = GridBagConstraints.EAST;

		gbc.gridx = 10;
		gbc.gridy = 1;
		pane.add(inputrowField, gbc);

	
		gbc.gridx = 10;
		gbc.gridy = 10;
		pane.add(originalField,gbc);
		
		
		gbc.gridx = 10;
		gbc.gridy = 20;
		pane.add(changeField,gbc);


		
		

		ok.addActionListener(this);
		close.addActionListener(this);
		reset.addActionListener(this);
		change.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){

		int A[] = new int [6], B[] = new int [6], C[] = new int [6],
				D[] = new int [6], E[] = new int [6];
		
		int rank[] = new int[7];
		
		
		rank[0] = 9;
		rank[1] = 10;
		rank[2] = 13;
		rank[3] = 28;
		rank[4] = 35;
		rank[5] = 38;
		rank[6] = 45;
		

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

			
			int x = 0;
		      
		      for(int i = 0; i<6; i++){
		    	  for(int k = 0; k<7;k++) {
		    		  if(ball[i] == rank[k]) {
		    			  x++;
		    		  	
		    		  }
		    	  }
		      }
		      
		      if(x <= 1) {
			      JOptionPane.showMessageDialog(null, "                  꽝!", "당첨결과", JOptionPane.PLAIN_MESSAGE);
			      
			      rank_main.setText("꽝");
			      
			      }
			      if(x ==2) {
				  JOptionPane.showMessageDialog(null, "                  5등", "당첨결과", JOptionPane.PLAIN_MESSAGE);
				  rank_main.setText("5등");
			      }
			      if(x ==3) {
			    	  JOptionPane.showMessageDialog(null, "                  4등", "당첨결과", JOptionPane.PLAIN_MESSAGE);
			    	  rank_main.setText("4등");
			      }
			      if(x ==4) {
					  JOptionPane.showMessageDialog(null, "                  3등", "당첨결과", JOptionPane.PLAIN_MESSAGE);
					  rank_main.setText("3등");
			      }
			      if(x ==5) {
					  JOptionPane.showMessageDialog(null, "                  2등", "당첨결과", JOptionPane.PLAIN_MESSAGE);
					  rank_main.setText("2등");
			      }
			      if(x ==6) {
					  JOptionPane.showMessageDialog(null, "                  1등", "당첨결과", JOptionPane.PLAIN_MESSAGE);
					  rank_main.setText("1등");
			      }
			
			
			count++;
			//System.out.println(count);


			switch(count) {
			case 1: case 6: case 11: case 16: case 21:
				A=ball;
				System.out.print("A :");
				for(int c=0; c<6; c++) {
					System.out.print(A[c] + " ");
					AN0.setIcon(new ImageIcon("./imageLotto/"+A[0]+".png"));
					AN1.setIcon(new ImageIcon("./imageLotto/"+A[1]+".png"));
					AN2.setIcon(new ImageIcon("./imageLotto/"+A[2]+".png"));
					AN3.setIcon(new ImageIcon("./imageLotto/"+A[3]+".png"));
					AN4.setIcon(new ImageIcon("./imageLotto/"+A[4]+".png"));
					AN5.setIcon(new ImageIcon("./imageLotto/"+A[5]+".png"));

				}
				System.out.println( );
				if(x <= 1) {
				      
				      rank1.setText("꽝");
				      }
				      if(x ==2) {
				      rank1.setText("5등");
				      }
				      if(x ==3) {
				      rank1.setText("4등");
				      }
				      if(x ==4) {
				      rank1.setText("3등");
				      }
				      if(x ==5) {
				      rank1.setText("2등");
				      }
				      if(x ==6) {
				      rank1.setText("1등");
				      }
				break;
			case 2: case 7: case 12: case 17: case 22:
				B=ball;
				System.out.print("B :");
				for(int c=0; c<6; c++) {
					System.out.print(B[c] + " ");
					BN0.setIcon(new ImageIcon("./imageLotto/"+B[0]+".png"));
					BN1.setIcon(new ImageIcon("./imageLotto/"+B[1]+".png"));
					BN2.setIcon(new ImageIcon("./imageLotto/"+B[2]+".png"));
					BN3.setIcon(new ImageIcon("./imageLotto/"+B[3]+".png"));
					BN4.setIcon(new ImageIcon("./imageLotto/"+B[4]+".png"));
					BN5.setIcon(new ImageIcon("./imageLotto/"+B[5]+".png"));
				}
				System.out.println( );
				if(x <= 1) {
				      
				      rank2.setText("꽝");
				      rank2.setFont(new Font("", Font.PLAIN, 30));
				      rank2.setForeground(Color.red);
				      }
				      if(x ==2) {
				    	  rank2.setText("5등");
				      }
				      if(x ==3) {
				    	  rank2.setText("4등");
				      }
				      if(x ==4) {
				    	  rank2.setText("3등");
				      }
				      if(x ==5) {
				    	  rank2.setText("2등");
				      }
				      if(x ==6) {
				    	  rank2.setText("1등");
				      }
				break;
			case 3: case 8: case 13: case 18: case 23:
				C=ball;
				System.out.print("C :");
				for(int c=0; c<6; c++) {
					System.out.print(C[c] + " ");
					CN0.setIcon(new ImageIcon("./imageLotto/"+C[0]+".png"));
					CN1.setIcon(new ImageIcon("./imageLotto/"+C[1]+".png"));
					CN2.setIcon(new ImageIcon("./imageLotto/"+C[2]+".png"));
					CN3.setIcon(new ImageIcon("./imageLotto/"+C[3]+".png"));
					CN4.setIcon(new ImageIcon("./imageLotto/"+C[4]+".png"));
					CN5.setIcon(new ImageIcon("./imageLotto/"+C[5]+".png"));
				}
				System.out.println( );
				if(x <= 1) {
				      
				      rank3.setText("꽝");
				      }
				      if(x ==2) {
				      rank3.setText("5등");
				      }
				      if(x ==3) {
				      rank3.setText("4등");
				      }
				      if(x ==4) {
				      rank3.setText("3등");
				      }
				      if(x ==5) {
				      rank3.setText("2등");
				      }
				      if(x ==6) {
				      rank3.setText("1등");
				      }
				break;
			case 4: case 9: case 14: case 19: case 24:
				D=ball;
				System.out.print("D :");
				for(int c=0; c<6; c++) {
					System.out.print(D[c] + " ");
					DN0.setIcon(new ImageIcon("./imageLotto/"+D[0]+".png"));
					DN1.setIcon(new ImageIcon("./imageLotto/"+D[1]+".png"));
					DN2.setIcon(new ImageIcon("./imageLotto/"+D[2]+".png"));
					DN3.setIcon(new ImageIcon("./imageLotto/"+D[3]+".png"));
					DN4.setIcon(new ImageIcon("./imageLotto/"+D[4]+".png"));
					DN5.setIcon(new ImageIcon("./imageLotto/"+D[5]+".png"));
				}
				System.out.println( );
				if(x <= 1) {
				      
				      rank4.setText("꽝");
				      }
				      if(x ==2) {
				      rank4.setText("5등");
				      }
				      if(x ==3) {
				      rank4.setText("4등");
				      }
				      if(x ==4) {
				      rank4.setText("3등");
				      }
				      if(x ==5) {
				      rank4.setText("2등");
				      }
				      if(x ==6) {
				      rank4.setText("1등");
				      }
				break;
			case 5: case 10: case 15: case 20: case 25:
				E=ball;
				System.out.print("E :");
				for(int c=0; c<6; c++) {
					System.out.print(E[c] + " ");
					EN0.setIcon(new ImageIcon("./imageLotto/"+E[0]+".png"));
					EN1.setIcon(new ImageIcon("./imageLotto/"+E[1]+".png"));
					EN2.setIcon(new ImageIcon("./imageLotto/"+E[2]+".png"));
					EN3.setIcon(new ImageIcon("./imageLotto/"+E[3]+".png"));
					EN4.setIcon(new ImageIcon("./imageLotto/"+E[4]+".png"));
					EN5.setIcon(new ImageIcon("./imageLotto/"+E[5]+".png"));
				}
				System.out.println( );
				
				if(x <= 1) {
				      
				      rank4.setText("꽝");
				      }
				      if(x ==2) {
				      rank4.setText("5등");
				      }
				      if(x ==3) {
				      rank4.setText("4등");
				      }
				      if(x ==4) {
				      rank4.setText("3등");
				      }
				      if(x ==5) {
				      rank4.setText("2등");
				      }
				      if(x ==6) {
				      rank4.setText("1등");
				      }
				break;
			default:
				break;
			}

			
			
			
			
			
			
			
			
			
			/*
			switch(count) {
			case 1:
				A=ball;
				System.out.print("A :");
				for(int c=0; c<6; c++) {
					System.out.print(A[c] + " ");
					AN0.setIcon(new ImageIcon("./imageLotto/"+A[0]+".png"));
					AN1.setIcon(new ImageIcon("./imageLotto/"+A[1]+".png"));
					AN2.setIcon(new ImageIcon("./imageLotto/"+A[2]+".png"));
					AN3.setIcon(new ImageIcon("./imageLotto/"+A[3]+".png"));
					AN4.setIcon(new ImageIcon("./imageLotto/"+A[4]+".png"));
					AN5.setIcon(new ImageIcon("./imageLotto/"+A[5]+".png"));

				}
				System.out.println( );
				break;
			case 2:
				B=ball;
				System.out.print("B :");
				for(int c=0; c<6; c++) {
					System.out.print(B[c] + " ");
					BN0.setIcon(new ImageIcon("./imageLotto/"+B[0]+".png"));
					BN1.setIcon(new ImageIcon("./imageLotto/"+B[1]+".png"));
					BN2.setIcon(new ImageIcon("./imageLotto/"+B[2]+".png"));
					BN3.setIcon(new ImageIcon("./imageLotto/"+B[3]+".png"));
					BN4.setIcon(new ImageIcon("./imageLotto/"+B[4]+".png"));
					BN5.setIcon(new ImageIcon("./imageLotto/"+B[5]+".png"));
				}
				System.out.println( );
				break;
			case 3:
				C=ball;
				System.out.print("C :");
				for(int c=0; c<6; c++) {
					System.out.print(C[c] + " ");
					CN0.setIcon(new ImageIcon("./imageLotto/"+C[0]+".png"));
					CN1.setIcon(new ImageIcon("./imageLotto/"+C[1]+".png"));
					CN2.setIcon(new ImageIcon("./imageLotto/"+C[2]+".png"));
					CN3.setIcon(new ImageIcon("./imageLotto/"+C[3]+".png"));
					CN4.setIcon(new ImageIcon("./imageLotto/"+C[4]+".png"));
					CN5.setIcon(new ImageIcon("./imageLotto/"+C[5]+".png"));
				}
				System.out.println( );
				break;
			case 4:
				D=ball;
				System.out.print("D :");
				for(int c=0; c<6; c++) {
					System.out.print(D[c] + " ");
					DN0.setIcon(new ImageIcon("./imageLotto/"+D[0]+".png"));
					DN1.setIcon(new ImageIcon("./imageLotto/"+D[1]+".png"));
					DN2.setIcon(new ImageIcon("./imageLotto/"+D[2]+".png"));
					DN3.setIcon(new ImageIcon("./imageLotto/"+D[3]+".png"));
					DN4.setIcon(new ImageIcon("./imageLotto/"+D[4]+".png"));
					DN5.setIcon(new ImageIcon("./imageLotto/"+D[5]+".png"));
				}
				System.out.println( );
				break;
			case 5:
				E=ball;
				System.out.print("E :");
				for(int c=0; c<6; c++) {
					System.out.print(E[c] + " ");
					EN0.setIcon(new ImageIcon("./imageLotto/"+E[0]+".png"));
					EN1.setIcon(new ImageIcon("./imageLotto/"+E[1]+".png"));
					EN2.setIcon(new ImageIcon("./imageLotto/"+E[2]+".png"));
					EN3.setIcon(new ImageIcon("./imageLotto/"+E[3]+".png"));
					EN4.setIcon(new ImageIcon("./imageLotto/"+E[4]+".png"));
					EN5.setIcon(new ImageIcon("./imageLotto/"+E[5]+".png"));
				}
				System.out.println( );
				break;
			default:
				break;
			}

			*/



		



		}else if(e.getSource() == close){
			System.exit(0);
		}else if(e.getSource() == reset){
			lotto1.setIcon(new ImageIcon("imageLotto/lotto1.jpg"));
			lotto2.setIcon(new ImageIcon("imageLotto/lotto2.jpg"));
			lotto3.setIcon(new ImageIcon("imageLotto/lotto3.jpg"));
			lotto4.setIcon(new ImageIcon("imageLotto/lotto3.jpg"));
			lotto5.setIcon(new ImageIcon("imageLotto/lotto2.jpg"));
			lotto6.setIcon(new ImageIcon("imageLotto/lotto4.jpg"));
			
			AN0.setIcon(new ImageIcon());
			AN1.setIcon(new ImageIcon());
			AN2.setIcon(new ImageIcon());
			AN3.setIcon(new ImageIcon());
			AN4.setIcon(new ImageIcon());
			AN5.setIcon(new ImageIcon());
			
			BN0.setIcon(new ImageIcon());
			BN1.setIcon(new ImageIcon());
			BN2.setIcon(new ImageIcon());
			BN3.setIcon(new ImageIcon());
			BN4.setIcon(new ImageIcon());
			BN5.setIcon(new ImageIcon());
			
			CN0.setIcon(new ImageIcon());
			CN1.setIcon(new ImageIcon());
			CN2.setIcon(new ImageIcon());
			CN3.setIcon(new ImageIcon());
			CN4.setIcon(new ImageIcon());
			CN5.setIcon(new ImageIcon());
			
			DN0.setIcon(new ImageIcon());
			DN1.setIcon(new ImageIcon());
			DN2.setIcon(new ImageIcon());
			DN3.setIcon(new ImageIcon());
			DN4.setIcon(new ImageIcon());
			DN5.setIcon(new ImageIcon());
			
			EN0.setIcon(new ImageIcon());
			EN1.setIcon(new ImageIcon());
			EN2.setIcon(new ImageIcon());
			EN3.setIcon(new ImageIcon());
			EN4.setIcon(new ImageIcon());
			EN5.setIcon(new ImageIcon());
			

			rank_main.setText(" ");
			rank1.setText(" ");
			rank2.setText(" ");
			rank3.setText(" ");
			rank4.setText(" ");
			rank5.setText(" ");
			
			
			
		}










		if(e.getSource() == change) {

			int reply = JOptionPane.showConfirmDialog(null, pane, "로또번호 변경하기", JOptionPane.OK_CANCEL_OPTION
					, JOptionPane.PLAIN_MESSAGE);

			if (reply ==JOptionPane.OK_OPTION) {
				//get user input

				String inputrow = inputrowField.getText();
				String originalNum = originalField.getText();
				String changeNum = new String(changeField.getText());
				
				int rNum = Integer.parseInt(inputrow);
				int ONum = Integer.parseInt(originalNum);
				int CNum = Integer.parseInt(changeNum);
				


				if ((rNum >= 1 && rNum <= 5) && (ONum>=1 && ONum <=6) && (CNum>=1 && CNum<=45)){
					System.out.println("행 번호 : " + rNum);
					System.out.println("바꿀 자리 : " + ONum);
					System.out.println("변경 번호 : " + CNum);
				}
				else
					JOptionPane.showMessageDialog(null, "행 번호는 1~5, 자릿수는 1~6, 변경번호는 1~45 사이의 번호를 입력해주세요.");


				
				if (rNum==1){
					switch(ONum) {
					case 1:
						AN0.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 2:
						AN1.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 3:
						AN2.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 4:
						AN3.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 5:
						AN4.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 6:
						AN5.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					default :
						break;
					}
				}
				
				
				else if (rNum==2) {
					switch(ONum) {
					case 1:
						BN0.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 2:
						BN1.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 3:
						BN2.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 4:
						BN3.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 5:
						BN4.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 6:
						BN5.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					default :
						break;
					}
				}
				
				
				else if (rNum==3) {
					switch(ONum) {
					case 1:
						CN0.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 2:
						CN1.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 3:
						CN2.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 4:
						CN3.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 5:
						CN4.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 6:
						CN5.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					default :
						break;
					}
				}
				
				
				else if (rNum==4) {
					switch(ONum) {
					case 1:
						DN0.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 2:
						DN1.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 3:
						DN2.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 4:
						DN3.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 5:
						DN4.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 6:
						DN5.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					default :
						break;
					}
				}
				
				
				else if (rNum==5) {
					switch(ONum) {
					case 1:
						EN0.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 2:
						EN1.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 3:
						EN2.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 4:
						EN3.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 5:
						EN4.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					case 6:
						EN5.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
						break;
					default :
						break;
					}
				}
				
				
			



			}




		}






		

	}

}
