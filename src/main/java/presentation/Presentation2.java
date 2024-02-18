package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) {
        // l'injection des dépendances Par instanciation dynamique

        try {
            // pour objet IDao
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class classDao = Class.forName(daoClassName);
            IDao dao = (IDao)classDao.newInstance();

            // pour objet IMetier
            String metierClassName = scanner.nextLine();
            Class classMetier = Class.forName(metierClassName);

            Constructor metierConstructor = classMetier.getConstructor(IDao.class);
            IMetier metier = (IMetier) metierConstructor.newInstance(dao);
            System.out.println("Résultat = " + metier.calcul());

        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
