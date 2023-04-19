package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.AlphaComposite;
import java.awt.CardLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MainView extends JFrame {
	JFrame frame = new JFrame();
	
	private JPanel contentPane;
	private CardLayout cardLayout;
	private JPanel cardPanel;
	private JButton lastClicked;
	private JPanel panelTheThanhVien;
	private JTable table_qls;
	private JTable table_ttv;
	private JTextField textField_TimKiem_ttv;
	private JTable table_1;
	private JTable table_qln;
	private JTable table_qlpm;
	private JTextField textField_TimKiem_qln;
	private JTextField textField_TimKiem_qls;
	private JTextField textField_TimKiem_qlpm;
	private JTextField textField_HoVaTen_pm;
	private JTextField textField_DiaChi_pm;
	private JTextField textField_SoLuon_pm;

	/**
	 * Launch the application.
	 */
	
	public MainView(){
		setResizable(false);
		this.init();
		this.setLocationRelativeTo(null);
		this.setVisible(false);
	}

	/**
	 * Create the frame.
	 */
	
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cardLayout = new CardLayout();
		
		JPanel panel_Top = new JPanel();
		panel_Top.setBorder(new MatteBorder(1, 1, 5, 1, (Color) new Color(0, 0, 0)));
		panel_Top.setBackground(new Color(0xE2FF99));
		panel_Top.setBounds(0, 0, 1086, 66);
		contentPane.add(panel_Top);
		panel_Top.setLayout(null);
		
		ImageIcon iconlibrary = new ImageIcon(MainView.class.getResource("/images/books.png"));
		Image imglibrary = iconlibrary.getImage();
		Image newImglibrary = imglibrary.getScaledInstance(58, 58, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIconlibrary = new ImageIcon(newImglibrary);
		
		ImageIcon iconTimKiem = new ImageIcon(MainView.class.getResource("/images/search.png"));
		Image imgTimKiem = iconTimKiem.getImage();
		Image newImgTimKiem = imgTimKiem.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIconTimKiem = new ImageIcon(newImgTimKiem);
		
		JButton btnLibrary = new JButton("");
		btnLibrary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeButtonColor(btnLibrary);
				cardLayout.show(cardPanel, "panelHome");
			}
		});
		btnLibrary.setOpaque(true);
		btnLibrary.setBorderPainted(false);
		btnLibrary.setBackground(new Color(226, 255, 153));
		btnLibrary.setBounds(10, 2, 58, 58);
		panel_Top.add(btnLibrary);
		btnLibrary.setIcon(newIconlibrary);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ THƯ VIỆN ABC");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(105, 10, 336, 46);
		panel_Top.add(lblNewLabel);
		
		ImageIcon iconUser = new ImageIcon(MainView.class.getResource("/images/exit.png"));
		Image imgUser = iconUser.getImage();
		Image newImgUser = imgUser.getScaledInstance(29,29, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIconUser = new ImageIcon(newImgUser);
		
		JButton btn_Logout_top = new JButton("");
		btn_Logout_top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginView().setVisible(true);
				dispose();
			}
		});
		btn_Logout_top.setBackground(new Color(0xE2FF99));
		btn_Logout_top.setOpaque(true);
		btn_Logout_top.setBorderPainted(false);
		btn_Logout_top.setBounds(1018, 2, 58, 58);
		panel_Top.add(btn_Logout_top);
		btn_Logout_top.setIcon(newIconUser);
		
		JPanel panel_Left = new JPanel();
		panel_Left.setBackground(new Color(0xE2FF99));
		panel_Left.setBounds(0, 65, 238, 548);
		contentPane.add(panel_Left);
		panel_Left.setLayout(null);
		
		JLabel lbl_ChucNang_left = new JLabel("Chức năng");
		lbl_ChucNang_left.setForeground(new Color(255, 255, 255));
		lbl_ChucNang_left.setBackground(new Color(0,0,0));
		lbl_ChucNang_left.setOpaque(true);
		lbl_ChucNang_left.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ChucNang_left.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_ChucNang_left.setBounds(0, 0, 238, 25);
		panel_Left.add(lbl_ChucNang_left);
		
		ImageIcon iconBill = new ImageIcon(MainView.class.getResource("/images/bill.png"));
		Image imgBill = iconBill.getImage();
		Image newImgBill = imgBill.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIconBill = new ImageIcon(newImgBill);
		
		JButton btn_PhieuMuon_left = new JButton("PHIẾU MƯỢN");
		btn_PhieuMuon_left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeButtonColor(btn_PhieuMuon_left);
				cardLayout.show(cardPanel, "panelHoaDon");
			}
		});
		btn_PhieuMuon_left.setHorizontalAlignment(SwingConstants.LEFT);
		btn_PhieuMuon_left.setBackground(new Color(0xE2FF99));
		btn_PhieuMuon_left.setOpaque(true);
		btn_PhieuMuon_left.setBorderPainted(false);
		btn_PhieuMuon_left.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_PhieuMuon_left.setBounds(0, 51, 238, 75);
		panel_Left.add(btn_PhieuMuon_left);
		btn_PhieuMuon_left.setIcon(newIconBill);
		
		ImageIcon iconMnBooks = new ImageIcon(MainView.class.getResource("/images/mnbooks.png"));
		Image imgMnBooks = iconMnBooks.getImage();
		Image newImgMnBooks = imgMnBooks.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIconMnBooks = new ImageIcon(newImgMnBooks);
		
		JButton btn_QLPhieuMuon_left = new JButton("QLý PHIẾU MƯỢN");
		btn_QLPhieuMuon_left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeButtonColor(btn_QLPhieuMuon_left);
				cardLayout.show(cardPanel, "panelQuanLySach");
			}
		});
		btn_QLPhieuMuon_left.setHorizontalAlignment(SwingConstants.LEADING);
		btn_QLPhieuMuon_left.setBackground(new Color(0xE2FF99));
		btn_QLPhieuMuon_left.setOpaque(true);
		btn_QLPhieuMuon_left.setBorderPainted(false);
		btn_QLPhieuMuon_left.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_QLPhieuMuon_left.setBounds(0, 136, 238, 75);
		panel_Left.add(btn_QLPhieuMuon_left);
		btn_QLPhieuMuon_left.setIcon(newIconMnBooks);
		
		ImageIcon iconExChange = new ImageIcon(MainView.class.getResource("/images/exchange.png"));
		Image imgExChange = iconExChange.getImage();
		Image newImgExChange = imgExChange.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIconExChange = new ImageIcon(newImgExChange);
		
		JButton btn_QLSach_left = new JButton("QUẢN LÝ SÁCH");
		btn_QLSach_left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeButtonColor(btn_QLSach_left);
				cardLayout.show(cardPanel, "panelMuonSach");
			}
		});
		btn_QLSach_left.setHorizontalAlignment(SwingConstants.LEADING);
		btn_QLSach_left.setBackground(new Color(0xE2FF99));
		btn_QLSach_left.setOpaque(true);
		btn_QLSach_left.setBorderPainted(false);
		btn_QLSach_left.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_QLSach_left.setBounds(0, 221, 238, 75);
		panel_Left.add(btn_QLSach_left);
		btn_QLSach_left.setIcon(newIconExChange);
		
		ImageIcon iconTrend = new ImageIcon(MainView.class.getResource("/images/trend.png"));
		Image imgTrend = iconTrend.getImage();
		Image newImgTrend = imgTrend.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIconTrend = new ImageIcon(newImgTrend);
		
		JButton btn_QLNhap_left = new JButton("QUẢN LÝ NHẬP");
		btn_QLNhap_left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeButtonColor(btn_QLNhap_left);
				cardLayout.show(cardPanel, "panelThongKe");
			}
		});
		btn_QLNhap_left.setHorizontalAlignment(SwingConstants.LEADING);
		btn_QLNhap_left.setBackground(new Color(0xE2FF99));
		btn_QLNhap_left.setOpaque(true);
		btn_QLNhap_left.setBorderPainted(false);
		btn_QLNhap_left.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_QLNhap_left.setBounds(0, 306, 238, 75);
		panel_Left.add(btn_QLNhap_left);
		btn_QLNhap_left.setIcon(newIconTrend);
		
		ImageIcon iconMember = new ImageIcon(MainView.class.getResource("/images/member.png"));
		Image imgMember = iconMember.getImage();
		Image newImgMember = imgMember.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIconMember = new ImageIcon(newImgMember);
		
		JButton btn_TheThanhVien_left = new JButton(" THẺ THÀNH VIÊN");
		btn_TheThanhVien_left.setHorizontalAlignment(SwingConstants.LEADING);
		btn_TheThanhVien_left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeButtonColor(btn_TheThanhVien_left);
				cardLayout.show(cardPanel, "panelTheThanhVien");
			}
		});
		btn_TheThanhVien_left.setOpaque(true);
		btn_TheThanhVien_left.setBorderPainted(false);
		btn_TheThanhVien_left.setBackground(new Color(0xE2FF99));
		btn_TheThanhVien_left.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_TheThanhVien_left.setBounds(0, 391, 238, 75);
		panel_Left.add(btn_TheThanhVien_left);
		btn_TheThanhVien_left.setIcon(newIconMember);
		
		cardPanel = new JPanel(cardLayout);
		cardPanel.setBounds(237, 65, 849, 548);
		contentPane.add(cardPanel);
		//cardPanel.setLayout(new CardLayout(0, 0));
		
		JPanel panelHome = new JPanel();
		panelHome.setBackground(new Color(255, 255, 255));
		cardPanel.add(panelHome, "panelHome");
		panelHome.setLayout(null);
		
		JLabel lbl_Home1 = new JLabel("XIN CHÀO!");
		lbl_Home1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Home1.setFont(new Font("Tahoma", Font.BOLD, 70));
		lbl_Home1.setBounds(10, 10, 829, 172);
		panelHome.add(lbl_Home1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(MainView.class.getResource("/images/background.png")));
		lblNewLabel_4.setBounds(0, 0, 849, 548);
		panelHome.add(lblNewLabel_4);
	  	
	  	JPanel panelPhieuMuon = new JPanel();
	  	panelPhieuMuon.setBackground(new Color(255, 255, 255));
	  	cardPanel.add(panelPhieuMuon, "panelHoaDon");
	  	panelPhieuMuon.setLayout(null);
	  	
	  	//////////////////////////////////////////////////// Phieu muon ///////////////////////////////////////
	  	JPanel jPanel_PhieuMuon = new JPanel();
	  	jPanel_PhieuMuon.setBounds(10, 10, 829, 411);
	  	panelPhieuMuon.add(jPanel_PhieuMuon);
	  	jPanel_PhieuMuon.setLayout(null);
	  	
	  	JLabel jLabel_pm10 = new JLabel("Thông tin khách hàng");
	  	jLabel_pm10.setFont(new Font("Tahoma", Font.BOLD, 30));
	  	jLabel_pm10.setHorizontalAlignment(SwingConstants.CENTER);
	  	jLabel_pm10.setBounds(10, 21, 809, 73);
	  	jPanel_PhieuMuon.add(jLabel_pm10);
	  	
	  	JLabel jLabel_pm1 = new JLabel("Số điện thoại");
	  	jLabel_pm1.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	jLabel_pm1.setBounds(50, 116, 120, 30);
	  	jPanel_PhieuMuon.add(jLabel_pm1);
	  	
	  	JLabel jLabel_pm9 = new JLabel("Tổng tiền");
	  	jLabel_pm9.setFont(new Font("Tahoma", Font.BOLD, 20));
	  	jLabel_pm9.setOpaque(true);
	  	jLabel_pm9.setBackground(new Color(240, 240, 240));
	  	jLabel_pm9.setBounds(454, 237, 120, 73);
	  	jPanel_PhieuMuon.add(jLabel_pm9);
	  	
	  	JTextField textField_SDT_pm = new JTextField();
	  	textField_SDT_pm.setColumns(10);
	  	textField_SDT_pm.setBounds(180, 116, 200, 30);
	  	jPanel_PhieuMuon.add(textField_SDT_pm);
	  	
	  	JLabel jLabel_pm2 = new JLabel("Họ và tên");
	  	jLabel_pm2.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	jLabel_pm2.setBounds(50, 156, 120, 30);
	  	jPanel_PhieuMuon.add(jLabel_pm2);
	  	
	  	JLabel jLabel_pm3 = new JLabel("Địa chỉ");
	  	jLabel_pm3.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	jLabel_pm3.setBounds(50, 196, 120, 30);
	  	jPanel_PhieuMuon.add(jLabel_pm3);
	  	
	  	JLabel jLabel_pm4 = new JLabel("Tên sách");
	  	jLabel_pm4.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	jLabel_pm4.setBounds(50, 239, 120, 30);
	  	jPanel_PhieuMuon.add(jLabel_pm4);
	  	
	  	JLabel jLabel_pm5 = new JLabel("Số lượng");
	  	jLabel_pm5.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	jLabel_pm5.setBounds(50, 280, 120, 30);
	  	jPanel_PhieuMuon.add(jLabel_pm5);
	  	
	  	textField_HoVaTen_pm = new JTextField();
	  	textField_HoVaTen_pm.setColumns(10);
	  	textField_HoVaTen_pm.setBounds(180, 156, 200, 30);
	  	jPanel_PhieuMuon.add(textField_HoVaTen_pm);
	  	
	  	textField_DiaChi_pm = new JTextField();
	  	textField_DiaChi_pm.setColumns(10);
	  	textField_DiaChi_pm.setBounds(180, 196, 200, 30);
	  	jPanel_PhieuMuon.add(textField_DiaChi_pm);
	  	
	  	textField_SoLuon_pm = new JTextField();
	  	textField_SoLuon_pm.setColumns(10);
	  	textField_SoLuon_pm.setBounds(180, 278, 200, 30);
	  	jPanel_PhieuMuon.add(textField_SoLuon_pm);
	  	
	  	JLabel jLabel_pm6 = new JLabel("Thời gian mượn");
	  	jLabel_pm6.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	jLabel_pm6.setBounds(454, 116, 120, 30);
	  	jPanel_PhieuMuon.add(jLabel_pm6);
	  	
	  	JLabel jLabel_pm7 = new JLabel("Phí mượn");
	  	jLabel_pm7.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	jLabel_pm7.setBounds(454, 156, 120, 30);
	  	jPanel_PhieuMuon.add(jLabel_pm7);
	  	
	  	JLabel jLabel_pm8 = new JLabel("Phí cọc");
	  	jLabel_pm8.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	jLabel_pm8.setBounds(454, 198, 120, 30);
	  	jPanel_PhieuMuon.add(jLabel_pm8);
	  	
	  	JLabel lbl_TongTien_pm = new JLabel("20000000");
	  	lbl_TongTien_pm.setBackground(new Color(255, 255, 255));
	  	lbl_TongTien_pm.setOpaque(true);
	  	lbl_TongTien_pm.setHorizontalAlignment(SwingConstants.CENTER);
	  	lbl_TongTien_pm.setFont(new Font("Tahoma", Font.PLAIN, 17));
	  	lbl_TongTien_pm.setBounds(584, 237, 200, 73);
	  	jPanel_PhieuMuon.add(lbl_TongTien_pm);
	  	
	  	JComboBox comboBox_ThoiGianMuon_pm = new JComboBox();
	  	comboBox_ThoiGianMuon_pm.setFont(new Font("Tahoma", Font.PLAIN, 17));
	  	comboBox_ThoiGianMuon_pm.setModel(new DefaultComboBoxModel(new String[] {"1 tháng", "3 tháng", "5 tháng", "7 tháng", "10 tháng", "12 tháng"}));
	  	comboBox_ThoiGianMuon_pm.setBounds(584, 114, 200, 30);
	  	jPanel_PhieuMuon.add(comboBox_ThoiGianMuon_pm);
	  	
	  	JButton btn_TenSach_pm = new JButton("Chọn tên sách");
	  	btn_TenSach_pm.setFont(new Font("Tahoma", Font.PLAIN, 17));
	  	btn_TenSach_pm.setBounds(180, 237, 200, 30);
	  	jPanel_PhieuMuon.add(btn_TenSach_pm);
	  	
	  	JLabel lbl_PhiMuon_pm = new JLabel("20000000");
	  	lbl_PhiMuon_pm.setOpaque(true);
	  	lbl_PhiMuon_pm.setHorizontalAlignment(SwingConstants.CENTER);
	  	lbl_PhiMuon_pm.setFont(new Font("Tahoma", Font.PLAIN, 17));
	  	lbl_PhiMuon_pm.setBackground(Color.WHITE);
	  	lbl_PhiMuon_pm.setBounds(584, 155, 200, 30);
	  	jPanel_PhieuMuon.add(lbl_PhiMuon_pm);
	  	
	  	JLabel lbl_PhiCoc_pm = new JLabel("20000000");
	  	lbl_PhiCoc_pm.setOpaque(true);
	  	lbl_PhiCoc_pm.setHorizontalAlignment(SwingConstants.CENTER);
	  	lbl_PhiCoc_pm.setFont(new Font("Tahoma", Font.PLAIN, 17));
	  	lbl_PhiCoc_pm.setBackground(Color.WHITE);
	  	lbl_PhiCoc_pm.setBounds(584, 196, 200, 30);
	  	jPanel_PhieuMuon.add(lbl_PhiCoc_pm);
	  	
	  	
	  	JButton btn_InPhieu_pm = new JButton("In phiếu");
	  	btn_InPhieu_pm.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	btn_InPhieu_pm.setBounds(137, 458, 140, 50);
	  	panelPhieuMuon.add(btn_InPhieu_pm);
	  	
	  	JButton btn_HuyThaoTac_pm = new JButton("Huỷ thao tác");
	  	btn_HuyThaoTac_pm.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	btn_HuyThaoTac_pm.setBounds(365, 458, 140, 50);
	  	panelPhieuMuon.add(btn_HuyThaoTac_pm);
	  	
	  	JButton btn_ThanhVien_pm = new JButton("Thành viên");
	  	btn_ThanhVien_pm.setFont(new Font("Tahoma", Font.BOLD, 15));
	  	btn_ThanhVien_pm.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  			
	  		}
	  	});
	  	btn_ThanhVien_pm.setBounds(587, 458, 140, 50);
	  	panelPhieuMuon.add(btn_ThanhVien_pm);
	  	
	  	JLabel lblNewLabel_6 = new JLabel("New label");
	  	lblNewLabel_6.setIcon(new ImageIcon(MainView.class.getResource("/images/background.png")));
	  	lblNewLabel_6.setBounds(0, 0, 849, 548);
	  	panelPhieuMuon.add(lblNewLabel_6);
	  	


	  
	  	
	  	JPanel panelQLPhieuMuon = new JPanel();
	  	panelQLPhieuMuon.setBackground(new Color(255, 255, 255));
	  	cardPanel.add(panelQLPhieuMuon, "panelQuanLySach");
	  	panelQLPhieuMuon.setLayout(null);
	  	
	  	table_qlpm = new JTable();
	  	table_qlpm.setFont(new Font("Tahoma", Font.PLAIN, 11));
	  	table_qlpm.setModel(new DefaultTableModel(
	  		new Object[][] {
	  			{null, null, null, null, null, null, null, null, null},
	  		},
	  		new String[] {
	  			"M\u00E3 phi\u1EBFu", "M\u00E3 kh\u00E1ch h\u00E0ng", "S\u0110T", "H\u1ECD v\u00E0 t\u00EAn", "T\u00EAn s\u00E1ch", "S\u1ED1 l\u01B0\u1EE3ng", "Ng\u00E0y tr\u1EA3", "T\u1ED5ng ti\u1EC1n", "T\u00ECnh tr\u1EA1ng"
	  		}
	  	));
	  	table_qlpm.getColumnModel().getColumn(0).setPreferredWidth(86);
	  	table_qlpm.getColumnModel().getColumn(1).setPreferredWidth(86);
	  	table_qlpm.getColumnModel().getColumn(2).setPreferredWidth(64);
	  	table_qlpm.getColumnModel().getColumn(3).setPreferredWidth(78);
	  	table_qlpm.getColumnModel().getColumn(4).setPreferredWidth(89);
	  	table_qlpm.getColumnModel().getColumn(5).setPreferredWidth(52);
	  	table_qlpm.getColumnModel().getColumn(6).setPreferredWidth(69);
	  	table_qlpm.getColumnModel().getColumn(7).setPreferredWidth(67);
	  	
	  	JLabel lbl_KhachChuaTraSach_qlpm = new JLabel("Khách chưa trả sách:");
	  	lbl_KhachChuaTraSach_qlpm.setHorizontalAlignment(SwingConstants.LEFT);
	  	lbl_KhachChuaTraSach_qlpm.setOpaque(true);
	  	lbl_KhachChuaTraSach_qlpm.setFont(new Font("Tahoma", Font.BOLD, 20));
	  	lbl_KhachChuaTraSach_qlpm.setBounds(10, 10, 300, 80);
	  	panelQLPhieuMuon.add(lbl_KhachChuaTraSach_qlpm);
	  	
	  	JButton btn_TimKiem_qlpm = new JButton("");
	  	btn_TimKiem_qlpm.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  		}
	  	});
	  	btn_TimKiem_qlpm.setOpaque(true);
	  	btn_TimKiem_qlpm.setBorderPainted(false);
	  	btn_TimKiem_qlpm.setBackground(new Color(226, 255, 153));
	  	btn_TimKiem_qlpm.setBounds(467, 10, 45, 45);
	  	panelQLPhieuMuon.add(btn_TimKiem_qlpm);
	  	btn_TimKiem_qlpm.setIcon(newIconTimKiem);
	  	
	  	textField_TimKiem_qlpm = new JTextField();
	  	textField_TimKiem_qlpm.setForeground(Color.LIGHT_GRAY);
	  	textField_TimKiem_qlpm.setFont(new Font("Tahoma", Font.PLAIN, 20));
	  	textField_TimKiem_qlpm.setColumns(10);
	  	textField_TimKiem_qlpm.setBackground(new Color(226, 255, 153));
	  	textField_TimKiem_qlpm.setBounds(510, 10, 300, 45);
	  	panelQLPhieuMuon.add(textField_TimKiem_qlpm);
	  	
	  	JPanel panel_qlpm = new JPanel();
	  	panel_qlpm.setBounds(10, 123, 829, 415);
	  	panelQLPhieuMuon.add(panel_qlpm);
	  	panel_qlpm.setLayout(null);
	  	
	  	JScrollPane scrollPane_qlpm = new JScrollPane(table_qlpm);
	  	scrollPane_qlpm.setBounds(0, 0, 829, 415);
	  	panel_qlpm.add(scrollPane_qlpm);
	  	
	  	JLabel lblNewLabel_1 = new JLabel("New label");
	  	lblNewLabel_1.setIcon(new ImageIcon(MainView.class.getResource("/images/background.png")));
	  	lblNewLabel_1.setBounds(0, 0, 849, 548);
	  	panelQLPhieuMuon.add(lblNewLabel_1);
	  	///////////////////////////////////////////////////////////////////////////////////////////
	  	
//	  	JPanel panelQLPhieuMuon = new JPanel();
//	  	panelQLPhieuMuon.setBackground(new Color(255, 255, 255));
//	  	cardPanel.add(panelQLPhieuMuon, "panelQuanLySach");
//	  	panelQLPhieuMuon.setLayout(null);
	  	
	  	JPanel panelQuanLySach = new JPanel();
	  	panelQuanLySach.setBackground(new Color(255, 255, 255));
	  	cardPanel.add(panelQuanLySach, "panelMuonSach");
	  	panelQuanLySach.setLayout(null);
	  	
	  	JPanel panelQuanLyNhap = new JPanel();
	  	panelQuanLyNhap.setBackground(new Color(255, 255, 255));
	  	cardPanel.add(panelQuanLyNhap, "panelThongKe");
	  	panelQuanLyNhap.setLayout(null);
	  	
	  	JPanel panel_qln = new JPanel();
	  	panel_qln.setBounds(10, 123, 829, 415);
	  	panelQuanLyNhap.add(panel_qln);
	  	panel_qln.setLayout(null);
	  	
	  	table_qln = new JTable();
	  	table_qln.setModel(new DefaultTableModel(
	  		new Object[][] {
	  			{null, null, null, null, null, null},
	  		},
	  		new String[] {
	  			"M\u00E3 l\u00F4", "Ng\u00E0y nh\u1EADp", "Thanh to\u00E1n", "Nh\u00E0 cung c\u1EA5p", "\u0110\u1ECBa ch\u1EC9 cung c\u1EA5p", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i"
	  		}
	  	));
	  	table_qln.getColumnModel().getColumn(0).setPreferredWidth(37);
	  	table_qln.getColumnModel().getColumn(1).setPreferredWidth(63);
	  	table_qln.getColumnModel().getColumn(2).setPreferredWidth(74);
	  	table_qln.getColumnModel().getColumn(3).setPreferredWidth(89);
	  	table_qln.getColumnModel().getColumn(4).setPreferredWidth(101);
	  	
	  	JScrollPane scrollPane_qln = new JScrollPane(table_qln);
	  	scrollPane_qln.setBounds(0, 0, 829, 415);
	  	panel_qln.add(scrollPane_qln);
	  	
	  	JButton btn_Sua_qln = new JButton("Sửa");
	  	btn_Sua_qln.setFont(new Font("Tahoma", Font.BOLD, 16));
	  	btn_Sua_qln.setBounds(10, 67, 120, 45);
	  	panelQuanLyNhap.add(btn_Sua_qln);
	  	
	  	JButton btn_Them_qln = new JButton("Thêm");
	  	btn_Them_qln.setFont(new Font("Tahoma", Font.BOLD, 16));
	  	btn_Them_qln.setBounds(200, 67, 120, 45);
	  	panelQuanLyNhap.add(btn_Them_qln);
	  	
	  	JButton btn_TimKiem_qln = new JButton("");
	  	btn_TimKiem_qln.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  		}
	  	});
	  	btn_TimKiem_qln.setOpaque(true);
	  	btn_TimKiem_qln.setBorderPainted(false);
	  	btn_TimKiem_qln.setBackground(new Color(226, 255, 153));
	  	btn_TimKiem_qln.setBounds(467, 10, 45, 45);
	  	panelQuanLyNhap.add(btn_TimKiem_qln);
	  	btn_TimKiem_qln.setIcon(newIconTimKiem);
	  	
	  	textField_TimKiem_qln = new JTextField();
	  	textField_TimKiem_qln.setForeground(Color.LIGHT_GRAY);
	  	textField_TimKiem_qln.setFont(new Font("Tahoma", Font.PLAIN, 20));
	  	textField_TimKiem_qln.setColumns(10);
	  	textField_TimKiem_qln.setBackground(new Color(226, 255, 153));
	  	textField_TimKiem_qln.setBounds(510, 10, 300, 45);
	  	panelQuanLyNhap.add(textField_TimKiem_qln);
	  	
	  	JButton btn_XemChiTietLo_qln = new JButton("Xem chi tiết lô");
	  	btn_XemChiTietLo_qln.setFont(new Font("Tahoma", Font.BOLD, 16));
	  	btn_XemChiTietLo_qln.setBounds(661, 68, 149, 45);
	  	panelQuanLyNhap.add(btn_XemChiTietLo_qln);
	  	
	  	JLabel lblNewLabel_2 = new JLabel("New label");
	  	lblNewLabel_2.setIcon(new ImageIcon(MainView.class.getResource("/images/background.png")));
	  	lblNewLabel_2.setBounds(0, 0, 849, 548);
	  	panelQuanLyNhap.add(lblNewLabel_2);
	  	
	  	panelTheThanhVien = new JPanel();
	  	cardPanel.add(panelTheThanhVien, "panelTheThanhVien");
	  	panelTheThanhVien.setLayout(null);
	  	
	  	JPanel panel_ttv = new JPanel();
	  	panel_ttv.setBounds(10, 122, 829, 415);
	  	panelTheThanhVien.add(panel_ttv);
	  	
	  	table_ttv = new JTable();
	  	table_ttv.setModel(new DefaultTableModel(
	  		new Object[][] {
	  			{null, null, null, null, null, null, null},
	  		},
	  		new String[] {
	  			"M\u00E3 TV", "H\u1ECD t\u00EAn", "S\u0110T", "\u0110\u1ECBa ch\u1EC9", "Th\u1EDDi gian \u0110K", "H\u1EA1n th\u1EBB", "Ph\u00ED \u0111\u0103ng k\u00FD"
	  		}
	  	));
	  	
	  	JPanel panel_qls = new JPanel();
	  	panel_qls.setBounds(10, 123, 829, 415);
	  	panelQuanLySach.add(panel_qls);
	  	
	  	table_qls = new JTable();
	  	table_qls.setModel(new DefaultTableModel(
	  		new Object[][] {
	  			{null, null, null, null, null, null, null, null, null, null},
	  		},
	  		new String[] {
	  			"M\u00E3 HD", "M\u00E3 KH", "H\u1ECD t\u00EAn", "S\u0110T", "\u0110\u1ECBa \u0111i\u1EC3m", "S\u00E1ch m\u01B0\u1EE3n", "Ng\u00E0y m\u01B0\u1EE3n", "Ng\u00E0y tr\u1EA3", "S\u1ED1 l\u01B0\u1EE3ng", "Ph\u00ED m\u01B0\u1EE3n"
	  		}
	  	));
	  	table_qls.getColumnModel().getColumn(0).setPreferredWidth(40);
	  	table_qls.getColumnModel().getColumn(1).setPreferredWidth(40);
	  	table_qls.getColumnModel().getColumn(8).setPreferredWidth(51);
	  	panel_qls.setLayout(null);
	  	
	  	JScrollPane scrollPane_qls = new JScrollPane(table_qls);
	  	scrollPane_qls.setBounds(0, 0, 829, 415);
	  	panel_qls.add(scrollPane_qls);
	  	
	  	JButton btn_Them_qls = new JButton("Thêm");
	  	btn_Them_qls.setFont(new Font("Tahoma", Font.BOLD, 16));
	  	btn_Them_qls.setBounds(200, 67, 120, 45);
	  	panelQuanLySach.add(btn_Them_qls);
	  	
	  	JButton btn_Sua_qls = new JButton("Sửa");
	  	btn_Sua_qls.setFont(new Font("Tahoma", Font.BOLD, 16));
	  	btn_Sua_qls.setBounds(10, 67, 120, 45);
	  	panelQuanLySach.add(btn_Sua_qls);
	  	
	  	textField_TimKiem_qls = new JTextField();
	  	textField_TimKiem_qls.setForeground(Color.LIGHT_GRAY);
	  	textField_TimKiem_qls.setFont(new Font("Tahoma", Font.PLAIN, 20));
	  	textField_TimKiem_qls.setColumns(10);
	  	textField_TimKiem_qls.setBackground(new Color(226, 255, 153));
	  	textField_TimKiem_qls.setBounds(510, 10, 300, 45);
	  	panelQuanLySach.add(textField_TimKiem_qls);
	  	
	  	JButton btn_TimKiem_qls = new JButton("");
	  	btn_TimKiem_qls.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  		}
	  	});
	  	btn_TimKiem_qls.setOpaque(true);
	  	btn_TimKiem_qls.setBorderPainted(false);
	  	btn_TimKiem_qls.setBackground(new Color(226, 255, 153));
	  	btn_TimKiem_qls.setBounds(467, 10, 45, 45);
	  	btn_TimKiem_qls.setIcon(newIconTimKiem);
	  	panelQuanLySach.add(btn_TimKiem_qls);
	  	
	  	JLabel lblNewLabel_32 = new JLabel("New label");
	  	lblNewLabel_32.setIcon(new ImageIcon(MainView.class.getResource("/images/background.png")));
	  	lblNewLabel_32.setBounds(0, 0, 849, 548);
	  	panelQuanLySach.add(lblNewLabel_32);
	  	panel_ttv.setLayout(null);
	  	
	  	JScrollPane scrollPane_ttv = new JScrollPane(table_ttv);
	  	scrollPane_ttv.setBounds(0, 0, 829, 415);
	  	panel_ttv.add(scrollPane_ttv);
	  	
	  	JButton btn_Sua_ttv = new JButton("Sửa");
	  	btn_Sua_ttv.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  		}
	  	});
	  	btn_Sua_ttv.setFont(new Font("Tahoma", Font.BOLD, 16));
	  	btn_Sua_ttv.setBounds(10, 67, 120, 45);
	  	panelTheThanhVien.add(btn_Sua_ttv);
	  	
	  	JButton btn_Them_ttv = new JButton("Thêm");
	  	btn_Them_ttv.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  			new DialogThemTTVView(frame).setVisible(true);
	  		}
	  	});
	  	btn_Them_ttv.setFont(new Font("Tahoma", Font.BOLD, 16));
	  	btn_Them_ttv.setBounds(200, 67, 120, 45);
	  	panelTheThanhVien.add(btn_Them_ttv);
	  	
	  	textField_TimKiem_ttv = new JTextField();
	  	textField_TimKiem_ttv.setBackground(new Color(0xE2FF99));
	  	textField_TimKiem_ttv.setForeground(new Color(192, 192, 192));
	  	textField_TimKiem_ttv.setFont(new Font("Tahoma", Font.PLAIN, 20));
	  	textField_TimKiem_ttv.setBounds(510, 10, 300, 45);
	  	panelTheThanhVien.add(textField_TimKiem_ttv);
	  	textField_TimKiem_ttv.setColumns(10);
	  	
	  	
	  	
	  	JButton btn_TimKiem_ttv = new JButton("");
	  	btn_TimKiem_ttv.setBackground(new Color(0xE2FF99));
	  	btn_TimKiem_ttv.setOpaque(true);
	  	btn_TimKiem_ttv.setBorderPainted(false);
	  	btn_TimKiem_ttv.setBounds(467, 10, 45, 45);
	  	panelTheThanhVien.add(btn_TimKiem_ttv);
	  	btn_TimKiem_ttv.setIcon(newIconTimKiem);
	  	
	  	JLabel lblNewLabel_5 = new JLabel("New label");
	  	lblNewLabel_5.setIcon(new ImageIcon(MainView.class.getResource("/images/background.png")));
	  	lblNewLabel_5.setBounds(0, 0, 849, 548);
	  	panelTheThanhVien.add(lblNewLabel_5);
	  	

	}
	
	private void changeButtonColor(JButton button) {
        if (lastClicked != null) {
        	lastClicked.setBackground(new Color(0xE2FF99));
        }
        button.setBackground(new Color(0X7A8F44));
        lastClicked = button;
    }
}








































