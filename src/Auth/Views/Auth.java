package Auth.Views;

import Components.AlertMessager;
import Database.DBConnector;
import Home.Views.Home;
import Themes.Theme;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.sql.*;

public class Auth extends javax.swing.JFrame {
    
    private void addAuthScreen(Component screen){
        authScreen.removeAll();
        authScreen.add(screen);
        authScreen.repaint();
        authScreen.revalidate();
    }
    
    public Auth() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        bg = new javax.swing.JPanel();
        authImage = new javax.swing.JLabel();
        authScreen = new javax.swing.JPanel();
        signInScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnSignIn = new com.k33ptoo.components.KButton();
        gotoSignUp = new javax.swing.JLabel();
        signUpScreen = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JTextField();
        btnSignUp = new com.k33ptoo.components.KButton();
        gotoSignIn = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 45, 45));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Email            :");
        jLabel2.setAutoscrolls(true);
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        jTextField1.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(45, 44, 44));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        jLabel4.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 45, 45));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Password    :");
        jLabel4.setAutoscrolls(true);
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        jTextField2.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(45, 44, 44));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1004, 611));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        authImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signIn.jpg"))); // NOI18N

        authScreen.setLayout(new java.awt.CardLayout());

        signInScreen.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Barlow", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 42, 42));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN IN");

        jLabel5.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 45, 45));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome back , Continue with your email and password or");
        jLabel5.setAutoscrolls(true);

        jLabel6.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 45, 45));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("continue with social media");
        jLabel6.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 45, 45));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Email            :");
        jLabel3.setAutoscrolls(true);
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        jTextField3.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(45, 44, 44));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        jLabel7.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(45, 45, 45));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Password    :");
        jLabel7.setAutoscrolls(true);
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        jTextField4.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(45, 44, 44));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        btnSignIn.setText("Sign In");
        btnSignIn.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSignIn.setkBorderRadius(40);
        btnSignIn.setkEndColor(new java.awt.Color(255, 51, 51));
        btnSignIn.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnSignIn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignIn.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnSignIn.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnSignIn.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnSignIn.setkStartColor(new java.awt.Color(255, 153, 153));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        gotoSignUp.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        gotoSignUp.setForeground(new java.awt.Color(45, 45, 45));
        gotoSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotoSignUp.setText("Create new account ?");
        gotoSignUp.setAutoscrolls(true);
        gotoSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoSignUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signInScreenLayout = new javax.swing.GroupLayout(signInScreen);
        signInScreen.setLayout(signInScreenLayout);
        signInScreenLayout.setHorizontalGroup(
            signInScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInScreenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(signInScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signInScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(signInScreenLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
            .addGroup(signInScreenLayout.createSequentialGroup()
                .addGroup(signInScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signInScreenLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(signInScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(signInScreenLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(signInScreenLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(signInScreenLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gotoSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        signInScreenLayout.setVerticalGroup(
            signInScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInScreenLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(85, 85, 85)
                .addGroup(signInScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(signInScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(gotoSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        authScreen.add(signInScreen, "card2");

        signUpScreen.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Barlow", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 42, 42));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SIGN UP");

        jLabel9.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(45, 45, 45));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Continue with your email and password or");
        jLabel9.setAutoscrolls(true);

        jLabel10.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(45, 45, 45));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("continue with social media");
        jLabel10.setAutoscrolls(true);

        jLabel11.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 45, 45));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Email                  :");
        jLabel11.setAutoscrolls(true);
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        txtEmail.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(45, 44, 44));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        jLabel12.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(45, 45, 45));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Password           :");
        jLabel12.setAutoscrolls(true);
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        txtPassword.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(45, 44, 44));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        jLabel13.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(45, 45, 45));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Re-Password    :");
        jLabel13.setAutoscrolls(true);
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        txtRePassword.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtRePassword.setForeground(new java.awt.Color(45, 44, 44));
        txtRePassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRePassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));

        btnSignUp.setText("Sign Up");
        btnSignUp.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSignUp.setkBorderRadius(40);
        btnSignUp.setkEndColor(new java.awt.Color(255, 51, 51));
        btnSignUp.setkHoverEndColor(new java.awt.Color(255, 153, 153));
        btnSignUp.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignUp.setkHoverStartColor(new java.awt.Color(255, 51, 51));
        btnSignUp.setkPressedColor(new java.awt.Color(255, 51, 51));
        btnSignUp.setkSelectedColor(new java.awt.Color(255, 51, 51));
        btnSignUp.setkStartColor(new java.awt.Color(255, 153, 153));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        gotoSignIn.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        gotoSignIn.setForeground(new java.awt.Color(45, 45, 45));
        gotoSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotoSignIn.setText("Do you have an account ?");
        gotoSignIn.setAutoscrolls(true);
        gotoSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoSignInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signUpScreenLayout = new javax.swing.GroupLayout(signUpScreen);
        signUpScreen.setLayout(signUpScreenLayout);
        signUpScreenLayout.setHorizontalGroup(
            signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(signUpScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpScreenLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpScreenLayout.createSequentialGroup()
                                .addGroup(signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpScreenLayout.createSequentialGroup()
                                .addGroup(signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addGroup(signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66))
                            .addComponent(gotoSignIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        signUpScreenLayout.setVerticalGroup(
            signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpScreenLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(108, 108, 108)
                .addGroup(signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(signUpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(gotoSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        authScreen.add(signUpScreen, "card3");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(authImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(authImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(authScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        
    }//GEN-LAST:event_btnSignInActionPerformed

    private void gotoSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoSignUpMouseClicked
        authImage.setIcon(new ImageIcon("D:/Category/NetbeansProject/Employee-DB/src/Images/signUp.jpg"));
        addAuthScreen(signUpScreen);
    }//GEN-LAST:event_gotoSignUpMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String rePassword = txtRePassword.getText();

        if (!email.isEmpty() || !password.isEmpty() || !rePassword.isEmpty()) {
            if (password.equals(rePassword)) {
                DBConnector connector = new DBConnector();

                PreparedStatement ps;
                ResultSet rs;

                try {
                    String sql = "SELECT `email` FROM `authantication` WHERE email=?";
                    ps = (PreparedStatement) connector.connector("db_employee").prepareStatement(sql);
                    ps.setString(1, email);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        AlertMessager.error("Your email is used");
                    }else{
                        String sql1 = "INSERT INTO `authantication`(`email`, `password`) VALUES (?,MD5(?))";
                        ps = (PreparedStatement) connector.connector("db_employee").prepareStatement(sql1);
                        ps.setString(1, email);
                        ps.setString(2, password);
                        int result = ps.executeUpdate();
                        if (result > 0) {
                            AlertMessager.success("Create account success");
                            new Home().setVisible(true);
                            dispose();
                        } else {
                            AlertMessager.error("Can't create your account");
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }else{
                AlertMessager.warning("Your Re-Password is not correct");
            }
        }else{
            AlertMessager.warning("Please enter your data");
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void gotoSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoSignInMouseClicked
        authImage.setIcon(new ImageIcon("D:/Category/NetbeansProject/Employee-DB/src/Images/signIn.jpg"));
        addAuthScreen(signInScreen);

    }//GEN-LAST:event_gotoSignInMouseClicked

    public static void main(String args[]) {
        new Theme("light");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authImage;
    private javax.swing.JPanel authScreen;
    private javax.swing.JPanel bg;
    private com.k33ptoo.components.KButton btnSignIn;
    private com.k33ptoo.components.KButton btnSignUp;
    private javax.swing.JLabel gotoSignIn;
    private javax.swing.JLabel gotoSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel signInScreen;
    private javax.swing.JPanel signUpScreen;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRePassword;
    // End of variables declaration//GEN-END:variables
}
