package Home.Views;

import Components.AlertMessager;
import Components.panelItems;
import Home.Controller.EmployeeController;
import Home.Model.EmployeeModel;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
public class Home extends javax.swing.JFrame {
    
    EmployeeController controller = new EmployeeController();
    
    public Home() {
        initComponents();
        scrollPacel.setLayout(new GridLayout(20/5, 5, 3, 3));
        for (int i = 0; i < 20; i++) {
            panelItems items = new panelItems();
            scrollPacel.add(items);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGpGender = new javax.swing.ButtonGroup();
        dashBoard = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSignUp = new com.k33ptoo.components.KButton();
        btnSignUp1 = new com.k33ptoo.components.KButton();
        btnSignUp2 = new com.k33ptoo.components.KButton();
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
        scrollPacel = new javax.swing.JPanel();
        txtContact = new javax.swing.JTextField();
        searchScreen = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
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

        btnSignUp.setText("Menu");
        btnSignUp.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSignUp.setkBorderRadius(30);
        btnSignUp.setkEndColor(new java.awt.Color(255, 51, 51));
        btnSignUp.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnSignUp.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignUp.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnSignUp.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnSignUp.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnSignUp.setkStartColor(new java.awt.Color(255, 153, 153));
        dashBoard.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 150, -1));

        btnSignUp1.setText("Home");
        btnSignUp1.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSignUp1.setkBorderRadius(30);
        btnSignUp1.setkEndColor(new java.awt.Color(255, 51, 51));
        btnSignUp1.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnSignUp1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignUp1.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnSignUp1.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnSignUp1.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnSignUp1.setkStartColor(new java.awt.Color(255, 153, 153));
        dashBoard.add(btnSignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, -1));

        btnSignUp2.setText("Search");
        btnSignUp2.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSignUp2.setkBorderRadius(30);
        btnSignUp2.setkEndColor(new java.awt.Color(255, 51, 51));
        btnSignUp2.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnSignUp2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignUp2.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnSignUp2.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnSignUp2.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnSignUp2.setkStartColor(new java.awt.Color(255, 153, 153));
        dashBoard.add(btnSignUp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 150, -1));

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
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });
        homeScreen.add(btnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 411, 90, 30));

        btnGpGender.add(btnFemale);
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });
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

        javax.swing.GroupLayout scrollPacelLayout = new javax.swing.GroupLayout(scrollPacel);
        scrollPacel.setLayout(scrollPacelLayout);
        scrollPacelLayout.setHorizontalGroup(
            scrollPacelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        scrollPacelLayout.setVerticalGroup(
            scrollPacelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(scrollPacel);

        homeScreen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 290));

        txtContact.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtContact.setForeground(new java.awt.Color(51, 51, 51));
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 190, 30));

        mainScreen.add(homeScreen, "card2");

        searchScreen.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "Age", "Position", "Salary", "Contact", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        txtSearch.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N

        javax.swing.GroupLayout searchScreenLayout = new javax.swing.GroupLayout(searchScreen);
        searchScreen.setLayout(searchScreenLayout);
        searchScreenLayout.setHorizontalGroup(
            searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchScreenLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchScreenLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        searchScreenLayout.setVerticalGroup(
            searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchScreenLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

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

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void btnChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        String fileName  = file.getAbsolutePath();
        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(),Image.SCALE_SMOOTH);
        lbImage.setIcon(new ImageIcon(image));
        txtImage.setText(fileName);
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
        
        System.out.println("name      : "+name);
        System.out.println("gender    : "+gender);
        System.out.println("age       : "+age1);
        System.out.println("position  : "+position);
        System.out.println("salary    : "+salary1);
        System.out.println("contact   : "+contact);
        System.out.println("image     : "+image);
        System.out.println("date      : "+date);
        
        if (!name.isEmpty() && !gender.isEmpty() && !age1.isEmpty() && !position.isEmpty() && !salary1.isEmpty() && !contact.isEmpty() && !image.isEmpty() && !date.isEmpty()) {
            int age = Integer.parseInt(age1);
            double salary = Double.parseDouble(salary1);
            controller.addEmpToDB(new EmployeeModel(name,gender,age,position,salary,contact,image,date));
        } else {
            AlertMessager.warning("Please enter all field");
        }
        
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

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
    private javax.swing.ButtonGroup btnGpGender;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JButton btnSearch;
    private com.k33ptoo.components.KButton btnSignUp;
    private com.k33ptoo.components.KButton btnSignUp1;
    private com.k33ptoo.components.KButton btnSignUp2;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JPanel homeScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JPanel menuScreen;
    private javax.swing.JLabel profile;
    private javax.swing.JPanel scrollPacel;
    private javax.swing.JPanel searchScreen;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
