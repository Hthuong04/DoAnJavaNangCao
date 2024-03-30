package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class diaLOGIN extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			diaLOGIN dialog = new diaLOGIN();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public diaLOGIN() {
		setBounds(100, 100, 450, 278);
		getContentPane().setLayout(null);
		contentPanel.setBounds(10, 0, 416, 232);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.LEFT);
			textField.setColumns(10);
			textField.setBounds(164, 79, 158, 31);
			contentPanel.add(textField);
		}
		{
			textField_1 = new JTextField();
			textField_1.setHorizontalAlignment(SwingConstants.LEFT);
			textField_1.setColumns(10);
			textField_1.setBounds(164, 120, 158, 31);
			contentPanel.add(textField_1);
		}
		{
			JButton okButton = new JButton("OK");
			okButton.setBounds(164, 176, 70, 21);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setBounds(259, 176, 63, 21);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
		{
			JButton btnNewButton = new JButton();
			btnNewButton.setBackground(new Color(238, 238, 238));
			btnNewButton.setEnabled(false);
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setIcon(new ImageIcon(diaLOGIN.class.getResource("/image/pngwing.com (9).png")));
			btnNewButton.setBounds(129, 73, 25, 37);
			btnNewButton.setBorder(null);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton = new JButton();
			btnNewButton.setIcon(new ImageIcon(diaLOGIN.class.getResource("/image/user.png")));
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setEnabled(false);
			btnNewButton.setBorder(null);
			btnNewButton.setBackground(new Color(238, 238, 238));
			btnNewButton.setBounds(84, 114, 70, 51);
			contentPanel.add(btnNewButton);
		}
	}
}
