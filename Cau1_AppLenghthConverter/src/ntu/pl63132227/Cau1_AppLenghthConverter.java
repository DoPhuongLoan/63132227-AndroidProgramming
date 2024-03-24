package ntu.pl63132227;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cau1_AppLenghthConverter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnhap;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cau1_AppLenghthConverter frame = new Cau1_AppLenghthConverter();
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
	public Cau1_AppLenghthConverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 579);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(227, 2, 2));
		panel.setBounds(0, 0, 680, 92);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đổi Đơn Vị Đo Độ Dài");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(203, 23, 299, 41);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("Nhập Số: ");
		lblNewLabel2.setBackground(new Color(255, 255, 255));
		lblNewLabel2.setForeground(new Color(255, 255, 255));
		lblNewLabel2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel2.setBounds(129, 132, 104, 35);
		contentPane.add(lblNewLabel2);
		
		txtnhap = new JTextField();
		txtnhap.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtnhap.setBounds(243, 128, 257, 42);
		contentPane.add(txtnhap);
		txtnhap.setColumns(10);
		
		JLabel lblNewLabel3 = new JLabel("Đổi:  ");
		lblNewLabel3.setForeground(new Color(255, 255, 255));
		lblNewLabel3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel3.setBounds(75, 202, 59, 30);
		contentPane.add(lblNewLabel3);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBackground(new Color(255, 255, 255));
		comboBox1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Kilomet", "Hectomet", "Decamet", "Met", "Decimet", "Centimet", "Milimet"}));
		comboBox1.setBounds(155, 202, 154, 30);
		contentPane.add(comboBox1);
		
		JLabel lblNewLabel4 = new JLabel("Sang:  ");
		lblNewLabel4.setForeground(Color.WHITE);
		lblNewLabel4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel4.setBounds(337, 202, 75, 30);
		contentPane.add(lblNewLabel4);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setBackground(new Color(255, 255, 255));
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Kilomet", "Hectomet", "Decamet", "Met", "Decimet", "Centimet", "Milimet"}));
		comboBox2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		comboBox2.setBounds(430, 202, 154, 30);
		contentPane.add(comboBox2);
		
		txtkq = new JTextField();
		txtkq.setEnabled(false);
		txtkq.setForeground(new Color(255, 255, 255));
		txtkq.setBackground(new Color(255, 255, 255));
		txtkq.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtkq.setColumns(10);
		txtkq.setBounds(243, 371, 257, 42);
		txtkq.setForeground(Color.BLACK);
		contentPane.add(txtkq);
		
		JLabel lblKtQua = new JLabel("Kết Quả: ");
		lblKtQua.setForeground(Color.WHITE);
		lblKtQua.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblKtQua.setBackground(Color.WHITE);
		lblKtQua.setBounds(129, 375, 104, 35);
		contentPane.add(lblKtQua);
		
		JLabel lblthongbao = new JLabel("");
		lblthongbao.setBackground(new Color(255, 255, 255));
		lblthongbao.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblthongbao.setForeground(new Color(255, 0, 0));
		lblthongbao.setBounds(213, 446, 328, 42);
		contentPane.add(lblthongbao);
		
		JButton btnkq = new JButton("");
		btnkq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double nhap = Double.parseDouble(txtnhap.getText());
					if(nhap < 0) {
						txtkq.setText("");
						lblthongbao.setText("Không hỗ trợ số âm!");
						return;
					}
					String gtchuyen = (String)comboBox1.getSelectedItem();
					String gtdoi = (String)comboBox2.getSelectedItem();
					double kq = kqchuyendoi(nhap, gtchuyen, gtdoi);
					txtkq.setText(Double.toString(kq));
					lblthongbao.setText("");
				}catch(Exception ex) {
					txtnhap.setText("");
					lblthongbao.setText("Vui lòng nhập số hợp lệ!");
					return;
				}
		    }
		});
		btnkq.setBackground(new Color(255, 255, 255));
		btnkq.setIcon(new ImageIcon("D:\\MyProject\\63132227-AndroidProgramming\\Cau1_AppLenghthConverter\\src\\ntu\\pl63132227\\loop.png"));
		btnkq.setBounds(290, 295, 133, 42);
		contentPane.add(btnkq);
	}

	protected double kqchuyendoi(double nhap, String gtchuyen, String gtdoi) {
		double Ketqua = 0;
		if(gtchuyen.equals("Kilomet")) {
			Ketqua = DoiTuKm(nhap,gtdoi);
		}else if(gtchuyen.equals("Hectomet")) {
			Ketqua = DoiTuHec(nhap,gtdoi);
		}else if(gtchuyen.equals("Decamet")) {
			Ketqua = DoiTuDam(nhap,gtdoi);
		}else if(gtchuyen.equals("Met")) {
			Ketqua = DoiTuMet(nhap,gtdoi);
		}else if(gtchuyen.equals("Decimet")) {
			Ketqua = DoiTuDm(nhap,gtdoi);
		}else if(gtchuyen.equals("Centimet")) {
			Ketqua = DoiTuCm(nhap,gtdoi);
		}else if(gtchuyen.equals("Milimet")) {
			Ketqua = DoiTuMm(nhap,gtdoi);
		}
		return Ketqua;
	}

	private double DoiTuKm(double nhap, String gtdoi) {
		double ketqua = 0;
		if(gtdoi.equals("Kilomet")) {
			ketqua = nhap;
		}else if(gtdoi.equals("Hectomet")) {
			ketqua = nhap * 10;
		}else if(gtdoi.equals("Decamet")) {
			ketqua = nhap * 100;
		}else if(gtdoi.equals("Met")) {
			ketqua = nhap * 1000;
		}else if(gtdoi.equals("Decimet")) {
			ketqua = nhap * 10000;
		}else if(gtdoi.equals("Centimet")) {
			ketqua = nhap * 100000;
		}else if(gtdoi.equals("Milimet")) {
			ketqua = nhap * 1000000;
		}
		return ketqua;
	}
	private double DoiTuHec(double nhap, String gtdoi) {
		double ketqua = 0;
		if(gtdoi.equals("Kilomet")) {
			ketqua = nhap / 10;
		}else if(gtdoi.equals("Hectomet")) {
			ketqua = nhap;
		}else if(gtdoi.equals("Decamet")) {
			ketqua = nhap * 10;
		}else if(gtdoi.equals("Met")) {
			ketqua = nhap * 100;
		}else if(gtdoi.equals("Decimet")) {
			ketqua = nhap * 1000;
		}else if(gtdoi.equals("Centimet")) {
			ketqua = nhap * 10000;
		}else if(gtdoi.equals("Milimet")) {
			ketqua = nhap * 100000;
		}
		return ketqua;
	}
	private double DoiTuDam(double nhap, String gtdoi) {
		double ketqua = 0;
		if(gtdoi.equals("Kilomet")) {
			ketqua = nhap / 100;
		}else if(gtdoi.equals("Hectomet")) {
			ketqua = nhap / 10;
		}else if(gtdoi.equals("Decamet")) {
			ketqua = nhap;
		}else if(gtdoi.equals("Met")) {
			ketqua = nhap * 10;
		}else if(gtdoi.equals("Decimet")) {
			ketqua = nhap * 100;
		}else if(gtdoi.equals("Centimet")) {
			ketqua = nhap * 1000;
		}else if(gtdoi.equals("Milimet")) {
			ketqua = nhap * 10000;
		}
		return ketqua;
	}
	private double DoiTuMet(double nhap, String gtdoi) {
		double ketqua = 0;
		if(gtdoi.equals("Kilomet")) {
			ketqua = nhap / 1000;
		}else if(gtdoi.equals("Hectomet")) {
			ketqua = nhap / 100;
		}else if(gtdoi.equals("Decamet")) {
			ketqua = nhap / 10;
		}else if(gtdoi.equals("Met")) {
			ketqua = nhap;
		}else if(gtdoi.equals("Decimet")) {
			ketqua = nhap * 10;
		}else if(gtdoi.equals("Centimet")) {
			ketqua = nhap * 100;
		}else if(gtdoi.equals("Milimet")) {
			ketqua = nhap * 1000;
		}
		return ketqua;
	}
	private double DoiTuDm(double nhap, String gtdoi) {
		double ketqua = 0;
		if(gtdoi.equals("Kilomet")) {
			ketqua = nhap / 10000;
		}else if(gtdoi.equals("Hectomet")) {
			ketqua = nhap / 1000;
		}else if(gtdoi.equals("Decamet")) {
			ketqua = nhap / 100;
		}else if(gtdoi.equals("Met")) {
			ketqua = nhap / 10;
		}else if(gtdoi.equals("Decimet")) {
			ketqua = nhap;
		}else if(gtdoi.equals("Centimet")) {
			ketqua = nhap * 10;
		}else if(gtdoi.equals("Milimet")) {
			ketqua = nhap * 100;
		}
		return ketqua;
	}
	private double DoiTuCm(double nhap, String gtdoi) {
		// TODO Auto-generated method stub
		return 0;
	}
	private double DoiTuMm(double nhap, String gtdoi) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
