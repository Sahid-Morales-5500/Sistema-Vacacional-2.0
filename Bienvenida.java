import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bienvenida extends JFrame implements ActionListener {
    private JLabel Logo, Titulo, Nombre, Copyright;
    private JTextField Espacio_Nombre;
    private JButton Boton_Ingreso;
    public static String Texto = "";

    public Bienvenida() {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        Image icono = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        setIconImage(icono);

        // -JLabels- //

        // Imagen Logo //
         ImageIcon imagenLogo = new ImageIcon("images/logo-coca.png");
         Logo = new JLabel(imagenLogo);
         Logo.setBounds(25,15,300,150);
         add(Logo);

         // Titulo //
         Titulo = new JLabel("Sistema de Control Vacacional");
         Titulo.setBounds(35,135,300,30);
         Titulo.setFont(new Font("Roboto", 1, 18));
         Titulo.setForeground(new Color(255,255,255));
         add(Titulo);

         // Ingresa Tu Nombre //
         Nombre = new JLabel("Ingresa tu Nombre");
         Nombre.setBounds(45,212,200,30);

         // Copyright //
         Copyright = new JLabel("©2024 The Coca-Cola Company");
         Copyright.setBounds(85,375,300,30);
         Copyright.setFont(new Font("Roboto", 1,12));
         Copyright.setForeground(new Color(255,255,255));
         add(Copyright);

         // -TextField-//
         Espacio_Nombre = new JTextField();
         Espacio_Nombre.setBounds(45,240,255,25);
         Espacio_Nombre.setFont(new Font("Roboto", 1,14 ));
         Espacio_Nombre.setForeground(new Color(255,0,0));
         add(Espacio_Nombre);

         // -Boton-//
         Boton_Ingreso = new JButton("Ingresar");
         Boton_Ingreso.setBounds(125,280,100,30);
         Boton_Ingreso.setBackground(new Color(255,255,255));
         Boton_Ingreso.setFont(new Font("Roboto", 1 ,14));
         Boton_Ingreso.setForeground(new Color(255,0,0));
         Boton_Ingreso.addActionListener(this);

    }

    
    // ActionEvent//
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Boton_Ingreso){
            Texto = Espacio_Nombre.getText().trim();
        }
    }
    
    public static void main(String[] args) {
     Bienvenida bienvenida = new Bienvenida();
     bienvenida.setBounds(0,0,350,450);
     bienvenida.setVisible(true);
     bienvenida.setResizable(false);
     bienvenida.setLocationRelativeTo(null);
    }
}

