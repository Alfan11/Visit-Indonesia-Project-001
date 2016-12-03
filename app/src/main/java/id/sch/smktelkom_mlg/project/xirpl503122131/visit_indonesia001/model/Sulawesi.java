package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.model;

import java.io.Serializable;

/**
 * Created by Rehan on 12/3/2016.
 */

public class Sulawesi implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Sulawesi(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
