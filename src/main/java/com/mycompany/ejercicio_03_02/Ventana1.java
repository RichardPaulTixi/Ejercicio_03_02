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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Ventana1 extends JFrame{
    private JPanel jpanel1;
    private List<JLabel> jlabellist1;
    private List<JPanel> jpanellist;
    private JComboBox jcombobox;
    private JComboBox jcombobox2;
    private JTextField jtextfield1;
    private JButton jbutton1;

    public Ventana1(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 300);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.IniciarComponentes();
        this.setContentPane(this.jpanel1);
    }
    
    public void IniciarComponentes(){
        this.jpanel1=new JPanel();
        this.jpanel1.setBackground(Color.BLUE);
        this.jpanel1.setLayout(new GridLayout(5,1));
        this.IniciarPaneles();
        this.IniciarEtiquetas();
        this.IniciarCombo();
        this.IniciarTexto();
        this.IniciarBoton();
    }
    
    public void IniciarPaneles(){
        this.jpanellist= new ArrayList<>();
        this.jpanellist.add(new JPanel());
        this.jpanellist.add(new JPanel());
        this.jpanellist.add(new JPanel());
        this.jpanellist.add(new JPanel());
        this.jpanellist.add(new JPanel());
        this.jpanel1.add(this.jpanellist.get(0));
        this.jpanel1.add(this.jpanellist.get(1));
        this.jpanel1.add(this.jpanellist.get(2));
        this.jpanel1.add(this.jpanellist.get(3));
        this.jpanel1.add(this.jpanellist.get(4));
        this.jpanellist.get(0).setBackground(Color.BLUE);
    }
    
    public void IniciarEtiquetas(){
        this.jlabellist1=new ArrayList<>();
        this.jlabellist1.add(new JLabel("Inscripciones"));
        this.jlabellist1.add(new JLabel("Seleccione una Sede: "));
        this.jlabellist1.add(new JLabel("Tipo de documento: "));
        this.jlabellist1.add(new JLabel("Ingrese su identificacion: "));
        this.jpanellist.get(0).add(this.jlabellist1.get(0));
        this.jpanellist.get(1).add(this.jlabellist1.get(1));
        this.jpanellist.get(2).add(this.jlabellist1.get(2));
        this.jpanellist.get(3).add(this.jlabellist1.get(3));
        this.jlabellist1.get(0).setForeground(Color.WHITE);
        
    }
    
    public void IniciarCombo(){
        this.jcombobox= new JComboBox();
        this.jcombobox.addItem("Matriz Cuenca");
        this.jcombobox.addItem("Quito");
        this.jcombobox.addItem("Guayaquil");
        this.jpanellist.get(1).add(this.jcombobox);
        
        this.jcombobox2= new JComboBox();
        this.jcombobox2.addItem("Cedula");
        this.jcombobox2.addItem("Pasaporte");
        this.jpanellist.get(2).add(this.jcombobox2);
    }
    
    public void IniciarTexto(){
        this.jtextfield1= new JTextField();
        this.jtextfield1.setColumns(20);
        this.jpanellist.get(3).add(this.jtextfield1);
    }
    
    public void IniciarBoton(){
        this.jbutton1= new JButton();
        this.jbutton1.setText("Ingresar");
        this.jpanellist.get(4).add(this.jbutton1);
    }
    
    
    
    
}
