
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

	JLabel rotationA;
	JLabel rotationB;
	JLabel rotationC;
	JLabel rotationD;
	JLabel rotationE;

	/*JLabel A[] = new JLabel[6];
	JLabel B[] = new JLabel[6];
	JLabel C[] = new JLabel[6];
	JLabel D[] = new JLabel[6];
	JLabel E[] = new JLabel[6];
	 */

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
	final JPasswordField changeField = new JPasswordField(10);

	GridBagConstraints gbc = new GridBagConstraints();

	
	/*GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, 
			GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
			new Insets(2, 2, 2, 2), 0, 0);
	*/


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
		rotationA.setBounds(100, 500, 40, 50);
		rotationB.setBounds(100, 600, 40, 50);
		rotationC.setBounds(100, 700, 40, 50);
		rotationD.setBounds(100, 800, 40, 50);
		rotationE.setBounds(100, 900, 40, 50);



		/*for(int k=0; k<6; k++){
			int l=0;
			A[k].setBounds(200 + l,500, 100, 100);
			B[k].setBounds(200 + l,600, 100, 100);
			C[k].setBounds(200 + l,700, 100, 100);
			D[k].setBounds(200 + l,800, 100, 100);
			E[k].setBounds(200 + l,900, 100, 100);
			l=l+100;
		}
		 */



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
		pane.add(originalField,gbc);

	
		gbc.gridx = 10;
		gbc.gridy = 10;
		pane.add(changeField,gbc);
		
		
		gbc.gridx = 10;
		gbc.gridy = 20;
		pane.add(inputrowField, gbc);




		ok.addActionListener(this);
		close.addActionListener(this);
		reset.addActionListener(this);
		change.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){

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

			count++;
			//System.out.println(count);


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

				String inputrow = inputrowField.getText();
				String originalNum = originalField.getText();
				String changeNum = new String(changeField.getPassword());

				int ONum = Integer.parseInt(originalNum);
				int CNum = Integer.parseInt(changeNum);
				


				if ((ONum>=1 && ONum <=6) && (CNum>=1 && CNum<=45)){
					System.out.println("행 번호 : ");
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
