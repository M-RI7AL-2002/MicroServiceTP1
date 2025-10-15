/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microservicetest;

import dao.IDao;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;
import metier.IMetier;

/**
 *
 * @author PC
 */
public class Microservicetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(new File("config/config.txt"));
        String daoClassNom= sc.nextLine();
        
        Class <?> cDao=Class.forName(daoClassNom);
        
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
        
        String metierClassNom = sc.nextLine();
        
        Class <?> cMetier= Class.forName(metierClassNom);
        
        IMetier metier= (IMetier) cMetier.getDeclaredConstructor().newInstance();
        
        
        Method setDaoMethod= cMetier.getMethod("setDao", IDao.class);
        
        setDaoMethod.invoke(metier, dao);
        
        System.out.println("Résultats = " + metier.calcul());
        
        sc.close();
        
        
        
        
        
        
    }
    
}
