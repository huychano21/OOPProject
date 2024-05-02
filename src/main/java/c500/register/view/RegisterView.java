/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package c500.register.view;

import c500.register.dao.StudentDao;
import c500.register.dao.SubjectDao;
import c500.register.entity.Student;
import c500.register.entity.Subject;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class RegisterView extends javax.swing.JFrame {
    private final String[] columnNamesOfStudent = new String[] {
        "Mã sinh viên", "Tên sinh viên", "Chuyên ngành", "Số TC giới hạn"
    };
    private final String[] columnNamesOfSubject = new String[] {
        "Tên môn học", "Số tín chỉ", "Loại lớp", "Mã lớp", "Giảng viên"
    };
    private final StudentDao studentDao;
    private final SubjectDao subjectDao;
    
    /**
     * Creates new form RegisterView
     */
    public RegisterView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Đăng kí môn học");
        ImageIcon icon = new ImageIcon("logo\\logo.png");
//        ImageIcon icon = new ImageIcon("src\\main\\resources\\img\\logo.png");
        setIconImage(icon.getImage());
        
        studentDao = new StudentDao();
        subjectDao = new SubjectDao();
        subjectDao.sortSubjectByID();
        
        ComboBoxSubjectName.setEnabled(false);
        ComboBoxCredit.setEnabled(false);
        ComboBoxTypeClass.setEnabled(false);
        ButtonAdd.setEnabled(false);
        ButtonDelete.setEnabled(false);
        ButtonDistribute.setEnabled(false);
        ButtonClear.setEnabled(false);
        
        showComboBoxSubjectName(subjectDao.getListSubjects());
        showListStudents(studentDao.getListStudents());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        LabelStrudentID = new javax.swing.JLabel();
        TextFieldStudentID = new javax.swing.JTextField();
        LabelStudentName = new javax.swing.JLabel();
        TextFieldStudentName = new javax.swing.JTextField();
        LabelMajor = new javax.swing.JLabel();
        TextFieldMajor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextFieldLimitCredit = new javax.swing.JTextField();
        LabelName = new javax.swing.JLabel();
        LabelCredit = new javax.swing.JLabel();
        ComboBoxCredit = new javax.swing.JComboBox<>();
        LabelTypeClass = new javax.swing.JLabel();
        ComboBoxTypeClass = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        LabelRegistedCredit = new javax.swing.JLabel();
        ComboBoxSubjectName = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonAdd = new button.MyButton();
        ButtonDelete = new button.MyButton();
        ButtonClear = new button.MyButton();
        ButtonDistribute = new button.MyButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ButtonReturn = new button.MyButton();
        RegisterBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Chuyên ngành", "Số TC giới hạn"
            }
        ));
        jScrollPane1.setViewportView(studentTable);
        if (studentTable.getColumnModel().getColumnCount() > 0) {
            studentTable.getColumnModel().getColumn(0).setMinWidth(120);
            studentTable.getColumnModel().getColumn(0).setMaxWidth(120);
            studentTable.getColumnModel().getColumn(2).setMinWidth(120);
            studentTable.getColumnModel().getColumn(2).setMaxWidth(120);
            studentTable.getColumnModel().getColumn(3).setMinWidth(120);
            studentTable.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 680, 550));

        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên học phần", "Số tín chỉ", "Loại lớp", "Mã lớp", "Giảng viên"
            }
        ));
        jScrollPane2.setViewportView(subjectTable);
        if (subjectTable.getColumnModel().getColumnCount() > 0) {
            subjectTable.getColumnModel().getColumn(1).setMinWidth(80);
            subjectTable.getColumnModel().getColumn(1).setMaxWidth(80);
            subjectTable.getColumnModel().getColumn(2).setMinWidth(80);
            subjectTable.getColumnModel().getColumn(2).setMaxWidth(80);
            subjectTable.getColumnModel().getColumn(3).setMinWidth(80);
            subjectTable.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 670, 200));

        jPanel1.setOpaque(false);

        LabelStrudentID.setForeground(new java.awt.Color(255, 255, 255));
        LabelStrudentID.setText("Mã sinh viên:");

        TextFieldStudentID.setEditable(false);
        TextFieldStudentID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextFieldStudentID.setFocusable(false);

        LabelStudentName.setForeground(new java.awt.Color(255, 255, 255));
        LabelStudentName.setText("Tên sinh viên:");

        TextFieldStudentName.setEditable(false);
        TextFieldStudentName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextFieldStudentName.setFocusable(false);

        LabelMajor.setForeground(new java.awt.Color(255, 255, 255));
        LabelMajor.setText("Chuyên ngành:");

        TextFieldMajor.setEditable(false);
        TextFieldMajor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextFieldMajor.setFocusable(false);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Số TC giới hạn:");

        TextFieldLimitCredit.setEditable(false);
        TextFieldLimitCredit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextFieldLimitCredit.setFocusable(false);

        LabelName.setForeground(new java.awt.Color(255, 255, 255));
        LabelName.setText("Tên học phần:");

        LabelCredit.setForeground(new java.awt.Color(255, 255, 255));
        LabelCredit.setText("Số tín chỉ:");

        ComboBoxCredit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>" }));

        LabelTypeClass.setForeground(new java.awt.Color(255, 255, 255));
        LabelTypeClass.setText("Loại lớp:");

        ComboBoxTypeClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>" }));
        ComboBoxTypeClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTypeClassActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Số tín chỉ đã đăng kí:");

        LabelRegistedCredit.setForeground(new java.awt.Color(255, 255, 255));

        ComboBoxSubjectName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>" }));
        ComboBoxSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSubjectNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thông tin sinh viên");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thông tin học phần");

        ButtonAdd.setBorder(null);
        ButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        ButtonAdd.setText("THÊM");
        ButtonAdd.setRadius(20);

        ButtonDelete.setBorder(null);
        ButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        ButtonDelete.setText("XÓA");
        ButtonDelete.setBorderColor(new java.awt.Color(153, 0, 0));
        ButtonDelete.setColorClick(new java.awt.Color(255, 102, 102));
        ButtonDelete.setColorOver(new java.awt.Color(255, 204, 204));
        ButtonDelete.setRadius(20);

        ButtonClear.setBorder(null);
        ButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clear.png"))); // NOI18N
        ButtonClear.setText("LÀM MỚI");
        ButtonClear.setBorderColor(new java.awt.Color(153, 153, 0));
        ButtonClear.setColorClick(new java.awt.Color(255, 255, 102));
        ButtonClear.setColorOver(new java.awt.Color(255, 255, 204));
        ButtonClear.setRadius(20);

        ButtonDistribute.setBorder(null);
        ButtonDistribute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Distribute.png"))); // NOI18N
        ButtonDistribute.setText("PHÂN LỚP");
        ButtonDistribute.setBorderColor(new java.awt.Color(0, 153, 153));
        ButtonDistribute.setColorClick(new java.awt.Color(0, 204, 204));
        ButtonDistribute.setColorOver(new java.awt.Color(204, 255, 255));
        ButtonDistribute.setRadius(20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelMajor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelStrudentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(TextFieldMajor)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxTypeClass, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(232, 232, 232))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(ButtonDistribute, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(LabelRegistedCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(LabelCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ComboBoxCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(TextFieldLimitCredit, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                                    .addComponent(TextFieldStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))))
                                .addGap(72, 72, 72))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelTypeClass)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelStrudentID)
                    .addComponent(TextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelStudentName)
                    .addComponent(TextFieldStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelMajor)
                        .addComponent(TextFieldLimitCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(TextFieldMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName)
                    .addComponent(LabelCredit)
                    .addComponent(ComboBoxCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRegistedCredit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboBoxTypeClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelTypeClass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDistribute, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        ButtonAdd.setFont(new java.awt.Font("Cambria", 1, 14));
        ButtonDelete.setFont(new java.awt.Font("Cambria", 1, 14));
        ButtonClear.setFont(new java.awt.Font("Cambria", 1, 14));
        ButtonDistribute.setFont(new java.awt.Font("Cambria", 1, 14));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 700, 360));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Danh sách sinh viên đã đăng ký môn");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Danh sách học phần sinh viên đã đăng ký");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        ButtonReturn.setBorder(null);
        ButtonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/OIP__3_-removebg-preview.png"))); // NOI18N
        ButtonReturn.setBorderColor(new java.awt.Color(204, 204, 204));
        ButtonReturn.setColorClick(new java.awt.Color(0, 0, 0));
        ButtonReturn.setColorOver(new java.awt.Color(204, 204, 204));
        ButtonReturn.setRadius(25);
        getContentPane().add(ButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 24, 24));

        RegisterBackGround.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RegisterBackGround.png"))); // NOI18N
        getContentPane().add(RegisterBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSubjectNameActionPerformed
        String selectedItem = (String) ComboBoxSubjectName.getSelectedItem();
        ComboBoxTypeClass.removeAllItems();
        ComboBoxCredit.removeAllItems();
        
        if (!selectedItem.equals("<none>")) {
            ComboBoxCredit.addItem("<none>");
            ComboBoxTypeClass.addItem("<none>");
            HashSet<String> set = new HashSet<>();
            
            for (Subject s : subjectDao.getListSubjects()) {
                if (s.getName().equals(selectedItem)) {
                    set.add(s.getTypeClass());
                }
            }
            
            for (String s : set) {
                ComboBoxTypeClass.addItem(s);
            }
        } else {
            ComboBoxCredit.addItem("<none>");
            ComboBoxTypeClass.addItem("<none>");
        }
    }//GEN-LAST:event_ComboBoxSubjectNameActionPerformed

    private void ComboBoxTypeClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTypeClassActionPerformed
        String name = (String) ComboBoxSubjectName.getSelectedItem();
        String typeClass = (String) ComboBoxTypeClass.getSelectedItem();
        
        for (Subject s : subjectDao.getListSubjects()) {
            if (s.getName().equals(name) && s.getTypeClass().equals(typeClass)) {
                ComboBoxCredit.removeAllItems();
                ComboBoxCredit.addItem("" + s.getCredit());
                break;
            }
            
            if (subjectDao.getListSubjects().getLast().equals(s)) {
                ComboBoxCredit.removeAllItems();
                ComboBoxCredit.addItem("<none>");
            }
        }
    }//GEN-LAST:event_ComboBoxTypeClassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton ButtonAdd;
    private button.MyButton ButtonClear;
    private button.MyButton ButtonDelete;
    private button.MyButton ButtonDistribute;
    private button.MyButton ButtonReturn;
    private javax.swing.JComboBox<String> ComboBoxCredit;
    private javax.swing.JComboBox<String> ComboBoxSubjectName;
    private javax.swing.JComboBox<String> ComboBoxTypeClass;
    private javax.swing.JLabel LabelCredit;
    private javax.swing.JLabel LabelMajor;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelRegistedCredit;
    private javax.swing.JLabel LabelStrudentID;
    private javax.swing.JLabel LabelStudentName;
    private javax.swing.JLabel LabelTypeClass;
    private javax.swing.JLabel RegisterBackGround;
    private javax.swing.JTextField TextFieldLimitCredit;
    private javax.swing.JTextField TextFieldMajor;
    private javax.swing.JTextField TextFieldStudentID;
    private javax.swing.JTextField TextFieldStudentName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable studentTable;
    private javax.swing.JTable subjectTable;
    // End of variables declaration//GEN-END:variables

    public String getLabelRegistedCredit() {
        return LabelRegistedCredit.getText();
    }
    
    public void setLabelRegistedCredit(String text) {
        LabelRegistedCredit.setText(text);
    }

    public String getTextFieldStudentID() {
        return TextFieldStudentID.getText();
    }
    
    public String getComboBoxSubjectName() {
        return ComboBoxSubjectName.getSelectedItem().toString();
    }
    
    public String getComboBoxTypeClass() {
        return ComboBoxTypeClass.getSelectedItem().toString();
    }
    
    public void addAddListener(ActionListener listener) {
        ButtonAdd.addActionListener(listener);
    }
    
    public void addDeleteListener(ActionListener listener) {
        ButtonDelete.addActionListener(listener);
    }
    
    public void addClearSubjectListener(ActionListener listener) {
        ButtonClear.addActionListener(listener);
    }
    
    public void addListStudentSelectionListener(ListSelectionListener listener) {
        studentTable.getSelectionModel().addListSelectionListener(listener);
    }
    
    public void addListSubjectSelectionListener(ListSelectionListener listener) {
        subjectTable.getSelectionModel().addListSelectionListener(listener);
    }
    
    public void addReturnListener(ActionListener listener) {
        ButtonReturn.addActionListener(listener);
    }
    
    public void addDistributeListener(ActionListener listener) {
        ButtonDistribute.addActionListener(listener);
    }
    
    private void showComboBoxSubjectName(List<Subject> list) {
        HashSet<String> set = new HashSet<>();
        for (Subject s : list) {
            set.add(s.getName());
        }
        
        for (String s : set) {
            ComboBoxSubjectName.addItem(s);
        }
    }
    
    public Student selectedStudent() {
        for (Student s : studentDao.getListStudents()) {
            if (s.getID().equals(TextFieldStudentID.getText())) {
                return s;
            }
        }
        return null;
    }
    
    private void showListStudents(List<Student> list) {
        int size = list.size();
        // với bảng studentTable có 4 cột, 
        // khởi tạo mảng 2 chiều student, trong đó:
        // số hàng: là kích thước của list student 
        // số cột: là 
        Object [][] students = new Object[size][4];
        for (int i = 0; i < size; i++) {
            students[i][0] = list.get(i).getID();
            students[i][1] = list.get(i).getName();
            students[i][2] = list.get(i).getMajor();
            students[i][3] = list.get(i).getLimitedCredit();
        }
        studentTable.setModel(new DefaultTableModel((Object[][])students, columnNamesOfStudent));
        studentTable.getColumnModel().getColumn(0).setMaxWidth(120);
        studentTable.getColumnModel().getColumn(0).setMinWidth(120);
        studentTable.getColumnModel().getColumn(2).setMaxWidth(120);
        studentTable.getColumnModel().getColumn(2).setMinWidth(120);
        studentTable.getColumnModel().getColumn(3).setMaxWidth(120);
        studentTable.getColumnModel().getColumn(3).setMinWidth(120);
    }
    
    public void fillStudentFromSelectedRow() {
        // lấy chỉ số của hàng được chọn 
        int row = studentTable.getSelectedRow();
        if (row >= 0) {
            TextFieldStudentID.setText(studentTable.getModel().getValueAt(row, 0).toString());
            TextFieldStudentName.setText(studentTable.getModel().getValueAt(row, 1).toString());
            TextFieldMajor.setText(studentTable.getModel().getValueAt(row, 2).toString());
            TextFieldLimitCredit.setText(studentTable.getModel().getValueAt(row, 3).toString());
            LabelRegistedCredit.setText(studentDao.getListStudents().get(row).getRegistedCredit() + "");
            
            ComboBoxSubjectName.setEnabled(true);
            ComboBoxCredit.setEnabled(true);
            ComboBoxTypeClass.setEnabled(true);
            ButtonAdd.setEnabled(true);
            
            showListSubjects(new StudentDao().getListStudents().get(row).getSubject());
            clearSubjectInfo();
        }
    }
    
    public void showListSubjects(List<Subject> list) {
        int size;
        if (list.isEmpty()) size = 0; 
        else size = list.size();
        // với bảng subjectTable có 5 cột, 
        // khởi tạo mảng 2 chiều subjects, trong đó:
        // số hàng: là kích thước của list subject 
        // số cột: là 5
        Object [][] subjects = new Object[size][5];
        for (int i = 0; i < size; i++) {
            subjects[i][0] = list.get(i).getName();
            subjects[i][1] = list.get(i).getCredit();
            subjects[i][2] = list.get(i).getTypeClass();
            subjects[i][3] = list.get(i).getIDclass();
            subjects[i][4] = list.get(i).getTeacher();
        }
        
        subjectTable.setModel(new DefaultTableModel((Object[][])subjects, columnNamesOfSubject));
        subjectTable.getColumnModel().getColumn(1).setMaxWidth(80);
        subjectTable.getColumnModel().getColumn(1).setMinWidth(80);
        subjectTable.getColumnModel().getColumn(2).setMaxWidth(80);
        subjectTable.getColumnModel().getColumn(2).setMinWidth(80);
        subjectTable.getColumnModel().getColumn(3).setMaxWidth(80);
        subjectTable.getColumnModel().getColumn(3).setMinWidth(80);
    }
    
    public void fillSubjectFromSelectedRow() {
        // lấy chỉ số của hàng được chọn 
        int row = subjectTable.getSelectedRow();
        if (row >= 0) {
            ComboBoxSubjectName.setSelectedItem(subjectTable.getModel().getValueAt(row, 0).toString());
            ComboBoxCredit.setSelectedItem(subjectTable.getModel().getValueAt(row, 1).toString());
            ComboBoxTypeClass.setSelectedItem(subjectTable.getModel().getValueAt(row, 2));
            
            ButtonAdd.setEnabled(false);
            ButtonDelete.setEnabled(true);
            ButtonClear.setEnabled(true);
            if (subjectTable.getModel().getValueAt(row, 3) == null) {
                ButtonDistribute.setEnabled(true);
            } else {
                ButtonDistribute.setEnabled(false);
            }
        }
    }         
    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Subject getSubjectInfo() {
        // validate subject
        if (!validateSubjectName() || !validateSubjectTypeClass()) {
            return null;
        }
        try {
            Subject subject = new Subject();
            subject.setName(ComboBoxSubjectName.getSelectedItem().toString().trim());
            subject.setCredit(Integer.parseInt(ComboBoxCredit.getSelectedItem().toString()));
            subject.setTypeClass(ComboBoxTypeClass.getSelectedItem().toString().trim());
            return subject;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
        return null;
    }
    
    private boolean validateSubjectName() {
        String name = ComboBoxSubjectName.getSelectedItem().toString();
        if ("<none>".equals(name.trim())) {
            ComboBoxSubjectName.requestFocus();
            showMessage("Tên môn học không được trống.");
            return false;
        }
        return true;
    }
    
    private boolean validateSubjectTypeClass() {
        String name = ComboBoxTypeClass.getSelectedItem().toString();
        if ("<none>".equals(name.trim())) {
            ComboBoxTypeClass.requestFocus();
            showMessage("Loại lớp không được trống.");
            return false;
        }
        return true;
    }
    
    public void clearSubjectInfo() {
        ComboBoxSubjectName.setSelectedItem("<none>");
        ComboBoxCredit.removeAllItems();
        ComboBoxTypeClass.removeAllItems();
        ComboBoxCredit.addItem("<none>");
        ComboBoxTypeClass.addItem("<none>");
        
        ComboBoxSubjectName.setEnabled(true);
        ButtonAdd.setEnabled(true);
        ButtonDelete.setEnabled(false);
        ButtonClear.setEnabled(false);
        ButtonDistribute.setEnabled(false);
        subjectTable.clearSelection();
    }
}
