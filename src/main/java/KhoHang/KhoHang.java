/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhoHang;

import DoanhThu.SuKienMotLan;
import IO.IO;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class KhoHang {
    ArrayList<SanPham> danhsachsanpham;
//    private ArrayList<SuKienMotLan> listSanPham_SuKien;
    public KhoHang(){
        IO fileIO = new IO();
        this.danhsachsanpham = fileIO.docSP();
//        this.listSanPham_SuKien = fileIO.docSKMotLan();
    }
    public void themSP(SanPham sp){
        this.danhsachsanpham.add(sp);
    }
    public ArrayList getdanhsachsanpham(){
        return this.danhsachsanpham;
    }
//    public ArrayList getlistSanPham_SuKien(){
//        return this.listSanPham_SuKien;
//    }
    public SanPham TimTen(String s ){
        SanPham sp = null;
        for (int i = 0; i < this.danhsachsanpham.size(); i++) {
            if (this.danhsachsanpham.get(i).getTensanpham().equals(s)) {
                sp = this.danhsachsanpham.get(i);
                break;
            }
        }
        return sp;
    }
    public ArrayList<SanPham> TimTheLoai(String s, ArrayList<SanPham> dssanpham){
//        this.danhsachsanpham = fileIO.docSP();
        ArrayList<SanPham> list= new ArrayList ();
        if (s.equals("sach")) {
//            System.out.print(1);
//            list = null;
            for (SanPham sp:dssanpham) {
                if (sp instanceof Sach){
                    list.add(sp);
                    System.out.print(1);
                    }    
                continue;
                }
            }
        else if (s.equals("dianhac")){
//            list = null;
            for (SanPham sp:dssanpham) {
                if (sp instanceof DiaNhac){                   
                    list.add(sp);
                    }    
                continue;
                }
            }
        else{
          for (SanPham sp:dssanpham) {
                if (sp instanceof DiaPhim){
                    list.add(sp);
                    }    
                continue;
                } 
       }
    return list;   
    }
}

