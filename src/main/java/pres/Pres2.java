package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner =new Scanner(new File("config.txt"));
        /*DYNAMIC*/
        String daoClassName=scanner.nextLine();
        Class cDao =Class.forName(daoClassName);/*Demande de charger une classe dont le nom figure dans le fichier .txt*/
        IDao dao =(IDao) cDao.newInstance();
        //System.out.println(dao.getData());

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method =cMetier.getMethod("setDao", IDao.class);
        //metier.setDao(dao); -->Static
        method.invoke(metier,dao);
        System.out.println("Résultat =>"+metier.calcul());

    }
}
