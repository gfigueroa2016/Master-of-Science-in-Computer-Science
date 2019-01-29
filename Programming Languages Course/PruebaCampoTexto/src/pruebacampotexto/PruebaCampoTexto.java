/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacampotexto;

/**
 *
 * @author Gabriel Figueroa
 */
 // Demostración de la clase JTextField.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaCampoTexto extends JFrame
{

    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField campoContrasenia;
    // configurar GUI
    public PruebaCampoTexto() {
        super( "Prueba de Entrada de Texto y mustra del Password" );
        Container contenedor = getContentPane();
        contenedor.setLayout( new FlowLayout() );
        // crear campo de texto con tamaño predeterminado
        campoTexto1 = new JTextField( 10 );
        contenedor.add( campoTexto1 );
        // crear campo de texto con texto predeterminado
        campoTexto2 = new JTextField( " " );
        contenedor.add( campoTexto2 );
        // crear campo de texto con texto predeterminado,
        // 20 elementos visibles y sin manejador de eventos
        campoTexto3 = new JTextField( "Campo de texto no editable", 20 ); //Tipo JTextField, remover Campo
        campoTexto3.setEditable( false ); // remover Campo
        campoTexto3.setToolTipText("Esta no se puede editar"); // remover campo
        contenedor.add( campoTexto3 );
 
        // crear campo de contraseña con texto predeterminado
        campoContrasenia = new JPasswordField( "Texto oculto" );
        contenedor.add( campoContrasenia );
        // registrar manejadores de eventos
 
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
 
        campoTexto1.addActionListener( manejador ); // Eliminar type de Campo
        campoTexto2.addActionListener( manejador ); // Eliminar type de Campo
        campoTexto3.addActionListener( manejador ); // Eliminar type de Campo
        campoContrasenia.addActionListener( manejador ); // Eliminar type de Campo
        setSize( 325, 100 );
        setVisible( true );
    } 
    // fin del constructor de PruebaCampoTexto e inicio del método principal
    
    public static void main( String args[] ) {
    
        PruebaCampoTexto aplicacion = new PruebaCampoTexto();
        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
    // clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener {
    // procesar eventos de campo de texto
        @Override
        public void actionPerformed( ActionEvent evento ) {
            String cadena = "";
            // el usuario oprimió Intro en objeto JTextField campoTexto1
            if ( evento.getSource() == campoTexto1 ) {
                cadena = "campoTexto1: " + evento.getActionCommand();
            }
            // el usuario oprimió Intro en objeto JTextField campoTexto2
            else if ( evento.getSource() == campoTexto2 ) {
                cadena = "campoTexto2: " + evento.getActionCommand();
            }
            // el usuario oprimió Intro en objeto JTextField campoTexto3
            else if ( evento.getSource() == campoTexto3 ) {
                cadena = "campoTexto3: " + evento.getActionCommand();
            }
            // el usuario oprimió Intro en objeto JTextField campoContrasenia
            else if ( evento.getSource() == campoContrasenia ) {
                cadena = "Campo Contrasena: " +
                new String( campoContrasenia.getPassword() );
                JOptionPane.showMessageDialog( null, 
                        cadena,"Resultados",JOptionPane.CANCEL_OPTION);
            } 
            // fin del método actionPerformed 
        } 
        // fin de la clase interna privada ManejadorCampoTexto
    } 
    // fin de la clase PruebaCampoTexto
}