package ext;

import dao.IDao;

import org.springframework.stereotype.Repository;

@Repository("vws")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double temp = 77;
        return temp;
    }
}
