/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Ventana4 extends JFrame{
    private JPanel jPanel4;
    private List<JPanel> jPanelList4;
    private List<JLabel> jLabelList4;
    private List<JTextField> jTextField4;
    private List<JComboBox> jComboBox4;
    private JCheckBox jCheckBox4;

    public Ventana4(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.IniciarComponentes();
        this.setContentPane(this.jPanel4);
    }
    
    public void IniciarComponentes(){
        this.jPanel4=new JPanel();
        this.jPanel4.setLayout(new GridLayout(13,1));
        this.IniciarPaneles();
        this.IniciarEtiquetas();
        this.IniciarTexto();
        this.IniciarCombos();
        this.IniciarCheck();
    }
    
    public void IniciarPaneles(){
        this.jPanelList4=new ArrayList<>();
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        this.jPanelList4.add(new JPanel());
        
        this.jPanel4.add(this.jPanelList4.get(0));
        this.jPanel4.add(this.jPanelList4.get(1));
        this.jPanel4.add(this.jPanelList4.get(2));
        this.jPanel4.add(this.jPanelList4.get(3));
        this.jPanel4.add(this.jPanelList4.get(4));
        this.jPanel4.add(this.jPanelList4.get(5));
        this.jPanel4.add(this.jPanelList4.get(6));
        this.jPanel4.add(this.jPanelList4.get(7));
        this.jPanel4.add(this.jPanelList4.get(8));
        this.jPanel4.add(this.jPanelList4.get(9));
        this.jPanel4.add(this.jPanelList4.get(10));
        this.jPanel4.add(this.jPanelList4.get(11));
        this.jPanel4.add(this.jPanelList4.get(12));
    }
    
    public void IniciarEtiquetas(){
        this.jLabelList4=new ArrayList<>();
        this.jLabelList4.add(new JLabel("Periodo Academico: "));
        this.jLabelList4.add(new JLabel("Sede: "));
        this.jLabelList4.add(new JLabel("Campus/Extension: "));
        this.jLabelList4.add(new JLabel("Modalidad: "));
        this.jLabelList4.add(new JLabel("Carrera"));
        this.jLabelList4.add(new JLabel("Codigo de Proyecto"));
        this.jLabelList4.add(new JLabel("Asignatura"));
        this.jLabelList4.add(new JLabel("Nombre de Grupo: * "));
        this.jLabelList4.add(new JLabel("Cupos por Grupo: * "));
        this.jLabelList4.add(new JLabel("Autorizacion calificacion sobre 100: "));
        this.jLabelList4.add(new JLabel("Seleccionar Jornada del Grupo: "));
        this.jLabelList4.add(new JLabel("Oferta para Estudiantes: "));
        this.jLabelList4.add(new JLabel("Aplica Cambio de Grupo: "));
        
        this.jPanelList4.get(0).add(this.jLabelList4.get(0));
        this.jPanelList4.get(1).add(this.jLabelList4.get(1));
        this.jPanelList4.get(2).add(this.jLabelList4.get(2));
        this.jPanelList4.get(3).add(this.jLabelList4.get(3));
        this.jPanelList4.get(4).add(this.jLabelList4.get(4));
        this.jPanelList4.get(5).add(this.jLabelList4.get(5));
        this.jPanelList4.get(6).add(this.jLabelList4.get(6));
        this.jPanelList4.get(7).add(this.jLabelList4.get(7));
        this.jPanelList4.get(8).add(this.jLabelList4.get(8));
        this.jPanelList4.get(9).add(this.jLabelList4.get(9));
        this.jPanelList4.get(10).add(this.jLabelList4.get(10));
        this.jPanelList4.get(11).add(this.jLabelList4.get(11));
        this.jPanelList4.get(12).add(this.jLabelList4.get(12));
    }
    
    
    public void IniciarTexto(){
        this.jTextField4=new ArrayList<>();
        this.jTextField4.add(new JTextField("2022-2022"));
        this.jTextField4.add(new JTextField("Matriz Cuenca"));
        this.jTextField4.add(new JTextField("El Vecino"));
        this.jTextField4.add(new JTextField("Presencial"));
        this.jTextField4.add(new JTextField("Agropecuaria"));
        this.jTextField4.add(new JTextField("Agropecuaria [Rediseño]- Nueva o Rediseño"));
        this.jTextField4.add(new JTextField("E-CV-IAG-003-BOTANICA"));
        this.jTextField4.add(new JTextField("Grupo1"));
        this.jTextField4.get(7).setColumns(25);
        this.jTextField4.add(new JTextField(""));
        this.jTextField4.get(8).setColumns(10);
        this.jPanelList4.get(0).add(this.jTextField4.get(0));
        this.jPanelList4.get(1).add(this.jTextField4.get(1));
        this.jPanelList4.get(2).add(this.jTextField4.get(2));
        this.jPanelList4.get(3).add(this.jTextField4.get(3));
        this.jPanelList4.get(4).add(this.jTextField4.get(4));
        this.jPanelList4.get(5).add(this.jTextField4.get(5));
        this.jPanelList4.get(6).add(this.jTextField4.get(6));
        this.jPanelList4.get(7).add(this.jTextField4.get(7));
        this.jPanelList4.get(8).add(this.jTextField4.get(8));
    }
    
    public void IniciarCombos(){
        this.jComboBox4=new ArrayList<>();
        this.jComboBox4.add(new JComboBox());
        this.jComboBox4.add(new JComboBox());
        this.jComboBox4.add(new JComboBox());
        
        this.jComboBox4.get(0).addItem("NO");
        this.jComboBox4.get(0).addItem("SI");
        
        this.jComboBox4.get(1).addItem("Matutina");
        this.jComboBox4.get(1).addItem("Vespertina");
        this.jComboBox4.get(1).addItem("Nocturna");
        
        this.jComboBox4.get(2).addItem("SI");
        this.jComboBox4.get(2).addItem("NO");
        
        this.jPanelList4.get(9).add(this.jComboBox4.get(0));
        this.jPanelList4.get(10).add(this.jComboBox4.get(1));
        this.jPanelList4.get(12).add(this.jComboBox4.get(2));
    }
    
    public void IniciarCheck(){
        this.jCheckBox4=new JCheckBox("Nuevos");
        this.jPanelList4.get(11).add(this.jCheckBox4);
    }
    
    
    
}
