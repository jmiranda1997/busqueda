/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathan Miranda
 */
public class Buscador extends javax.swing.JFrame {
    private Pattern ER;
    private Matcher evaluador;
    private Timer reloj;
    private int contadorReloj = 0;
    private String directorioInicio, expresionRegular;
    private DefaultTableModel tablaModel;
    
    /**
     * Creates new form App
     */
    public Buscador() {
        initComponents();
        iniciarTabla();
        historial.setText("Historial.");
        reloj = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contadorReloj >= 1) {
                    reloj.stop();
                    if(campo_busqueda.getText().trim().length()!= 0){
                    expresionRegular = ".*" + campo_busqueda.getText().trim() + ".*";
                    historial.setText(historial.getText()+"\n"+expresionRegular+" (Desde "+directorioInicio+")");
                    label_resultado.setText("Buscando...");
                    // Construcción de la expresión regular
                    ER = Pattern.compile(expresionRegular);
                    iniciarTabla();
                    buscar_archivos(new File(directorioInicio));
                    label_resultado.setText("Búsqueda finalizada. Se encontraron "+tablaModel.getRowCount()+" registro(s).");
                    }
                }
                contadorReloj++;
            }
        });
        directorioInicio = System.getProperty("user.home");
        label_directorio.setText("Buscar desde: "+directorioInicio);
    }
    private void iniciarTabla() {
        tablaModel = new DefaultTableModel();
        tablaModel.addColumn("Nombre");
        tablaModel.addColumn("Direccion");
        tablaModel.addColumn("Fecha creación");
        tablaModel.addColumn("Fecha modificación");
        tablaModel.addColumn("Tamaño");
        tablaModel.addColumn("Tipo");
        tabla_encontrados.setModel(tablaModel);
    }
    private void buscar_archivos(File archivo){
        String nombreArchivo = archivo.getName();
        evaluador = ER.matcher(nombreArchivo);
        if (evaluador.matches()) {
            tablaModel.addRow(new String[]{nombreArchivo,
                archivo.getAbsolutePath(),
                getFechaCreacion(archivo),
                getFechaModificacion(archivo),
                getTamaño(archivo),
                getTipo(archivo)
            });
        }
        try {
            if(!archivo.getAbsolutePath().contains("$Recycle.Bin") && archivo.isDirectory()) {
                File[] subdirectorio = archivo.listFiles();
                for (File subdirectorio1 : subdirectorio) {
                    buscar_archivos(subdirectorio1);
                }
            }
        } catch (Exception e) {}
    }
    private String getFechaCreacion(File archivo) {
        String fecha = "";
        try {
            Path file = Paths.get(archivo.getAbsolutePath());
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            fecha = attr.creationTime().toString().substring(0, 10);
//            fecha = attr.creationTime().toString();
        } catch (IOException ex) {
            Logger.getLogger(Buscador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fecha;
    }
    private String getFechaModificacion(File archivo){
        Date fechaLong = new Date(archivo.lastModified());
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fechaLong);
        String fecha = ""+Integer.toString(calendario.get(Calendar.YEAR));
        fecha+= (calendario.get(Calendar.MONTH) < 10) ? "-0"+calendario.get(Calendar.MONTH) : "-"+calendario.get(Calendar.MONTH);
        fecha+= (calendario.get(Calendar.DATE) < 10) ? "-0"+calendario.get(Calendar.DATE) : "-"+calendario.get(Calendar.DATE);
        return fecha;
    }
    private String getTamaño(File archivo) {
        long bytesArchivo = archivo.length();
        String[] tamaños = {" B "," KB"," MB"," GB"," TB"};
        String tamaño = ""+bytesArchivo+tamaños[0];
        int cont=0; bytesArchivo/=1024;
        while (bytesArchivo > 0) {
            cont++;
            tamaño = ""+bytesArchivo+tamaños[cont];
            bytesArchivo/=1024;
        }
        return tamaño;
    }
    private String getTipo(File archivo) {
        String tipo = "Carpeta";
        if (archivo.isFile()) {
            int indexExt = archivo.getName().lastIndexOf('.');
            tipo = (indexExt==-1) ? "Archivo" : archivo.getName().substring(indexExt+1);
        }
        return tipo;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo_busqueda = new javax.swing.JTextField();
        check_empieza = new javax.swing.JCheckBox();
        txtEmpieza = new javax.swing.JTextField();
        check_termina = new javax.swing.JCheckBox();
        txtTermina = new javax.swing.JTextField();
        check_contiene = new javax.swing.JCheckBox();
        txtContiene = new javax.swing.JTextField();
        check_extension = new javax.swing.JCheckBox();
        txtExtencion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        historial = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_encontrados = new javax.swing.JTable();
        seleccion_directorio = new javax.swing.JButton();
        btnFiltro = new javax.swing.JButton();
        label_directorio = new javax.swing.JLabel();
        label_resultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ejecutar_archivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campo_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_busquedaKeyTyped(evt);
            }
        });

        check_empieza.setText("Empieza con...");
        check_empieza.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_empiezaStateChanged(evt);
            }
        });

        txtEmpieza.setEnabled(false);

        check_termina.setText("Termina con...");
        check_termina.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_terminaStateChanged(evt);
            }
        });

        txtTermina.setEnabled(false);

        check_contiene.setText("Contiene...");
        check_contiene.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_contieneStateChanged(evt);
            }
        });

        txtContiene.setEnabled(false);

        check_extension.setText("Extensión...");
        check_extension.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_extensionStateChanged(evt);
            }
        });

        txtExtencion.setEnabled(false);

        historial.setColumns(20);
        historial.setRows(5);
        jScrollPane2.setViewportView(historial);

        jLabel1.setText("Buscar Archivo:");

        tabla_encontrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabla_encontrados);

        seleccion_directorio.setText("Directorio");
        seleccion_directorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion_directorioActionPerformed(evt);
            }
        });

        btnFiltro.setText("Filtro");
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });

        label_directorio.setText("Buscar desde:");

        label_resultado.setText("Sin acción");

        jLabel2.setText("Historial de búsquedas");

        ejecutar_archivo.setText("Abrir archivo");
        ejecutar_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutar_archivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_busqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccion_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_directorio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_resultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ejecutar_archivo)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(check_empieza))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(check_extension)
                                                .addComponent(check_contiene))
                                            .addGap(10, 10, 10)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(check_termina)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTermina, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtExtencion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtContiene)
                                    .addComponent(txtEmpieza))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(seleccion_directorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_empieza)
                            .addComponent(txtEmpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_termina)
                            .addComponent(txtTermina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_contiene)
                            .addComponent(txtContiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_extension)
                            .addComponent(txtExtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(btnFiltro)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_directorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_resultado)
                            .addComponent(ejecutar_archivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_busquedaKeyTyped
        if (!reloj.isRunning()) {
            reloj.start();
        } else {
            reloj.restart();
            contadorReloj = 0;
        }
    }//GEN-LAST:event_campo_busquedaKeyTyped

    private void seleccion_directorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion_directorioActionPerformed
        JFileChooser ventana_ruta = new JFileChooser(System.getProperty("user.home"));
        ventana_ruta.setDialogTitle("Seleccione el directorio donde se hará la búsqueda");
        ventana_ruta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = ventana_ruta.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            directorioInicio = ventana_ruta.getSelectedFile().getAbsolutePath();
            label_directorio.setText("Buscar desde: "+directorioInicio);
        }
    }//GEN-LAST:event_seleccion_directorioActionPerformed

    private void check_empiezaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_empiezaStateChanged
        if (check_empieza.isSelected()) {
            txtEmpieza.setEnabled(true);
            campo_busqueda.setEnabled(false);
        }else{
            txtEmpieza.setEnabled(false);
            campo_busqueda.setEnabled(true);
        }
    }//GEN-LAST:event_check_empiezaStateChanged

    private void check_terminaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_terminaStateChanged
        if (check_termina.isSelected()) {
            txtTermina.setEnabled(true);
            campo_busqueda.setEnabled(false);
        }else{
            txtTermina.setEnabled(false);
            campo_busqueda.setEnabled(true);
        }
    }//GEN-LAST:event_check_terminaStateChanged

    private void check_contieneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_contieneStateChanged
        if (check_contiene.isSelected()) {
            txtContiene.setEnabled(true);
            campo_busqueda.setEnabled(false);
        }else{
            txtContiene.setEnabled(false);
            campo_busqueda.setEnabled(true);
        }
    }//GEN-LAST:event_check_contieneStateChanged

    private void check_extensionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_extensionStateChanged
        if (check_extension.isSelected()) {
            txtExtencion.setEnabled(true);
            campo_busqueda.setEnabled(false);
        }else{
            txtExtencion.setEnabled(false);
            campo_busqueda.setEnabled(true);
        }
    }//GEN-LAST:event_check_extensionStateChanged

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        condiciones_para_ER();
        ER = Pattern.compile(expresionRegular);
        historial.setText(historial.getText()+"\n"+expresionRegular+" (Desde "+directorioInicio+")");
        label_resultado.setText("Buscando...");
        // Construcción de la expresión regular
        ER = Pattern.compile(expresionRegular);
        iniciarTabla();
        buscar_archivos(new File(directorioInicio));
        label_resultado.setText("Búsqueda finalizada. Se encontraron "+tablaModel.getRowCount()+" registro(s).");
        campo_busqueda.setText(expresionRegular.trim());
        
        buscar_archivos(new File(directorioInicio));
    }//GEN-LAST:event_btnFiltroActionPerformed

    private void ejecutar_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutar_archivoActionPerformed
        int index = tabla_encontrados.getSelectedRow();
        if (index != -1) {
            try { 
                Desktop.getDesktop().open(new File((String)tabla_encontrados.getValueAt(index, 1)));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "No se puede ejecutar el archivo", "Error", JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }//GEN-LAST:event_ejecutar_archivoActionPerformed
    
    private void condiciones_para_ER(){
        expresionRegular = "";
        if (check_empieza.isSelected() && txtEmpieza.getText().trim().length()!=0 && !check_termina.isSelected() && !check_contiene.isSelected() && !check_extension.isSelected()) { //Solo empieza
            expresionRegular = txtEmpieza.getText().trim() + ".*";
        }else if (!check_empieza.isSelected() && txtTermina.getText().trim().length()!=0 && check_termina.isSelected() && !check_contiene.isSelected() && !check_extension.isSelected()) {//solo termina
            expresionRegular = ".*" + txtTermina.getText().trim() + "(\\..*)?";
        }else if (!check_empieza.isSelected() && txtContiene.getText().trim().length()!=0 && !check_termina.isSelected() && check_contiene.isSelected() && !check_extension.isSelected()) {//solo contiene
            expresionRegular = ".*" + txtContiene.getText().trim() + ".*";
        }else if (!check_empieza.isSelected() && txtExtencion.getText().trim().length()!=0 && !check_termina.isSelected() && !check_contiene.isSelected() && check_extension.isSelected()) {//solo extencion
            expresionRegular = ".*\\." + txtExtencion.getText().trim();
        }else if (check_empieza.isSelected() && txtEmpieza.getText().trim().length()!=0 && txtTermina.getText().trim().length()!=0 && check_termina.isSelected() && !check_contiene.isSelected() && !check_extension.isSelected()) {// empieza y termina
            expresionRegular = txtEmpieza.getText().trim() + ".*" + txtTermina.getText().trim() + "(\\..*)?";
        }else if (check_empieza.isSelected() && txtEmpieza.getText().trim().length()!=0 && txtContiene.getText().trim().length()!=0 && !check_termina.isSelected() && check_contiene.isSelected() && !check_extension.isSelected()) {// empieza y contiene
            expresionRegular = txtEmpieza.getText().trim() + ".*" + txtContiene.getText().trim() + ".*(\\..*)?";
        }else if (check_empieza.isSelected() && txtEmpieza.getText().trim().length()!=0 && txtExtencion.getText().trim().length()!=0 && !check_termina.isSelected() && !check_contiene.isSelected() && check_extension.isSelected()) {// empieza y extencion
            expresionRegular = txtEmpieza.getText().trim() + ".*\\." + txtExtencion.getText().trim();
        }else if (!check_empieza.isSelected() && txtContiene.getText().trim().length()!=0 && txtTermina.getText().trim().length()!=0 && check_termina.isSelected() && check_contiene.isSelected() && !check_extension.isSelected()) {//termina y contiene
            expresionRegular = ".*" + txtContiene.getText().trim() + ".*" + txtTermina.getText().trim() + "(\\..*)?";
        }else if (!check_empieza.isSelected() && txtExtencion.getText().trim().length()!=0 && txtTermina.getText().trim().length()!=0 && check_termina.isSelected() && !check_contiene.isSelected() && check_extension.isSelected()) {//termina y extencion
            expresionRegular = ".*" + txtTermina.getText().trim() + "\\." + txtExtencion.getText().trim();
        }else if (!check_empieza.isSelected() && txtExtencion.getText().trim().length()!=0 && txtContiene.getText().trim().length()!=0 && !check_termina.isSelected() && check_contiene.isSelected() && check_extension.isSelected()) {//contiene y extencion
            expresionRegular = ".*" + txtContiene.getText().trim() + ".*\\." + txtExtencion.getText().trim();
        }else if (check_empieza.isSelected() && txtEmpieza.getText().trim().length()!=0&& txtTermina.getText().trim().length()!=0 && txtContiene.getText().trim().length()!=0 && check_termina.isSelected() && check_contiene.isSelected() && !check_extension.isSelected()) {//empieza, contiene y termina
            expresionRegular = txtEmpieza.getText().trim()+ ".*" + txtContiene.getText().trim() + ".*" + txtTermina.getText().trim() + "(\\..*)?";
        }else if (check_empieza.isSelected() && txtEmpieza.getText().trim().length()!=0&& txtTermina.getText().trim().length()!=0 && txtExtencion.getText().trim().length()!=0 && check_termina.isSelected() && !check_contiene.isSelected() && check_extension.isSelected()) {//empieza, termina y extencion
            expresionRegular = txtEmpieza.getText().trim()+ ".*" + txtTermina.getText().trim() + "\\.*" + txtExtencion.getText().trim();
        }else if (check_empieza.isSelected() && txtEmpieza.getText().trim().length()!=0&& txtContiene.getText().trim().length()!=0 && txtExtencion.getText().trim().length()!=0 && !check_termina.isSelected() && check_contiene.isSelected() && check_extension.isSelected()) {//empieza, contiene y extencion
            expresionRegular = txtEmpieza.getText().trim()+ ".*" + txtContiene.getText().trim() + ".*"  + "\\." + txtExtencion.getText().trim();
        }else if (!check_empieza.isSelected() && txtContiene.getText().trim().length()!=0&& txtTermina.getText().trim().length()!=0 && txtExtencion.getText().trim().length()!=0 && check_termina.isSelected() && check_contiene.isSelected() && check_extension.isSelected()) {//termina, contiene y extencion
            expresionRegular =  ".*" + txtContiene.getText().trim() + ".*" + txtTermina.getText().trim() + "\\." + txtExtencion.getText().trim();
        }else if (!check_empieza.isSelected() && txtContiene.getText().trim().length()!=0&& txtTermina.getText().trim().length()!=0 && txtExtencion.getText().trim().length()!=0 && check_termina.isSelected() && check_contiene.isSelected() && check_extension.isSelected()) {//termina, contiene y extencion
            expresionRegular =  ".*" + txtContiene.getText().trim() + ".*" + txtTermina.getText().trim() + "\\." + txtExtencion.getText().trim();
        }else if (check_empieza.isSelected() && txtContiene.getText().trim().length()!=0 && txtEmpieza.getText().trim().length()!=0&& txtTermina.getText().trim().length()!=0 && txtExtencion.getText().trim().length()!=0 && check_termina.isSelected() && check_contiene.isSelected() && check_extension.isSelected()) {//empieza, termina, contiene y extencion
            expresionRegular =  txtEmpieza.getText().trim() + ".*" + txtContiene.getText().trim() + ".*" + txtTermina.getText().trim() + "\\." + txtExtencion.getText().trim();
        }
    }
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
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltro;
    private javax.swing.JTextField campo_busqueda;
    private javax.swing.JCheckBox check_contiene;
    private javax.swing.JCheckBox check_empieza;
    private javax.swing.JCheckBox check_extension;
    private javax.swing.JCheckBox check_termina;
    private javax.swing.JButton ejecutar_archivo;
    private javax.swing.JTextArea historial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_directorio;
    private javax.swing.JLabel label_resultado;
    private javax.swing.JButton seleccion_directorio;
    private javax.swing.JTable tabla_encontrados;
    private javax.swing.JTextField txtContiene;
    private javax.swing.JTextField txtEmpieza;
    private javax.swing.JTextField txtExtencion;
    private javax.swing.JTextField txtTermina;
    // End of variables declaration//GEN-END:variables
}
