package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JSeparator;

public class frmTHONGTINPHIM extends JPanel {
	private JTextField textFieldTimKiem;
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public frmTHONGTINPHIM() {
		setBackground(new Color(241, 241, 241));
		setLayout(null);
		
		
		JLabel lblNewLabel_6 = new JLabel("Danh sách phim");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(23, 45, 123, 30);
		this.add(lblNewLabel_6);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.setForeground(new Color(87, 171, 181));
		btnTimKiem.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnTimKiem.setBackground(new Color(240, 240, 240));
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnTimKiem.setBounds(463, 43, 72, 34);
		this.add(btnTimKiem);
		
		textFieldTimKiem = new JTextField();
		textFieldTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldTimKiem.setBorder(null);
		textFieldTimKiem.setBackground(new Color(227, 227, 227));
		textFieldTimKiem.setBounds(300, 44, 147, 32);
		this.add(textFieldTimKiem);
		textFieldTimKiem.setColumns(10);
		
		JButton btnThem = new JButton("Thêm phim");
		btnThem.setForeground(new Color(85, 173, 183));
		btnThem.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnThem.setBackground(new Color(240, 240, 240));
		btnThem.setFont(new Font("Roboto", Font.BOLD, 14));
		btnThem.setBounds(38, 388, 91, 30);
		this.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa phim");
		btnXoa.setForeground(new Color(85, 173, 183));
		btnXoa.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoa.setBackground(new Color(240, 240, 240));
		btnXoa.setFont(new Font("Roboto", Font.BOLD, 14));
		btnXoa.setBounds(191, 388, 91, 30);
		this.add(btnXoa);
		
		JButton btnSua = new JButton("Chỉnh sửa");
		btnSua.setForeground(new Color(85, 173, 183));
		btnSua.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSua.setBackground(new Color(240, 240, 240));
		btnSua.setFont(new Font("Roboto", Font.BOLD, 14));
		btnSua.setBounds(344, 388, 91, 30);
		this.add(btnSua);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.setForeground(new Color(85, 173, 183));
		btnLuu.setFont(new Font("Roboto", Font.BOLD, 14));
		btnLuu.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnLuu.setBackground(new Color(240, 240, 240));
		btnLuu.setBounds(496, 388, 91, 30);
		add(btnLuu);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(194, 254, 224));
		panel.setBounds(0, 0, 644, 29);
		add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("DANH SÁCH PHIM");
		lblNewLabel_5.setBounds(22, 5, 603, 20);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setBackground(new Color(71, 141, 141));
		lblNewLabel_5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage("D:\\eclipse\\DoAnJavaNangCao2\\src\\image\\pngwing.com (14).png")));
		lblNewLabel_5.setForeground(new Color(81, 171, 181));
		lblNewLabel_5.setBorder(null);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setBackground(new Color(253, 243, 225));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setRowHeight(25);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 phim", "T\u00EAn phim", "Th\u1EDDi l\u01B0\u1EE3ng", "Qu\u1ED1c gia", "\u0110\u1EA1o di\u1EC5n", "N\u0103m s\u1EA3n xu\u1EA5t", "\u0110\u1ED9 tu\u1ED5i xem", "Th\u1EC3 lo\u1EA1i"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 84, 614, 143);
		this.add(scrollPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 237, 614, 2);
		add(separator);
		
		JLabel lblNewLabel_6_1 = new JLabel("Mã phim");
		lblNewLabel_6_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6_1.setBounds(10, 249, 91, 24);
		add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Quốc gia");
		lblNewLabel_6_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6_1_1.setBounds(10, 339, 91, 24);
		add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("Tên phim");
		lblNewLabel_6_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6_1_2.setBounds(10, 279, 91, 24);
		add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("Thời lượng");
		lblNewLabel_6_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6_1_3.setBounds(10, 309, 91, 24);
		add(lblNewLabel_6_1_3);
		
		textField = new JTextField();
		textField.setBounds(123, 249, 142, 24);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(123, 279, 142, 24);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(123, 309, 142, 24);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 339, 142, 24);
		add(textField_3);
		
		JLabel lblNewLabel_6_1_4 = new JLabel("Năm sản xuất");
		lblNewLabel_6_1_4.setForeground(Color.BLACK);
		lblNewLabel_6_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6_1_4.setBounds(316, 276, 91, 27);
		add(lblNewLabel_6_1_4);
		
		JLabel lblNewLabel_6_1_2_1 = new JLabel("Độ tuổi");
		lblNewLabel_6_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_6_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6_1_2_1.setBounds(316, 309, 91, 24);
		add(lblNewLabel_6_1_2_1);
		
		JLabel lblNewLabel_6_1_3_1 = new JLabel("Thể loại");
		lblNewLabel_6_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_6_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6_1_3_1.setBounds(316, 339, 91, 26);
		add(lblNewLabel_6_1_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(429, 279, 142, 24);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(429, 309, 142, 24);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(429, 339, 142, 24);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(429, 249, 142, 24);
		add(textField_7);
		
		JLabel lblNewLabel_6_1_3_1_1 = new JLabel("Đạo diễn");
		lblNewLabel_6_1_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_6_1_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6_1_3_1_1.setBounds(316, 249, 91, 24);
		add(lblNewLabel_6_1_3_1_1);
		
		JButton btnHyTm = new JButton("Hủy tìm");
		btnHyTm.setForeground(new Color(87, 171, 181));
		btnHyTm.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnHyTm.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnHyTm.setBackground(UIManager.getColor("Button.background"));
		btnHyTm.setBounds(551, 43, 72, 34);
		add(btnHyTm);
		
		JLabel lblNewLabel_6_1_2_2 = new JLabel("Tên phim:");
		lblNewLabel_6_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_6_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6_1_2_2.setBounds(222, 45, 72, 30);
		add(lblNewLabel_6_1_2_2);
		
		
		
//		add(table_1);

		
	}
}
