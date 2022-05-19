/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Ventana5 extends JFrame{
    private JPanel jPanel5;
    private List<JLabel> jLabel5;
    private List<JPanel> jPaneList5;
    private List<JComboBox> jComboBox5;
    

    public Ventana5(String title) throws HeadlessException {
        super(title);
        this.setSize(1100, 200);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.IniciarComponentes();
        this.setContentPane(this.jPanel5);
    }
    
    public void IniciarComponentes(){
        this.jPanel5=new JPanel();
        this.jPanel5.setLayout(new GridLayout(3,3));
        this.IniciarPaneles();
        this.IniciarEtiquetas();
        this.IniciarCombo();
    }
    
    public void IniciarPaneles(){
        this.jPaneList5= new ArrayList<>();
        this.jPaneList5.add(new JPanel());
        this.jPaneList5.add(new JPanel());
        this.jPaneList5.add(new JPanel());
        this.jPaneList5.add(new JPanel());
        this.jPaneList5.add(new JPanel());
        this.jPaneList5.add(new JPanel());
        this.jPaneList5.add(new JPanel());
        this.jPaneList5.add(new JPanel());
        this.jPaneList5.add(new JPanel());
        
        this.jPanel5.add(this.jPaneList5.get(0));
        this.jPanel5.add(this.jPaneList5.get(1));
        this.jPanel5.add(this.jPaneList5.get(2));
        this.jPanel5.add(this.jPaneList5.get(3));
        this.jPanel5.add(this.jPaneList5.get(4));
        this.jPanel5.add(this.jPaneList5.get(5));
        this.jPanel5.add(this.jPaneList5.get(6));
        this.jPanel5.add(this.jPaneList5.get(7));
        this.jPanel5.add(this.jPaneList5.get(8));
    }
    
    public void IniciarEtiquetas(){
        this.jLabel5=new ArrayList<>();
        this.jLabel5.add(new JLabel("Sede:"));
        this.jLabel5.add(new JLabel("Cmpus/Extension"));
        this.jLabel5.add(new JLabel("Carrera"));
        this.jLabel5.add(new JLabel("Codigo del Proyecto"));
        this.jLabel5.add(new JLabel("Fecha Inicio Clases: 28/03/2022 al 06/08/2022"));
        this.jPaneList5.get(0).add(this.jLabel5.get(0));
        this.jPaneList5.get(1).add(this.jLabel5.get(1));
        this.jPaneList5.get(2).add(this.jLabel5.get(2));
        this.jPaneList5.get(3).add(this.jLabel5.get(3));
        this.jPaneList5.get(6).add(this.jLabel5.get(4));
    }
    
    public void IniciarCombo(){
        this.jComboBox5=new ArrayList<>();
        this.jComboBox5.add(new JComboBox());
        this.jComboBox5.add(new JComboBox());
        this.jComboBox5.add(new JComboBox());
        this.jComboBox5.add(new JComboBox());
        
        this.jComboBox5.get(0).addItem("Matriz Cuenca");
        this.jComboBox5.get(0).addItem("Quito");
        this.jComboBox5.get(0).addItem("Guayaquil");
        
        this.jComboBox5.get(1).addItem("El Vecino");
        this.jComboBox5.get(1).addItem("El Giron");
        this.jComboBox5.get(1).addItem("Guayaquil");
        
        this.jComboBox5.get(2).addItem("Arquitectura");
        this.jComboBox5.get(2).addItem("Electronica y Automatizacion");
        this.jComboBox5.get(2).addItem("Telecomunicaciones");
        this.jComboBox5.get(2).addItem("Mecatronica");
        this.jComboBox5.get(2).addItem("Civil");
        this.jComboBox5.get(2).addItem("Biomedicina");
        
        this.jComboBox5.get(3).addItem("Agropecuaria[Rediseño]- Nueva o Rediseño");
        this.jComboBox5.get(3).addItem("Electronica y Automatizacion[Rediseño]- Nueva o Rediseño");
        this.jComboBox5.get(3).addItem("Telecomunicaciones[Rediseño]- Nueva o Rediseño");
        this.jComboBox5.get(3).addItem("Mecatronica[Rediseño]- Nueva o Rediseño");
        this.jComboBox5.get(3).addItem("Civil[Rediseño]- Nueva o Rediseño");
        this.jComboBox5.get(3).addItem("Biomedicina[Rediseño]- Nueva o Rediseño");
        
        this.jPaneList5.get(0).add(this.jComboBox5.get(0));
        this.jPaneList5.get(1).add(this.jComboBox5.get(1));
        this.jPaneList5.get(2).add(this.jComboBox5.get(2));
        this.jPaneList5.get(3).add(this.jComboBox5.get(3));
    }
        
    

}
