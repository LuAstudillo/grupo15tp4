/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tp4;

import java.util.HashSet;
import javax.swing.JOptionPane;


public class FormularioDeInscripcion extends javax.swing.JInternalFrame {

    
    
    private HashSet<Alumno> alumnos;
    private HashSet<Materia> materias;
   
    
    public FormularioDeInscripcion(HashSet<Alumno> alumnos, HashSet<Materia> materias) {
        initComponents();
        this.alumnos = alumnos;
        this.materias = materias;

    for (Materia m : materias) {
        jcbMateria.addItem(m.getNombre());
    }

    for (Alumno a : alumnos) {
        jcbAlumno.addItem(a.getApellido() + " " + a.getNombre());
    }
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbMateria = new javax.swing.JComboBox<>();
        jcbAlumno = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel1.setText("Formulario De Inscripcion");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("ELIJA UNA MATERIA:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("ELIJA UNA ALUMNO:");

        jbSalir.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbInscribir.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(47, 47, 47)
                                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(jcbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbInscribir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed

    String nombreMateria = (String) jcbMateria.getSelectedItem();
    String nombreAlumno = (String) jcbAlumno.getSelectedItem();

    Materia materiaEncontrada = null;
    Alumno alumnoEncontrado = null;

    if (nombreMateria != null) {
        for (Materia m : materias) {
        if (m.getNombre().equals(nombreMateria)) {
            materiaEncontrada = m;
            break;
            }
        }
    }

    if (nombreAlumno != null) {
        for (Alumno a : alumnos) {
            String nombreCompleto = a.getApellido() + " " + a.getNombre();
        if (nombreCompleto.equals(nombreAlumno)) {
            alumnoEncontrado = a;
            break;
            }
        }
    }

    if (materiaEncontrada != null && alumnoEncontrado != null) {
        if (alumnoEncontrado.getMaterias().contains(materiaEncontrada)) {
            JOptionPane.showMessageDialog(this,
                "El/La alumno/a " + alumnoEncontrado.getNombre() + " " + alumnoEncontrado.getApellido() +
                " ya está inscripto en " + materiaEncontrada.getNombre());
        } else {
            alumnoEncontrado.agregarMateria(materiaEncontrada);
            JOptionPane.showMessageDialog(this,
                "Alumno inscripto en " + materiaEncontrada.getNombre() +
                "\nMaterias inscriptas: " + alumnoEncontrado.cantidadMaterias());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un alumno y una materia.");
    }


       
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbAlumno;
    private javax.swing.JComboBox<String> jcbMateria;
    // End of variables declaration//GEN-END:variables
}
