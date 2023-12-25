package Home.Views;

import Components.AlertMessager;
import Components.panelItems;
import Home.Controller.EmployeeController;
import Home.Model.EmployeeModel;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Home extends javax.swing.JFrame {
    
    EmployeeController controller = new EmployeeController();
    
    public Home() {
        initComponents();
        viewEmployee();
    }
    
    public void viewEmployee(){
        scrollPanel.removeAll();
        scrollPanel.setLayout(new GridLayout(controller.getData().size()/5, 5));
        controller.getData().forEach((emp) -> {
            panelItems items = new panelItems(emp);
            scrollPanel.add(items);
            scrollPanel.repaint();
            scrollPanel.revalidate();
     
        });        
    }
    
    public void getData(){
        DefaultTableModel model =(DefaultTableModel) table.getModel();
        model.setRowCount(0);
        controller.getData().forEach((emp)->{
            Object[] row = {
                emp.getId(),
                emp.getName(),
                emp.getGender(),
                emp.getAge(),
                emp.getPosition(),
                emp.getSalary(),
                emp.getContact(),
                emp.getImage(),
                emp.getDate(),
            };
            model.addRow(row);
        });
    }
    
    public void clear(){
        txtName.setText("");
        btnMale.setSelected(false);
        btnFemale.setSelected(false);
        txtSalary.setText("");
        txtAge.setText("");
        txtContact.setText("");
        txtPosition.setText("");
        txtImage.setText("");
        btnGpGender.clearSelection();
        lbImage.setIcon(null);
    }
    
    void gotoScreen(Component component){
        mainScreen.removeAll();
        mainScreen.add(component);
        mainScreen.repaint();
        mainScreen.revalidate();
    }
    
    public void chooseImage(JLabel label,JTextField textField){
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        String fileName  = file.getAbsolutePath();
        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(),Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
        textField.setText(fileName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGpGender = new javax.swing.ButtonGroup();
        dashBoard = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new com.k33ptoo.components.KButton();
        btnGotoSearch = new com.k33ptoo.components.KButton();
        btnMenu1 = new com.k33ptoo.components.KButton();
        mainScreen = new javax.swing.JPanel();
        homeScreen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        btnAddEmployee = new javax.swing.JButton();
        lbImage = new javax.swing.JLabel();
        btnChooseImage = new javax.swing.JButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollPanel = new javax.swing.JPanel();
        txtContact = new javax.swing.JTextField();
        searchScreen = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtUDAge = new javax.swing.JTextField();
        txtUDImage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnUDMale = new javax.swing.JRadioButton();
        btnUDFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUDPosition = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtUDDate = new com.toedter.calendar.JDateChooser();
        txtUDSalary = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtUDContact = new javax.swing.JTextField();
        lbUDImage = new javax.swing.JLabel();
        btnUDChooseImage = new javax.swing.JButton();
        btnMenu = new com.k33ptoo.components.KButton();
        btnMenu2 = new com.k33ptoo.components.KButton();
        jLabel6 = new javax.swing.JLabel();
        txtUDName = new javax.swing.JTextField();
        txtUDId = new javax.swing.JTextField();
        menuScreen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));

        dashBoard.setBackground(new java.awt.Color(255, 255, 255));
        dashBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        dashBoard.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 160));

        jLabel1.setFont(new java.awt.Font("Barlow", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin");
        dashBoard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, 170, 30));

        btnHome.setText("Home");
        btnHome.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnHome.setkBorderRadius(30);
        btnHome.setkEndColor(new java.awt.Color(255, 51, 51));
        btnHome.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnHome.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnHome.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnHome.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnHome.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnHome.setkStartColor(new java.awt.Color(255, 153, 153));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        dashBoard.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, -1));

        btnGotoSearch.setText("Search");
        btnGotoSearch.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnGotoSearch.setkBorderRadius(30);
        btnGotoSearch.setkEndColor(new java.awt.Color(255, 51, 51));
        btnGotoSearch.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnGotoSearch.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnGotoSearch.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnGotoSearch.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnGotoSearch.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnGotoSearch.setkStartColor(new java.awt.Color(255, 153, 153));
        btnGotoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoSearchActionPerformed(evt);
            }
        });
        dashBoard.add(btnGotoSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 150, -1));

        btnMenu1.setText("Menu");
        btnMenu1.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnMenu1.setkBorderRadius(30);
        btnMenu1.setkEndColor(new java.awt.Color(255, 51, 51));
        btnMenu1.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnMenu1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnMenu1.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnMenu1.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnMenu1.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnMenu1.setkStartColor(new java.awt.Color(255, 153, 153));
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        dashBoard.add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 150, -1));

        mainScreen.setBackground(new java.awt.Color(255, 255, 255));
        mainScreen.setLayout(new java.awt.CardLayout());

        homeScreen.setBackground(new java.awt.Color(255, 255, 255));
        homeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Barlow", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Employee");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeScreen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        txtName.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 190, 30));

        jLabel4.setBackground(new java.awt.Color(100, 100, 100));
        jLabel4.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel4.setText("Name           :");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 100, 30));

        jLabel10.setBackground(new java.awt.Color(100, 100, 100));
        jLabel10.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel10.setText("Gender        :");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 100, 30));

        btnGpGender.add(btnMale);
        btnMale.setText("Male");
        homeScreen.add(btnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 411, 90, 30));

        btnGpGender.add(btnFemale);
        btnFemale.setText("Female");
        homeScreen.add(btnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 410, 100, 30));

        jLabel11.setBackground(new java.awt.Color(100, 100, 100));
        jLabel11.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel11.setText("Salary          :");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 30));

        txtSalary.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtSalary.setForeground(new java.awt.Color(51, 51, 51));
        txtSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 190, 30));

        jLabel12.setBackground(new java.awt.Color(100, 100, 100));
        jLabel12.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel12.setText("Contact      :");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 100, 30));

        txtImage.setEditable(false);
        txtImage.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtImage.setForeground(new java.awt.Color(51, 51, 51));
        txtImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 0, 0));

        jLabel7.setBackground(new java.awt.Color(100, 100, 100));
        jLabel7.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel7.setText("Age              :");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 100, 30));

        jLabel8.setBackground(new java.awt.Color(100, 100, 100));
        jLabel8.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel8.setText("Position     :");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 100, 30));

        jLabel13.setBackground(new java.awt.Color(100, 100, 100));
        jLabel13.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel13.setText("Date            :");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 100, 30));

        txtAge.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtAge.setForeground(new java.awt.Color(51, 51, 51));
        txtAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 190, 30));

        txtPosition.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtPosition.setForeground(new java.awt.Color(51, 51, 51));
        txtPosition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 190, 30));

        btnAddEmployee.setBackground(new java.awt.Color(255, 204, 204));
        btnAddEmployee.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnAddEmployee.setText("+ Add");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });
        homeScreen.add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 140, -1));

        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(100, 100, 100)));
        homeScreen.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 120, 130));

        btnChooseImage.setBackground(new java.awt.Color(255, 204, 204));
        btnChooseImage.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnChooseImage.setText("Brawe");
        btnChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseImageActionPerformed(evt);
            }
        });
        homeScreen.add(btnChooseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 120, -1));

        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 190, 30));

        jLabel3.setBackground(new java.awt.Color(100, 100, 100));
        jLabel3.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 190, 10));

        javax.swing.GroupLayout scrollPanelLayout = new javax.swing.GroupLayout(scrollPanel);
        scrollPanel.setLayout(scrollPanelLayout);
        scrollPanelLayout.setHorizontalGroup(
            scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        scrollPanelLayout.setVerticalGroup(
            scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(scrollPanel);

        homeScreen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 290));

        txtContact.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtContact.setForeground(new java.awt.Color(51, 51, 51));
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 190, 30));

        mainScreen.add(homeScreen, "card2");

        searchScreen.setBackground(new java.awt.Color(255, 255, 255));
        searchScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "Age", "Position", "Salary", "Contact", "Image", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        searchScreen.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 123, 770, 240));

        txtSearch.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        searchScreen.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 53, 450, 40));

        btnSearch.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        searchScreen.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 53, 40, 40));

        txtUDAge.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtUDAge.setForeground(new java.awt.Color(51, 51, 51));
        txtUDAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 190, 30));

        txtUDImage.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtUDImage.setForeground(new java.awt.Color(51, 51, 51));
        txtUDImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 0, 0));

        jLabel5.setBackground(new java.awt.Color(100, 100, 100));
        jLabel5.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel5.setText("Name           :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 100, 30));

        jLabel14.setBackground(new java.awt.Color(100, 100, 100));
        jLabel14.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel14.setText("Gender        :");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 100, 30));

        btnGpGender.add(btnUDMale);
        btnUDMale.setText("Male");
        searchScreen.add(btnUDMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 90, 30));

        btnGpGender.add(btnUDFemale);
        btnUDFemale.setText("Female");
        searchScreen.add(btnUDFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 100, 30));

        jLabel9.setBackground(new java.awt.Color(100, 100, 100));
        jLabel9.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel9.setText("Age              :");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 100, 30));

        jLabel15.setBackground(new java.awt.Color(100, 100, 100));
        jLabel15.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel15.setText("Position     :");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 100, 30));

        txtUDPosition.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtUDPosition.setForeground(new java.awt.Color(51, 51, 51));
        txtUDPosition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 190, 30));

        jLabel16.setBackground(new java.awt.Color(100, 100, 100));
        jLabel16.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel16.setText("Date            :");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 100, 30));

        txtUDDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 190, 30));

        txtUDSalary.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtUDSalary.setForeground(new java.awt.Color(51, 51, 51));
        txtUDSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 190, 30));

        jLabel17.setBackground(new java.awt.Color(100, 100, 100));
        jLabel17.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel17.setText("Salary          :");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 100, 30));

        jLabel18.setBackground(new java.awt.Color(100, 100, 100));
        jLabel18.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel18.setText("Contact      :");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 100, 30));

        txtUDContact.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtUDContact.setForeground(new java.awt.Color(51, 51, 51));
        txtUDContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 190, 30));

        lbUDImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUDImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(100, 100, 100)));
        searchScreen.add(lbUDImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 120, 130));

        btnUDChooseImage.setBackground(new java.awt.Color(255, 204, 204));
        btnUDChooseImage.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnUDChooseImage.setText("Brawe");
        btnUDChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUDChooseImageActionPerformed(evt);
            }
        });
        searchScreen.add(btnUDChooseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 120, -1));

        btnMenu.setText("Delete");
        btnMenu.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnMenu.setkBorderRadius(30);
        btnMenu.setkEndColor(new java.awt.Color(255, 51, 51));
        btnMenu.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnMenu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnMenu.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnMenu.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnMenu.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnMenu.setkStartColor(new java.awt.Color(255, 153, 153));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        searchScreen.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 120, 40));

        btnMenu2.setText("Update");
        btnMenu2.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnMenu2.setkBorderRadius(30);
        btnMenu2.setkEndColor(new java.awt.Color(255, 51, 51));
        btnMenu2.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnMenu2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnMenu2.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnMenu2.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnMenu2.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnMenu2.setkStartColor(new java.awt.Color(255, 153, 153));
        btnMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu2ActionPerformed(evt);
            }
        });
        searchScreen.add(btnMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 120, 40));

        jLabel6.setBackground(new java.awt.Color(100, 100, 100));
        jLabel6.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 190, 10));

        txtUDName.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtUDName.setForeground(new java.awt.Color(51, 51, 51));
        txtUDName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 190, 30));

        txtUDId.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtUDId.setForeground(new java.awt.Color(51, 51, 51));
        txtUDId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 0, 0));

        mainScreen.add(searchScreen, "card3");

        menuScreen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuScreenLayout = new javax.swing.GroupLayout(menuScreen);
        menuScreen.setLayout(menuScreenLayout);
        menuScreenLayout.setHorizontalGroup(
            menuScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        menuScreenLayout.setVerticalGroup(
            menuScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainScreen.add(menuScreen, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImageActionPerformed
        chooseImage(lbImage, txtImage);
    }//GEN-LAST:event_btnChooseImageActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        String name = txtName.getText();
        String gender = btnMale.isSelected()?"Male":btnFemale.isSelected()?"Female":"Other";
        String age1 = txtAge.getText();
        String position = txtPosition.getText();
        String salary1 = txtSalary.getText();
        String contact = txtContact.getText();
        String image   = txtImage.getText();
        SimpleDateFormat df = new SimpleDateFormat(txtDate.getDateFormatString());
        String date = df.format(txtDate.getDate());
        
        if (!name.isEmpty() && !gender.isEmpty() && !age1.isEmpty() && !position.isEmpty() && !salary1.isEmpty() && !contact.isEmpty() && !image.isEmpty() && !date.isEmpty()) {
            int age = Integer.parseInt(age1);
            double salary = Double.parseDouble(salary1);
            controller.addEmpToDB(new EmployeeModel(0,name,gender,age,position,salary,contact,image,date));
            viewEmployee();
            clear();
        } else {
            AlertMessager.warning("Please enter all field");
        }
        
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnGotoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoSearchActionPerformed
        gotoScreen(searchScreen);
        getData();
    }//GEN-LAST:event_btnGotoSearchActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        gotoScreen(homeScreen);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        gotoScreen(menuScreen);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenu2ActionPerformed

    private void btnUDChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUDChooseImageActionPerformed
        chooseImage(lbUDImage, txtUDImage);
    }//GEN-LAST:event_btnUDChooseImageActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        txtUDId.setText(model.getValueAt(row, 0).toString());
        txtUDName.setText(model.getValueAt(row, 1).toString());
        if (model.getValueAt(row, 2).toString().equalsIgnoreCase("male")) {
            btnUDMale.setSelected(true);
        } else {
            btnUDFemale.setSelected(true);
        }
        txtUDAge.setText(model.getValueAt(row, 3).toString());
        txtUDPosition.setText(model.getValueAt(row, 4).toString());
        txtUDSalary.setText(model.getValueAt(row, 5).toString());
        txtUDContact.setText(model.getValueAt(row, 6).toString());
        txtUDImage.setText(model.getValueAt(row, 7).toString());
        ImageIcon icon = new ImageIcon(txtUDImage.getText());
        Image image = icon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(),Image.SCALE_SMOOTH);
        lbUDImage.setIcon(new ImageIcon(image));
        
        try {
            Date date;
            SimpleDateFormat df = new SimpleDateFormat(txtUDDate.getDateFormatString());
            date = df.parse(model.getValueAt(row, 8).toString());
            txtUDDate.setDate(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_tableMouseClicked

    public static void main(String args[]) {
        new Themes.Theme("light");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnChooseImage;
    private javax.swing.JRadioButton btnFemale;
    private com.k33ptoo.components.KButton btnGotoSearch;
    private javax.swing.ButtonGroup btnGpGender;
    private com.k33ptoo.components.KButton btnHome;
    private javax.swing.JRadioButton btnMale;
    private com.k33ptoo.components.KButton btnMenu;
    private com.k33ptoo.components.KButton btnMenu1;
    private com.k33ptoo.components.KButton btnMenu2;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUDChooseImage;
    private javax.swing.JRadioButton btnUDFemale;
    private javax.swing.JRadioButton btnUDMale;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JPanel homeScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbUDImage;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JPanel menuScreen;
    private javax.swing.JLabel profile;
    private javax.swing.JPanel scrollPanel;
    private javax.swing.JPanel searchScreen;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUDAge;
    private javax.swing.JTextField txtUDContact;
    private com.toedter.calendar.JDateChooser txtUDDate;
    private javax.swing.JTextField txtUDId;
    private javax.swing.JTextField txtUDImage;
    private javax.swing.JTextField txtUDName;
    private javax.swing.JTextField txtUDPosition;
    private javax.swing.JTextField txtUDSalary;
    // End of variables declaration//GEN-END:variables
}
