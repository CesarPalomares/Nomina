package VentanaSwing;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * VentanaSwing
 * Nombre_project: DAMJava
 * VentanaMadre
 * Created by: magua
 * Date : 05/05/2021
 * Description:
 **/
public class VentanaMadre extends JFrame {
    private JPanel panelMadre;
    private JButton insertarTrabajadorButton;
    private JButton calcularNominasButton;

    public VentanaMadre() {
        setLocationRelativeTo(null);
        setResizable(false);
        insertarTrabajadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaInsertTra vit = new VentanaInsertTra();
                vit.NewWindowsInsertTra();

            }
        });
        calcularNominasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaNomina vn = null;
                try {
                    vn = new VentanaNomina();
                    vn.NewWindowsNomina();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] args) {
        VentanaMadre vm = new VentanaMadre();
        vm.setContentPane(new VentanaMadre().panelMadre);
        vm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vm.pack();
        vm.setVisible(true);
    }
}
