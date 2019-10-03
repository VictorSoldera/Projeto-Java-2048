/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author luizviniciusruoso
 */
public class Tabuleiro extends javax.swing.JFrame  {


    /**
     * Creates new form Tabuleiro
     */

    public Tabuleiro() {
        initComponents();
        setLocationRelativeTo(null);
    }
    //"/img/getright.png"
    public Image criaIcones( String source){
        Image img = null;
        try{
           img = ImageIO.read(getClass().getResource(source));
        }catch(IOException e){
            e.printStackTrace();
        }
        return img;
    }
    
    
public  void criaExibeTelas(int i, JFrame tabuleiro){
        JLabel label = null;
        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();

        switch(i){
            case 1: //derrota
            tabuleiro.setVisible(false); 
               
                frame1.setUndecorated(true);
                frame1.setAlwaysOnTop( true );
                frame1.setVisible(true);
                frame1.setSize(456, 196);
                frame1.setLocationRelativeTo(null);
                label = new JLabel(new ImageIcon("derrota.gif"));
                label.setBounds(0, 0, 456, 196);
                frame1.add(label);
                new Thread() {
                    public void run() {
                    try {
                         Thread.sleep(3000);
                         frame1.dispose();
                         tabuleiro.setVisible(true);
                    } catch (InterruptedException ex) {
                         Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }.start();
                    
            break;
            case 2: //vitoria
                
                tabuleiro.setVisible(false); 
                frame2.setUndecorated(true);
                frame2.setAlwaysOnTop( true );
                frame2.setVisible(true);
                frame2.setSize(480, 360);
                frame2.setLocationRelativeTo(null);
                label = new JLabel(new ImageIcon("gif.gif"));
                label.setBounds(0, 0, 456, 196);
                frame2.add(label);
                new Thread() {
                    public void run() {
                    try {
                         Thread.sleep(3000);
                         frame2.dispose();
                         tabuleiro.setVisible(true);
                    } catch (InterruptedException ex) {
                         Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }.start();
                    
            break;
     

        }
       
        
        
    }


public void derrota() {
     
}
public void displayMenu(JFrame tabuleiro)
    {
        tabuleiro.setVisible(false);
        JFrame frame = new JFrame("Bem Vindo ao Incrível 2048 - THE GAME!");

        // create our jbutton
        JButton showDialogButton = new JButton("Novo Jogo!");
  
        // add the listener to the jbutton to handle the "pressed" event
        showDialogButton.addActionListener((ActionEvent e) -> {
            // display/center the jdialog when the button is pressed
                tabuleiro.setTitle("2048");
                tabuleiro.setBackground(Color.blue);
                tabuleiro.setVisible(true);
                tabuleiro.setResizable(false);      
                tabuleiro.getContentPane().setBackground(Color.decode("#baac9f"));

                frame.dispose();
        });
            

            // put the button on the frame
            frame.getContentPane().setLayout(new FlowLayout());
            frame.add(showDialogButton);

        // set up the jframe, then display it
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setPreferredSize(new Dimension(500, 500));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        
    }
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        direita = new javax.swing.JLabel();
        pos1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        pos2 = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        label17 = new javax.swing.JLabel();
        pos3 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        label18 = new javax.swing.JLabel();
        pos4 = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        label19 = new javax.swing.JLabel();
        pos5 = new javax.swing.JPanel();
        label5 = new javax.swing.JLabel();
        pos6 = new javax.swing.JPanel();
        label6 = new javax.swing.JLabel();
        pos7 = new javax.swing.JPanel();
        label7 = new javax.swing.JLabel();
        pos8 = new javax.swing.JPanel();
        label8 = new javax.swing.JLabel();
        pos9 = new javax.swing.JPanel();
        label9 = new javax.swing.JLabel();
        pos11 = new javax.swing.JPanel();
        label11 = new javax.swing.JLabel();
        pos12 = new javax.swing.JPanel();
        label12 = new javax.swing.JLabel();
        pos13 = new javax.swing.JPanel();
        label13 = new javax.swing.JLabel();
        pos14 = new javax.swing.JPanel();
        label14 = new javax.swing.JLabel();
        pos15 = new javax.swing.JPanel();
        label15 = new javax.swing.JLabel();
        pos16 = new javax.swing.JPanel();
        label16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pont = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        baixo = new javax.swing.JLabel();
        cima = new javax.swing.JLabel();
        esquerda = new javax.swing.JLabel();
        pos10 = new javax.swing.JPanel();
        label10 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        jButton6.setText("Direita");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(203, 191, 178));
        setForeground(new java.awt.Color(175, 195, 226));
        getContentPane().setLayout(null);
        getContentPane().add(direita);
        direita.setBounds(530, 230, 112, 177);

        pos1.setBackground(new java.awt.Color(255, 255, 255));
        pos1.setToolTipText("");
        pos1.setPreferredSize(new java.awt.Dimension(80, 80));

        label1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText(" ");

        javax.swing.GroupLayout pos1Layout = new javax.swing.GroupLayout(pos1);
        pos1.setLayout(pos1Layout);
        pos1Layout.setHorizontalGroup(
            pos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        pos1Layout.setVerticalGroup(
            pos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pos1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(label1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(pos1);
        pos1.setBounds(170, 140, 80, 80);

        pos2.setBackground(new java.awt.Color(255, 255, 255));
        pos2.setPreferredSize(new java.awt.Dimension(80, 80));
        pos2.setRequestFocusEnabled(false);

        label2.setBackground(new java.awt.Color(203, 191, 178));
        label2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText(" ");

        label17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label17.setText(" ");

        javax.swing.GroupLayout pos2Layout = new javax.swing.GroupLayout(pos2);
        pos2.setLayout(pos2Layout);
        pos2Layout.setHorizontalGroup(
            pos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pos2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(pos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos2Layout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pos2Layout.setVerticalGroup(
            pos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos2Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label2)
                    .addContainerGap(26, Short.MAX_VALUE)))
            .addGroup(pos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pos2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(label17)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos2);
        pos2.setBounds(260, 140, 80, 80);

        pos3.setBackground(new java.awt.Color(255, 255, 255));
        pos3.setPreferredSize(new java.awt.Dimension(80, 80));

        label3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label3.setText(" ");

        label18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label18.setText(" ");

        javax.swing.GroupLayout pos3Layout = new javax.swing.GroupLayout(pos3);
        pos3.setLayout(pos3Layout);
        pos3Layout.setHorizontalGroup(
            pos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label18, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addGroup(pos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pos3Layout.createSequentialGroup()
                    .addGap(0, 36, Short.MAX_VALUE)
                    .addComponent(label3)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );
        pos3Layout.setVerticalGroup(
            pos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pos3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(label18)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(pos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pos3Layout.createSequentialGroup()
                    .addGap(0, 25, Short.MAX_VALUE)
                    .addComponent(label3)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos3);
        pos3.setBounds(350, 140, 80, 80);

        pos4.setBackground(new java.awt.Color(255, 255, 255));

        label4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText(" ");

        label19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label19.setText(" ");

        javax.swing.GroupLayout pos4Layout = new javax.swing.GroupLayout(pos4);
        pos4.setLayout(pos4Layout);
        pos4Layout.setHorizontalGroup(
            pos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pos4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        pos4Layout.setVerticalGroup(
            pos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pos4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label4)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(pos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pos4Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(label19)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos4);
        pos4.setBounds(440, 140, 80, 80);

        pos5.setBackground(new java.awt.Color(255, 255, 255));

        label5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText(" ");

        javax.swing.GroupLayout pos5Layout = new javax.swing.GroupLayout(pos5);
        pos5.setLayout(pos5Layout);
        pos5Layout.setHorizontalGroup(
            pos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pos5Layout.setVerticalGroup(
            pos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos5Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label5)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos5);
        pos5.setBounds(170, 230, 80, 80);

        pos6.setBackground(new java.awt.Color(255, 255, 255));
        pos6.setPreferredSize(new java.awt.Dimension(80, 80));

        label6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setText(" ");

        javax.swing.GroupLayout pos6Layout = new javax.swing.GroupLayout(pos6);
        pos6.setLayout(pos6Layout);
        pos6Layout.setHorizontalGroup(
            pos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        pos6Layout.setVerticalGroup(
            pos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(label6)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(pos6);
        pos6.setBounds(260, 230, 80, 80);

        pos7.setBackground(new java.awt.Color(255, 255, 255));

        label7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setText(" ");

        javax.swing.GroupLayout pos7Layout = new javax.swing.GroupLayout(pos7);
        pos7.setLayout(pos7Layout);
        pos7Layout.setHorizontalGroup(
            pos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pos7Layout.setVerticalGroup(
            pos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos7Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label7)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos7);
        pos7.setBounds(350, 230, 80, 80);

        pos8.setBackground(new java.awt.Color(255, 255, 255));

        label8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setText(" ");

        javax.swing.GroupLayout pos8Layout = new javax.swing.GroupLayout(pos8);
        pos8.setLayout(pos8Layout);
        pos8Layout.setHorizontalGroup(
            pos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pos8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pos8Layout.setVerticalGroup(
            pos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos8Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label8)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos8);
        pos8.setBounds(440, 230, 80, 80);

        pos9.setBackground(new java.awt.Color(255, 255, 255));

        label9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText(" ");

        javax.swing.GroupLayout pos9Layout = new javax.swing.GroupLayout(pos9);
        pos9.setLayout(pos9Layout);
        pos9Layout.setHorizontalGroup(
            pos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pos9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pos9Layout.setVerticalGroup(
            pos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos9Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label9)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos9);
        pos9.setBounds(170, 320, 80, 80);

        pos11.setBackground(new java.awt.Color(255, 255, 255));

        label11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setText(" ");

        javax.swing.GroupLayout pos11Layout = new javax.swing.GroupLayout(pos11);
        pos11.setLayout(pos11Layout);
        pos11Layout.setHorizontalGroup(
            pos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pos11Layout.setVerticalGroup(
            pos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos11Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label11)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos11);
        pos11.setBounds(350, 320, 80, 80);

        pos12.setBackground(new java.awt.Color(255, 255, 255));

        label12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setText(" ");

        javax.swing.GroupLayout pos12Layout = new javax.swing.GroupLayout(pos12);
        pos12.setLayout(pos12Layout);
        pos12Layout.setHorizontalGroup(
            pos12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pos12Layout.setVerticalGroup(
            pos12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos12Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label12)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos12);
        pos12.setBounds(440, 320, 80, 80);

        pos13.setBackground(new java.awt.Color(255, 255, 255));
        pos13.setPreferredSize(new java.awt.Dimension(80, 80));

        label13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label13.setText(" ");

        javax.swing.GroupLayout pos13Layout = new javax.swing.GroupLayout(pos13);
        pos13.setLayout(pos13Layout);
        pos13Layout.setHorizontalGroup(
            pos13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        pos13Layout.setVerticalGroup(
            pos13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pos13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(pos13);
        pos13.setBounds(170, 410, 80, 80);

        pos14.setBackground(new java.awt.Color(255, 255, 255));

        label14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setText(" ");

        javax.swing.GroupLayout pos14Layout = new javax.swing.GroupLayout(pos14);
        pos14.setLayout(pos14Layout);
        pos14Layout.setHorizontalGroup(
            pos14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pos14Layout.setVerticalGroup(
            pos14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos14Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label14)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos14);
        pos14.setBounds(260, 410, 80, 80);

        pos15.setBackground(new java.awt.Color(255, 255, 255));

        label15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label15.setText(" ");

        javax.swing.GroupLayout pos15Layout = new javax.swing.GroupLayout(pos15);
        pos15.setLayout(pos15Layout);
        pos15Layout.setHorizontalGroup(
            pos15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pos15Layout.setVerticalGroup(
            pos15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos15Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label15)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos15);
        pos15.setBounds(350, 410, 80, 80);

        pos16.setBackground(new java.awt.Color(255, 255, 255));
        pos16.setPreferredSize(new java.awt.Dimension(80, 80));

        label16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label16.setText(" ");

        javax.swing.GroupLayout pos16Layout = new javax.swing.GroupLayout(pos16);
        pos16.setLayout(pos16Layout);
        pos16Layout.setHorizontalGroup(
            pos16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label16, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pos16Layout.setVerticalGroup(
            pos16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pos16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pos16Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label16)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        getContentPane().add(pos16);
        pos16.setBounds(440, 410, 80, 80);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pontuação:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 128, 39);

        pont.setBackground(new java.awt.Color(255, 255, 255));
        pont.setFont(new java.awt.Font("Lucida Grande", 0, 30)); // NOI18N
        pont.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pont);
        pont.setBounds(230, 10, 90, 38);

        jButton1.setBackground(new java.awt.Color(203, 191, 178));
        jButton1.setText("Novo Jogo");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 10, 109, 37);

        baixo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(baixo);
        baixo.setBounds(250, 510, 172, 79);

        cima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(cima);
        cima.setBounds(250, 60, 180, 63);
        getContentPane().add(esquerda);
        esquerda.setBounds(70, 230, 89, 174);

        pos10.setBackground(new java.awt.Color(255, 255, 255));
        pos10.setPreferredSize(new java.awt.Dimension(80, 80));

        label10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText(" ");

        javax.swing.GroupLayout pos10Layout = new javax.swing.GroupLayout(pos10);
        pos10.setLayout(pos10Layout);
        pos10Layout.setHorizontalGroup(
            pos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pos10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        pos10Layout.setVerticalGroup(
            pos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pos10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label10)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(pos10);
        pos10.setBounds(260, 320, 80, 80);

        fundo.setText("jLabel2");
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 760, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Jogo jogo = new Jogo();
        jogo.iniciaJogo();
        
        //Fecha janela anterior
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel baixo;
    public javax.swing.JLabel cima;
    public javax.swing.JLabel direita;
    public javax.swing.JLabel esquerda;
    public javax.swing.JLabel fundo;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel label1;
    public javax.swing.JLabel label10;
    public javax.swing.JLabel label11;
    public javax.swing.JLabel label12;
    public javax.swing.JLabel label13;
    public javax.swing.JLabel label14;
    public javax.swing.JLabel label15;
    public javax.swing.JLabel label16;
    public javax.swing.JLabel label17;
    public javax.swing.JLabel label18;
    public javax.swing.JLabel label19;
    public javax.swing.JLabel label2;
    public javax.swing.JLabel label3;
    public javax.swing.JLabel label4;
    public javax.swing.JLabel label5;
    public javax.swing.JLabel label6;
    public javax.swing.JLabel label7;
    public javax.swing.JLabel label8;
    public javax.swing.JLabel label9;
    public javax.swing.JLabel pont;
    public javax.swing.JPanel pos1;
    public javax.swing.JPanel pos10;
    public javax.swing.JPanel pos11;
    public javax.swing.JPanel pos12;
    public javax.swing.JPanel pos13;
    public javax.swing.JPanel pos14;
    public javax.swing.JPanel pos15;
    public javax.swing.JPanel pos16;
    public javax.swing.JPanel pos2;
    public javax.swing.JPanel pos3;
    public javax.swing.JPanel pos4;
    public javax.swing.JPanel pos5;
    public javax.swing.JPanel pos6;
    public javax.swing.JPanel pos7;
    public javax.swing.JPanel pos8;
    public javax.swing.JPanel pos9;
    // End of variables declaration//GEN-END:variables



}
