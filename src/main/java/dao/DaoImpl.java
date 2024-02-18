package dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Base de Donnees");
        double temp = Math.random() * 40;
        return temp;
    }
}
