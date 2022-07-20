/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

import IO.IO;
import ThongBao.ThongBao;
import DoanhThu.QuanLySuKien;
import DoanhThu.SuKienDinhKy;
import View.MainViews;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class MainApp {

    public static void main(String args[]) {

        IO io = new IO();
        QuanLySuKien qlsk = new QuanLySuKien();
        qlsk.checkSKDK();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame MainViews = new MainViews();
                MainViews.setLocationRelativeTo(null);
                MainViews.setVisible(true);
            }
        });
    }

}
