import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmColorForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmColorForm frame = new frmColorForm();
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
	public frmColorForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 217, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 
		
		final Label lblNameColor = new Label("");
		lblNameColor.setBounds(25,90,143,23);
		contentPane.add(lblNameColor);
		
		JButton btnChangeColor = new JButton("\u0418\u0437\u043C\u0435\u043D\u0438\u0442\u044C \u0446\u0432\u0435\u0442 \u0444\u043E\u0440\u043C\u044B");
		btnChangeColor.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				if(contentPane.getBackground() == Color.red){
					contentPane.setBackground(Color.green); 
					lblNameColor.setText("Зеленый"); 
				}
				else {
					contentPane.setBackground(Color.red);
					lblNameColor.setText("Красный"); 
				}
			}			
		});
		btnChangeColor.setBounds(25, 39, 161, 23); 
		contentPane.add(btnChangeColor, BorderLayout.CENTER);
		
	}

}
