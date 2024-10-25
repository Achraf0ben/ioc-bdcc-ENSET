package dao;

import org.springframework.stereotype.Component;

@Component("dao") //cree moi un objer de cette classe et donne lui le nom dao >>
// <bean id="d" class="ext.DaoImplV2"></bean>

public class IDaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version BDD");
        double temp=12;
        return temp;
    }
}
