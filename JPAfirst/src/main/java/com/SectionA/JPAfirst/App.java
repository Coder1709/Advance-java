package com.SectionA.JPAfirst;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("push");
        EntityManager em=emf.createEntityManager();
        emp s=em.find(emp.class,1);
        System.out.println(s);
        
    }
}
