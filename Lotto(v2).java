
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
	
	JLabel rotationA;
	JLabel rotationB;
	JLabel rotationC;
	JLabel rotationD;
	JLabel rotationE;

	JPanel pane;

	//Lotto tf2;
	final JTextField originalField = new JTextField(10);
	final JPasswordField changeField = new JPasswordField(10);

	GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, 
			GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
			new Insets(2, 2, 2, 2), 0, 0);



	public static void main(String args[]){
		Lotto bb=new Lotto();
		bb.setSize(660, 1000);
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

		label2 = new JLabel("제 833회 당첨결과");
		label2.setFont(new Font("HY동녘M", Font.PLAIN, 25));
		
		rotationA = new JLabel("A   ");
		rotationA.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		rotationB = new JLabel("B   ");
		rotationB.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		rotationC = new JLabel("C   ");
		rotationC.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		rotationD = new JLabel("D   ");
		rotationD.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		rotationE = new JLabel("E   ");
		rotationE.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		



		title = new JLabel(new ImageIcon("./imageLotto/title.png"));
		lotto1 = new JLabel(new ImageIcon("./imageLotto/lotto1.png"));
		lotto2 = new JLabel(new ImageIcon("./imageLotto/lotto2.png"));
		lotto3 = new JLabel(new ImageIcon("./imageLotto/lotto3.png"));
		lotto4 = new JLabel(new ImageIcon("./imageLotto/lotto3.png"));
		lotto5 = new JLabel(new ImageIcon("./imageLotto/lotto2.png"));
		lotto6 = new JLabel(new ImageIcon("./imageLotto/lotto4.png"));

		result1 = new JLabel(new ImageIcon("./imageLotto/12.png"));
		result2 = new JLabel(new ImageIcon("./imageLotto/18.png"));
		result3 = new JLabel(new ImageIcon("./imageLotto/30.png"));
		result4 = new JLabel(new ImageIcon("./imageLotto/39.png"));
		result5 = new JLabel(new ImageIcon("./imageLotto/41.png"));
		result6 = new JLabel(new ImageIcon("./imageLotto/42.png"));
		result7 = new JLabel(new ImageIcon("./imageLotto/19.png"));

		pane = new JPanel(new GridBagLayout());




		ok.setBounds(110,250,130,30); 
		close.setBounds(390,250,130,30);
		title.setBounds(160,20,120,80);
		reset.setBounds(250,250,130,30);
		change.setBounds(530,250,130,30);

		lotto1.setBounds(20,120,100,100);
		lotto2.setBounds(120,120,100,100);
		lotto3.setBounds(220,120,100,100);
		lotto4.setBounds(320,120,100,100);
		lotto5.setBounds(420,120,100,100);
		lotto6.setBounds(520,120,100,100);
		label.setBounds(new Rectangle(300, 50, 300, 50));
		label2.setBounds(new Rectangle(200, 300, 300, 50));
		result1.setBounds(0, 350, 100, 100);
		result2.setBounds(110, 350, 100, 100);
		result3.setBounds(210, 350, 100, 100);
		result4.setBounds(310, 350, 100, 100);
		result5.setBounds(410, 350, 100, 100);
		result6.setBounds(510, 350, 100, 100);
		result7.setBounds(610, 350, 100, 100);
		rotationA.setBounds(100, 500, 100, 50);
		rotationB.setBounds(100, 600, 100, 50);
		rotationC.setBounds(100, 700, 100, 50);
		rotationD.setBounds(100, 800, 100, 50);
		rotationE.setBounds(100, 900, 100, 50);
		
		
		



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
		
		
		pane.add(new JLabel("바꿀 자리:"), gbc);

		gbc.gridy=1;
		pane.add(new JLabel("변경 번호:"), gbc);

		gbc.gridx=1;
		gbc.gridy=0;
		gbc.anchor = GridBagConstraints.EAST;
		pane.add(originalField, gbc);

		gbc.gridy=1;
		pane.add(changeField, gbc);



		ok.addActionListener(this);
		close.addActionListener(this);
		reset.addActionListener(this);
		change.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		//static int count=5;
		int A[] = new int [6], B[] = new int [6], C[] = new int [6],
				D[] = new int [6], E[] = new int [6];

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
			
			//count++;
		}else if(e.getSource() == close){
			System.exit(0);
		}else if(e.getSource() == reset){
			lotto1.setIcon(new ImageIcon("imageLotto/lotto1.jpg"));
			lotto2.setIcon(new ImageIcon("imageLotto/lotto2.jpg"));
			lotto3.setIcon(new ImageIcon("imageLotto/lotto3.jpg"));
			lotto4.setIcon(new ImageIcon("imageLotto/lotto3.jpg"));
			lotto5.setIcon(new ImageIcon("imageLotto/lotto2.jpg"));
			lotto6.setIcon(new ImageIcon("imageLotto/lotto4.jpg"));
		}
		
		
		
		
		
		


		if(e.getSource() == change) {

			int reply = JOptionPane.showConfirmDialog(null, pane, "로또번호 변경하기", JOptionPane.OK_CANCEL_OPTION
					, JOptionPane.PLAIN_MESSAGE);

			if (reply ==JOptionPane.OK_OPTION) {
				//get user input
				
				
				String originalNum = originalField.getText();
				String changeNum = new String(changeField.getPassword());
				
				int ONum = Integer.parseInt(originalNum);
				int CNum = Integer.parseInt(changeNum);
				
				
				if ((ONum>=1 && ONum <=6) && (CNum>=1 && CNum<=45)){
				
					System.out.println("바꿀 자리 : " + ONum);
					System.out.println("변경 번호 : " + CNum);
				}
				else
					JOptionPane.showMessageDialog(null, "자릿수는 1~6, 변경번호는 1~45 사이의 번호를 입력해주세요.");
					
				
			

				switch(ONum) {
				case 1:
					lotto1.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
					break;
				case 2:
					lotto2.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
					break;
				case 3:
					lotto3.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
					break;
				case 4:
					lotto4.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
					break;
				case 5:
					lotto5.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
					break;
				case 6:
					lotto6.setIcon(new ImageIcon("./imageLotto/"+CNum+".png"));
					break;
				default :
					break;
				}



			}




		}








	}

}
