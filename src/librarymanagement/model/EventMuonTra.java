
package librarymanagement.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


public class EventMuonTra{   
    private String idDocGia; 
    private String idSach; 
    private String ngayMuon; 
    private String ngayHenTra; 
    private String ngayTra; 
    private String status;

    public EventMuonTra() {
    }

    public EventMuonTra(String idDocGia, String idSach, String ngayMuon, String ngayHenTra, String ngayTra, String status) {
        this.idDocGia = idDocGia;
        this.idSach = idSach;
        this.ngayMuon = ngayMuon;
        this.ngayHenTra = ngayHenTra;
        this.ngayTra = ngayTra;
        this.status = status != null ? status : updateStatus();
    }

    public EventMuonTra(String idDocGia, String idSach, String ngayMuon, String ngayHenTra) {
        this.idDocGia = idDocGia;
        this.idSach = idSach;
        this.ngayMuon = ngayMuon;
        this.ngayHenTra = ngayHenTra;
        this.status = updateStatus();
    }

    public String getIdDocGia() {
        return idDocGia;
    }

    public void setIdDocGia(String idDocGia) {
        this.idDocGia = idDocGia;
    }

    public String getIdSach() {
        return idSach;
    }

    public void setIdSach(String idSach) {
        this.idSach = idSach;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayHenTra() {
        return ngayHenTra;
    }

    public void setNgayHenTra(String ngayHenTra) {
        this.ngayHenTra = ngayHenTra;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.idDocGia);
        hash = 17 * hash + Objects.hashCode(this.idSach);
        hash = 17 * hash + Objects.hashCode(this.ngayMuon);
        hash = 17 * hash + Objects.hashCode(this.ngayHenTra);
        hash = 17 * hash + Objects.hashCode(this.ngayTra);
        hash = 17 * hash + Objects.hashCode(this.status);
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
        final EventMuonTra other = (EventMuonTra) obj;
        if (!Objects.equals(this.idDocGia, other.idDocGia)) {
            return false;
        }
        if (!Objects.equals(this.idSach, other.idSach)) {
            return false;
        }
        if (!Objects.equals(this.ngayMuon, other.ngayMuon)) {
            return false;
        }
        if (!Objects.equals(this.ngayHenTra, other.ngayHenTra)) {
            return false;
        }
        if (!Objects.equals(this.ngayTra, other.ngayTra)) {
            return false;
        }
        return Objects.equals(this.status, other.status);
    }

    private String updateStatus() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date currentDate = new Date();
            Date muonDate = sdf.parse(ngayMuon);
            Date henTraDate = sdf.parse(ngayHenTra);

            if (ngayTra != null && !ngayTra.isEmpty()) {
                return "đã trả";
            } else if (currentDate.after(henTraDate)) {
                return "quá hạn";
            } else if (!currentDate.before(muonDate) && !currentDate.after(henTraDate)) {
                return "đang mượn";
            } else {
                return "đang mượn";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "đang mượn";
        }
    }
}
