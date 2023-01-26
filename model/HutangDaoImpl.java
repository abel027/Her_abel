/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Her_abel.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class HutangDaoImpl implements HutangDao{
private final List<Hutang> data = new ArrayList<>();
    
    
@Override
public Hutang save(Hutang hutang) {
        data.add(hutang);
        return hutang;
    }

    
    public Hutang update(int index, Hutang hutang) {
        data.set(index, hutang);
        return hutang;
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public Hutang getHutang(int index) {
        return data.get(index);
    }

    @Override
    public List<Hutang> getAllHutang() {
        return data;
    }
    
}
