package GUI;

import javax.swing.JPanel;
import javax.annotation.processing.RoundEnvironment;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

public class frmLOGIN extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldTenDangNhap;
	private JTextField textFieldMatKhau;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Create the panel.
	 */
	public frmLOGIN() {
		setBackground(new Color(230, 218, 198));
		setLayout(null);
		ImageIcon icon =new ImageIcon("C:\\Users\\nguye\\OneDrive\\Máy tính\\background.png");
		JLabel lbBackground = new JLabel();
		lbBackground.setIcon(icon);
		lbBackground.setBounds(74, 22, 268, 399);
		add(lbBackground);
		
		JLabel lblNewLabel = new JLabel("W E L C O M");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel.setBounds(453, 22, 130, 69);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Tên đăng nhâp:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(464, 149, 119, 21);
		add(lblNewLabel_1);
		
		textFieldTenDangNhap = new JTextField();
		textFieldTenDangNhap.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldTenDangNhap.setBounds(464, 174, 158, 31);
		add(textFieldTenDangNhap);
		textFieldTenDangNhap.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Mật khẩu:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(464, 217, 119, 21);
		add(lblNewLabel_2);
	
		textFieldMatKhau = new JTextField();
		textFieldMatKhau.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldMatKhau.setColumns(10);
		textFieldMatKhau.setBounds(464, 242, 158, 31);
		add(textFieldMatKhau);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(49, 79, 79));
		btnLogin.setBounds(498, 288, 85, 31);
		add(btnLogin);
		
		
		
		

	}
	private static class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }
}
