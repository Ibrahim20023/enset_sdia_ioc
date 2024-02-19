package extention;

import dao.IDao;

import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs");
        double temp = Math.random()*40;
        return temp;
    }
}
