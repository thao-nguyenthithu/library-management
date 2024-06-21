
package librarymanagement.model;

import java.util.Objects;

public class DocGia {
    
    private String idDocGia; 
    private String tenDocGia; 
    private String soDienthoai; 
    private String gioiTinh; 

    public DocGia() {
    }

    public DocGia(String idDocGia, String tenDocGia, String soDienthoai, String gioiTinh) {
        this.idDocGia = idDocGia;
        this.tenDocGia = tenDocGia;
        this.soDienthoai = soDienthoai;
        this.gioiTinh = gioiTinh;
    }

    public DocGia(String idDocGia, String tenDocGia) {
        this.idDocGia = idDocGia;
        this.tenDocGia = tenDocGia;
    }

    public String getIdDocGia() {
        return idDocGia;
    }

    public void setIdDocGia(String idDocGia) {
        this.idDocGia = idDocGia;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public String getSoDienthoai() {
        return soDienthoai;
    }

    public void setSoDienthoai(String soDienthoai) {
        this.soDienthoai = soDienthoai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.idDocGia);
        hash = 71 * hash + Objects.hashCode(this.tenDocGia);
        hash = 71 * hash + Objects.hashCode(this.soDienthoai);
        hash = 71 * hash + Objects.hashCode(this.gioiTinh);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DocGia other = (DocGia) obj;
        if (!Objects.equals(this.idDocGia, other.idDocGia)) {
            return false;
        }
        if (!Objects.equals(this.tenDocGia, other.tenDocGia)) {
            return false;
        }
        if (!Objects.equals(this.soDienthoai, other.soDienthoai)) {
            return false;
        }
        return Objects.equals(this.gioiTinh, other.gioiTinh);
    }
    
    
            
}
