package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.model;

import java.io.Serializable;

public class Kalimantan implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Kalimantan(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}