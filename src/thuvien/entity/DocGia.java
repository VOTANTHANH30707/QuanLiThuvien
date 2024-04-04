package thuvien.entity;

import java.util.Date;

public class DocGia {

    private String MaDocGia;
    private String Ho;
    private String Ten;
    private String CCCD;
    private String Email;
    private String DiaChi;
    private String Hinh;
    private Date NgayCap; // = new Date();
    private Date HanSD; // = new Date();

    public String getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(String MaDocGia) {
        this.MaDocGia = MaDocGia;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public Date getNgayCap() {
        return NgayCap;
    }

    public void setNgayCap(Date NgayCap) {
        this.NgayCap = NgayCap;
    }

    public Date getHanSD() {
        return HanSD;
    }

    public void setHanSD(Date HanSD) {
        this.HanSD = HanSD;
    }

}
