package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final String PRESISTENCE_UNIT_NAME = "task_board";
    private static EntityManagerFactory emf;

    public static EntityManager createEntityManager(){
        return _getEntityManagerFactory().createEntityManager();
    }

    public static EntityManagerFactory _getEntityManagerFactory(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PRESISTENCE_UNIT_NAME);
        }

        return emf;
    }

}
