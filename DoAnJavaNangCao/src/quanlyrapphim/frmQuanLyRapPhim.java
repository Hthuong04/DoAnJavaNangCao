package quanlyrapphim;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GUI.frmCANHAN;
import GUI.frmLOGIN;
import GUI.CHANGEPASSWORD;
import javax.swing.JLabel;
import java.awt.Font;

public class frmQuanLyRapPhim extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel mainPanel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmQuanLyRapPhim frame = new frmQuanLyRapPhim();
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
	public frmQuanLyRapPhim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setTitle("QUẢN LÝ RẠP PHIM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(785, 528);
        
        mainPanel = new JPanel(new CardLayout());
        mainPanel.setBounds(121, 60, 650, 431);
//        mainPanel.setBorder(null);

        panel1 = new GUI.frmLOGIN();

        panel2 = new GUI.frmCANHAN();

        panel3 = new GUI.frmTHONGTINPHIM();
//        
//        panel4 = new GUI.log_in();
//
//        panel5 = new GUI.home();
//
//        panel6 = new GUI.doiMatKhau();
        
        mainPanel.add(panel1, "panel1");
        mainPanel.add(panel2, "panel2");
        mainPanel.add(panel3, "panel3");
//        mainPanel.add(panel1, "panel4");
//        mainPanel.add(panel2, "panel5");
//        mainPanel.add(panel3, "panel6");
        System.out.println(panel1.getHeight() + " " + panel1.getWidth() );
        contentPane.setLayout(null);
        getContentPane().add(createMenuPanel());
        getContentPane().add(mainPanel);
        
        ImageIcon icon = new ImageIcon("image\\pngwing.com (1).png");
        JButton btnNewButton = new JButton(new ImageIcon(frmQuanLyRapPhim.class.getResource("/image/pngwing.com (1).png")));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setText("VIP CINEMA");
        btnNewButton.setBounds(0, 0, 771, 62);
        contentPane.add(btnNewButton);
        btnNewButton.setEnabled(false);
        //        btnNewButton.setBorder(null);
                btnNewButton.setFont(new Font("Matura MT Script Capitals", Font.BOLD | Font.ITALIC, 25));
                btnNewButton.setBackground(new Color(89, 89, 89));
        
	}
	private JPanel createMenuPanel() {
        JPanel menuPanel = new JPanel();
        menuPanel.setBorder(null);
        menuPanel.setBounds(0, 60, 121, 431);
        menuPanel.setForeground(new Color(255, 255, 255));
        menuPanel.setBackground(new Color(60, 123, 119));

        JButton button1 = new JButton("Giao diện 1");
        button1.setForeground(new Color(255, 255, 255));
        button1.setBorder(null);
        button1.setBackground(new Color(60, 123, 119));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                cardLayout.show(mainPanel, "panel1");
            }
        });

        JButton button2 = new JButton("Giao diện 2");
        button2.setForeground(new Color(255, 255, 255));
        button2.setBackground(new Color(60, 123, 119));
        button2.setBorder(null);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                cardLayout.show(mainPanel, "panel2");
            }
        });
//        button2.setBackground(Color RED);

        JButton button3 = new JButton("Giao diện 3");
        button3.setForeground(new Color(255, 255, 255));
        button3.setBackground(new Color(60, 123, 119));
        button3.setBorder(null);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                cardLayout.show(mainPanel, "panel3");
            }
        });
        JButton button4 = new JButton("Giao diện 4");
        button4.setForeground(new Color(255, 255, 255));
        button4.setBackground(new Color(60, 123, 119));
        button4.setBorder(null);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
//                cardLayout.show(mainPanel, "panel4");
            }
        });
        JButton button5 = new JButton("Giao diện 5");
        button5.setForeground(new Color(255, 255, 255));
        button5.setBackground(new Color(60, 123, 119));
        button5.setBorder(null);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
//                cardLayout.show(mainPanel, "panel5");
            }
        });
        JButton button6 = new JButton("Giao diện 6");
        button6.setForeground(new Color(255, 255, 255));
        button6.setBackground(new Color(60, 123, 119));
        button6.setBorder(null);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
//                cardLayout.show(mainPanel, "panel6");
            }
        });
        menuPanel.setLayout(new GridLayout(0, 1, 0, 0));
        
        menuPanel.add(button1);
        menuPanel.add(button2);
        menuPanel.add(button3);
        menuPanel.add(button4);
        menuPanel.add(button5);
        menuPanel.add(button6);
        

        return menuPanel;
	}

}
