import java.awt.*;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class addNewDepartment extends javax.swing.JFrame {
        String name ,
                description;
        String[] getItrator ;

        Iterator<String> iterator;
        String[] getItratordec ;
        Iterator<String> iteratordsc;

        private javax.swing.JButton addNewDepartment;
        private javax.swing.JTextField addNewDepartmentFiled;
        private javax.swing.JButton cancelAddNewDepartment;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea newDecriptionDepartment;
        public addNewDepartment() {
            initComponents();
        }


        @SuppressWarnings("unchecked")
        private void initComponents() {

            jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
            jLabel1 = new javax.swing.JLabel();
            addNewDepartmentFiled = new javax.swing.JTextField();
            jScrollPane1 = new javax.swing.JScrollPane();
            newDecriptionDepartment = new javax.swing.JTextArea();
            jLabel2 = new javax.swing.JLabel();
            addNewDepartment = new javax.swing.JButton();
            cancelAddNewDepartment = new javax.swing.JButton();
            jPanel1 = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();

            jRadioButtonMenuItem1.setSelected(true);
            jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

            setTitle("Add New Department");

            jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(187, 187, 187, 255));
            jLabel1.setText("Name :");

            addNewDepartmentFiled.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            addNewDepartmentFiled.setForeground(new java.awt.Color(28, 30, 33));

            newDecriptionDepartment.setColumns(20);
            newDecriptionDepartment.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
            newDecriptionDepartment.setForeground(new java.awt.Color(42, 37, 37));
            newDecriptionDepartment.setRows(5);
            jScrollPane1.setViewportView(newDecriptionDepartment);

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(187, 187, 187, 255));
            jLabel2.setText("Description :");

            addNewDepartment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            addNewDepartment.setForeground(new java.awt.Color(0, 3, 5, 255));
            addNewDepartment.setText("Add New Department");
            addNewDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            addNewDepartment.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addNewDepartmentActionPerformed(evt);
                }
            });

            cancelAddNewDepartment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            cancelAddNewDepartment.setForeground(new java.awt.Color(0, 3, 5, 255));
            cancelAddNewDepartment.setText("Cancel");
            cancelAddNewDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            cancelAddNewDepartment.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cancelAddNewDepartmentActionPerformed(evt);
                }
            });

            jPanel1.setBackground(new java.awt.Color(0, 3, 5, 255));

            jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setText("To Add New Department :");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(172, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(134, 134, 134))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(36, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(addNewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(75, 75, 75)
                                                    .addComponent(cancelAddNewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(addNewDepartmentFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(addNewDepartmentFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(addNewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cancelAddNewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40))
            );

            pack();
        }

        private void addNewDepartmentActionPerformed(java.awt.event.ActionEvent evt) {


            name = addNewDepartmentFiled.getText();
            description = newDecriptionDepartment.getText();


            // To Search If The Department Has Exsit
            if(Department.nameDepartment.contains(name)){
                JOptionPane.showMessageDialog(this, " Sorry This Department Is Already Exist "," Error" , 0);

            }
            else
            {

                Department.nameDepartment.add(name);

                Department.description.add(description);




                getItrator = new String[Department.nameDepartment.size()]; // For Name Department طوله
                getItratordec = new String[Department.description.size()]; // For Name Description طوله

                /* ======        To Get The Informetion From Linked And Addede ToText Fild  ===================================*/

                // For Itrator Department
                int size1 = 0 ;
                iterator = Department.nameDepartment.iterator();
                while(iterator.hasNext()){
                    getItrator[size1] = iterator.next();//رجع اسم القسم
                    size1 ++;
                }

                // For Itrator Decreption
                int size2 = 0 ;
                iteratordsc = Department.description.iterator();
                while(iteratordsc.hasNext()){
                    getItratordec[size2] = iteratordsc.next();
                    size2++;

                }


            // This To Add The Department Into ComboBox

                for (int i =0; i <  Department.nameDepartment.size() ; i++){
                    ManagerWindow.departmentCombowBox.addItem(getItrator[i]);
                }


// ========================= To Added The Data Into Filed ==================== //

                ManagerWindow.jList.setListData(getItrator); // Take Arrays

                JOptionPane.showMessageDialog(this, " Add SucssFull "," Note " , 1);
                Department.size ++;
            }

        }//GEN-LAST:event_addNewDepartmentActionPerformed

        private void cancelAddNewDepartmentActionPerformed(java.awt.event.ActionEvent evt) {

            // To Hide The Frame
            this.setVisible(false);
        }//GEN-LAST:event_cancelAddNewDepartmentActionPerformed


        public static void main(String args[]) {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(addNewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(addNewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(addNewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(addNewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new addNewDepartment().setVisible(true);
                }
            });
        }
    }

