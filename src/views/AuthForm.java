
package views;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import models.Cuenta;
import models.Docente;
import models.Estudiante;
import services.CuentaService;
import services.DocenteService;
import services.EstudianteService;
import services.UsuarioService;
import util.Hash;
import util.ValidarResponse;

public class AuthForm extends javax.swing.JFrame {

    public Image back = new ImageIcon(getClass().getResource("/img/background2.png")).getImage();
    public static final UsuarioService usuarioService = new UsuarioService();
    public static final EstudianteService estudianteService = new EstudianteService();
    public static final DocenteService docenteService = new DocenteService();
    private int tipoUsr = 1;
    
    
    public AuthForm() {
        
        initComponents();
        this.cargarEstilos();
        this.setLocationRelativeTo(null);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SuccessMessage = new javax.swing.JDialog();
        ContentPanel = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        successMessage = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        ErrorMessage = new javax.swing.JDialog();
        ContentPanel1 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        btnOk1 = new javax.swing.JButton();
        TipoUsuarioChoose = new javax.swing.JDialog();
        Contenido = new javax.swing.JPanel();
        btnOk2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        btnDocente = new javax.swing.JButton();
        btnEstudiante = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BackgroundPanel = new util.BGPanel();
        Cover = new javax.swing.JLabel();
        FormsPanel = new javax.swing.JTabbedPane();
        LoginPanel = new javax.swing.JPanel();
        LoginFormPanel = new util.RoundPanel(25, new Color(239,239,239));
        txtUsuarioLogin = new util.RoundJTextField();
        txtPasswordLogin = new util.RoundJPassField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        RegisterPanel = new javax.swing.JPanel();
        jPanel4 = new util.RoundPanel(25, new Color(239,239,239));
        txtNombreReg = new util.RoundJTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnIngresar2 = new javax.swing.JButton();
        txtCedulaReg = new util.RoundJTextField();
        txtEmailReg = new util.RoundJTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefonoReg = new util.RoundJTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDireccionReg = new util.RoundJTextField();
        jLabel11 = new javax.swing.JLabel();
        txtApellidoReg = new util.RoundJTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUsuarioReg = new util.RoundJTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPasswordReg = new util.RoundJPassField();
        btnRegresar = new javax.swing.JButton();
        EstudiantePanel = new javax.swing.JPanel();
        EstudianteForm = new util.RoundPanel(25, new Color(239,239,239));
        txtNivelEst = new util.RoundJTextField();
        jLabel14 = new javax.swing.JLabel();
        btnGuardarEstudiante = new javax.swing.JButton();
        txtCarreraStu = new util.RoundJTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnRegresar1 = new javax.swing.JButton();
        DocentePanel = new javax.swing.JPanel();
        DocenteForm = new util.RoundPanel(25, new Color(239,239,239));
        txtTituloDoc = new util.RoundJTextField();
        jLabel25 = new javax.swing.JLabel();
        btnGuardarDocente = new javax.swing.JButton();
        txtDepartamentoDoc = new util.RoundJTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnRegresar2 = new javax.swing.JButton();

        SuccessMessage.setMinimumSize(new java.awt.Dimension(411, 250));
        SuccessMessage.setName("Success"); // NOI18N
        SuccessMessage.setUndecorated(true);

        ContentPanel.setBackground(new java.awt.Color(204, 204, 204));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/correct-icon.png"))); // NOI18N

        title.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Exitoso");

        successMessage.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        successMessage.setForeground(new java.awt.Color(51, 51, 51));
        successMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successMessage.setText("El usuario a sido registrado correctamente");

        btnOk.setBackground(new java.awt.Color(51, 102, 255));
        btnOk.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setText("OK");
        btnOk.setBorder(null);
        btnOk.setBorderPainted(false);
        btnOk.setFocusPainted(false);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(successMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(successMessage)
                .addGap(18, 18, 18)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SuccessMessageLayout = new javax.swing.GroupLayout(SuccessMessage.getContentPane());
        SuccessMessage.getContentPane().setLayout(SuccessMessageLayout);
        SuccessMessageLayout.setHorizontalGroup(
            SuccessMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SuccessMessageLayout.setVerticalGroup(
            SuccessMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ErrorMessage.setMinimumSize(new java.awt.Dimension(411, 250));
        ErrorMessage.setName("Success"); // NOI18N
        ErrorMessage.setUndecorated(true);

        ContentPanel1.setBackground(new java.awt.Color(204, 204, 204));

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bad-icon.png"))); // NOI18N

        title1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(51, 51, 51));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Fallido");

        errorMessage.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(51, 51, 51));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("El usuario no se pudo registrar");

        btnOk1.setBackground(new java.awt.Color(51, 102, 255));
        btnOk1.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        btnOk1.setForeground(new java.awt.Color(255, 255, 255));
        btnOk1.setText("OK");
        btnOk1.setBorder(null);
        btnOk1.setBorderPainted(false);
        btnOk1.setFocusPainted(false);
        btnOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentPanel1Layout = new javax.swing.GroupLayout(ContentPanel1);
        ContentPanel1.setLayout(ContentPanel1Layout);
        ContentPanel1Layout.setHorizontalGroup(
            ContentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContentPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnOk1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContentPanel1Layout.setVerticalGroup(
            ContentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMessage)
                .addGap(18, 18, 18)
                .addComponent(btnOk1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ErrorMessageLayout = new javax.swing.GroupLayout(ErrorMessage.getContentPane());
        ErrorMessage.getContentPane().setLayout(ErrorMessageLayout);
        ErrorMessageLayout.setHorizontalGroup(
            ErrorMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ErrorMessageLayout.setVerticalGroup(
            ErrorMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TipoUsuarioChoose.setMinimumSize(new java.awt.Dimension(370, 250));
        TipoUsuarioChoose.setName("Success"); // NOI18N
        TipoUsuarioChoose.setUndecorated(true);

        Contenido.setBackground(new java.awt.Color(204, 204, 204));
        Contenido.setMaximumSize(new java.awt.Dimension(370, 250));
        Contenido.setMinimumSize(new java.awt.Dimension(370, 250));
        Contenido.setPreferredSize(new java.awt.Dimension(370, 250));

        btnOk2.setBackground(new java.awt.Color(51, 102, 255));
        btnOk2.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        btnOk2.setForeground(new java.awt.Color(255, 255, 255));
        btnOk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close-icon.png"))); // NOI18N
        btnOk2.setBorder(null);
        btnOk2.setBorderPainted(false);
        btnOk2.setFocusPainted(false);
        btnOk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk2ActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(60, 63, 65));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("¿Que tipo de usuario Eres?");

        btnDocente.setBackground(new java.awt.Color(51, 102, 255));
        btnDocente.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/teacher-icon.png"))); // NOI18N
        btnDocente.setText("Soy un Docente");
        btnDocente.setBorder(null);
        btnDocente.setBorderPainted(false);
        btnDocente.setFocusPainted(false);
        btnDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocenteActionPerformed(evt);
            }
        });

        btnEstudiante.setBackground(new java.awt.Color(51, 102, 255));
        btnEstudiante.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student-icon.png"))); // NOI18N
        btnEstudiante.setText("Soy un Estudiante");
        btnEstudiante.setBorder(null);
        btnEstudiante.setBorderPainted(false);
        btnEstudiante.setFocusPainted(false);
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pet-xd.png"))); // NOI18N

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOk2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TipoUsuarioChooseLayout = new javax.swing.GroupLayout(TipoUsuarioChoose.getContentPane());
        TipoUsuarioChoose.getContentPane().setLayout(TipoUsuarioChooseLayout);
        TipoUsuarioChooseLayout.setHorizontalGroup(
            TipoUsuarioChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TipoUsuarioChooseLayout.setVerticalGroup(
            TipoUsuarioChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(new java.awt.Dimension(720, 520));
        setMinimumSize(new java.awt.Dimension(720, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cover.setBackground(new java.awt.Color(34, 40, 49));
        Cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cover.png"))); // NOI18N
        Cover.setOpaque(true);
        BackgroundPanel.add(Cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

        LoginPanel.setOpaque(false);

        LoginFormPanel.setBackground(new java.awt.Color(204, 204, 204));
        LoginFormPanel.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-login.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario-icon.png"))); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key-icon.png"))); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("¿No tienes cuenta?");

        lblRegister.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(51, 51, 51));
        lblRegister.setText("Registrate");
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(51, 102, 255));
        btnIngresar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login-icon.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setFocusPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginFormPanelLayout = new javax.swing.GroupLayout(LoginFormPanel);
        LoginFormPanel.setLayout(LoginFormPanelLayout);
        LoginFormPanelLayout.setHorizontalGroup(
            LoginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFormPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(LoginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRegister)
                        .addGap(16, 16, 16))
                    .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPasswordLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        LoginFormPanelLayout.setVerticalGroup(
            LoginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFormPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(txtPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblRegister))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(LoginFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        FormsPanel.addTab("Login", LoginPanel);

        RegisterPanel.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/name-icon.png"))); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cedula-icon.png"))); // NOI18N
        jLabel7.setText("Cedula");

        btnIngresar2.setBackground(new java.awt.Color(51, 102, 255));
        btnIngresar2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnIngresar2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next-icon.png"))); // NOI18N
        btnIngresar2.setText("Siguiente");
        btnIngresar2.setBorder(null);
        btnIngresar2.setBorderPainted(false);
        btnIngresar2.setFocusPainted(false);
        btnIngresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/email-icon.png"))); // NOI18N
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telefono-icon.png"))); // NOI18N
        jLabel10.setText("Telefono");

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/direccion-icon.png"))); // NOI18N
        jLabel11.setText("Dirección");

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apellido-icon.png"))); // NOI18N
        jLabel12.setText("Apellido");

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nuevo Usuario");

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key-icon.png"))); // NOI18N
        jLabel15.setText("Contraseña");

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario-icon.png"))); // NOI18N
        jLabel8.setText("Usuario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIngresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuarioReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addComponent(txtPasswordReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmailReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCedulaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTelefonoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtApellidoReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDireccionReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(txtNombreReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCedulaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(txtApellidoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccionReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmailReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuarioReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPasswordReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel8))
                        .addGap(52, 52, 52)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnIngresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        btnRegresar.setBackground(new java.awt.Color(51, 102, 255));
        btnRegresar.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return-icon.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        FormsPanel.addTab("Registro", RegisterPanel);

        EstudiantePanel.setOpaque(false);

        EstudianteForm.setBackground(new java.awt.Color(204, 204, 204));
        EstudianteForm.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/name-icon.png"))); // NOI18N
        jLabel14.setText("Nivel");

        btnGuardarEstudiante.setBackground(new java.awt.Color(51, 102, 255));
        btnGuardarEstudiante.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnGuardarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar-icon-white.png"))); // NOI18N
        btnGuardarEstudiante.setText("Guardar");
        btnGuardarEstudiante.setBorder(null);
        btnGuardarEstudiante.setBorderPainted(false);
        btnGuardarEstudiante.setFocusPainted(false);
        btnGuardarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEstudianteActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apellido-icon.png"))); // NOI18N
        jLabel20.setText("Carrera");

        jLabel21.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 102, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Estudiante");

        javax.swing.GroupLayout EstudianteFormLayout = new javax.swing.GroupLayout(EstudianteForm);
        EstudianteForm.setLayout(EstudianteFormLayout);
        EstudianteFormLayout.setHorizontalGroup(
            EstudianteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstudianteFormLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(EstudianteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EstudianteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(EstudianteFormLayout.createSequentialGroup()
                            .addGroup(EstudianteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNivelEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                            .addGap(26, 26, 26)
                            .addGroup(EstudianteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCarreraStu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        EstudianteFormLayout.setVerticalGroup(
            EstudianteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstudianteFormLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EstudianteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstudianteFormLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(12, 12, 12)
                        .addComponent(txtNivelEst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EstudianteFormLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(12, 12, 12)
                        .addComponent(txtCarreraStu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(btnGuardarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        btnRegresar1.setBackground(new java.awt.Color(51, 102, 255));
        btnRegresar1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnRegresar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return-icon.png"))); // NOI18N
        btnRegresar1.setBorder(null);
        btnRegresar1.setBorderPainted(false);
        btnRegresar1.setFocusPainted(false);
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EstudiantePanelLayout = new javax.swing.GroupLayout(EstudiantePanel);
        EstudiantePanel.setLayout(EstudiantePanelLayout);
        EstudiantePanelLayout.setHorizontalGroup(
            EstudiantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstudiantePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EstudianteForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        EstudiantePanelLayout.setVerticalGroup(
            EstudiantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstudiantePanelLayout.createSequentialGroup()
                .addGroup(EstudiantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EstudianteForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        FormsPanel.addTab("Estudiante", EstudiantePanel);

        DocentePanel.setOpaque(false);

        DocenteForm.setBackground(new java.awt.Color(204, 204, 204));
        DocenteForm.setOpaque(false);

        jLabel25.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/name-icon.png"))); // NOI18N
        jLabel25.setText("Titulo");

        btnGuardarDocente.setBackground(new java.awt.Color(51, 102, 255));
        btnGuardarDocente.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnGuardarDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar-icon-white.png"))); // NOI18N
        btnGuardarDocente.setText("Guardar");
        btnGuardarDocente.setBorder(null);
        btnGuardarDocente.setBorderPainted(false);
        btnGuardarDocente.setFocusPainted(false);
        btnGuardarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDocenteActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apellido-icon.png"))); // NOI18N
        jLabel30.setText("Departamento");

        jLabel31.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 102, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Docente");

        javax.swing.GroupLayout DocenteFormLayout = new javax.swing.GroupLayout(DocenteForm);
        DocenteForm.setLayout(DocenteFormLayout);
        DocenteFormLayout.setHorizontalGroup(
            DocenteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocenteFormLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(DocenteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarDocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DocenteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(DocenteFormLayout.createSequentialGroup()
                            .addGroup(DocenteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTituloDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                            .addGap(26, 26, 26)
                            .addGroup(DocenteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDepartamentoDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        DocenteFormLayout.setVerticalGroup(
            DocenteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocenteFormLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DocenteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DocenteFormLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(12, 12, 12)
                        .addComponent(txtTituloDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DocenteFormLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(12, 12, 12)
                        .addComponent(txtDepartamentoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(btnGuardarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        btnRegresar2.setBackground(new java.awt.Color(51, 102, 255));
        btnRegresar2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnRegresar2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return-icon.png"))); // NOI18N
        btnRegresar2.setBorder(null);
        btnRegresar2.setBorderPainted(false);
        btnRegresar2.setFocusPainted(false);
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DocentePanelLayout = new javax.swing.GroupLayout(DocentePanel);
        DocentePanel.setLayout(DocentePanelLayout);
        DocentePanelLayout.setHorizontalGroup(
            DocentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocentePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnRegresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DocenteForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        DocentePanelLayout.setVerticalGroup(
            DocentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DocentePanelLayout.createSequentialGroup()
                .addGroup(DocentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DocenteForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        FormsPanel.addTab("Docente", DocentePanel);

        BackgroundPanel.add(FormsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        getContentPane().add(BackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        SuccessMessage.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk1ActionPerformed
        ErrorMessage.dispose();
    }//GEN-LAST:event_btnOk1ActionPerformed

    private void btnOk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk2ActionPerformed
        TipoUsuarioChoose.dispose();
    }//GEN-LAST:event_btnOk2ActionPerformed

    private void btnDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocenteActionPerformed
        TipoUsuarioChoose.dispose();
        FormsPanel.setSelectedIndex(1);
        this.tipoUsr=1;
        System.out.println("Tipo "+this.tipoUsr+": Docente");
    }//GEN-LAST:event_btnDocenteActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        TipoUsuarioChoose.dispose();
        FormsPanel.setSelectedIndex(1);
        this.tipoUsr=2;
        System.out.println("Tipo "+this.tipoUsr+": Estudiante");
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormsPanel.setSelectedIndex(0);
        this.setTitle("Login");
        

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnIngresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar2ActionPerformed
        switch (this.tipoUsr) {
            case 1:
                FormsPanel.setSelectedIndex(3);
                break;
            case 2:
                FormsPanel.setSelectedIndex(2);
                break;
            default:
                FormsPanel.setSelectedIndex(0);
                errorMessage.setText("No tienes un tipo de usuario");
                ErrorMessage.setVisible(true);
                break;
        }
    }//GEN-LAST:event_btnIngresar2ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        CuentaService cuentaService = new CuentaService();
        String user = txtUsuarioLogin.getText();
        String pwd = new String(txtPasswordLogin.getPassword());

        if (!user.equals("") && !pwd.equals("")) {
            String pwdN = Hash.sha1(pwd);
            System.out.println(pwdN);
            if (cuentaService.comprobarCuenta(user) && cuentaService.login(user, pwdN)) {
                
                String tipo = cuentaService.recuperarCuentaByUsername(user).getUsuario().getClass().getName().replaceAll("models.", "");
                this.dispose();
                PrincipalForm bf = new PrincipalForm(cuentaService.recuperarCuentaByUsername(user).getUsuario(),tipo);
                bf.setVisible(true);
                System.out.println("Logueado Exitosamente");
            } else {
                errorMessage.setText("Contraseña y o Usuario Incorrecto");
                ErrorMessage.setVisible(true);
            }
        } else {
            errorMessage.setText("Debes llenar los campos para ingresar");
            ErrorMessage.setVisible(true);
            
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        lblRegister.setForeground(new Color(57,62,100));
        lblRegister.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_lblRegisterMouseExited

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        lblRegister.setForeground(new Color(39,109,133));
        lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        
        TipoUsuarioChoose.setVisible(true);
        
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void btnGuardarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEstudianteActionPerformed
        String nombre = txtNombreReg.getText(),
        apellido = txtApellidoReg.getText(),
        cedula = txtCedulaReg.getText(),
        direccion = txtDireccionReg.getText(),
        email = txtEmailReg.getText(),
        telefono = txtTelefonoReg.getText(),
        usuario = txtUsuarioReg.getText(),
        password = Hash.sha1(new String(txtPasswordReg.getPassword())),
        nivel = txtNivelEst.getText(),
        carrera = txtCarreraStu.getText();
        
        ValidarResponse sonValidos = this.validarDatos(nombre, apellido, cedula, direccion, email, telefono, usuario, password);
        if(sonValidos.isStatus()){
            Cuenta cuenta = new Cuenta(usuario, password);
            Estudiante estudiante = new Estudiante(nombre, apellido, cedula, direccion, email, telefono, nivel, carrera);
            cuenta.setUsuario(estudiante);
            estudiante.setCuenta(cuenta);

            estudianteService.guardar(estudiante);
            successMessage.setText(sonValidos.getMensaje());
            SuccessMessage.setVisible(true);
            FormsPanel.setSelectedIndex(0);
            restablecerFormularios();
        }else{
            errorMessage.setText(sonValidos.getMensaje());
            ErrorMessage.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarEstudianteActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        FormsPanel.setSelectedIndex(1);
    }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void btnGuardarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDocenteActionPerformed
        String nombre = txtNombreReg.getText(),
        apellido = txtApellidoReg.getText(),
        cedula = txtCedulaReg.getText(),
        direccion = txtDireccionReg.getText(),
        email = txtEmailReg.getText(),
        telefono = txtTelefonoReg.getText(),
        usuario = txtUsuarioReg.getText(),
        password = Hash.sha1(new String(txtPasswordReg.getPassword())),
        titulo = txtTituloDoc.getText(),
        departamento = txtDepartamentoDoc.getText();
        
        ValidarResponse sonValidos = this.validarDatos(nombre, apellido, cedula, direccion, email, telefono, usuario, new String(txtPasswordReg.getPassword()));
        if(sonValidos.isStatus()){
            Cuenta cuenta = new Cuenta(usuario, password);
            Docente docente = new Docente(nombre, apellido, cedula, direccion, email, telefono, titulo, departamento);
            cuenta.setUsuario(docente);
            docente.setCuenta(cuenta);

            docenteService.guardar(docente);
            successMessage.setText(sonValidos.getMensaje());
            SuccessMessage.setVisible(true);
            FormsPanel.setSelectedIndex(0);
            restablecerFormularios();
        }else{
            errorMessage.setText(sonValidos.getMensaje());
            ErrorMessage.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarDocenteActionPerformed

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        FormsPanel.setSelectedIndex(1);
    }//GEN-LAST:event_btnRegresar2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AuthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.BGPanel BackgroundPanel;
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel ContentPanel1;
    private javax.swing.JLabel Cover;
    private javax.swing.JPanel DocenteForm;
    private javax.swing.JPanel DocentePanel;
    private javax.swing.JDialog ErrorMessage;
    private javax.swing.JPanel EstudianteForm;
    private javax.swing.JPanel EstudiantePanel;
    private javax.swing.JTabbedPane FormsPanel;
    private javax.swing.JPanel LoginFormPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JDialog SuccessMessage;
    private javax.swing.JDialog TipoUsuarioChoose;
    private javax.swing.JButton btnDocente;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnGuardarDocente;
    private javax.swing.JButton btnGuardarEstudiante;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar2;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnOk1;
    private javax.swing.JButton btnOk2;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel successMessage;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private util.RoundJTextField txtApellidoReg;
    private util.RoundJTextField txtCarreraStu;
    private util.RoundJTextField txtCedulaReg;
    private util.RoundJTextField txtDepartamentoDoc;
    private util.RoundJTextField txtDireccionReg;
    private util.RoundJTextField txtEmailReg;
    private util.RoundJTextField txtNivelEst;
    private util.RoundJTextField txtNombreReg;
    private util.RoundJPassField txtPasswordLogin;
    private util.RoundJPassField txtPasswordReg;
    private util.RoundJTextField txtTelefonoReg;
    private util.RoundJTextField txtTituloDoc;
    private util.RoundJTextField txtUsuarioLogin;
    private util.RoundJTextField txtUsuarioReg;
    // End of variables declaration//GEN-END:variables
   private void cargarEstilos(){

        this.FormsPanel.setBorder(null);
        this.FormsPanel.setEnabledAt(0, false);
        this.FormsPanel.setEnabledAt(1, false);
        this.FormsPanel.setEnabledAt(2, false);
        this.FormsPanel.setEnabledAt(3, false);
        SuccessMessage.setLocationRelativeTo(null);
        ErrorMessage.setLocationRelativeTo(null);
        TipoUsuarioChoose.setLocationRelativeTo(null);
        BackgroundPanel.setImagen(back); 
    }
   
   
    private ValidarResponse validarDatos(String nombre, String apellido,  String cedula, String direccion, String email, String telefono, String usuario, String password){
        if(!this.validarEmail(email).isStatus()){
            return this.validarEmail(email);
        }
        
        if(!this.validarPasswordLenght(password).isStatus()){
            return this.validarPasswordLenght(password);
        }
        
        if(!this.validarCedulaLenght(cedula).isStatus()){
            return this.validarCedulaLenght(cedula);
        }
        
        if(!this.validarTelefonoLenght(telefono).isStatus()){
            return this.validarTelefonoLenght(telefono);
        }
        
        if(!(!nombre.equals("") && !apellido.equals("") && !cedula.equals("") && !direccion.equals("") && !email.equals("") && !telefono.equals("") && !usuario.equals("") && !password.equals(""))){
            return new ValidarResponse(false,"Es necesario rellenar todos los campos para continuar");
        }
        
        return new ValidarResponse(true,"Usuario Registrado Correctamente");
    }
    
    private ValidarResponse validarEmail(String email){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return (mather.find()) ? new ValidarResponse(true,"Email valido") : new ValidarResponse(false,"El email no es valido");
    }
    
    private ValidarResponse validarPasswordLenght(String password){
        return (password.length() >= 8) ? new ValidarResponse(true,"Password valido") : new ValidarResponse(false,"La contraseña debe contener almenos 8 caracteres");             
    }
    
    private ValidarResponse validarTelefonoLenght(String telefono){
        return (telefono.length() == 10) ? new ValidarResponse(true,"Telefono valido") : new ValidarResponse(false,"El telefono no es válido (Debe contener 10 caracteres)");
    }
    
    private ValidarResponse validarCedulaLenght(String cedula){
        return (cedula.length() == 10) ? new ValidarResponse(true,"Cedula valida") : new ValidarResponse(false,"El número de cedula no es válido (Debe contener 10 caracteres)");
    }
    
    
    private void restablecerFormularios(){
        
        txtNombreReg.setText("");
        txtApellidoReg.setText("");
        txtCedulaReg.setText("");
        txtDireccionReg.setText("");
        txtEmailReg.setText("");
        txtTelefonoReg.setText("");
        txtUsuarioReg.setText("");
        txtPasswordReg.setText("");
        txtNivelEst.setText("");
        txtCarreraStu.setText("");
        txtTituloDoc.setText("");
        txtDepartamentoDoc.setText("");

    }
}
