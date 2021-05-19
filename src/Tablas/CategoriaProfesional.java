package Tablas;

/**
 * Tablas
 * Nombre_project: NominasJava-marcos
 * CategoriaProfesional
 * Created by: MarcosRa
 * Date : 30/04/2021
 * Description:
 **/
public class CategoriaProfesional {
    private static int idCategoriaProfesional;
    private double salarioBase;
    private double plusConvenio;
    private Convenio convenio;

    public CategoriaProfesional() {
    }

    public CategoriaProfesional(double salarioBase, double plusConvenio, Convenio convenio) {
        this.salarioBase = salarioBase;
        this.plusConvenio = plusConvenio;
        this.convenio = convenio;
    }
}
