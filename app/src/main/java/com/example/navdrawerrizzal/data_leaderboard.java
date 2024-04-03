package com.example.navdrawerrizzal;

public class data_leaderboard {
    private int imgClub;
    private String txtPOS;
    private String txtClub;
    private String txtPL;
    private String txtGD;
    private String txtPTS;

    public int getImgClub() {
        return imgClub;
    }

    public String getTxtPOS() {
        return txtPOS;
    }

    public String getTxtClub() {
        return txtClub;
    }

    public String getTxtPL() {
        return txtPL;
    }

    public String getTxtGD() {
        return txtGD;
    }

    public String getTxtPTS() {
        return txtPTS;
    }

    public data_leaderboard(int imgClub, String txtPOS, String txtClub, String txtPL, String txtGD, String txtPTS) {
        this.imgClub = imgClub;
        this.txtPOS = txtPOS;
        this.txtClub = txtClub;
        this.txtPL = txtPL;
        this.txtGD = txtGD;
        this.txtPTS = txtPTS;
    }
}
