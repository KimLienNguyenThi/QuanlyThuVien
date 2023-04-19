package view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class DialogThemQLNhapView extends JDialog {
	JFrame frame = new JFrame();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	/**
	 * Launch the application.
	 */
	
	public DialogThemQLNhapView(JFrame parent){
		super(parent, "Dialog Default", true);
		this.init();        
		this.setLocationRelativeTo(null);
		this.setVisible(false);
	}

	/**
	 * Create the dialog.
	 */
	
	public void init() {
		setBounds(100, 100, 757, 511);
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBounds(10, 10, 656, 413);
		contentPane.add(contentPane_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 56, 636, 347);
		contentPane_1.add(panel);
		
		JLabel lblNgyNhp = new JLabel("Ngày nhập");
		lblNgyNhp.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNgyNhp.setBounds(60, 10, 109, 30);
		panel.add(lblNgyNhp);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(179, 10, 395, 30);
		panel.add(textField);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại");
		lblSinThoi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSinThoi.setBounds(60, 50, 109, 30);
		panel.add(lblSinThoi);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(179, 50, 395, 30);
		panel.add(textField_1);
		
		JLabel lblThiGian = new JLabel("Thời Gian");
		lblThiGian.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThiGian.setBounds(60, 133, 109, 30);
		panel.add(lblThiGian);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(179, 133, 395, 30);
		panel.add(textField_2);
		
		JLabel lblHanThe = new JLabel("Hạn thẻ");
		lblHanThe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHanThe.setBounds(60, 173, 109, 30);
		panel.add(lblHanThe);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(179, 173, 395, 30);
		panel.add(textField_3);
		
		JLabel lbldk = new JLabel("Phí đăng ký:");
		lbldk.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbldk.setBounds(179, 213, 94, 54);
		panel.add(lbldk);
		
		JLabel lblPhiDangKy = new JLabel("#########đ");
		lblPhiDangKy.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhiDangKy.setBounds(283, 213, 291, 54);
		panel.add(lblPhiDangKy);
		
		JLabel lblaCh = new JLabel("Địa chỉ");
		lblaCh.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblaCh.setBounds(60, 93, 109, 30);
		panel.add(lblaCh);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(179, 93, 395, 30);
		panel.add(textField_4);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(376, 279, 200, 40);
		panel.add(btnNewButton);
		
		JButton btnHyThaoTc = new JButton("Hủy thao tác");
		btnHyThaoTc.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnHyThaoTc.setBounds(60, 277, 200, 40);
		panel.add(btnHyThaoTc);
		
		JLabel lblThngTinL = new JLabel("Thông tin lô mới");
		lblThngTinL.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngTinL.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblThngTinL.setBounds(10, 10, 636, 36);
		contentPane_1.add(lblThngTinL);
	}
}

































