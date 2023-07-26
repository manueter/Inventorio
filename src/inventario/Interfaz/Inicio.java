package inventario.Interfaz;

import inventario.Controladores.ControladorInicio;
import inventario.Controladores.VistaInicio;
import inventario.Modelo.Componente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mneter
 */
public class Inicio extends javax.swing.JFrame implements VistaInicio
{
    ControladorInicio controlador;
    ArrayList<String> filtrosTipo = new ArrayList<>();
    
    TableRowSorter<TableModel> sorter;

    
    public Inicio() 
    {
        
        initComponents();
        controlador = new ControladorInicio(this);
        this.tabla_componentes.setAutoCreateRowSorter(true);
    
        sorter = new TableRowSorter<>(tabla_componentes.getModel());
        tabla_componentes.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_componentes = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        btn_agregarComponente = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btn_quitar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        chk_resist = new javax.swing.JCheckBox();
        chk_diodo = new javax.swing.JCheckBox();
        chk_transist = new javax.swing.JCheckBox();
        chk_ic = new javax.swing.JCheckBox();
        chk_capacitor = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(145, 113, 145));

        tabla_componentes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        tabla_componentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Componente", "Valor", "Cantidad", "Precio"
            }
        ));
        tabla_componentes.setGridColor(new java.awt.Color(255, 153, 255));
        jScrollPane1.setViewportView(tabla_componentes);

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        btn_agregarComponente.setText("Agregar");
        btn_agregarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarComponenteActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar Componente");

        btn_quitar.setText("Quitar");
        btn_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(145, 113, 145));

        chk_resist.setBackground(new java.awt.Color(145, 113, 140));
        chk_resist.setText("Resistencia");
        chk_resist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_resistActionPerformed(evt);
            }
        });

        chk_diodo.setBackground(new java.awt.Color(145, 113, 140));
        chk_diodo.setText("Diodo");
        chk_diodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_diodoActionPerformed(evt);
            }
        });

        chk_transist.setBackground(new java.awt.Color(145, 113, 140));
        chk_transist.setText("Transistor");
        chk_transist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_transistActionPerformed(evt);
            }
        });

        chk_ic.setBackground(new java.awt.Color(145, 113, 140));
        chk_ic.setText("IC");
        chk_ic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_icActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(chk_resist)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(chk_diodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(chk_transist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(chk_ic)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_resist)
                    .addComponent(chk_diodo)
                    .addComponent(chk_transist)
                    .addComponent(chk_ic)))
        );

        chk_capacitor.setBackground(new java.awt.Color(145, 113, 140));
        chk_capacitor.setText("Capacitor");
        chk_capacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_capacitorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregarComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chk_capacitor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_capacitor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregarComponente)
                    .addComponent(btn_quitar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarComponenteActionPerformed
        new AddComponente(this,false).setVisible(true);
    }//GEN-LAST:event_btn_agregarComponenteActionPerformed

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
        String buscar = this.txt_buscar.getText();
            if(!evt.isActionKey())
        {
            char r = evt.getKeyChar() ;
            if(Character.isLetterOrDigit(r)){buscar+=r;}
        }
        controlador.filtrarXNombre(buscar);
    }//GEN-LAST:event_txt_buscarKeyTyped

    
    private void btn_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarActionPerformed
        
        //int[] componentesAEliminar = this.tabla_componentes.getSelectedRows();
        controlador.quitarCompontentes(this.tabla_componentes.getSelectedRows());
    }//GEN-LAST:event_btn_quitarActionPerformed

    private void chk_capacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_capacitorActionPerformed
        actualizarFiltro("capacitor");
    }//GEN-LAST:event_chk_capacitorActionPerformed

    private void chk_resistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_resistActionPerformed
        actualizarFiltro("resistencia");
    }//GEN-LAST:event_chk_resistActionPerformed

    private void chk_diodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_diodoActionPerformed
        
        actualizarFiltro("diodo");
    }//GEN-LAST:event_chk_diodoActionPerformed

    private void chk_transistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_transistActionPerformed
       actualizarFiltro("transistor");        
    }//GEN-LAST:event_chk_transistActionPerformed

    private void chk_icActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_icActionPerformed
        actualizarFiltro("ic");
    }//GEN-LAST:event_chk_icActionPerformed

    private void actualizarFiltro(String filtro)
    {
        if(filtrosTipo.contains(filtro))
        {filtrosTipo.remove(filtro);}
        else
        {filtrosTipo.add(filtro);}
        controlador.filtrarXTipos(filtrosTipo);
        /*
        RowFilter<TableModel, Object> rf = null;
        //If current expression doesn't parse, don't update.
        try 
        {
            rf = RowFilter.regexFilter(filtro, 0);
        } 
        catch (java.util.regex.PatternSyntaxException e) 
        {
            return;
        }
        sorter.setRowFilter(rf);
        */
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_agregarComponente;
    private javax.swing.JButton btn_quitar;
    private javax.swing.JCheckBox chk_capacitor;
    private javax.swing.JCheckBox chk_diodo;
    private javax.swing.JCheckBox chk_ic;
    private javax.swing.JCheckBox chk_resist;
    private javax.swing.JCheckBox chk_transist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_componentes;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarComponentes(ArrayList<Componente> componentes) 
    {
        DefaultTableModel model  = (DefaultTableModel)this.tabla_componentes.getModel();
        limpiarTabla(model);
        int i=0;
        for(Componente c:componentes)
        {
            model.insertRow(i++,new Object[]{c.getTipo().getNombre(),c.getNombre(),c.getCantidad(),"$"+c.getPrecio()});
        }
    }
    
    public void limpiarTabla(DefaultTableModel model)
    {
        int i = model.getRowCount()-1;
        while(i>=0)
        {model.removeRow(i--);}
    }

    @Override
    public void error(String error) 
    {
        JOptionPane.showMessageDialog(this, error);
    }

    @Override
    public void msg(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
}
