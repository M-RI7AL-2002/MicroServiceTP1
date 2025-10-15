/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.IDao;

/**
 *
 * @author PC
 */
public class MetierImpl  implements IMetier{
    IDao dao;

  
    
    
    @Override
    public int calcul() {
        return dao.getValeur()*2;
    }

    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
    
    
    
}
