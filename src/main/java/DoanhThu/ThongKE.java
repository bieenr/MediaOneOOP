/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import IO.IO;
import KhoHang.KhoHang;
import KhoHang.SanPham;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class ThongKE {
    private ArrayList<SuKienMotLan> dsSKML = new ArrayList();
    
    public ThongKE() {
        IO IO = new IO();
        this.dsSKML = IO.docSKMotLan();
    }
    public ArrayList<SuKienMotLan> getThongKeSuKien(LocalDateTime start, LocalDateTime end) {
        ArrayList<SuKienMotLan> dsThongKeSuKien = new ArrayList<>();
        
        for (SuKienMotLan obj : this.dsSKML) {
            if ((obj.getDate()).compareTo(start) >= 0 && (obj.getDate()).compareTo(end) < 0) {
                dsThongKeSuKien.add(obj);
                
            }
        }
        return dsThongKeSuKien;
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
    public int getDoanhThu(LocalDateTime start, LocalDateTime end) {
        int doanhthu = 0;
        for (SuKienMotLan obj : this.getThongKeSuKien(start, end)) {
            if ((obj.getLoaiSuKien()).equals("Bán")) {
                doanhthu += obj.getGiatri();
            }
        }
        return doanhthu;
    }
    public int getLoiNhuan_muaban(LocalDateTime start, LocalDateTime end) {
        int doanhthu = 0;
        for (SuKienMotLan obj : this.getThongKeSuKien(start, end)) {
            if ((obj.getLoaiSuKien()).equals("Bán")) {
                doanhthu += obj.getGiatri();
            } else if((obj.getLoaiSuKien()).equals("Mua")) {
                doanhthu -= obj.getGiatri();
            }
        }
        return doanhthu;
    }
    public ArrayList<SuKienMotLan> getsukienmua(LocalDateTime start, LocalDateTime end){
        ArrayList<SuKienMotLan> list = getThongKeSuKien(start, end);
//        System.out.println(list.size());
        ArrayList<SuKienMotLan> listcantim = new ArrayList();
        for(SuKienMotLan sk : list){
            if ((sk.getLoaiSuKien()).equals("Mua")){
                listcantim.add(sk);
            }
        }
        return listcantim;
    }
    public ArrayList<SuKienMotLan> getsukienban(LocalDateTime start, LocalDateTime end){
        ArrayList<SuKienMotLan> list = this.getThongKeSuKien(start, end);
//        System.out.println(list.size());
        ArrayList<SuKienMotLan> listcantim = new ArrayList();
        for(SuKienMotLan sk : list){
//            System.out.println(1);
            if ((sk.getLoaiSuKien()).equals("Bán")){
                listcantim.add(sk);
            }
        }
        System.out.println(listcantim.size());
        return listcantim;
    }
    public Map<String,Integer> thongkebanbaonhieusanpham(LocalDateTime start, LocalDateTime end){
        ArrayList<SuKienMotLan> list = this.getsukienban(start,end);
//        System.out.println(list.size());
        Map<String, Integer> my_dict = new Hashtable<String, Integer>();
        KhoHang khohang = new KhoHang();
        for (SuKienMotLan sk : list){
            
            String ten = sk.getTenSuKien().split(" ")[1];
            System.out.println(ten);
            SanPham sp = khohang.TimTen(ten);
            int soluong = sk.getGiatri()/sp.getGiaban();
            my_dict.put(ten, my_dict.get(ten)+soluong);
        }
//        System.out.println(1);
        return my_dict;
    }
    
    
    public SanPham bannhieunhat(LocalDateTime start, LocalDateTime end){
//        ArrayList<SuKienMotLan> list = this.getsukienban(start,end);
//        Hashtable<String, Integer> my_dict = new Hashtable<String, Integer>();
//        KhoHang khohang = new KhoHang();
//        for (SuKienMotLan sk : list){
//            String ten = sk.getTenSuKien().split(" ")[1];
//            
//            SanPham sp = khohang.TimTen(ten);
//            int soluong = sk.getGiatri()/sp.getGiaban();
//            my_dict.put(ten, my_dict.get(ten)+soluong);
//        }
        Map<String, Integer> my_dict = this.thongkebanbaonhieusanpham(start, end);
        String maxKey=null;
//        Map<String, Integer> dict = new Hashtable<String, Integer>();
        Integer maxValue = Integer.MIN_VALUE; 
        for(Map.Entry<String,Integer> entry : my_dict.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
//                dict.put(maxKey,my_dict.get(maxKey));
            }
        }
        
        KhoHang khohang = new KhoHang();
//        System.out.print(maxKey);
//        System.out.print(my_dict.get(maxKey));
        SanPham sp = khohang.TimTen(maxKey);
//        System.out.print(maxKey);
        return sp;
    }
    
    public Map<String,Integer> thongkebanbaonhieutien(LocalDateTime start, LocalDateTime end){
        ArrayList<SuKienMotLan> list = this.getsukienban(start,end);
        Hashtable<String, Integer> my_dict = new Hashtable<String, Integer>();
        KhoHang khohang = new KhoHang();
        for (SuKienMotLan sk : list){
            String ten = sk.getTenSuKien().split(" ")[1];            
            SanPham sp = khohang.TimTen(ten);
//            int soluong = sk.getGiatri()/sp.getGiaban();
            my_dict.put(ten, my_dict.get(ten)+sk.getGiatri());
        }
        return my_dict;
    }
}
