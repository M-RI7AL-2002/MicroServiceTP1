/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author PC
 */
public class DaoImpl2 implements IDao{

    @Override
    public int getValeur() {
        System.out.println("New Service of 200");
        return 200;
    }
    
}
