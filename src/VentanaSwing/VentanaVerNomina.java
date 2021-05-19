package VentanaSwing;

import BD.Conexion;
import Tablas.Querys;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * VentanaSwing
 * Nombre_project: NominasJava-MarcosMiguel
 * VentanaVerNomina
 * Created by: magua
 * Date : 11/05/2021
 * Description:
 **/
public class VentanaVerNomina extends JFrame {
    private JPanel panelVerNomina;
    private JLabel salario_base;
    private JTextField textFieldSalarioBase;
    private JTextField textFieldAntigüedad;
    private JTextField textFieldHExtra;
    private JTextField textFieldHExtraFM;
    private JTextField textFieldContingénciasComunes;
    private JTextField textFieldIRPF;
    private JTextField textFieldHExtraFMD;
    private JTextField textFieldHExtraDeduc;
    private JTextField textFieldFomacion;
    private JTextField textFieldDesempleo;
    private JTextField textFieldTotalMerital;
    private JTextField textFieldSalarioFinal;
    private JLabel plus_antiguedad;
    private JLabel horas_extra;
    private JLabel horas_extra_fm;
    private JLabel contingencias_comunes;
    private JLabel desempleo;
    private JLabel irpf;
    private JLabel total_merital;
    private JLabel deduc_horas_extraFM;
    private JLabel deduc_horas_extra;
    private JLabel formacion;
    private JLabel salario_final;
    private JLabel meritaciones;
    private JLabel deducciones;
    private JButton exportarXMLButton;
    private JTextField textFieldCif;
    private JLabel cif;
    private JTextField textFieldFA;
    private JLabel fa;
    private JLabel nt;
    private JTextField textFieldNombreT;
    private JTextField textFieldDni;
    private JLabel dni;
    private JTextField textFieldCcc;
    private JTextField textFieldNombreEmpresa;
    private JLabel empresa;
    private JLabel ccc;
    private JButton exportButton;
    private JButton pdfButton;
    private JButton csvButton;
    VentanaNomina vn = new VentanaNomina();

    public void ColocarVentana(){
        //Esto te dice la resolución de tu pantalla, lo grande que es
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        //Almaceno el tamaño de la pantalla en tamanoPantalla
        Dimension tamanoPantalla=mipantalla.getScreenSize();
        //Obtenenmos el alto de la resolucuion y la almacenamo en altoPantalla
        int alturaPantalla=tamanoPantalla.height;
        //Lo mismo pero para el ancho
        int anchoPantalla=tamanoPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
    }

    public VentanaVerNomina() throws Exception {
        ColocarVentana();
        setResizable(false);
        Querys q = new Querys();
        try {
            String ssb = String.valueOf(q.selectSalarioBase());
            String sa = String.valueOf(q.selectAntiguadad());
            String she = String.valueOf(q.selectHorasExtra());
            String shefm = String.valueOf(q.selectHorasExtraFM());
            String stm = String.valueOf(q.selectTotalMerital());
            String scg = String.valueOf(q.selectContingenciasComunes());
            String sd = String.valueOf(q.selectDesempleo());
            String sf = String.valueOf(q.selectFormacion());
            String shed = String.valueOf(q.selectHorasExtraDeducciones());
            String shedfm = String.valueOf(q.selectHorasExtraFMDeducciones());
            String sirpf = String.valueOf(q.selectIrpf());
            String ssf = String.valueOf(q.selectSalarioFinal());


            String nt = String.valueOf(q.selectTrabajadorPorDNInomina());

            String cif = String.valueOf(q.selectCif());

            String dniT = String.valueOf(q.selectDNInomina());

            String fa = String.valueOf(q.saberFechaActual());
            String ne = String.valueOf(q.selectNombreEmpresa());
            String ccc = String.valueOf(q.selectCcc());
            textFieldSalarioBase.setText(ssb);
            textFieldAntigüedad.setText(sa);
            textFieldHExtra.setText(she);
            textFieldHExtraFM.setText(shefm);
            textFieldTotalMerital.setText(stm);

            textFieldContingénciasComunes.setText(scg);
            textFieldDesempleo.setText(sd);
            textFieldFomacion.setText(sf);
            textFieldHExtraDeduc.setText(shed);

            textFieldHExtraFMD.setText(shedfm);
            textFieldIRPF.setText(sirpf);
            textFieldSalarioFinal.setText(ssf);
            textFieldDni.setText(String.valueOf(dniT));
            textFieldCif.setText(cif);
            textFieldNombreT.setText(nt);
            textFieldFA.setText(fa);
            textFieldCcc.setText(ccc);
            textFieldNombreEmpresa.setText(ne);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        exportarXMLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedWriter bw = null;

                try {
                    String mycontent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                            "<nominas>\n" +
                            "  <nomina>\n" +
                            "      <trabajador>\n" +
                            "        <nombreTrabajador>"+ textFieldNombreT.getText() + "</nombreTrabajador>\n" +
                            "        <dni>"+textFieldDni.getText() +"</dni>\n" +
                            "      </trabajador>\n" +
                            "      <empresa>\n" +
                            "        <cif>" + textFieldCif.getText()+ "</cif>\n" +
                            "        <nombreEmpresa>" +textFieldNombreEmpresa.getText() + "</nombreEmpresa>\n" +
                            "      </empresa>\n" +
                            "      <percepciones>\n" +
                            "        <salario_base>" +textFieldSalarioBase.getText() + "</salario_base>\n" +
                            "        <antiguedad>" + textFieldAntigüedad.getText() + "</antiguedad>\n" +
                            "        <horas_extra>"+ textFieldHExtra.getText() + "</horas_extra>\n" +
                            "        <horas_extraFM>"+ textFieldHExtraFM.getText()+"</horas_extraFM>\n" +
                            "      </percepciones>\n" +
                            "      <total_meritado>" + textFieldTotalMerital.getText() + "</total_meritado>\n" +
                            "      <deducciones>\n" +
                            "        <contingencias_comunes>" +textFieldContingénciasComunes.getText() + "</contingencias_comunes>\n" +
                            "        <desempleo>" + textFieldDesempleo.getText()+ "</desempleo>\n" +
                            "        <formacion>" + textFieldFomacion.getText()+ "</formacion>\n" +
                            "        <deducciones_horas_extra>" + textFieldHExtraDeduc.getText()+ "</deducciones_horas_extra>\n" +
                            "        <deducciones_horas_extraFM>" + textFieldHExtraFMD.getText() + "</deducciones_horas_extraFM>\n" +
                            "        <irpf>" + textFieldIRPF.getText() + "</irpf>\n" +
                            "      </deducciones> \n" +
                            "      <salario_final>" + textFieldSalarioFinal.getText() + "</salario_final>\n" +
                            "  </nomina>\n" +
                            "</nominas>";

                    //Ruta
                    String path = "src\\xml\\";
                    //Nombre del fichero
                    String nombreFichero = "nomina_"+ textFieldDni.getText()+"_"+textFieldFA.getText() + ".xml";
                    File file = new File(path + nombreFichero);

                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    FileWriter fw = new FileWriter(file);
                    bw = new BufferedWriter(fw);
                    bw.write(mycontent);
                    System.out.println("XML generado correctamente");

                } catch (IOException ioe) {
                    ioe.printStackTrace();
                } finally {
                    try {
                        if (bw != null)
                            bw.close();
                    } catch (Exception ex) {
                        System.out.println("Error al cerrar writter" + ex);
                    }
                }
            }
        });

        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection conn = Conexion.getConnection();
                    String reportSrcFile = "src\\jasperReports\\nominasMarcosMiguel.jrxml";

                    JasperReport jasperReport = null;
                    jasperReport = JasperCompileManager.compileReport(reportSrcFile);

                    Map<String, Object> parameters = new HashMap<String, Object>();

                    JasperPrint print = JasperFillManager.fillReport(jasperReport, parameters, conn);

                    JasperViewer jw = new JasperViewer(print, false);
                    jw.setVisible(true);
                }catch (JRException | SQLException jrException) {
                    jrException.printStackTrace();
                    System.out.println("Error");
                }
            }
        });
    }
    public void NewWindowsVerNomina() throws Exception {
        VentanaVerNomina vvn = new VentanaVerNomina();
        vvn.setContentPane(new VentanaVerNomina().panelVerNomina);
        vvn.pack();
        vvn.setVisible(true);
    }

}
