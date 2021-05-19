package Tablas;

import java.sql.Date;

/**
 * Tablas
 * Nombre_project: CalcularNominas
 * Empresa
 * Created by: MarcosRa
 * Date : 12/05/2021
 * Description:
 **/
public class Empresa {
    private String cif;
    private String nombre;
    private String sedeFiscal;
    private int ccc;

    public Empresa() {
    }

    public Empresa(String cif) {
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSedeFiscal() {
        return sedeFiscal;
    }

    public void setSedeFiscal(String sedeFiscal) {
        this.sedeFiscal = sedeFiscal;
    }

    public int getccc() {
        return ccc;
    }

    public void setccc(int ccc) {
        this.ccc = ccc;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cif='" + cif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sedeFiscal='" + sedeFiscal + '\'' +
                ", ccc=" + ccc +
                '}';
    }
}
