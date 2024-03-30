package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frmCANHAN extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldTen;
	private JTextField textFieldNgaySinh;
	private JTextField textFieldDiaChi;
	private JTextField textFieldDienThoai;
	private JTextField textFieldTenTaiKhoan;
	private JTextField textFieldMatKhau;
	private JButton btnDoiMatKhau;
	private JButton btnLuu;
	/**
	 * Create the panel.
	 */
	public frmCANHAN() {
		setBackground(new Color(230, 218, 198));
		setLayout(null);
		
		JLabel lbAvatar = new JLabel("New label");
		lbAvatar.setBounds(57, 72, 116, 121);
		add(lbAvatar);
		
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
		lbChucVu.setBounds(76, 204, 76, 27);
		add(lbChucVu);
		
		Font font = new Font("Tahoma", Font.PLAIN, 14);
		JLabel lbTen = new JLabel("TÊN");
		lbTen.setForeground(new Color(120, 120, 120));
		lbTen.setFont(font);
		lbTen.setBounds(247, 40, 80, 21);
		add(lbTen);
		
		JLabel lbNgaySinh = new JLabel("NGÀY SINH");
		lbNgaySinh.setBounds(247, 90, 80, 21);
		lbNgaySinh.setFont(font);
		lbNgaySinh.setForeground(new Color(120, 120, 120));
		add(lbNgaySinh);
		
		
		JLabel lbDiaChi = new JLabel("ĐỊA CHỈ");
		lbDiaChi.setBounds(247, 140, 80, 21);
		lbDiaChi.setForeground(new Color(120, 120, 120));
		lbDiaChi.setFont(font);
		add(lbDiaChi);
		
		JLabel lbDienThoai = new JLabel("ĐIỆN THOẠI");
		lbDienThoai.setBounds(247, 190, 103, 21);
		lbDienThoai.setForeground(new Color(120, 120, 120));
		lbDienThoai.setFont(font);
		add(lbDienThoai);
		
		JLabel lnTenTaiKhoan = new JLabel("TÊN TÀI KHOẢN");
		lnTenTaiKhoan.setBounds(247, 240, 116, 21);
		lnTenTaiKhoan.setForeground(new Color(120, 120, 120));
		lnTenTaiKhoan.setFont(font);
		add(lnTenTaiKhoan);
		
		JLabel lbMatKhau = new JLabel("MẬT KHẨU");
		lbMatKhau.setBounds(247, 290, 80, 21);
		lbMatKhau.setForeground(new Color(120, 120, 120));
		lbMatKhau.setFont(font);
		add(lbMatKhau);
		
		Font textFieldFont = new Font("Roboto", Font.PLAIN, 16);
		
		textFieldTen = new JTextField();
		textFieldTen.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldTen.setBounds(393, 36, 206, 25);
		textFieldTen.setColumns(15);
		textFieldTen.setFont(textFieldFont);
		textFieldTen.setBorder(null);
		
		textFieldNgaySinh = new JTextField();
		textFieldNgaySinh.setColumns(15);
		textFieldNgaySinh.setBounds(393, 86, 206, 25);
		textFieldNgaySinh.setFont(textFieldFont);
		textFieldNgaySinh.setBorder(null);
		
		textFieldDiaChi = new JTextField();
		textFieldDiaChi.setColumns(15);
		textFieldDiaChi.setBounds(393, 136, 206, 25);
		textFieldDiaChi.setFont(textFieldFont);
		textFieldDiaChi.setBorder(null);
		
		textFieldDienThoai = new JTextField();
		textFieldDienThoai.setColumns(15);
		textFieldDienThoai.setBounds(393, 186, 206, 25);
		textFieldDienThoai.setFont(textFieldFont);
		textFieldDienThoai.setBorder(null);
		
		
		textFieldTenTaiKhoan = new JTextField();
		textFieldTenTaiKhoan.setColumns(15);
		textFieldTenTaiKhoan.setBounds(393, 236, 206, 25);
		textFieldTenTaiKhoan.setFont(textFieldFont);
		textFieldTenTaiKhoan.setBorder(null);
		
		textFieldMatKhau = new JTextField();
		textFieldMatKhau.setColumns(15);
		textFieldMatKhau.setBounds(393, 286, 206, 25);
		textFieldMatKhau.setFont(textFieldFont);
		textFieldMatKhau.setBorder(null);
		
		add(textFieldTen);
		add(textFieldNgaySinh);
		add(textFieldDiaChi);
		add(textFieldDienThoai);
		add(textFieldTenTaiKhoan);
		add(textFieldMatKhau);
		
		btnDoiMatKhau = new JButton("ĐỔI MẬT KHẨU");
		btnDoiMatKhau.setBackground(new Color(207, 208, 218));
		btnDoiMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDoiMatKhau.setForeground(new Color(0, 128, 192));
		btnDoiMatKhau.setBounds(393, 327, 124, 27);
		btnDoiMatKhau.setBorder(null);
		add(btnDoiMatKhau);
		
		btnLuu = new JButton("LƯU");// thêm một JOptionPane khi bấm vào 
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLuu.setForeground(new Color(255, 255, 255));
		btnLuu.setBackground(new Color(64, 128, 128));
		btnLuu.setBounds(523, 327, 76, 27);
		btnLuu.setBorder(null);
		add(btnLuu);
	}

}
