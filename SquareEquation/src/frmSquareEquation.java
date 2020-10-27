import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSquareEquation extends JFrame {

	private JPanel contentPane;
	private JTextField txt_a;
	private JTextField txt_b;
	private JTextField txt_c;
	private JLabel lbl_a;
	private JLabel lbl_b;
	private JLabel lblRightPart;
	private JLabel label;
	private JLabel lblSolution;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_a = new JTextField();
		txt_a.setBounds(5,64, 58, 21);
		txt_a.setText("0");
		txt_a.setFont(new Font("Tahoma",Font.PLAIN,14));
		contentPane.add(txt_a);
		txt_a.setColumns(10);
		
		txt_b = new JTextField();
		txt_b.setBounds(108,64, 58, 21);
		txt_b.setText("0");
		txt_b.setFont(new Font("Tahoma",Font.PLAIN,14));
		contentPane.add(txt_b);
		txt_b.setColumns(10);
		
		txt_c = new JTextField();
		txt_c.setBounds(200,64, 58, 21);
		txt_c.setText("0");
		txt_c.setFont(new Font("Tahoma",Font.PLAIN,14));
		contentPane.add(txt_c);
		txt_c.setColumns(10);
		
		JLabel lblTaskName = new JLabel("Квадратное уравнение");
		lblTaskName.setBounds(83, 15, 184, 30);
		lblTaskName.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(lblTaskName);
		
		lbl_a = new JLabel("x2 + ");
		lbl_a.setBounds(69, 67, 40, 15);
		lbl_a.setFont(new Font("Tahoma",Font.PLAIN,14));
		contentPane.add(lbl_a);
		
		lbl_b = new JLabel("x + ");
		lbl_b.setBounds(172, 67, 32, 15);
		lbl_b.setFont(new Font("Tahoma",Font.PLAIN,14));
		contentPane.add(lbl_b);
		
		lblRightPart = new JLabel("=0");
		lblRightPart.setBounds(268, 67, 20, 15);
		lblRightPart.setFont(new Font("Tahoma",Font.PLAIN,14));
		contentPane.add(lblRightPart);
		
		JButton btnSolve = new JButton("Решить уравнение");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a,b,c;
				try {
					a=Double.parseDouble(txt_a.getText());
				}
				catch(NumberFormatException nfe) {
					a=0.0;
					txt_a.setText("0.0");
				}
				try {
					b=Double.parseDouble(txt_b.getText());
				}
				catch(NumberFormatException nfe) {
					b=0.0;
					txt_b.setText("0.0");
				}
				try {
					c=Double.parseDouble(txt_c.getText());
				}
				catch(NumberFormatException nfe) {
					c=0.0;
					txt_c.setText("0.0");
				}
				double D=b*b-4*a*c;
				double x1,x2;
				String Sol="";
				if(D<0.0)
					Sol = "Действательных корней нет";
				else if(D > 0. && a != 0.){
					x1 = (-b + Math.sqrt(D)) / (2. * a);
					x2 = (-b - Math.sqrt(D)) / (2. * a);
					Sol = "Корни: x1 = " + x1 + ", x2 = " + x2; 
				}
				else if(D == 0.0 && a != 0.0){ 
					x1 = -b / (2. * a); 
					Sol = "Корень x = " + x1; 
				}
				else if(a == 0 && b != 0.){
					x1 = -c / b; 
					Sol = "Корень x = " + x1;
				}
				lblSolution.setText(Sol); 
			}
		});
		btnSolve.setBounds(69, 155, 220, 21);
		contentPane.add(btnSolve);
		
		label = new JLabel("Решение");
		label.setBounds(150, 187, 64, 21);
		label.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(label);
		
		lblSolution = new JLabel("");
		lblSolution.setBackground(Color.white);
		lblSolution.setBounds(10, 208, 326, 30);
		lblSolution.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolution.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(lblSolution);
		

		
	}
}
