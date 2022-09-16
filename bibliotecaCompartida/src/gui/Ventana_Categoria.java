/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Modelo.ModeloCategoria;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import logico.Categoria;

/**
 *
 * @author Fiction
 */
public class Ventana_Categoria extends javax.swing.JDialog {

    /**
     * Creates new form Ventana_Categoria
     * @param parent
     * @param modal
     */
    
    ModeloCategoria mc = new ModeloCategoria();
    int idc;
    public Ventana_Categoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ModeloCategoria.getTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backround = new javax.swing.JPanel();
        panelsuperior1 = new javax.swing.JPanel();
        labelcat = new javax.swing.JLabel();
        labelcodcat = new javax.swing.JLabel();
        labelnomcat = new javax.swing.JLabel();
        txtnombrecat = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacategoria = new javax.swing.JTable();
        btnrvolver = new javax.swing.JPanel();
        btnlabelvolver = new javax.swing.JLabel();
        btnagregar1 = new javax.swing.JPanel();
        btnlabeagregar = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JPanel();
        btnlabelactualizar = new javax.swing.JLabel();
        btneliminar = new javax.swing.JPanel();
        btnlabeleliminar = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JPanel();
        btnlabelbuscar = new javax.swing.JLabel();
        labelid = new javax.swing.JLabel();
        labelidcat = new javax.swing.JLabel();
        btnlimpiar2 = new javax.swing.JPanel();
        btnlabellimpiar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        backround.setBackground(new java.awt.Color(255, 255, 255));

        panelsuperior1.setBackground(new java.awt.Color(0, 153, 153));

        labelcat.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        labelcat.setForeground(new java.awt.Color(255, 255, 255));
        labelcat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcat.setText("REGISTRAR CATEGORÍA");

        javax.swing.GroupLayout panelsuperior1Layout = new javax.swing.GroupLayout(panelsuperior1);
        panelsuperior1.setLayout(panelsuperior1Layout);
        panelsuperior1Layout.setHorizontalGroup(
            panelsuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsuperior1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelcat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelsuperior1Layout.setVerticalGroup(
            panelsuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsuperior1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(labelcat)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        labelcodcat.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labelcodcat.setForeground(new java.awt.Color(102, 102, 102));
        labelcodcat.setText("CÓDIGO:");

        labelnomcat.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labelnomcat.setForeground(new java.awt.Color(102, 102, 102));
        labelnomcat.setText("NOMBRE CATEGORÍA:");

        txtnombrecat.setBorder(null);
        txtnombrecat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombrecatKeyTyped(evt);
            }
        });

        txtcodigo.setBorder(null);
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        tablacategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablacategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacategoria);

        btnrvolver.setBackground(new java.awt.Color(0, 153, 153));

        btnlabelvolver.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelvolver.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelvolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelvolver.setText("VOLVER");
        btnlabelvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelvolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelvolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnrvolverLayout = new javax.swing.GroupLayout(btnrvolver);
        btnrvolver.setLayout(btnrvolverLayout);
        btnrvolverLayout.setHorizontalGroup(
            btnrvolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelvolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnrvolverLayout.setVerticalGroup(
            btnrvolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelvolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnagregar1.setBackground(new java.awt.Color(0, 153, 153));

        btnlabeagregar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabeagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnlabeagregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabeagregar.setText("AGREGAR");
        btnlabeagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabeagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabeagregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnagregar1Layout = new javax.swing.GroupLayout(btnagregar1);
        btnagregar1.setLayout(btnagregar1Layout);
        btnagregar1Layout.setHorizontalGroup(
            btnagregar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabeagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnagregar1Layout.setVerticalGroup(
            btnagregar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabeagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnactualizar.setBackground(new java.awt.Color(0, 153, 153));

        btnlabelactualizar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelactualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelactualizar.setText("ACTUALIZAR");
        btnlabelactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelactualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnactualizarLayout = new javax.swing.GroupLayout(btnactualizar);
        btnactualizar.setLayout(btnactualizarLayout);
        btnactualizarLayout.setHorizontalGroup(
            btnactualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnactualizarLayout.setVerticalGroup(
            btnactualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btneliminar.setBackground(new java.awt.Color(0, 153, 153));

        btnlabeleliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabeleliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnlabeleliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabeleliminar.setText("ELIMINAR");
        btnlabeleliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabeleliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabeleliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btneliminarLayout = new javax.swing.GroupLayout(btneliminar);
        btneliminar.setLayout(btneliminarLayout);
        btneliminarLayout.setHorizontalGroup(
            btneliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabeleliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btneliminarLayout.setVerticalGroup(
            btneliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabeleliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        btnbuscar.setBackground(new java.awt.Color(0, 153, 153));

        btnlabelbuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabelbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnlabelbuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabelbuscar.setText("BUSCAR");
        btnlabelbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabelbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabelbuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnbuscarLayout = new javax.swing.GroupLayout(btnbuscar);
        btnbuscar.setLayout(btnbuscarLayout);
        btnbuscarLayout.setHorizontalGroup(
            btnbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnbuscarLayout.setVerticalGroup(
            btnbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabelbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        labelid.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        labelid.setForeground(new java.awt.Color(102, 102, 102));
        labelid.setText("ID:");

        labelidcat.setEnabled(false);

        btnlimpiar2.setBackground(new java.awt.Color(0, 153, 153));

        btnlabellimpiar2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnlabellimpiar2.setForeground(new java.awt.Color(255, 255, 255));
        btnlabellimpiar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlabellimpiar2.setText("LIMPIAR");
        btnlabellimpiar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlabellimpiar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlabellimpiar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnlimpiar2Layout = new javax.swing.GroupLayout(btnlimpiar2);
        btnlimpiar2.setLayout(btnlimpiar2Layout);
        btnlimpiar2Layout.setHorizontalGroup(
            btnlimpiar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabellimpiar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnlimpiar2Layout.setVerticalGroup(
            btnlimpiar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnlabellimpiar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backroundLayout = new javax.swing.GroupLayout(backround);
        backround.setLayout(backroundLayout);
        backroundLayout.setHorizontalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelsuperior1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(backroundLayout.createSequentialGroup()
                            .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelcodcat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelnomcat, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                            .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backroundLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(backroundLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnombrecat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelidcat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelid, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnagregar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnrvolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        backroundLayout.setVerticalGroup(
            backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backroundLayout.createSequentialGroup()
                .addComponent(panelsuperior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnagregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnlimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnrvolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(backroundLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelidcat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelcodcat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombrecat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelnomcat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Agregar() {
        try {
            Categoria cate = new Categoria();
            String codigo = txtcodigo.getText().trim();
            String nombre = txtnombrecat.getText().trim();

            if (codigo.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS");
            } else {
                if (cate.Validar_Nombre_Cat(nombre) == false) {
                    JOptionPane.showMessageDialog(null, "NOMBRE NO VÁLIDO");
                } else {

                    cate.setCodigo_cat(codigo);
                    cate.setNombre_cat(nombre);
                    if (mc.RegistrarCategoria(cate)) {
                        JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                        ModeloCategoria.Limpiar_Tabla();
                        ModeloCategoria.getTabla();
                        LimpiarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR EL IDIOMA");
                        ModeloCategoria.Limpiar_Tabla();
                        ModeloCategoria.getTabla();
                    }
                    
                }
            }
        } catch (HeadlessException | NumberFormatException | NullPointerException e) {
            System.out.println(e);
        }
    }
    
    public void Modificar() {
        try {
            Categoria cate = new Categoria();
            int id = Integer.parseInt(labelidcat.getText().trim());
            String codigo = txtcodigo.getText().trim();
            String nombre = txtnombrecat.getText().trim();

            if (codigo.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS");
            } else {
                if (cate.Validar_Nombre_Cat(nombre) == false) {
                    JOptionPane.showMessageDialog(null, "NOMBRE NO VÁLIDO");
                } else {
                    cate.setId(id);
                    cate.setCodigo_cat(codigo);
                    cate.setNombre_cat(nombre);
                    if (mc.ModificarCategoria(cate)) {
                        JOptionPane.showMessageDialog(null, "DATOS MODIFICADOS CON ÉXITO");
                        ModeloCategoria.Limpiar_Tabla();
                        ModeloCategoria.getTabla();
                        LimpiarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR LOS DATOS");
                        ModeloCategoria.Limpiar_Tabla();
                        ModeloCategoria.getTabla();
                    }
                }
            }
        } catch (HeadlessException | NumberFormatException | NullPointerException e) {
            System.out.println(e);
        }
    }
    
    public void LimpiarCampos() {
        labelidcat.setText(null);
        txtcodigo.setText(null);
        txtnombrecat.setText(null);
    }
    
    
    private void txtnombrecatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrecatKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            evt.consume();
        }else{
            if (txtnombrecat.getText().length()>=50) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtnombrecatKeyTyped

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            evt.consume();
        } else{
            if(txtcodigo.getText().length()>=5) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void btnlabelvolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelvolverMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnlabelvolverMouseClicked

    private void btnlabeagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabeagregarMouseClicked
        Agregar();
    }//GEN-LAST:event_btnlabeagregarMouseClicked

    private void btnlabelactualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelactualizarMouseClicked
        Modificar();
    }//GEN-LAST:event_btnlabelactualizarMouseClicked

    private void btnlabeleliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabeleliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlabeleliminarMouseClicked

    private void btnlabelbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabelbuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlabelbuscarMouseClicked

    private void tablacategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacategoriaMouseClicked
        int fila = tablacategoria.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "NO HAY UNA FILA SELECCIONADA");
        } else {
            labelidcat.disable();
            idc = Integer.parseInt((String) tablacategoria.getValueAt(fila, 0).toString());
            String codigo = (String) tablacategoria.getValueAt(fila, 1);
            String nombre = (String) tablacategoria.getValueAt(fila, 2);

            labelidcat.setText("" + idc);
            txtcodigo.setText(codigo);
            txtnombrecat.setText(nombre);
        }
    }//GEN-LAST:event_tablacategoriaMouseClicked

    private void btnlabellimpiar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlabellimpiar2MouseClicked
        LimpiarCampos();
        ModeloCategoria.Limpiar_Tabla();
        ModeloCategoria.getTabla();
    }//GEN-LAST:event_btnlabellimpiar2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backround;
    private javax.swing.JPanel btnactualizar;
    private javax.swing.JPanel btnagregar1;
    private javax.swing.JPanel btnbuscar;
    private javax.swing.JPanel btneliminar;
    private javax.swing.JLabel btnlabeagregar;
    private javax.swing.JLabel btnlabelactualizar;
    private javax.swing.JLabel btnlabelbuscar;
    private javax.swing.JLabel btnlabeleliminar;
    private javax.swing.JLabel btnlabellimpiar;
    private javax.swing.JLabel btnlabellimpiar1;
    private javax.swing.JLabel btnlabellimpiar2;
    private javax.swing.JLabel btnlabelvolver;
    private javax.swing.JPanel btnlimpiar;
    private javax.swing.JPanel btnlimpiar1;
    private javax.swing.JPanel btnlimpiar2;
    private javax.swing.JPanel btnrvolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelcat;
    private javax.swing.JLabel labelcodcat;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelidcat;
    private javax.swing.JLabel labelnomcat;
    private javax.swing.JPanel panelsuperior1;
    public static javax.swing.JTable tablacategoria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombrecat;
    // End of variables declaration//GEN-END:variables
}