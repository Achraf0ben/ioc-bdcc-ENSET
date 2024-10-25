package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier") //cree moi un objer de cette classe et donne lui le nom metier >>
// <bean id="metier" class="metier.MetierImpl">


public abstract class MetierImpl implements IMerier, IDao {

    //pour faire l'injection des dep >> setter


    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Autowired //inject moi a cette varr dao un objet de type IDao
    private IDao dao; //dependre de l'interface IDao
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*23;
        return res;
    }
}
