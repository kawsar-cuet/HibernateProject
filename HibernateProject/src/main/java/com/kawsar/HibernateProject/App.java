package com.kawsar.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student std = new Student();
        std.setId(101);
        std.setName("Kawsar");
        std.setDepartment("CSE");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        ss.save(std);
        tx.commit();
        
    }
}
