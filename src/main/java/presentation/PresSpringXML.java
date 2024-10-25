package presentation;

import metier.IMerier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //^^ lire le fichier config.xml  + creation des deux object et assossier les objets (injec des dep)
        IMerier metier = (IMerier) context.getBean("metier"); // objet de type (IMerier)
        //IMerier metier = context.getBean(IMetier.class);
        System.out.println("Res="+ metier.calcul()  );

    }
}
