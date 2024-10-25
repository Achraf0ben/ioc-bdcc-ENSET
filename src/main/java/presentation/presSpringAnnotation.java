package presentation;

import metier.IMerier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");

        IMerier metier = context.getBean(IMerier.class);
        System.out.println("Res= " + metier.calcul());
    }
}
