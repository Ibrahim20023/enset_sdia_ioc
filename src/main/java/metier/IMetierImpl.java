package metier;

import dao.IDao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component("metier")
public class IMetierImpl implements IMetier{

    private IDao dao; // Couplage faible

    public IMetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*150/Math.sin(temp*Math.PI);
        return res;
    }

    /*
            Injecter dans la variable dao un objet
            d'une classe qui implemente l'interface IDao
             */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
