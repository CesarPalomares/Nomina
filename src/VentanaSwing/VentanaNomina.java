package VentanaSwing;

import BD.Conexion;
import Tablas.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * VentanaSwing
 * Nombre_project: DAMJava
 * VentanaNomina
 * Created by: magua
 * Date : 07/05/2021
 * Description:
 **/
public class VentanaNomina extends JFrame {
    private JPanel panelNomina;
    private JComboBox comboBoxDNI;
    private JLabel CalcularNomina;
    private JLabel DNI;
    private JTextField textFieldHorasExtra;
    private JTextField textFieldHorasExtraFM;
    private JLabel HorasExtra;
    private JLabel HorasExtraFM;
    private JButton calcularButton;
    Connection conn;

    public void selectVentanaNomina(){
        this.comboBoxDNI.removeAllItems();
        try{
            conn = Conexion.getConnection();
            Statement update = conn.createStatement();
            ResultSet r = update.executeQuery("SELECT * FROM trabajador");
            while (r.next()){
                this.comboBoxDNI.addItem(r.getString("DNI_Trabajador"));

            }
            conn.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public VentanaNomina() throws SQLException {
        setLocationRelativeTo(null);
        setResizable(false);
        selectVentanaNomina();
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String horas = textFieldHorasExtra.getText();
                String horasfm = textFieldHorasExtraFM.getText();
                String dni = (String) comboBoxDNI.getSelectedItem();
                Querys q = null;
                try {
                    q = new Querys();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

                int horasParse = Integer.parseInt(horas);
                int horasFMParse = Integer.parseInt(horasfm);
                try {
                    q.insertarNomina(horasParse,horasFMParse,dni);
                    VentanaVerNomina vvn = new VentanaVerNomina();
                    vvn.NewWindowsVerNomina();

                } catch (Exception exception) {
                    exception.printStackTrace();
                }

                textFieldHorasExtra.setText(null);
                textFieldHorasExtraFM.setText(null);
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }

    public static void NewWindowsNomina() throws SQLException {
        VentanaNomina vn = new VentanaNomina();
        vn.setContentPane(new VentanaNomina().panelNomina);
        vn.pack();
        vn.setVisible(true);
    }
}
