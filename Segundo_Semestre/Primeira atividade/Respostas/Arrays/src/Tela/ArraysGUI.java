package Tela;

import Classes.ArraysDeNumeros;
import javax.swing.JOptionPane;

public class ArraysGUI extends javax.swing.JFrame {

    ArraysDeNumeros objArrays;
    int tamanho;

    public ArraysGUI() {
        initComponents();
        setLocationRelativeTo(null);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtNumero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnPreencher = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnInverter = new javax.swing.JButton();
        btnBuscaBinaria = new javax.swing.JButton();
        btnPosicao = new javax.swing.JButton();
        btnSubstituir = new javax.swing.JButton();
        btnHistograma = new javax.swing.JButton();
        btnPares = new javax.swing.JButton();
        btnDivisiveis = new javax.swing.JButton();
        btnRepitidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores:"));

        jLabel1.setText("Número:");

        edtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edtNumero)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado:"));

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operações:"));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnPreencher.setText("Preencher");
        btnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnInverter.setText("Inverter");
        btnInverter.setActionCommand("");
        btnInverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInverterActionPerformed(evt);
            }
        });

        btnBuscaBinaria.setText("Busca Binária");
        btnBuscaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaBinariaActionPerformed(evt);
            }
        });

        btnPosicao.setText("Posicao");
        btnPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosicaoActionPerformed(evt);
            }
        });

        btnSubstituir.setText("Substituir");
        btnSubstituir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubstituirActionPerformed(evt);
            }
        });

        btnHistograma.setText("Histograma");
        btnHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistogramaActionPerformed(evt);
            }
        });

        btnPares.setText("Pares");
        btnPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParesActionPerformed(evt);
            }
        });

        btnDivisiveis.setText("Divisíveis");
        btnDivisiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisiveisActionPerformed(evt);
            }
        });

        btnRepitidos.setText("Repitidos");
        btnRepitidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepitidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDivisiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPreencher, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscaBinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPosicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubstituir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRepitidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPreencher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInverter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrdenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscaBinaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPosicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubstituir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDivisiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistograma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRepitidos)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        int numero = Integer.parseInt(edtNumero.getText());

        if(objArrays.adicionar(numero) == true){
        txtResultado.setText(objArrays.toString());   
        }else{
            JOptionPane.showMessageDialog(null,"Você já completou seu vetor", "AppArray",2);
            btnAdicionar.setEnabled(false);
             btnPreencher.setEnabled(false);   
        } 
        edtNumero.setText(null);        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja determinar o tamanho do array?", "AppArray", JOptionPane.YES_NO_OPTION);

        if (escolha == JOptionPane.YES_OPTION) {
            tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor:", "AppArray", 3));

            objArrays = new ArraysDeNumeros(tamanho);

        } else {
            objArrays = new ArraysDeNumeros();
        }
    }//GEN-LAST:event_formWindowOpened

    private void edtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNumeroActionPerformed
      
    }//GEN-LAST:event_edtNumeroActionPerformed

    private void btnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreencherActionPerformed
        btnAdicionar.setEnabled(false);
        objArrays.preencher();
        txtResultado.setText(objArrays.toString());
         btnPreencher.setEnabled(false);
        
    }//GEN-LAST:event_btnPreencherActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
       objArrays.ordenar();
       txtResultado.setText(objArrays.toString());
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnInverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInverterActionPerformed
       objArrays.inverter();
       txtResultado.setText(objArrays.toString());
    }//GEN-LAST:event_btnInverterActionPerformed

    private void btnBuscaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaBinariaActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número que você deseja buscar", "AppArrays", 1));
        boolean encontrou = objArrays.buscaBinaria(numero);
        
        txtResultado.setText(objArrays.toString());
        
        if(encontrou ==true){
            JOptionPane.showMessageDialog(null, "O número foi encontrado");
        }else{
            JOptionPane.showMessageDialog(null, "O número não foi encontrado");
        }
    }//GEN-LAST:event_btnBuscaBinariaActionPerformed

    private void btnPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosicaoActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número que você deseja descrobir a posição", "AppArrays", 1));
        int [] vetor =  objArrays.posicao(numero);
        StringBuilder saida = new StringBuilder();
       
        if(vetor.length <  0){
            JOptionPane.showMessageDialog(null, "Seu número não está na coleção"); 
        }else{
           for(int i = 0; i < vetor.length; i++){
              saida.append(vetor[i]).append(", ");
           }
           
          JOptionPane.showMessageDialog(null,saida.toString()); 
        }
    }//GEN-LAST:event_btnPosicaoActionPerformed

    private void btnSubstituirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubstituirActionPerformed
        int numeroInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Que número vc deseja tirar ?", "AppArrays",3));
        int numeroFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Qua número vc deseja colocar ?", "AppArrays",3));
        objArrays.substituir(numeroInicial, numeroFinal);
        
        txtResultado.setText(objArrays.toString());
    }//GEN-LAST:event_btnSubstituirActionPerformed

    private void btnHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistogramaActionPerformed
      
           String teste =  objArrays.histograma();
           
           txtResultado.setText(teste);

    }//GEN-LAST:event_btnHistogramaActionPerformed

    private void btnParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParesActionPerformed
      ArraysDeNumeros resultado  =  objArrays.pares();
      
      txtResultado.setText(resultado.toString());

    }//GEN-LAST:event_btnParesActionPerformed

    private void btnDivisiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisiveisActionPerformed
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para saber se há número divisíveis po ele", "AppArrays",3));
        
        if(objArrays.divisiveis(numero) == true){
            JOptionPane.showMessageDialog(null,"Há valores divisiveis por ele");
        }else{
            JOptionPane.showMessageDialog(null," Não há valores divisíveis por ele"); 
        }
    }//GEN-LAST:event_btnDivisiveisActionPerformed

    private void btnRepitidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepitidosActionPerformed
       int [] resultado = objArrays.repeticoes();
       
       if(resultado[1]  < 1){
          JOptionPane.showMessageDialog(null,"Número que mais se repete: "+ resultado[0]+ "se repete "+ resultado[1]+ "X"); 
       }else{
           JOptionPane.showMessageDialog(null, "Não há números repitidos!");
       }
        
       
    }//GEN-LAST:event_btnRepitidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArraysGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArraysGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArraysGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArraysGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArraysGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscaBinaria;
    private javax.swing.JButton btnDivisiveis;
    private javax.swing.JButton btnHistograma;
    private javax.swing.JButton btnInverter;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnPares;
    private javax.swing.JButton btnPosicao;
    private javax.swing.JButton btnPreencher;
    private javax.swing.JButton btnRepitidos;
    private javax.swing.JButton btnSubstituir;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
