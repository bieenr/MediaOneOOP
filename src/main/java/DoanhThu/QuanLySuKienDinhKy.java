/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import IO.IO;
import ThongBao.ThongBao;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QuanLySuKienDinhKy {
    private ArrayList<SuKienDinhKy> dsSKDK;
    public QuanLySuKienDinhKy() {
        IO IO = new IO();
        this.dsSKDK = IO.docSKDinhKy();
    }
    private boolean isSameDay(LocalDateTime a, LocalDateTime b) {
//        LocalDateTime c = LocalDateTime.of(a.getDayOfYear(), a.getMonthValue(), a.getDayOfMonth(), 0, 0, 0);
//        LocalDateTime d = LocalDateTime.of(a.getDayOfYear(), a.getMonthValue(), a.getDayOfMonth(), 23, 59, 59);
//        return b.isAfter(c) && b.isBefore(d);
        LocalDateTime c = LocalDateTime.of(a.getYear(), a.getMonthValue(), a.getDayOfMonth(), 0, 0, 0);
        c = c.minusSeconds(1);
        LocalDateTime d = LocalDateTime.of(a.getYear(), a.getMonthValue(), a.getDayOfMonth(), 23, 59, 59);
        d = d.plusSeconds(1);
        return (b.isAfter(c) && b.isBefore(d));
    }

    public void checkSKDK() {
        LocalDateTime tdht = LocalDateTime.now();
        IO io = new IO();
        ArrayList<ThongBao> tb = io.docThongBao();
        for (SuKienDinhKy skdk : dsSKDK) {
            if (isSameDay(tdht, skdk.getNgayTiepTheo())) {
                tb.add(new ThongBao(skdk.getTenSuKien(), false));
                if (skdk instanceof SuKienHangThang) {
//                    skdk.setNgayTiepTheo(skdk.getNgayTiepTheo().plusMonths(1));
                    skdk.setNgayTiepTheo(tdht.plusMonths(1));
                } else if (skdk instanceof SuKienTheoChuKy) {
                    SuKienTheoChuKy skdk1 = (SuKienTheoChuKy) skdk;
//                    skdk.setNgayTiepTheo(skdk.getNgayTiepTheo().plusDays(skdk1.getSoNgayMotChuKy()));
                    skdk.setNgayTiepTheo(tdht.plusDays(skdk1.getSoNgayMotChuKy()));
                }
            }
        }
        io.ghiSKDinhKy(dsSKDK);
    }
    public void themSKDK(SuKienDinhKy skdk) {
        this.dsSKDK.add(skdk);
        IO io = new IO();
        io.ghiSKDinhKy(this.dsSKDK);
    }

    public void xoaSKDK(String tenSK) {
        for (int i = 0; i < this.dsSKDK.size(); ++i) {
            SuKienDinhKy skdk = this.dsSKDK.get(i);
            if (skdk.getTenSuKien().equals(tenSK)) {
                this.dsSKDK.remove(i);
                break;
            }
        }
        IO io = new IO();
        io.ghiSKDinhKy(dsSKDK);
    }
     public ArrayList<SuKienDinhKy> getDanhSachSuKienDinhKy() {
        return this.dsSKDK;
    }

    public void setDanhSachSuKienDinhKy(ArrayList<SuKienDinhKy> s) {
        this.dsSKDK = s;
    }
}
