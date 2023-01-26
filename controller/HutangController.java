/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Her_abel.controller;

import Her_abel.model.Hutang;
import Her_abel.model.HutangDao;
import Her_abel.model.HutangDaoImpl;
import Her_abel.view.FormHutang;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class HutangController {
    private FormHutang formHutang;
    private Hutang hutang;
    private HutangDao hutangDao; 
    
    
    public HutangController(FormHutang formHutang){
        this.formHutang = formHutang;
        hutangDao = new HutangDaoImpl(); //berfungsi untuk menyimpan ke dao karna arrayny berada pada dao, jika ini tidak ada maka berhenti smpai model saja
    }
    
    public void bersihForm(){
        formHutang.getTxtKode_transaksi().setText("");
        formHutang.getTxtTgl_transaksi().setText("");
        formHutang.getTxtPembeli().setText("");
        formHutang.getTxtTotal_beli().setText("");


    }
    
    public void saveHutang(){
        hutang = new Hutang();
        hutang.setKode_transaksi(formHutang.getTxtKode_transaksi().getText());
        hutang.setTgl_transaksi(formHutang.getTxtTgl_transaksi().getText());
        hutang.setPembeli(formHutang.getTxtPembeli().getText());
        hutang.setTotal_beli(Integer.parseInt(formHutang.getTxtTotal_beli().getText()));
        hutangDao.save(hutang);
        JOptionPane.showMessageDialog(formHutang, "Insert OK");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formHutang.getTblHutang().getModel();
        tabelModel.setRowCount(0);
        List<Hutang> list = hutangDao.getAllHutang();
        for (Hutang hutang : list){
            Object[] row = {
                hutang.getKode_transaksi(),
                hutang.getTgl_transaksi(),
                hutang.getPembeli(),
                hutang.getTotal_beli(),
                hutang.getTotal_hutang()

            };
            tabelModel.addRow(row);
        }
    }
    
    public void updateHutang(){
        int index = formHutang.getTblHutang().getSelectedRow();
        hutang.setKode_transaksi(formHutang.getTxtKode_transaksi().getText());
        hutang.setTgl_transaksi(formHutang.getTxtTgl_transaksi().getText());
        hutang.setPembeli(formHutang.getTxtPembeli().getText());
        hutang.setTotal_beli(Integer.parseInt(formHutang.getTxtTotal_beli().getText()));
        hutangDao.update(index, hutang);
        JOptionPane.showMessageDialog(formHutang, "Update Ok");
    }
    
    public void deleteHutang(){
        int index = formHutang.getTblHutang().getSelectedRow();
        hutangDao.delete(index);
        JOptionPane.showMessageDialog(formHutang, "Delete Ok");
    }
    
    public void getHutang(){
        int index = formHutang.getTblHutang().getSelectedRow();
        hutang = hutangDao.getHutang(index);
        if(hutang != null){
            formHutang.getTxtKode_transaksi().setText("");
            formHutang.getTxtTgl_transaksi().setText("");
            formHutang.getTxtPembeli().setText("");
            formHutang.getTxtTotal_beli().setText("");
        }
    }
}
