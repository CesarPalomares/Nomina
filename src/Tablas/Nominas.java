package Tablas;

import java.sql.Date;

/**
 * Tablas
 * Nombre_project: NominasJava-marcos
 * Nominas
 * Created by: MarcosRa
 * Date : 07/05/2021
 * Description:
 **/
public class Nominas {

    public int idNomina;
    private double horas_extra ;
    private double horas_extra_fm ;
    private double plus_antiguedad;
    private double irpf ;
    private double formacion;
    private double desempleo ;
    private double deduc_horas_extra;
    private double deduc_horas_extraFM;
    private double contingencias_comunes;
    private double salari_base;
    private double total_merital;
    private double salario_final;
    private int idConvenio;
    private String DNItrabajdor;
    private Date fecha_actual;
    private double salarioBaseMasHoraExtra;
    private String nombreT ;
    private String apellidoT;
    private String puestoT;




    public Nominas() {

    }

    public Nominas(String DNItrabajdor) {
        this.DNItrabajdor = DNItrabajdor;
    }

    public Nominas(int idNomina, double horas_extra, double horas_extra_fm, double plus_antiguedad, double irpf, double formacion, double desempleo, double deduc_horas_extra, double deduc_horas_extraFM, double contingencias_comunes, double salari_base, double total_merital, double salario_final, int idConvenio, String DNItrabajdor, Date fecha_actual, double salarioBaseMasHoraExtra, String nombreT, String apellidoT, String puestoT) {
        this.idNomina = idNomina;
        this.horas_extra = horas_extra;
        this.horas_extra_fm = horas_extra_fm;
        this.plus_antiguedad = plus_antiguedad;
        this.irpf = irpf;
        this.formacion = formacion;
        this.desempleo = desempleo;
        this.deduc_horas_extra = deduc_horas_extra;
        this.deduc_horas_extraFM = deduc_horas_extraFM;
        this.contingencias_comunes = contingencias_comunes;
        this.salari_base = salari_base;
        this.total_merital = total_merital;
        this.salario_final = salario_final;
        this.idConvenio = idConvenio;
        this.DNItrabajdor = DNItrabajdor;
        this.fecha_actual = fecha_actual;
        this.salarioBaseMasHoraExtra = salarioBaseMasHoraExtra;
        this.nombreT = nombreT;
        this.apellidoT = apellidoT;
        this.puestoT = puestoT;
    }

    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }

    public double getHoras_extra() {
        return horas_extra;
    }

    public void setHoras_extra(double horas_extra) {
        this.horas_extra = horas_extra;
    }

    public double getHoras_extra_fm() {
        return horas_extra_fm;
    }

    public void setHoras_extra_fm(double horas_extra_fm) {
        this.horas_extra_fm = horas_extra_fm;
    }

    public double getPlus_antiguedad() {
        return plus_antiguedad;
    }

    public void setPlus_antiguedad(double plus_antiguedad) {
        this.plus_antiguedad = plus_antiguedad;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public double getFormacion() {
        return formacion;
    }

    public void setFormacion(double formacion) {
        this.formacion = formacion;
    }

    public double getDesempleo() {
        return desempleo;
    }

    public void setDesempleo(double desempleo) {
        this.desempleo = desempleo;
    }

    public double getDeduc_horas_extra() {
        return deduc_horas_extra;
    }

    public void setDeduc_horas_extra(double deduc_horas_extra) {
        this.deduc_horas_extra = deduc_horas_extra;
    }

    public double getDeduc_horas_extraFM() {
        return deduc_horas_extraFM;
    }

    public void setDeduc_horas_extraFM(double deduc_horas_extraFM) {
        this.deduc_horas_extraFM = deduc_horas_extraFM;
    }

    public double getContingencias_comunes() {
        return contingencias_comunes;
    }

    public void setContingencias_comunes(double contingencias_comunes) {
        this.contingencias_comunes = contingencias_comunes;
    }

    public double getSalari_base() {
        return salari_base;
    }

    public void setSalari_base(double salari_base) {
        this.salari_base = salari_base;
    }

    public double getTotal_merital() {
        return total_merital;
    }

    public void setTotal_merital(double total_merital) {
        this.total_merital = total_merital;
    }

    public double getSalario_final() {
        return salario_final;
    }

    public void setSalario_final(double salario_final) {
        this.salario_final = salario_final;
    }

    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public String getDNItrabajdor() {
        return DNItrabajdor;
    }

    public void setDNItrabajdor(String DNItrabajdor) {
        this.DNItrabajdor = DNItrabajdor;
    }

    public Date getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(Date fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public double getSalarioBaseMasHoraExtra() {
        return salarioBaseMasHoraExtra;
    }

    public void setSalarioBaseMasHoraExtra(double salarioBaseMasHoraExtra) {
        this.salarioBaseMasHoraExtra = salarioBaseMasHoraExtra;
    }

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public String getApellidoT() {
        return apellidoT;
    }

    public void setApellidoT(String apellidoT) {
        this.apellidoT = apellidoT;
    }

    public String getPuestoT() {
        return puestoT;
    }

    public void setPuestoT(String puestoT) {
        this.puestoT = puestoT;
    }

    @Override
    public String toString() {
        return "Nominas{" +
                "idNomina=" + idNomina +
                ", horas_extra=" + horas_extra +
                ", horas_extra_fm=" + horas_extra_fm +
                ", plus_antiguedad=" + plus_antiguedad +
                ", irpf=" + irpf +
                ", formacion=" + formacion +
                ", desempleo=" + desempleo +
                ", deduc_horas_extra=" + deduc_horas_extra +
                ", deduc_horas_extraFM=" + deduc_horas_extraFM +
                ", contingencias_comunes=" + contingencias_comunes +
                ", salari_base=" + salari_base +
                ", total_merital=" + total_merital +
                ", salario_final=" + salario_final +
                ", idConvenio=" + idConvenio +
                ", DNItrabajdor='" + DNItrabajdor + '\'' +
                ", fecha_actual=" + fecha_actual +
                ", salarioBaseMasHoraExtra=" + salarioBaseMasHoraExtra +
                ", nombreT='" + nombreT + '\'' +
                ", apellidoT='" + apellidoT + '\'' +
                ", puestoT='" + puestoT + '\'' +
                '}';
    }
}