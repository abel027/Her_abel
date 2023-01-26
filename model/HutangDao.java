/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Her_abel.model;

import java.util.List;

/**
 *
 * @author User
 */
public interface HutangDao {
    //Anggota save(Anggota anggota);
    Hutang save(Hutang hutang);
    Hutang update(int index, Hutang hutang);
    void delete(int index);
    Hutang getHutang(int index);
    List<Hutang> getAllHutang();
}
