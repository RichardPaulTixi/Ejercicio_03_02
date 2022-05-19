/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Ventana2 extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabel1;
    private List<JPanel> jPanelList1;
    private List<JTextField> jTextField1;
    
    
    

    public Ventana2(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 700);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.IniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void IniciarComponentes(){
        this.jPanel1=new JPanel();
        this.jPanel1.setBackground(Color.BLUE);
        this.jPanel1.setLayout(new GridLayout(9,1));
        this.IniciarPaneles();
        this.IniciarEtiquetas();
        this.IniciarTexto();
        
    }
    
    public void IniciarPaneles(){
        this.jPanelList1=new ArrayList<>();
        this.jPanelList1.add(new JPanel());
        this.jPanelList1.add(new JPanel());
        this.jPanelList1.add(new JPanel());
        this.jPanelList1.add(new JPanel());
        this.jPanelList1.add(new JPanel());
        this.jPanelList1.add(new JPanel());
        this.jPanelList1.add(new JPanel());
        this.jPanelList1.add(new JPanel());
        this.jPanelList1.add(new JPanel());
        
        this.jPanel1.add(this.jPanelList1.get(0));
        this.jPanel1.add(this.jPanelList1.get(1));
        this.jPanel1.add(this.jPanelList1.get(2));
        this.jPanel1.add(this.jPanelList1.get(3));
        this.jPanel1.add(this.jPanelList1.get(4));
        this.jPanel1.add(this.jPanelList1.get(5));
        this.jPanel1.add(this.jPanelList1.get(6));
        this.jPanel1.add(this.jPanelList1.get(7));
        this.jPanel1.add(this.jPanelList1.get(8));
        
    }
    
    public void IniciarEtiquetas(){
        this.jLabel1=new ArrayList<>();
        this.jLabel1.add(new JLabel("Apellidos: "));
        this.jLabel1.add(new JLabel("Nombres: "));
        this.jLabel1.add(new JLabel("Nacionalidad: "));
        this.jLabel1.add(new JLabel("Genero: "));
        this.jLabel1.add(new JLabel("Correo Electronico Personal: "));
        this.jLabel1.add(new JLabel("Fecha Nacimiento: "));
        this.jLabel1.add(new JLabel("Telefono Domicilio: "));
        this.jLabel1.add(new JLabel("Telefono Celular: "));
        this.jLabel1.add(new JLabel("WhatsApp"));
        this.jPanelList1.get(0).add(this.jLabel1.get(0));
        this.jPanelList1.get(1).add(this.jLabel1.get(1));
        this.jPanelList1.get(2).add(this.jLabel1.get(2));
        this.jPanelList1.get(3).add(this.jLabel1.get(3));
        this.jPanelList1.get(4).add(this.jLabel1.get(4));
        this.jPanelList1.get(5).add(this.jLabel1.get(5));
        this.jPanelList1.get(6).add(this.jLabel1.get(6));
        this.jPanelList1.get(7).add(this.jLabel1.get(7));
        this.jPanelList1.get(8).add(this.jLabel1.get(8));
    }
    
    public void IniciarTexto(){
        this.jTextField1= new ArrayList<>();
        this.jTextField1.add(new JTextField("Tixi Uyaguari"));
        this.jTextField1.add(new JTextField("Richard Paul"));
        this.jTextField1.add(new JTextField("Ecuatoriana"));
        this.jTextField1.add(new JTextField("Masculono"));
        this.jTextField1.add(new JTextField("rtixiu@est.ups.edu.ec"));
        this.jTextField1.add(new JTextField("06/06/97"));
        this.jTextField1.add(new JTextField("4093159"));
        this.jTextField1.add(new JTextField("03395673591"));
        this.jTextField1.add(new JTextField());
        this.jTextField1.get(0).setColumns(15);
        this.jTextField1.get(1).setColumns(15);
        this.jTextField1.get(2).setColumns(15);
        this.jTextField1.get(3).setColumns(15);
        this.jTextField1.get(4).setColumns(15);
        this.jTextField1.get(5).setColumns(15);
        this.jTextField1.get(6).setColumns(15);
        this.jTextField1.get(7).setColumns(15);
        this.jTextField1.get(8).setColumns(15);
        
        this.jPanelList1.get(0).add(this.jTextField1.get(0));
        this.jPanelList1.get(1).add(this.jTextField1.get(1));
        this.jPanelList1.get(2).add(this.jTextField1.get(2));
        this.jPanelList1.get(3).add(this.jTextField1.get(3));
        this.jPanelList1.get(4).add(this.jTextField1.get(4));
        this.jPanelList1.get(5).add(this.jTextField1.get(5));
        this.jPanelList1.get(6).add(this.jTextField1.get(6));
        this.jPanelList1.get(7).add(this.jTextField1.get(7));
        this.jPanelList1.get(8).add(this.jTextField1.get(8));
        
        
                
    }
        
        
        
    }
    