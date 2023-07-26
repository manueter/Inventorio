/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package inventario.Interfaz;

import inventario.Controladores.ControladorAddComponente;
import inventario.Controladores.VistaAddComponente;
import inventario.Modelo.SistemaInventario;
import inventario.Modelo.TipoComponente;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mneter
 */
public class AddComponente extends javax.swing.JDialog implements VistaAddComponente
{
    ControladorAddComponente controlador;
    private ArrayList<String> unidades = new ArrayList<>();
    boolean nombreEsAutomatico=true;
    
    public AddComponente(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();   
        controlador = new ControladorAddComponente(this);
        controlador.cargarTipos();
        unidades = controlador.obtenerUnidades();
    }
     @Override
    public void mostrarTipos(ArrayList<TipoComponente> tipos)
    {
        this.cbox_tipos.removeAllItems();
        for(TipoComponente tc : tipos )
        {
            this.cbox_tipos.addItem(tc.getNombre());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbox_tipos = new javax.swing.JComboBox<>();
        txt_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbl_tipo = new javax.swing.JLabel();
        btn_agregarTipo = new javax.swing.JButton();
        btn_confirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spinner_cantidad = new javax.swing.JSpinner();
        btn_cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        cbox_unidades = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        spinner_precio = new javax.swing.JSpinner();
        txt_magn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(135, 110, 140));
        setFocusTraversalPolicyProvider(true);
        setForeground(java.awt.Color.white);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(145, 113, 145));
        jPanel1.setForeground(new java.awt.Color(145, 113, 145));

        cbox_tipos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbox_tipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbox_tipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_tiposActionPerformed(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombre.setDisabledTextColor(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        lbl_tipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_tipo.setText("Tipo");

        btn_agregarTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_agregarTipo.setText("Agregar Tipo");

        btn_confirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_confirmar.setText("Confirmar");
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad");

        spinner_cantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cancelar.setText("Cerrar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Valor");

        txt_valor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_valor.setDisabledTextColor(new java.awt.Color(145, 113, 145));
        txt_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valorKeyTyped(evt);
            }
        });

        cbox_unidades.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbox_unidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "K", "- ", "µ", "n", "p" }));
        cbox_unidades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbox_unidadesItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Precio");

        spinner_precio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_magn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_magn.setText("Ω");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spinner_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(spinner_precio))
                        .addGap(21, 21, 21))
                    .addComponent(btn_cancelar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tipo)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbox_tipos, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE)
                            .addComponent(txt_valor))
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregarTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbox_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_magn)))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipo)
                    .addComponent(btn_agregarTipo))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbox_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_magn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinner_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spinner_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_confirmar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed

        String nombre_str = this.txt_nombre.getText().toUpperCase();
        String valor_str= this.txt_valor.getText();
        int precio = (int)this.spinner_precio.getValue();
        int cantidad = (int)this.spinner_cantidad.getValue();
        controlador.agregarComponente(nombre_str,valor_str,(float)precio,cantidad);
    }//GEN-LAST:event_btn_confirmarActionPerformed

    private void cbox_tiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_tiposActionPerformed
        
        if(this.cbox_tipos.getSelectedItem()!=null)
        {
            String tipo_string = (String)this.cbox_tipos.getSelectedItem();
            controlador.seleccionarTipo(tipo_string);
        }
        
    }//GEN-LAST:event_cbox_tiposActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorKeyTyped
            if(!evt.isActionKey())
            {
                char r = evt.getKeyChar() ;
                if(Character.isLetterOrDigit(r))
                {
                    actualizarNombre(r);
                }
            }

    }//GEN-LAST:event_txt_valorKeyTyped

    private void cbox_unidadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbox_unidadesItemStateChanged
 if(nombreEsAutomatico)controlador.generarNombre(this.txt_valor.getText(),this.cbox_unidades.getSelectedItem().toString());        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_unidadesItemStateChanged

    private void actualizarNombre(char r)
    {
        if(nombreEsAutomatico)
        {
            String valor = this.txt_valor.getText();
            valor+=r;
            String unidad =this.cbox_unidades.getSelectedItem().toString();
            controlador.generarNombre(valor,unidad);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarTipo;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JComboBox<String> cbox_tipos;
    private javax.swing.JComboBox<String> cbox_unidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JSpinner spinner_cantidad;
    private javax.swing.JSpinner spinner_precio;
    private javax.swing.JLabel txt_magn;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables


    @Override
    public void mostrarUnidades(ArrayList<String> unidades) 
    {
        this.cbox_unidades.removeAllItems();
        for(String u : unidades )
        {
            this.cbox_unidades.addItem(u);
        }
    }
    @Override
    public void configurarVistaXTipo(TipoComponente tc)
    {
        if(tc==null) 
        {   
            this.txt_nombre.setEnabled(false);
            this.txt_valor.setEnabled(false);
            this.cbox_unidades.setEnabled(false);
        }else
        {
            if(tc.getNombre().equals("Resistencia") || tc.getNombre().equals("Capacitor") || tc.getNombre().equals("Potenciometro"))
            {
                this.txt_valor.setBackground(Color.WHITE);
                this.txt_nombre.setBackground(new Color(145,113,145));
                this.txt_nombre.setEnabled(false);
                this.txt_nombre.setText("");
                this.txt_valor.setEnabled(true);
                this.cbox_unidades.setEnabled(true);
                this.nombreEsAutomatico=true;
                
                if(!txt_valor.getText().equals(""))
                {
                    controlador.generarNombre(txt_valor.getText(), cbox_unidades.getSelectedItem().toString());
                }
            }
            else
            {
                if(!this.txt_valor.getText().equals(""))
                {
                    this.txt_nombre.setText("");
                    this.txt_valor.setText("");
                }
                this.txt_valor.setBackground(new Color(145,113,145));
                this.txt_nombre.setBackground(Color.WHITE);
                this.txt_nombre.setEnabled(true);
                this.txt_valor.setEnabled(false);
                this.cbox_unidades.setEnabled(false);
                this.nombreEsAutomatico=false;
            }
        }
        
    }
    
    @Override
    public void actualizarNombre(String nombre)
    {
        this.txt_nombre.setText(nombre);
    }
    
    @Override
    public void limpiar()
    {   
        this.txt_nombre.setText("");
        this.txt_valor.setText("");
        this.spinner_precio.setValue(0);
        this.spinner_cantidad.setValue(0);
    }

    @Override
    public void error(String msg) 
    {
       JOptionPane.showMessageDialog(this, msg);
    }
}
