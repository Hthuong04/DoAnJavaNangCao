package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CANHAN extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldTen;
	private JTextField textFieldNgaySinh;
	private JTextField textFieldDiaChi;
	private JTextField textFieldDienThoai;
	private JTextField textFieldTenTaiKhoan;
	private JTextField textFieldMatKhau;
	private JButton btnDoiMatKhau;
	private JButton btnLuu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CANHAN frame = new CANHAN();
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
	public CANHAN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbAvatar = new JLabel("New label");
		lbAvatar.setBounds(74, 75, 116, 121);
		contentPane.add(lbAvatar);
		
		// ví dụ cái avatar cho dễ thấy // tự đổi địa chỉ ảnh
		// khi nào code thì xóa đi rồi làm lại
		ImageIcon icon = new ImageIcon("C:\\Users\\nguye\\Downloads\\me.jpg");
		lbAvatar.setIcon(icon);
		
		//label lấy text từ csdl để đại cho dễ thấy vị trí
		JLabel lbChucVu = new JLabel("Chức VỤ");
		lbChucVu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbChucVu.setForeground(new Color(0, 0, 0));
		lbChucVu.setHorizontalAlignment(SwingConstants.CENTER);
		lbChucVu.setBackground(new Color(64, 128, 128));
		lbChucVu.setBounds(93, 207, 76, 27);
		contentPane.add(lbChucVu);
		
		Font font = new Font("Tahoma", Font.PLAIN, 14);
		JLabel lbTen = new JLabel("TÊN");
		lbTen.setForeground(new Color(120, 120, 120));
		lbTen.setFont(font);
		lbTen.setBounds(262, 50, 80, 16);
		contentPane.add(lbTen);
		
		JLabel lbNgaySinh = new JLabel("NGÀY SINH");
		lbNgaySinh.setBounds(262, 90, 80, 16);
		lbNgaySinh.setFont(font);
		lbNgaySinh.setForeground(new Color(120, 120, 120));
		contentPane.add(lbNgaySinh);
		
		
		JLabel lbDiaChi = new JLabel("ĐỊA CHỈ");
		lbDiaChi.setBounds(262, 130, 80, 16);
		lbDiaChi.setForeground(new Color(120, 120, 120));
		lbDiaChi.setFont(font);
		contentPane.add(lbDiaChi);
		
		JLabel lbDienThoai = new JLabel("ĐIỆN THOẠI");
		lbDienThoai.setBounds(262, 170, 103, 16);
		lbDienThoai.setForeground(new Color(120, 120, 120));
		lbDienThoai.setFont(font);
		contentPane.add(lbDienThoai);
		
		JLabel lnTenTaiKhoan = new JLabel("TÊN TÀI KHOẢN");
		lnTenTaiKhoan.setBounds(262, 210, 116, 16);
		lnTenTaiKhoan.setForeground(new Color(120, 120, 120));
		lnTenTaiKhoan.setFont(font);
		contentPane.add(lnTenTaiKhoan);
		
		JLabel lbMatKhau = new JLabel("MẬT KHẨU");
		lbMatKhau.setBounds(262, 250, 80, 16);
		lbMatKhau.setForeground(new Color(120, 120, 120));
		lbMatKhau.setFont(font);
		contentPane.add(lbMatKhau);
		
		Font textFieldFont = new Font("Roboto", Font.PLAIN, 16);
		textFieldTen = new JTextField();
		textFieldTen.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldTen.setBounds(408, 50, 231, 25);
		textFieldTen.setColumns(15);
		textFieldTen.setFont(textFieldFont);
		
		textFieldNgaySinh = new JTextField();
		textFieldNgaySinh.setColumns(15);
		textFieldNgaySinh.setBounds(408, 90, 231, 25);
		textFieldNgaySinh.setFont(textFieldFont);
		
		textFieldDiaChi = new JTextField();
		textFieldDiaChi.setColumns(15);
		textFieldDiaChi.setBounds(408, 130, 231, 25);
		textFieldDiaChi.setFont(textFieldFont);
		
		textFieldDienThoai = new JTextField();
		textFieldDienThoai.setColumns(15);
		textFieldDienThoai.setBounds(408, 170, 231, 25);
		textFieldDienThoai.setFont(textFieldFont);
		
		
		textFieldTenTaiKhoan = new JTextField();
		textFieldTenTaiKhoan.setColumns(15);
		textFieldTenTaiKhoan.setBounds(408, 210, 231, 25);
		textFieldTenTaiKhoan.setFont(textFieldFont);
		
		textFieldMatKhau = new JTextField();
		textFieldMatKhau.setColumns(15);
		textFieldMatKhau.setBounds(408, 250, 231, 25);
		textFieldMatKhau.setFont(textFieldFont);
		
		contentPane.add(textFieldTen);
		contentPane.add(textFieldNgaySinh);
		contentPane.add(textFieldDiaChi);
		contentPane.add(textFieldDienThoai);
		contentPane.add(textFieldTenTaiKhoan);
		contentPane.add(textFieldMatKhau);
		
		btnDoiMatKhau = new JButton("ĐỔI MẬT KHẨU");
		btnDoiMatKhau.setBackground(new Color(207, 208, 218));
		btnDoiMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDoiMatKhau.setForeground(new Color(0, 128, 192));
		btnDoiMatKhau.setBounds(408, 304, 124, 27);
		contentPane.add(btnDoiMatKhau);
		
		btnLuu = new JButton("LƯU");// thêm một JOptionPane khi bấm vào 
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLuu.setForeground(new Color(255, 255, 255));
		btnLuu.setBackground(new Color(64, 128, 128));
		btnLuu.setBounds(559, 304, 80, 27);
		contentPane.add(btnLuu);
		
		
	}
}
