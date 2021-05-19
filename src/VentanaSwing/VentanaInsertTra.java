package VentanaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;

import Tablas.Trabajador;
import Tablas.Querys;
/**
 * PACKAGE_NAME
 * Nombre_project: NominasJava-marcos
 * form
 * Created by: MarcosRa
 * Date : 03/05/2021
 * Description:
 **/

public class VentanaInsertTra extends JFrame{

    private JPanel panel1;
    private JTextField TextFieldDNI;
    private JTextField TextFieldNombre;
    private JTextField TextFieldPA;
    private JTextField TextFieldSA;
    private JTextField TextFieldEdad;
    private JTextField TextFieldFInicio;
    private JTextField TextFieldPuesto;
    private JTextField textFieldIRPF;
    private JTextField TextFieldIDConvenio;
    private JButton insertarTrabajadorButton;
    private JLabel NombreTra;
    private JLabel PrimerApellidoTra;
    private JLabel SegundoApellidoTra;
    private JLabel EdadTra;
    private JLabel FechaIncioTra;
    private JLabel PuestoTra;
    private JLabel DNI_trabajador;
    private JLabel irpf;
    private JLabel ID_Convenio;



    public VentanaInsertTra() {
        setLocationRelativeTo(null);
        setResizable(false);
        insertarTrabajadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                String dni = TextFieldDNI.getText();
                String nombre = TextFieldNombre.getText();
                String papellido = TextFieldPA.getText();
                String sapellido = TextFieldSA.getText();
                String edad = TextFieldEdad.getText();
                String fechainicio = TextFieldFInicio.getText();
                String puesto = TextFieldPuesto.getText();
                String irpf = textFieldIRPF.getText();
                String idConvenio = TextFieldIDConvenio.getText();
                int edadParse = Integer.parseInt(edad);
                int convenioParse = Integer.parseInt(idConvenio);
                double irpfParse = Double.parseDouble(irpf);
                Date date = Date.valueOf(fechainicio);
                Querys trabajadorquery = null;
                try {
                    trabajadorquery = new Querys();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                Trabajador trabajador = new Trabajador(dni, nombre, papellido, sapellido, date, edadParse, puesto, irpfParse, convenioParse);

                try {
                    trabajadorquery.Insert(trabajador);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }


                Limpiar();
            }
        });

    }

    public void Limpiar(){
        TextFieldDNI.setText(null);
        TextFieldNombre.setText(null);
        TextFieldPA.setText(null);
        TextFieldSA.setText(null);
        TextFieldEdad.setText(null);
        TextFieldFInicio.setText(null);
        TextFieldPuesto.setText(null);
        TextFieldIDConvenio.setText(null);
        textFieldIRPF.setText(null);
    }
    public static void NewWindowsInsertTra(){
        VentanaInsertTra vit = new VentanaInsertTra();
        vit.setContentPane(new VentanaInsertTra().panel1);
        vit.pack();
        vit.setVisible(true);
    }
}