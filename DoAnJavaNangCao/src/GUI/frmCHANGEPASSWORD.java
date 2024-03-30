package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frmCHANGEPASSWORD extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldMatKhauMoiAgain;
	private Component textFieldMatKhauMoi;
	private JTextField textFieldMatKhauCu;

	/**
	 * Create the panel.
	 */
	public frmCHANGEPASSWORD() {
		setLayout(null);
		JLabel lbMatKhauCu = new JLabel("MẬT KHẨU CŨ");
		lbMatKhauCu.setHorizontalAlignment(SwingConstants.LEFT);
		lbMatKhauCu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbMatKhauCu.setBounds(52, 81, 108, 22);
		add(lbMatKhauCu);

		JLabel lbMatKhauMoi = new JLabel("MẬT KHẨU MỚI");
		lbMatKhauMoi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbMatKhauMoi.setBounds(52, 121, 108, 22);
		add(lbMatKhauMoi);

		JLabel lbMatKhauMoiAgain = new JLabel("XÁC NHẬN LẠI MẬT KHẨU");
		lbMatKhauMoiAgain.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbMatKhauMoiAgain.setBounds(52, 161, 150, 22);
		add(lbMatKhauMoiAgain);

		textFieldMatKhauCu = new JTextField();
		textFieldMatKhauCu.setToolTipText("");
		textFieldMatKhauCu.setBounds(228, 80, 150, 28);
		add(textFieldMatKhauCu);
		textFieldMatKhauCu.setColumns(10);

		textFieldMatKhauMoi = new JTextField();
//		textFieldMatKhauMoi.setColumns(10);
		textFieldMatKhauMoi.setBounds(228, 120, 150, 28);
		add(textFieldMatKhauMoi);

		textFieldMatKhauMoiAgain = new JTextField();
		textFieldMatKhauMoiAgain.setColumns(10);
		textFieldMatKhauMoiAgain.setBounds(228, 160, 150, 28);
		add(textFieldMatKhauMoiAgain);

		JLabel lbDoiMatKhau = new JLabel("ĐỔI MẬT KHẨU");
		lbDoiMatKhau.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbDoiMatKhau.setForeground(new Color(0, 0, 0));
		lbDoiMatKhau.setHorizontalAlignment(SwingConstants.CENTER);
		lbDoiMatKhau.setBounds(115, 22, 184, 28);
		add(lbDoiMatKhau);
		JButton btnSave = new JButton("LƯU");
		btnSave.setBounds(228, 201, 62, 25);
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(62, 177, 52));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSave.setActionCommand("LƯU");
		add(btnSave);
		getRootPane().setDefaultButton(btnSave);
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBounds(301, 201, 77, 25);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCancel.setBackground(new Color(210, 28, 32));
		btnCancel.setActionCommand("CANCEL");
		add(btnCancel);
	}

}
