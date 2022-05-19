/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Ventana3 extends JFrame{
    private JPanel jPanel3;
    private List<JPanel> jPanelList3;
    private List<JLabel> jLabelList3;
    private List<JComboBox> jComboBox3;
    private List<JTextField> jTextField3;
    

    public Ventana3(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.IniciarComponentes();
        this.setContentPane(this.jPanel3);
    }
    
    public void IniciarComponentes(){
        this.jPanel3= new JPanel();
        this.jPanel3.setLayout(new GridLayout(7,1));
        this.IniciarPaneles();
        this.IniciarEtiquetas();
        this.IniciarTexto();
        this.IniciarCombos();
                
    }
    
    public void IniciarPaneles(){
        this.jPanelList3=new ArrayList<>();
        this.jPanelList3.add(new JPanel());
        this.jPanelList3.add(new JPanel());
        this.jPanelList3.add(new JPanel());
        this.jPanelList3.add(new JPanel());
        this.jPanelList3.add(new JPanel());
        this.jPanelList3.add(new JPanel());
        this.jPanelList3.add(new JPanel());
        this.jPanel3.add(this.jPanelList3.get(0));
        this.jPanel3.add(this.jPanelList3.get(1));
        this.jPanel3.add(this.jPanelList3.get(2));
        this.jPanel3.add(this.jPanelList3.get(3));
        this.jPanel3.add(this.jPanelList3.get(4));
        this.jPanel3.add(this.jPanelList3.get(5));
        this.jPanel3.add(this.jPanelList3.get(6));
    }
    
    public void IniciarEtiquetas(){
        this.jLabelList3= new ArrayList<>();
        this.jLabelList3.add(new JLabel("Periodo Academico: "));
        this.jLabelList3.add(new JLabel("Carrera: "));
        this.jLabelList3.add(new JLabel("Modalidad: "));
        this.jLabelList3.add(new JLabel("Sede:"));
        this.jLabelList3.add(new JLabel("Campus: "));
        this.jLabelList3.add(new JLabel("Jornada: "));
        this.jLabelList3.add(new JLabel("Fecha de Registro: "));
        this.jPanelList3.get(0).add(this.jLabelList3.get(0));
        this.jPanelList3.get(1).add(this.jLabelList3.get(1));
        this.jPanelList3.get(2).add(this.jLabelList3.get(2));
        this.jPanelList3.get(3).add(this.jLabelList3.get(3));
        this.jPanelList3.get(4).add(this.jLabelList3.get(4));
        this.jPanelList3.get(5).add(this.jLabelList3.get(5));
        this.jPanelList3.get(6).add(this.jLabelList3.get(6));
    }
     public void IniciarTexto(){
         this.jTextField3=new ArrayList<>();
         this.jTextField3.add(new JTextField());
         this.jTextField3.add(new JTextField());
         this.jTextField3.get(0).setText("2022-2022");
         this.jTextField3.get(1).setText("29/04/22");
         this.jPanelList3.get(0).add(this.jTextField3.get(0));
         this.jPanelList3.get(6).add(this.jTextField3.get(1));
     }
    
     public void IniciarCombos(){
         this.jComboBox3=new ArrayList<>();
         this.jComboBox3.add(new JComboBox());
         this.jComboBox3.add(new JComboBox());
         this.jComboBox3.add(new JComboBox());
         this.jComboBox3.add(new JComboBox());
         this.jComboBox3.add(new JComboBox());
         
         this.jComboBox3.get(0).addItem("Arquitectura");
         this.jComboBox3.get(0).addItem("Electronica y Automatizacion");
         this.jComboBox3.get(0).addItem("Telecomunicaciones");
         this.jComboBox3.get(0).addItem("Mecatronica");
         this.jComboBox3.get(0).addItem("Civil");
         this.jComboBox3.get(0).addItem("Biomedicina");
         
         this.jComboBox3.get(1).addItem("Presencial");
         this.jComboBox3.get(1).addItem("Virtual");
         this.jComboBox3.get(1).addItem("Dual");
         
         this.jComboBox3.get(2).addItem("Cuenca");
         this.jComboBox3.get(2).addItem("Guayaquil");
         this.jComboBox3.get(2).addItem("Quito");
         
         this.jComboBox3.get(3).addItem("El Vecino");
         this.jComboBox3.get(3).addItem("Guayaquil");
         this.jComboBox3.get(3).addItem("El Giron");
         
         this.jComboBox3.get(4).addItem("Matutina");
         this.jComboBox3.get(4).addItem("Vespertina");
         this.jComboBox3.get(4).addItem("Nocturna");
         
         this.jPanelList3.get(1).add(this.jComboBox3.get(0));
         this.jPanelList3.get(2).add(this.jComboBox3.get(1));
         this.jPanelList3.get(3).add(this.jComboBox3.get(2));
         this.jPanelList3.get(4).add(this.jComboBox3.get(3));
         this.jPanelList3.get(5).add(this.jComboBox3.get(4));
     }
    
}
